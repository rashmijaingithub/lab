package learning.m;

public class Demo2 {

	static double area_circle()
	{
		int radius=20;
		double area_circle=(3.14*radius*radius);

		return area_circle;
	}
	
	static float area_circumference()
	{
		int radius=10;
		float area_circumference=(float) (2*3.14*radius);
		return area_circumference;
		
		
	}
	public static void main(String args[]) 
	{
		System.out.println("starts");
		area_circle();
		System.out.println(area_circle());
		
		System.out.println(area_circumference());
		
	}
}
	