package learning.m;

public class Switch {
	public static void main (String rags[])
	{
		String sday="Monday";
		int day=9;
		
		switch(sday){
		case "Monday":
			System.out.println("today is monday");
			break;
		case "2":
			System.out.println("today is tuesday");
			break;
		case "3":
			System.out.println("today is wednsday");
		case "4":
		
			break;
		case "5":
			System.out.println("today is thursday");
		
			break;
		case "6":
			System.out.println("today is friday");
			default:
				System.out.println("today is sunday");
				}
		switch(day)
		{
		case 1:
			System.out.println("today is monday");
			break;
		case 2:
		System.out.println("today is tuesday");
		break;
		case 3:
			System.out.println("today is wednsday");
			break;
		case 4:
			System.out.println("today is thursday");
			default:
				System.out.println("today is sunday");
		}
	}

}
