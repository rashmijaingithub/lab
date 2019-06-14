package com.excel;
import java.util.Scanner;

public class Largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* without using scanner 
		 * int num1=40, num2=20,num3=30, temp,result; temp=num1>num2 ? num1:num2;
		 * result=temp>num3 ? temp : num3;
		 * 
		 * System.out.println("largest of numbers is " +result);
		 */
		
		// with scanner class
		
		int num1, num2,num3, temp, result;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		
		num1=scanner.nextInt();
		System.out.println(" Enter second number");
		num2=scanner.nextInt();
		System.out.println("Enter 3rd number "); 
		num3=scanner.nextInt();
		scanner.close();
		
		temp=num1>num2 ? num1: num2;
		result=temp>num3 ? temp : num3;
		System.out.println(" largest number is "  +result);
		

	}

}
