package learning.m;

public class NewTest {

	public static class D {
	       int k;

	       D(int a)
	              {
	              System.out.println("Running D() constuctor");
	              k = a;
	              }
	       
	class Demo4{
		
	}
	       public static void main(String[] args) {
	                     System.out.println("Program Starts");
	                     D ref1 = new D(54);
	                     System.out.println("K Value :"+ref1.k);
	                     D ref2 = new D(87);
	                     System.out.println("K Value :"+ref2.k);
	              }
	}
	}

	

