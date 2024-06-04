package com.tut.com.tut.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        
        employee1 empl1 = (employee1) context.getBean("employee1");
        System.out.println(empl1);
        

        employee1 empl2 = (employee1) context.getBean("student2");
        System.out.println(empl2);
        
        employee1 empl3 = (employee1) context.getBean("person");
        System.out.println(empl3);
    }
}
