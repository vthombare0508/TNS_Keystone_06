package com.tnsif.daytwo.conditionalstatements;

public class NestedIfDemo {
	public static void main(String args[])
	{
		int passout_year = 2025;
		int income=3000000;
		
		if(passout_year == 2026)
		{	
			if(income < 500000)
			{
				System.out.println("Welcome to the TNSIF Training");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
		
	}

}
