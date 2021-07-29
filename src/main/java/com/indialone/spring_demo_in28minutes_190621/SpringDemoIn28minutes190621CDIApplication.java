package com.indialone.spring_demo_in28minutes_190621;

import com.indialone.spring_demo_in28minutes_190621.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringDemoIn28minutes190621CDIApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDemoIn28minutes190621CDIApplication.class);

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringDemoIn28minutes190621CDIApplication.class)) {


            SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
            LOGGER.info("{} dao- {}", someCDIBusiness, someCDIBusiness.getSomeCDIDao());
        }
    }

}
