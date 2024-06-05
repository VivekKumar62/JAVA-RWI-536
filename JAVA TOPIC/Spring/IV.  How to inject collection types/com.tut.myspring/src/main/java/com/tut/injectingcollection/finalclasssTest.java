package com.tut.injectingcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class finalclasssTest {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("injectingcoll.xml");
		  MyEmp myemp1=(MyEmp) context.getBean("myemp1");
		  System.out.println("MyName is   " + myemp1.getName());
		  System.out.println("MyPhone Number is " +myemp1.getPhones());
		  System.out.println("MyAddress is  "+myemp1.getAddresses());
		  System.out.println("MyCources is  "+myemp1.getCources());
		  
	}

}
