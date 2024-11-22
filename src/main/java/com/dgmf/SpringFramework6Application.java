package com.dgmf;

import com.dgmf.beans.basics.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework6Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringFramework6Application.class, args);

		// Now Scope = Prototype
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch); // com.dgmf.basics.BinarySearchImpl@4690f583
		System.out.println(binarySearch2); // com.dgmf.basics.BinarySearchImpl@59712875

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);
	}

}
