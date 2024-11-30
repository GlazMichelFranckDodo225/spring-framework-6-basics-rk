package com.dgmf;

import com.dgmf.beans.xmlconfig.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFramework6XmlContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFramework6XmlContextApplication.class);

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext xmlApplicationContext =
					new ClassPathXmlApplicationContext(
							"applicationContext.xml"
					)
		) {
			LOGGER.info(
					"All Beans Loaded ==> {}",
					// xmlApplicationContext.getBeanDefinitionCount()
					// [xmlJdbcConnection, xmlPersonDAO]
                    (Object) xmlApplicationContext.getBeanDefinitionNames()
            );

			XmlPersonDAO xmlPersonDAO =
					xmlApplicationContext.getBean(XmlPersonDAO.class);

			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());

			LOGGER.info(
					"{} ||| {}",
					xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection()
			);
		}
	}

}
