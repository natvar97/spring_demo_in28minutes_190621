package com.indialone.spring_demo_in28minutes_190621;

import com.indialone.spring_demo_in28minutes_190621.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringDemoIn28minutes190621ScopeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDemoIn28minutes190621ScopeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringDemoIn28minutes190621ScopeApplication.class)) {


            PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
            PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDao);
            LOGGER.info("{}", personDao.getJdbcConnection());

            LOGGER.info("{}", personDao2);
            LOGGER.info("{}", personDao2.getJdbcConnection());

        }
    }

}
