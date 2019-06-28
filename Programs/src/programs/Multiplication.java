package programs;

import java.util.Scanner;

public class Multiplication {

	
	public static void main(String args[])
	{
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("enter the first number"); int num1=sc.nextInt();
		 * System.out.println("enter the second  number"); int num2=sc.nextInt();
		 * System.out.println(num1 + " x " +num2 + " = " + num1*num2);
		 */
		
		int num=8; int i;int result;
		for(i=1;i<=10;i++)
		{
			result=num*i;
			System.out.println(num + "x"  + i + "=" +result);
		}
		System.out.println("   j    a    v      v   a");
		System.out.println("   j   a  a    v   v   a a");
		System.out.println("j  j   aaaaa    v v   aaaaa");
		System.out.println(" jj   a      a   v   a     a");
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		// Area of circle and perimeter
		//area=pir2, perimeter=2pir
		double radius=7.5;
		double  perimeter= 2 * Math.PI * radius;
		double area=Math.PI * radius *radius;
		System.out.println("perimeter "   +perimeter);
		System.out.println("perimeter "   +area);
		double width=5.5; double height=8.5;
		
		double areaofrectangle=(width*height);
		double perimeterofractangle=2*areaofrectangle;
		System.out.println("area of rectangle " +areaofrectangle +"perimeterofractangle " + perimeterofractangle );
		//Swap two numbers
		int a, b, temp;
		a=10; b=30;
		System.out.println(" before swapping : a, b =" +a +"," +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println(" after swapping : a, b =" +a +"," +b);
		//without 3rd varibale 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" after swapping : a, b =" +a +"," +b);
		
		 
		
		
		}
}
