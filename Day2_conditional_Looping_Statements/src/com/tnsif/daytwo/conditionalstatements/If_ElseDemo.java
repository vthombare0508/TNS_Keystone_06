package com.tnsif.daytwo.conditionalstatements;

public class If_ElseDemo {
	public static void main(String args[])
	{
		int age=13;
		String state = "MH";
		
		if(age>18 && state=="MH")
		{
			System.out.println("Person is eligible for voting");
		}
		else
		{
			System.out.println("Person is not eligible for voting");
		}
	}

}
