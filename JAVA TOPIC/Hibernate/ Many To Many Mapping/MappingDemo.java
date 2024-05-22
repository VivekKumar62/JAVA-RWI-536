package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Question;

public class MappingDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cgf.xml");  // Corrected the filename
        SessionFactory factory = cfg.buildSessionFactory();

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setEid(8);
        e1.setName("Vivek");

        e2.setEid(123);
        e2.setName("Bikku");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setPid(160);
        p1.setProjectName("Company Website");

        p2.setPid(180);
        p2.setProjectName("Hospital Management System");

        List<Employee> employees = new ArrayList<>();
        List<Project> projects = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);

        projects.add(p1);
        projects.add(p2);

        e1.setProjects(projects);
        e2.setProjects(projects);

        p1.setEmps(employees);
        p2.setEmps(employees);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        
        Employee employeeSearch = session.get(Employee.class, 8);  // Corrected ID for fetching
        Project projectSearch = session.get(Project.class, 180);  // Corrected ID for fetching
        
        System.out.println("Employee Name: " + employeeSearch.getName());
        System.out.println("Projects: ");
        for (Project project : employeeSearch.getProjects()) {
            System.out.println("Project Name: " + project.getProjectName());
        }

        System.out.println("Project Name: " + projectSearch.getProjectName());
        System.out.println("Employees: ");
        for (Employee employee : projectSearch.getEmps()) {
            System.out.println("Employee Name: " + employee.getName());
        }

        tx.commit();
        session.close();
        factory.close();
    }
}
