package com.indialone.spring_demo_in28minutes_190621.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        return array;
    }
}
