package learning.m.pack1;

class Account3
{
	int Acct_no;
	String Name;
	float amount;

	void insert(int a,String n,float amt)
	{
		Acct_no=a;
		Name=n;
		amount=amt;
	}
void deposite(float amt)
{
	amount=amt+amount;
	System.out.println(+amt + " " + "desposited" );
}
void withdrawn(float amt)
{
	if(amt>amount)
	{
		System.out.println("Insufficient balance");
	}else
	{
		amount=amount-amt;
		System.out.println(+amt+ "withdrawn");
	}		
}
void display()
{
	System.out.println(+Acct_no+""+Name+""+amount);
}
void checkbalance()
{
	System.out.println(+amount);
}
}

public class Account2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account3 a1=new Account3();
		a1.insert(123, "Rashmi", 5000);
		a1.checkbalance();
		a1.deposite(500);
		a1.display();
		a1.withdrawn(1000);
		a1.checkbalance();
		
	}

}
