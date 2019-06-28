package learning.m.pack1;

class Ani
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Cat extends Ani
{
	void meow()
	{
		System.out.println("meowing");
	}
}
class babycat extends Cat
{
	void weep()
	{
		System.out.println("weeping");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		babycat b=new babycat();
		b.eat();
		b.meow();
		b.weep();

	}

}
