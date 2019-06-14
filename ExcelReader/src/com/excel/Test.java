package com.excel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="(6 items)";
		/*
		 * int intvalue=Integer.parseInt(str); System.out.println(intvalue);
		 */
		String str1=str.substring(1, 2);
		System.out.println(str1+1);
		int intvalue=Integer.parseInt(str1); 
		System.out.println(intvalue+1);

	}

}
