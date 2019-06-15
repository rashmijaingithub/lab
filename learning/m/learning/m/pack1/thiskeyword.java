package learning.m.pack1;
// This keyword is refernce variable in java and refer to the current object.
//1) this: to refer current class instance variable
//
class currentobj {
	int rollno;
	String name;
	float fee;
	
	//parameters (formal arguments) and instance variables are same. 
	//So, we are using this keyword to distinguish local variable and instance variable. will get the results 0 if we are not using this keyword
	currentobj(int rollno,String name,float fee)
	{
        this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(+rollno +" " +name+ " "+fee);
		
	}
	
}

public class thiskeyword {

	public static void main(String[] args) {
	currentobj o=new currentobj(123,"rashmi",500f);
	o.display();

	}

}
