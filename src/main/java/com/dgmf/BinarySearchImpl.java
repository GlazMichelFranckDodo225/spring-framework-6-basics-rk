package com.dgmf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    // private SortAlgorithm sortAlgorithm;
    // Autowiring by Name
    private SortAlgorithm bubbleSortAlgorithm;

    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        // int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        /*int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);*/
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);

        return 3;
    }
}
