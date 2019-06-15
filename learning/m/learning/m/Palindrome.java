package learning.m;

public class Palindrome {

	public static void main(String[] args) {
		{
		      int num=121;
		      int temp=num;
		      int reversenum =0;
		      while( num != 0 )
		      {
		          reversenum = reversenum * 10;
		          reversenum = reversenum + num%10;
		          num = num/10;
		      }

		      //System.out.println("Reverse of specified number is: "+reversenum);
		      if(reversenum==temp)
		      {
		    	  System.out.println("Entered number is  Palidrome");
		      }
		      else
		    	  System.out.println("Entered number is not a Palidrome");
		      
		   }
		}}

	