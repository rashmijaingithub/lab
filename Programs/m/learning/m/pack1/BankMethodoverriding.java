package learning.m.pack1;

 class Bank
{

	int getrateofinterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
   int getrateofinterest()
	{
		return 8;
	}

	class ICICI extends Bank
	{
		int getrateofinterest()
		{
			return 7;
		}
	}
	
	}

public class BankMethodoverriding {

	public static void main (String arg[])
	{

SBI s=new SBI();


System.out.println("SBI rate of interest" +s.getrateofinterest());
//System.out.println("ICICI rate of interest" +I.getrateofinterest());
//System.out.println("AXIS rate of interest" +a.getrateofinterest());
	}

}
