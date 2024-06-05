package com.tut.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class standalonemain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        
        Person person = (Person) context.getBean("myperson");
        System.out.println(person);
        System.out.println(person.getPocketmoney());
        System.out.println(person.getPocketmoney().getClass());
        
    }
}
