package learning.m;

public class Sample4 {

	static int i=10;
	double d=2.34;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program starts");
		System.out.println("Value of i "  +i);
		
		Sample4 ref=new Sample4();
		System.out.println("Value of d " +ref.d);
		ref.test1();
		System.out.println("Program ends");

	}

	void test1()
	{
		System.out.println("runnig test1");
		System.out.println(i);
		System.out.println(d);
		
	}
}
