package learning.m;

public class ifstatement {

	public static void main(String args[])
	{
		int day=1;
		String sday="Monday";
		
		if (sday.equals("sunday"))
		{
			System.out.println("Today is sunday");
		}
		else if (sday.equals("saturday")){
			System.out.println("Today is saturday");}
			else {
				System.out.println("today is weekday");
			}
		
		if (day==6)
		{
			System.out.println("today is sunday");
		}
		else if (day==7)
		{
			System.out.println("today is not sunday");
		}
		else
			System.out.println("today is weekday");
	}
}
