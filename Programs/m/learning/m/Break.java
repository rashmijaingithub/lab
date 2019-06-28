package learning.m;

public class Break {
	public static void main (String arg[])
	{
		int count;
		//print- 0,1,2,3,4,5
		/*
		for(count=0;count<=10;count++)
		{
			if(count==6)
				break;
			
		System.out.println("the value of count " +count);
		}
		System.out.println("Exit loop");
	*/
		//print 0,1,2,4,5
	for(count=0;count<=5;count++)
	{
		if(count==3) {
			continue;
		}
		System.out.println("count " +count);
	}
	//will print 3
		for(count=0;count<=5;count++)
		{
			if(count==3)
				System.out.println("count " +count);
			continue;
			
		}
	}
	
	

}
