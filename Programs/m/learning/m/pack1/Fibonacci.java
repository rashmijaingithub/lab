package learning.m.pack1;

public class Fibonacci {
	public static void main (String arg[])
	{
		int x=0,y=1,a,count=10;
		int z;
	System.out.println(x);
	System.out.println(y);
	for(z=2;z<count;z++)
	{
		 a=x+y;
		 System.out.println(a);
		 x=y;
		 y=a;	 
	
	}
		
}}