package com.indialone.spring_demo_in28minutes_190621.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.List;

@Named
public class SomeCDIDao {

    public int[] getData() {
        return new int[]{8, 88, 20};
    }

}
