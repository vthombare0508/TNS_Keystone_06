package com.tnsif.dayfour.singleinheritance;


public class Parent {
	int i=10;
	public void parentmethod()
	{
		System.out.println("Parent class method");
	}	
}
class ChildClass extends Parent
{
	int x=10;
	public void childmethod()
	{
		System.out.println("child class method");
	}

}

