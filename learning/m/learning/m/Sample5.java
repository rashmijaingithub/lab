package learning.m;

public class Sample5 {
	
	int i=10;
	static int test()
	{
		System.out.println("running test");
		
		Sample5 ref= new Sample5();
		ref.i=20;
		System.out.println("Value of i " +ref.i);
		return ref.i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program starts");
		int ref1= test();
		
		System.out.println("Value of ref" +ref1);
		
	}

}
