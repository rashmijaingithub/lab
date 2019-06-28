package learning.m.pack1;

class Ani2
{
	void eat()
	{
		System.out.println("eating");
	}
}

class Dog3 extends Ani2
{
	void eat()
	{
		System.out.println("eating bread");
	}
	void bark()
	{
	System.out.println("barking");
}
	void work()
	{
		super.eat();
		bark();
	}
}

public class Supermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog3 ob=new Dog3();
	
		ob.work();

	}

}
