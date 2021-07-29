package com.indialone.spring_demo_in28minutes_190621;

import com.indialone.componentscan.ComponentScanDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.indialone.componentscan")
public class SpringDemoIn28minutes190621ComponentScanApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDemoIn28minutes190621ComponentScanApplication.class);

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringDemoIn28minutes190621ComponentScanApplication.class)) {


            ComponentScanDAO componentScanDAO = applicationContext.getBean(ComponentScanDAO.class);

            LOGGER.info("{}", componentScanDAO);
            LOGGER.info("{}", componentScanDAO.getComponentScanConnection());

        }

    }

}
