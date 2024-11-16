package com.dgmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework6Application {
	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl();
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		// System.out.println(result);

		ApplicationContext applicationContext =
				SpringApplication.run(SpringFramework6Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);
		// com.dgmf.BubbleSortAlgorithm@1b32cd16
		// 3
	}

}
