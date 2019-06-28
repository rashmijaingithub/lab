package learning.m.pack1;
//The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. 
//Let's see the example given below that displays the actual use of this keyword.

class thiscon
{
	int rollno;
	String name,course;
	float fee;
thiscon(int rollno,String name,String course)	
{
	this.rollno=rollno;
	this.name=name;
	this.course=course;
}
thiscon(int rollno, String name, String course, float fee)
{
//	/Rule: Call to this() must be the first statement in constructor.
	this(rollno,name,course);
	this.fee=fee;
}
	void display()
	{
		System.out.println(+rollno +" "+name+" "+course+" "+fee);
	}
}


public class thisconstuctor {

	public static void main(String[] args) {
		thiscon s1=new thiscon(123,"rashmi","java");
		thiscon s2=new thiscon(234,"jain","java",5000f);
		s1.display();
		s2.display();

	}

}
