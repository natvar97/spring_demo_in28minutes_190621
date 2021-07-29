package com.indialone.spring_demo_in28minutes_190621.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/*
        if we use @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) then it will pass the different beans
        in Application Context

 */

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    /*
        we can change the name of SortAlgorithm as we want to use specific algorithm
        like below if i use bubbleSortAlgorithm then it will  take the BubbleSorAlgorithm as first then error gone
        if i want QuickSortAlgorithm then i should use quickSortAlgorithm as SortAlgorithm instance

        @Primary has more priority then naming convention

        Another option is use @Qualifier and it will take the string parameter in the parenthesis

        @Qualifier has more priority then naming the instances

        @Qualifier has more priority then other types @Primary and naming the instances
     */

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubbleSortAlgorithm")
    private SortAlgorithm quickSortAlgorithm;

//    @Autowired
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


//    @Autowired
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] array, int number) {
        BubbleSortAlgorithm bubbleShort = new BubbleSortAlgorithm();
        int[] shortedArray = bubbleShort.sort(array);
        System.out.println(quickSortAlgorithm);
        return 3;
    }

//    @PostConstruct
    public void postConstruct() {
        logger.info("Post Construct");
    }

//    @PreDestroy
    public void preDestroy() {
        logger.info("Pre Destroy");
    }


}
