package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
    @Id
	private int phoneNumber;
    private String sName;
    private String sClass;
    private String sAddress;
    private String sEmail;
    
    
	public Student(int phoneNumber, String sName, String sClass, String sAddress, String sEmail) {
		super();
		this.phoneNumber = phoneNumber;
		this.sName = sName;
		this.sClass = sClass;
		this.sAddress = sAddress;
		this.sEmail = sEmail;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
    
    
}
