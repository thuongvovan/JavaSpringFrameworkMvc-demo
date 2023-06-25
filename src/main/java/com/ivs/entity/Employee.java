package com.ivs.entity;

public class Employee {

	private String id;
	
	private String name;
	
	private String address;
	
	private String department;
	
	private String phone;
	
	private String email;
	
	
	public Employee(String id, String name, String address, String department, String phone, String email) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
		this.phone = phone;
		this.email = email;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "[" + "id = " + id + ", name = " + name + ", address = " + address 
                + ", department = " + department  + ", phone = " + phone  + ", email = " + email + "]";  
	}
	
}
