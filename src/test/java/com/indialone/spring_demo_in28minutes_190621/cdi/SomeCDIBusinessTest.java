package com.indialone.spring_demo_in28minutes_190621.cdi;

import com.indialone.spring_demo_in28minutes_190621.SpringDemoIn28minutes190621BasicApplication;
import com.indialone.spring_demo_in28minutes_190621.SpringDemoIn28minutes190621CDIApplication;
import com.indialone.spring_demo_in28minutes_190621.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringDemoIn28minutes190621CDIApplication.class)
public class SomeCDIBusinessTest {


    // we use the @ContextConfiguration for get the bean BinarySearchImpl
    @InjectMocks
    SomeCDIBusiness someCDIBusiness;

    @Mock
    SomeCDIDao someCDIDao;

    @Test
    public void testBasicScenarioOne() {
        Mockito.when(someCDIDao.getData()).thenReturn(new int[]{2, 4});
        int actualResult = someCDIBusiness.findGreatest();
        assertEquals(4, actualResult);
    }

    @Test
    public void testBasicScenarioNoValue() {
        Mockito.when(someCDIDao.getData()).thenReturn(new int[]{});
        int actualResult = someCDIBusiness.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    public void testBasicScenarioSameValue() {
        Mockito.when(someCDIDao.getData()).thenReturn(new int[]{2,2});
        int actualResult = someCDIBusiness.findGreatest();
        assertEquals(2, actualResult);
    }

}
