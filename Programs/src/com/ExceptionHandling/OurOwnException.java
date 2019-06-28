package com.ExceptionHandling;

public class OurOwnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=8;
		int k=9;
		try
		{
		int num=i/k;
		System.out.println(num);
		
		// we can create our own exception by creating new exception class 
		if (num==0) throw new teslukoException("this is not possible");
		}
		catch(teslukoException e)
		{
			System.out.println("Exception"  +e.getMessage());
		}
	}

}
