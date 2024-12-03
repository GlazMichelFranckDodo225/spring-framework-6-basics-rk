package com.dgmf;

import com.dgmf.basics.BinarySearchImpl;
import com.dgmf.properties.SomeExternalServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
// To load Properties
@PropertySource("classpath:app.properties")
public class SpringFramework6PropertiesApplication {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(
							SpringFramework6PropertiesApplication.class
					)) {
			SomeExternalServices someExternalServices =
					applicationContext.getBean(SomeExternalServices.class);

			System.out.println(someExternalServices);
			System.out.println(someExternalServices.returnServiceUrl());
		}
	}

}
