package learning.m.pack1;
//Cannot change non static varible in static method, we can change only static variable.
//cannot call non static method using static method
// Not required object to call static method we can call using class
//this and super cannot be used in static context
public class Staticmethod {
	
	int rollno;
	 String name;
	static String collage="BIT";

 static void change()
{
	 collage="PES"; 
}
	
Staticmethod(int i,String n)
{
   rollno=i;
	name=n;
}

void display()
{
	System.out.println(+rollno+" "+name+ " "+collage );
}

	public static void main(String[] args) {
		Staticmethod.change();
	Staticmethod s1=new Staticmethod(123,"rashmi");
	Staticmethod s2=new Staticmethod(345,"jain");
	s1.display();
	s2.display();
	}

}
