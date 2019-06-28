package programs;

import java.util.Scanner;

public class EvenOroddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Scanner scr=new Scanner(System.in);
		 * System.out.println("enter the number from keyboard"); int num=scr.nextInt();
		 */
		/*
		 * System.out.println("entre the seocnd number"); int num2=scr.nextInt(); int
		 * avg=(num+num2)/2; System.out.println("average of number " +avg);
		 */
		
		//Even or add
		
		/*
		 * if((num%2)==0) { System.out.println("number is even number " + 1); } else
		 * System.out.println("number is odd number " + 0);
		 */
		 

		
		// Print add numbers from 1 to 99
		/*
		 *  for(int i=1;i<=99;i++) { if(!(i%2==0)) { System.out.println(i); } }
		 */
		
		// numbers between 1 to 100 which are divisible by 3, 5 and by both.
		  
		  for(int i=1;i<=100;i++)
		  {
			  if((i%5==0) && (i%3==0)&& ((i%5==0)&&i%3==0))
          {
	           System.out.println(i);
          }
		  }
		  
		  
		  
		  
		
	}

}
