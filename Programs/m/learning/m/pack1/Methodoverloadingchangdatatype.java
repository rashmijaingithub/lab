package learning.m.pack1;

//In java, method overloading is not possible by changing the return type of the method only because of ambiguity.
//Let's see how ambiguity may occur:

class Adder1
{
	static int add(int a, int b) 
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
	
}


public class Methodoverloadingchangdatatype {

	public static void main(String[] args) {
		
		System.out.println(Adder1.add(12.33,11.33));
		System.out.println(Adder1.add(11, 11));
		// TODO Auto-generated method stub

	}

}
