package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EMDdemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cgf.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student1 = new Student();
        student1.setId(62016);
        student1.setName("Vivek");
        student1.setCity("indore");

        Certificate certificate = new Certificate();
        certificate.setCourse("flutter");
        certificate.setDuration("4 months");
        student1.setCertificate(certificate);
        
        Student student2 = new Student();
        student2.setId(98018);
        student2.setName("Bikku");
        student2.setCity("Delhi");

        Certificate certificate1 = new Certificate();
        certificate1.setCourse("React JS");
        certificate1.setDuration("4 months");
        student2.setCertificate(certificate1);
        
        
        Session ses= factory.openSession();
        Transaction tx=ses.beginTransaction();
        
        // object save
        
        ses.save(student1);
        ses.save(student2);
        
        tx.commit();
        ses.close();
        factory.close();
        
      
    }
}
