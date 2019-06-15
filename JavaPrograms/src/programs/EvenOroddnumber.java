package programs;

import java.util.Scanner;

public class EvenOroddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number from keyboard");
		int num=scr.nextInt();
		
		
		if((num%2)==0)
		{
			System.out.println("number is even number");
		}
		else	
             System.out.println("number is odd number");
	}

}
