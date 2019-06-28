package com.ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
		
	  int a[]= new int[5];
	  a[5]=10;
	  int i=10/0;
		System.out.println("first line");
  }
 // catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
  
  catch(ArithmeticException e)
  
  {
	  System.out.println("Cannot divid by 0");
  }
catch(ArrayIndexOutOfBoundsException e)
  
  {
	  System.out.println("Error");
  }
catch(NullPointerException e)
  
  {
	  System.out.println("Null pointer");
  }
  finally 
  {
		System.out.println("end");
		
	}

}}
