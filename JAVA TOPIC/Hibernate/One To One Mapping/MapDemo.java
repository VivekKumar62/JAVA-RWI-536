package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cgf.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating question
        Question q1 = new Question();
        q1.setQuestionId(101);
        q1.setQuestion("What is your profile?");

        // Creating answer
        Answer answer = new Answer();
        answer.setAnswerId(102);
        answer.setAnswer("I am a software developer");
        q1.setAnswer(answer);

        // Creating another question
        Question q2 = new Question();
        q2.setQuestionId(103);
        q2.setQuestion("What is your salary?");

        // Creating another answer
        Answer answer1 = new Answer();
        answer1.setAnswerId(104);
        answer1.setAnswer("21k to 32k");
        q2.setAnswer(answer1);

        // Opening session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Save
        session.save(q1);
        session.save(q2);
        session.save(answer);
        session.save(answer1);


        // Commit and close session
        tx.commit();
        
        //fetching by question id 
        Question questionsearch=(Question) session.get(Question.class,101); //question search
        System.out.println(questionsearch.getQuestion());  //print question
        System.out.println(questionsearch.getAnswer().getAnswer()); //print answer
        
        session.close();

        factory.close();
    }
}
