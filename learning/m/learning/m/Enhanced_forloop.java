package learning.m;

public class Enhanced_forloop {

	public static void main (String arg[])
	
	//Array string storing days of week
	{
		String days[]= {"Mon","Tue","Wed","Thu","Fri","Sat"};
		//Enhanced for loop it automatically iterate on the array list
		for(String dayName : days)
		{
			System.out.println("Days " +dayName);
		}
		
		//Normal loop
		for(int i=0;i<days.length;i++)
		{
			System.out.println("Days " +days[i]);
		}
		
	}
}
