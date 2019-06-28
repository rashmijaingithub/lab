package learning.m.pack1;

class Vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
class bike extends Vehicle
{
	void run()
	{
		System.out.println("bike is running");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		bike ob=new bike();
		ob.run();
		// TODO Auto-generated method stub

	}

}
