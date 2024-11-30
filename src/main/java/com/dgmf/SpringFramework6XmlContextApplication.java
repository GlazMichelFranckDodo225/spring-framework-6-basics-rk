package com.dgmf;

import com.dgmf.beans.xmlconfig.XmlPersonDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFramework6XmlContextApplication {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext xmlApplicationContext =
					new ClassPathXmlApplicationContext(
							"applicationContext.xml"
					)
		) {
			XmlPersonDAO xmlPersonDAO =
					xmlApplicationContext.getBean(XmlPersonDAO.class);

			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		}
	}

}
