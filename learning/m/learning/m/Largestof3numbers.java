package learning.m;

public class Largestof3numbers {
	public static void main(String[] args) {
		
		int i=20,j=10,x=19;
		int temp;
		
		if(i>j&&i>x)
		{
			System.out.println("The greatest value is i " +i);
		}
		else if (j>x&&j>i) {
			System.out.println("The greatest of 3 number is j " +j);
			
		}
		else  {
			System.out.println("The greatest number is x " +x);
			
		}
		
	}

}
