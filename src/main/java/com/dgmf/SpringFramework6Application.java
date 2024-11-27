package com.dgmf;

import com.dgmf.beans.basics.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringFramework6Application {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(
							SpringFramework6Application.class
					)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch2);

			int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

			System.out.println(result);
		}
	}

}
