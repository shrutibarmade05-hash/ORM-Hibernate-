package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	 @Id
	 private int id;
	    private String name;
	    private String email;
	    private String mobile;
	    private String gender;
	    private int age;
	    private String city;
	    private String state;
	    private String country;
	    private String pincode;
	    private String address;
	    private String occupation;
	    private double salary;
	    private String username;
	    private String password;
	    
	    
	    
	    //generate constructor using superclass
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		//generate constructor using fields

		public Customer(int id, String name, String email, String mobile, String gender, int age, String city,
				String state, String country, String pincode, String address, String occupation, double salary,
				String username, String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
			this.gender = gender;
			this.age = age;
			this.city = city;
			this.state = state;
			this.country = country;
			this.pincode = pincode;
			this.address = address;
			this.occupation = occupation;
			this.salary = salary;
			this.username = username;
			this.password = password;
		}

//generate to string
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
					+ gender + ", age=" + age + ", city=" + city + ", state=" + state + ", country=" + country
					+ ", pincode=" + pincode + ", address=" + address + ", occupation=" + occupation + ", salary="
					+ salary + ", username=" + username + ", password=" + password + "]";
		}

		
		
		//generate getter and setter

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


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getMobile() {
			return mobile;
		}


		public void setMobile(String mobile) {
			this.mobile = mobile;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public String getPincode() {
			return pincode;
		}


		public void setPincode(String pincode) {
			this.pincode = pincode;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getOccupation() {
			return occupation;
		}


		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}

	   
		
		
		
		
		
	    
	    
}
