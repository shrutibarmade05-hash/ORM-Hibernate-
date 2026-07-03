package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {   //one to many
     
	@Id
	int dept_Id;
	String dept_Name;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private List<Employee> emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dept_Id, String dept_Name, List<Employee> emp) {
		super();
		this.dept_Id = dept_Id;
		this.dept_Name = dept_Name;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [dept_Id=" + dept_Id + ", dept_Name=" + dept_Name + ", emp=" + emp + "]";
	}

	public int getDept_Id() {
		return dept_Id;
	}

	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}

	public String getDept_Name() {
		return dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	
	
	
	
}
