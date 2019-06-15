
//upcasting : when reference variable of the parent class is refers to the object of the child class
package learning.m;

class bike
{
	void run()
	{
		System.out.println("running");
	}
}
public class Spelder extends bike
{
void run()
{
	System.out.println("splender is running");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b=new Spelder();
		b.run();		
}

}
