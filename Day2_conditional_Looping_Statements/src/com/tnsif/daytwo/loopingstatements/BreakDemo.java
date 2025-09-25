package com.tnsif.daytwo.loopingstatements;

public class BreakDemo {

	public static void main(String[] args) {

		int i=1;
		while(i<=10)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
