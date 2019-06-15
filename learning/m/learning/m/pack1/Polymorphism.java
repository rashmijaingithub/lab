package learning.m.pack1;

class bank1
{
	float getrateofinterest()
	{
		return 0;
	}
	
}

class SBI1 extends bank1
{
	float getrateofinterest()
	{
		return 	8.3f;
	}
}
class ICICI1 extends bank1
{
	float getrateofinterest()
	{
		return 9.3f;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank1 b;
		b=new SBI1();

	System.out.println("interest rate of SBI " +b.getrateofinterest());
	b=new ICICI1();
	System.out.println("interest rate of ICICI " +b.getrateofinterest());
	}

}
