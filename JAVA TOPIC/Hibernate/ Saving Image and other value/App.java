package com.tut.MavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
//        System.out.println( "Hello World!" );
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        
        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cgf.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
//        System.out.println( "done" );
        
    	// creating object of student
    	Student st=new Student();
    	st.setId(123);
    	st.setName("vivek");
    	st.setCity("Bhopal");
    	 System.out.println(st );
    	 
    	// creating object of student
    	Address myAdd=new Address();
    	myAdd.setStreet("Bhopal New Market");
    	myAdd.setCity("Bhopal");
    	myAdd.setStreet("Bhopal New Market");
    	myAdd.setOpen(true);
    	myAdd.setAddedDate(new Date());
    	myAdd.setX(1234.255);
    	
    	// reading image 
    	FileInputStream file=new FileInputStream("src/main/java/mypicinsta.png");
    	byte[]data=new byte[file.available()];
    	file.read(data);
    	myAdd.setImage(data);
    	
     	 System.out.println(myAdd);
    	 
    	 
    Session session= factory.openSession();
   Transaction tx=session.beginTransaction();
 session.save(st);
 session.save(myAdd);
 tx.commit();
    
    session.close();
    System.out.println( "done" );
        
    }
}
