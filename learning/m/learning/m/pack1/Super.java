package learning.m.pack1;
//Super keyword  java is a reference variable which is used to refer immediate parent class object
//

class Animal1
{
	String color="white";
}
class Dog2 extends Animal1
{
	String color="Black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}


public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog2 ob=new Dog2();
		ob.printcolor();

	}

}
