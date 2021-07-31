package com.indialone.spring_demo_in28minutes_190621.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

    SomeCDIDao someCDIDao;

    public SomeCDIDao getSomeCDIDao() {
        return someCDIDao;
    }

    @Inject
    public void setSomeCDIDao(SomeCDIDao someCDIDao) {
        this.someCDIDao = someCDIDao;
    }


    public int findGreatest() {
        int greatestNumber = Integer.MIN_VALUE;

        int[] numbers = someCDIDao.getData();

        for (int number : numbers)
            if (number > greatestNumber) greatestNumber = number;

        return greatestNumber;
    }


}
