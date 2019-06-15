package learning.m;

import com.sun.javafx.binding.StringFormatter;

public class ReverseString {
	
	public  String reverse(String str)
	{
		String reverese="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverese=reverese+str.charAt(i);
		}
		return reverese;
	}

	//using String builder 
	public static void main (String args[])
	{
		/*
		 * String str="rashmi jain"; StringBuilder sb=new StringBuilder(str);
		 * StringBuilder str2=sb.reverse(); System.out.println(str2);
		 */
		/*String str="rashmi jain";
		String reverse ="";
		int length=str.length();
		System.out.println(length-1);
		for(int i=length-1;i>=0;i--)
		{	
			reverse=reverse+str.charAt(i);	
		}
		System.out.println(reverse);*/
		ReverseString obj=new ReverseString();
		String reversestr=obj.reverse("Rashmi jain");
		System.out.println("Reverse string "  +reversestr);
		
		//System.out.println("Reverse string "  +reverse("rashmi jain"));
		String sub=reversestr.substring(0, 5);
		System.out.println("Sub string " +sub);
		
	}

		
		
		
}
