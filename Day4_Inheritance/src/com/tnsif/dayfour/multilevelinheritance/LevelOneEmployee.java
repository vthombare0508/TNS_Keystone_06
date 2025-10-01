package com.tnsif.dayfour.multilevelinheritance;

import java.util.Date;

public class LevelOneEmployee extends Employee {

	private int noOfShares;
	private String authority;
	
	public LevelOneEmployee() {
		super();
	}

	public LevelOneEmployee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary,int noOfShares, String authority) {
		super(name, contactNo, dateOfBirth, deptName, baseSalary);
		this.noOfShares = noOfShares;
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [noOfShares=" + noOfShares + ", authority=" + authority + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
