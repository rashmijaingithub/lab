package com.excel;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fib series 0 1 1 2 3 5 
		int num1=0;
		int num2=1;
		int count=7;
		
		for(int i=0;i<count;i++)
		{
			System.out.println("fibonacci series "  +num1);
			
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}

	}

}
