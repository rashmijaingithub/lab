package learning.m.pack1;

abstract class Bike2
{
	abstract void run();
}

public class Honda3 extends Bike2
{
void run()
{
	System.out.println("bike is running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike2 b=new Honda3();
		b.run();

	}

}
