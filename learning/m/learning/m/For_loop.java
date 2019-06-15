package learning.m;

public class For_loop {

	public static void main (String arg[])
{
	
		int Increment,Decrement;
//print 0,1,2,3,4,5
		
for(Increment=0;Increment<=5;Increment++)
{
	System.out.println("Value of Increment "+Increment);
}
	//print 5,4,3,2,1,0
for(Decrement=5;Decrement>=0;Decrement--)
{
	System.out.println("Value of decrement " +Decrement);
}
//print 0,2,4
for(Increment=0;Increment<=5;Increment+=2)
{
	System.out.println("Count "+Increment);
}
}
	

	}


