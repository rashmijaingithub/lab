package learning.m;

public class Demo {
	
	static void test1()
	{
		System.out.println("Running test1()");
		int num1=10;
		System.out.println("num1 is" +num1 );
		//System.out.println(var);
	}
	
	static void test2(int arg)
	{
		System.out.println("running test2");
		System.out.println("argument "  +arg);
	}
	
	public static void main (String arg[])
	
	{ 
		System.out.println("Program starts");
		test1();
		test2(20);
		System.out.println("program ends");
	}

}
