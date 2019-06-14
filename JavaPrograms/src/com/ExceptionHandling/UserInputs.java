package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//Compiler know about the exception its called checked exceptions
// Compiler dont prompt unchecked exception
// io is not part of runtime exception 
//run time exception subclasses are unchecked remaining all are checked exception 


public class UserInputs {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
         System.out.println("Enter the number ");
         int n=0;
        // BufferedReader br=null;
         try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))
         {
        	   
        // br=new BufferedReader(new InputStreamReader(System.in));
          n= Integer.parseInt(br.readLine());
         }
        
       /*  finally 
         {
        	 br.close();
        	 //System.out.println("closed");
         }*/
         
      System.out.println(n);
	}}


