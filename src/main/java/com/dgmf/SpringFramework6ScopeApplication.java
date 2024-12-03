package com.dgmf;

import com.dgmf.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework6ScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFramework6ScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(SpringFramework6ScopeApplication.class, args);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}
