package learning.m.pack1;

class Ani1
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog1 extends Ani
{
	void bark()
	{
		System.out.println("barking");
	}
}
class Cat1 extends Ani1
{
	void meow()
	{
		System.out.println("meowing");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Cat1 c=new Cat1();
		c.eat();
		c.meow();

	}

}
