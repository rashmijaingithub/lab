package learning.m.pack1;
// it support 3 types SIngle, multi level and hierarchical 
// Java doesnt support multiple inheritance and hybrid

class Animal
{
void eat()
{
	System.out.println("eating");
}}

class Dog extends Animal
{
	void barking()
	{
		System.out.println("Barking");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.barking();
		d.eat();
		
	}

}
