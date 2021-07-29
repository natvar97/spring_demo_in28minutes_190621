package com.indialone.spring_demo_in28minutes_190621.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Qualifier("bubbleSortAlgorithm")
public class BubbleSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sort(int[] array) {
        return array;
    }

}
