package com.tut.com.tut.myspring;

public class employee1 {
	private String name;
	private int empid;
	private String about;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee1(String name, int empid, String about) {
		super();
		this.name = name;
		this.empid = empid;
		this.about = about;
	}
	@Override
	public String toString() {
		return "employee1 [name=" + name + ", empid=" + empid + ", about=" + about + "]";
	}
	
}
