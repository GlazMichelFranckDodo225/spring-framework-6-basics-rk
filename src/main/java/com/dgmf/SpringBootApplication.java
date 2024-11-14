package com.dgmf;

import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);

		SpringApplication.run(SpringBootApplication.class, args);
	}

}
