package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {   //many to one
	
	
@Id
int empId;
String empName;

@ManyToOne
@JoinColumn(name = "ddd")
private Department dept;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int empId, String empName, Department dept) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}






}
