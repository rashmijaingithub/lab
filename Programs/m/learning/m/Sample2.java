package learning.m;

public class Sample2 {
	static void test1()
	{
		System.out.println("Running first test1");
		int i=10;
		System.out.println("Value of i "  +i);
	}
	
	void test2()
	{
		System.out.println("running test2");
		int k=12;
		System.out.println("Value of k "  +k);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program starts  ");
	test1();
		Sample2 ref1=new Sample2();
		ref1.test2();
		System.out.println("Program ends");
		

	}

}
