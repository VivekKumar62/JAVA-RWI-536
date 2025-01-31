package com.tut.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Embedded;

@Entity
@Table(name="mystudent")
public class Student {

    @Id
    private int id;
    private String name;
    private String city;
    
    @Embedded
    private Certificate certificate;

    public Student() {
        super();
    }

    public Student(int id, String name, String city, Certificate certificate) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.certificate = certificate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
    }
}
