package learning.m.pack1;

public class Counter {
	//int count=0;
	// without static it display results as "1,1,1" 
	//Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable, if it is incremented, it won't reflect to other objects. 
	//So each objects will have the value 1 in the count variable.
	static int count=0; 
	//static count display reults 1,2,3,static variable will get the memory only once, 
	//if any object changes the value of the static variable, it will retain its value.
	Counter()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
	
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
	

	}

}
