package com.indialone.spring_demo_in28minutes_190621;

import com.indialone.spring_demo_in28minutes_190621.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoIn28minutes190621XmlApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoIn28minutes190621ScopeApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Bean Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(xmlPersonDAO);

        }
    }

}
