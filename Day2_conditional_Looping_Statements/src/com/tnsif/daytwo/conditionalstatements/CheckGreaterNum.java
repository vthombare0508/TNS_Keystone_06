package com.tnsif.daytwo.conditionalstatements;

public class CheckGreaterNum {

	public static void main(String[] args) {

		int a=10, b=15,c=21;
		
		if(a>b && a>c)
		{
			System.out.println("A is greater number");
		}
		else if( b>c)
		{
			System.out.println("B is greater number");
		}
		else 
		{
			System.out.println("C is greater number");
		}
		
		
	}

}
