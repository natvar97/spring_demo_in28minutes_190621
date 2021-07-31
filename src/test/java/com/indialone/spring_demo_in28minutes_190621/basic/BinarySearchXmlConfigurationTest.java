package com.indialone.spring_demo_in28minutes_190621.basic;

import com.indialone.spring_demo_in28minutes_190621.SpringDemoIn28minutes190621BasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXmlConfigurationTest {


    // we use the @ContextConfiguration for get the bean BinarySearchImpl
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, actualResult);
    }

}
