package com.indialone.spring_demo_in28minutes_190621.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String getServiceUrl() {
        return url;
    }

}
