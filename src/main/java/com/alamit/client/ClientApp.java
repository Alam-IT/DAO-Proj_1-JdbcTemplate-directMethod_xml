package com.alamit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alamit.service.CustomerService;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alamit/config/applicationContext.xml");

		CustomerService service = context.getBean("service", CustomerService.class);

		String firedCustomer = service.removeCustomer(1);
		System.out.println(firedCustomer);
		System.out.println();

		System.out.println("getCustomerDetail" + service.getCustomerDetail(2));
		System.out.println("getAllCustomerDetail" + service.getAllCustomerDetail());

	}

}
