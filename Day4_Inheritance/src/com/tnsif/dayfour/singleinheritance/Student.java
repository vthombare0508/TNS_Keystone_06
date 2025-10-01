//Program to demonstrate Single Inheritance
package com.tnsif.dayfour.singleinheritance;

//creating child class
public class Student extends Citizen{
	
	private int rollNo;
	private String collegeName;
	
	public Student() {
		super(); // call parent class constructor
	}
	
	public Student(String name, long adharno, String address, long phno,int rollNo, String collegeName ) {
		super(name, adharno, address, phno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	
}
