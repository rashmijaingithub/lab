package learning.m.pack1;
class Cons
{
	int id;
	String name;
	int age;
	
	Cons(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	Cons(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("Valie of " +id +" "+name+" "+age);
	}
	
}

public class Contructor1 {

	public static void main(String[] args) {
		
	Cons s1=new Cons(1,"John");
	Cons s2=new Cons(2,"Kumar",22);
	s1.display();
	s2.display();

	}

}
