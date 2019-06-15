package learning.m;

public class Dowhile {
	public static void main (String arg[])
	{
		int count=0;
		//print 0,5,10,15,20,25	
		do {
			count=count+5;
			System.out.println("count " +count);	
		}
		while(count<25);	
	
		 testMethod(count);
		
		int countonce=25;
		//print not only once
		do {
		countonce=countonce+5;
		
		System.out.println("count once " +countonce);
	} while(countonce<25);

}

	private static void testMethod(int count) {
		// TODO Auto-generated method stub
		System.out.println("countin testmethod"+count);
		
	}}
