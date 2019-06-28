package learning.m;

public class Sample1 {
	
	static int k=120;
	double l=12.5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of k is "  +k);
		Sample1.k=130;
		
		//Instace creation
		Sample1 ref1=new Sample1();
		System.out.println("Value of l is "   +ref1.l);		
		ref1.l=13.5;
		System.out.println("New value of l is "  +ref1.l);
		//Another instance
		
	Sample1 ref2=new Sample1();
	System.out.println("L value with ref2 " +ref2.l);
	ref2.l=15.35;
	System.out.println("L new value for ref2 " +ref2.l);
	System.out.println("New value of k is "  +Sample1.k);
	System.out.println("Program ends");
	
	
	
		

	}

}
