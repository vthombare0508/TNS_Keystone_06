package com.day1.dataMembers;
import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {

		int id;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID");
		id= sc.nextInt();
		System.out.println("ID : "+id);
		
		System.out.println("Enter Name");
		name= sc.next();
		System.out.println("Name : "+name);
		
;	}

}
