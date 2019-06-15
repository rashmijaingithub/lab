package learning.m;

public class Whileloop {
	public static void main(String arg[])
	{
		int count=0;
		//print 5,10,15,20,25
		while(count<25)
		{
			count=count+5;
		
			System.out.println("count "  +count);
		}
		
		//will not print count even once
		
		int countonce=25;
		while(countonce<25)
		{
			countonce=countonce+5;
		
			System.out.println("count once " +countonce);
		}
		
	}

}
