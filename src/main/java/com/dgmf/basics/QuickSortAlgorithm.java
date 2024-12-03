package com.dgmf.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// @Component
@Service
// @Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        // Logic for Quick Sort

        return numbers;
    }
}