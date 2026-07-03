package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "empData")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	
	private String empname;
	private double salary;
	private String city;
	private int experience;
	@Column(unique = true,nullable = true)// notnull , Unique key
	private long MobileNo;
	@Column(unique = true)
	private String emailId;
	
	
	//generate constructor using superclass
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//generate constructor using fields
	public Employee(int empid, String empname, double salary, String city, int experience, long mobileNo,
			String emailId) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.city = city;
		this.experience = experience;
		MobileNo = mobileNo;
		this.emailId = emailId;
	}


	
	//generate getter and setter
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}
    public void setEmpname(String empname) {
		this.empname = empname;
	}
    public double getSalary() {
		return salary;
	}
    public void setSalary(double salary) {
		this.salary = salary;
	}
    public String getCity() {
		return city;
	}
    public void setCity(String city) {
		this.city = city;
	}
    public int getExperience() {
		return experience;
	}
    public void setExperience(int experience) {
		this.experience = experience;
	}
    public long getMobileNo() {
		return MobileNo;
	}
    public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
    public String getEmailId() {
		return emailId;
	}
    public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", city=" + city
				+ ", experience=" + experience + ", MobileNo=" + MobileNo + ", emailId=" + emailId + "]";
	}
	
	
	
	
	
	
	
	
	

}
