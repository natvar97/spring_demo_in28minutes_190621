package com.indialone.spring_demo_in28minutes_190621;

import com.indialone.spring_demo_in28minutes_190621.basic.BinarySearchImpl;
import com.indialone.spring_demo_in28minutes_190621.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringDemoIn28minutes190621PropertiesApplication {

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleShortAlgorithm());
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringDemoIn28minutes190621PropertiesApplication.class)) {

        /*
          initially when we make same bean then it will print same instances bcz
          default every bean is Singleton

          but if we define it with prototype then it will print different instaces with different
          has codes
`
         */

            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            System.out.println(someExternalService);
            System.out.println(someExternalService.getServiceUrl());

        }
    }

}
