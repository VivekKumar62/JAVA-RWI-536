package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
   
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cgf.xml"); // Load default configuration file
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // Fetch student with id 1 get
//        Student student =(Student)session.get(Student.class,1);
//        System.out.println(student);
        
        
     // Fetch student with id 1 load
        Student student =(Student)session.load(Student.class,1);
        System.out.println(student);
//        Address ad=(Address)session.get(Address.class,2);
//        System.out.println(ad.getStreet()+" : "+ad.getCity());
       
        

        session.close();
        factory.close();
    }
}
