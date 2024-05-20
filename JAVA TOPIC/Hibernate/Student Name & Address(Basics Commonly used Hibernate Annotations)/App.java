package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cgf.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
//        System.out.println( "done" );
        
    	
    	Student st=new Student();
    	st.setId(123);
    	st.setName("vivek");
    	st.setCity("Bhopal");
    	 System.out.println(st );
    	 
    Session session= factory.openSession();

   
 Transaction tx=   session.beginTransaction();
 session.save(st);
 tx.commit();
    
    session.close();
        
    }
}
