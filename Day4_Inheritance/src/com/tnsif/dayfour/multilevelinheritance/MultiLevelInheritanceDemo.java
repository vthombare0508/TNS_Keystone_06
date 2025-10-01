// Program to demonstrate multilevel inheritance
package com.tnsif.dayfour.multilevelinheritance;

import java.util.Date;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {

		Person p1= new Person("Pranav",9876543212L, new Date(2000,00,2) );
		System.out.println(p1);
		
		p1= new Employee("Akash",9878765432L, new Date(2001,02,23),"IT",45000);
		System.out.println(p1);
		
		p1= new LevelOneEmployee("Madhur",7865432312L, new Date(2001,9,3),"Database",50000,23,"Signing Authority");
		System.out.println(p1);
	}

}
