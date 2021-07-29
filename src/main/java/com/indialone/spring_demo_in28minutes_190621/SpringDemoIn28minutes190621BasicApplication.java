package com.indialone.spring_demo_in28minutes_190621;

import com.indialone.spring_demo_in28minutes_190621.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringDemoIn28minutes190621BasicApplication {

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleShortAlgorithm());
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringDemoIn28minutes190621BasicApplication.class)) {

        /*
          initially when we make same bean then it will print same instances bcz
          default every bean is Singleton

          but if we define it with prototype then it will print different instaces with different
          has codes

         */

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            System.out.println(binarySearch);

            BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
            System.out.println(binarySearch1);

            int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

            System.out.println(result);
        }
    }

}
