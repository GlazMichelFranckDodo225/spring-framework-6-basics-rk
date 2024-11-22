package com.dgmf;

import com.dgmf.beans.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework6ComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFramework6ComponentScanApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringFramework6ComponentScanApplication.class, args);

		ComponentPersonDAO componentPersonDAO =
				applicationContext.getBean(ComponentPersonDAO.class);

		LOGGER.info("{}", componentPersonDAO);
	}

}
