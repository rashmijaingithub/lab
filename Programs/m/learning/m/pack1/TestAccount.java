package learning.m.pack1;

class Account
{
	int acct_no;
	float amount;
	String name;
	
	void insert(int a, float amt, String s)
	{
		acct_no=a;
		amount=amt;
		name=s;
	}
	void deposite(float amt)
	{
		amount=amount+amt;
		System.out.println(amt +"Deposited");
	}
	
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("INsufficient balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}}
	void checkbalance()
	{
		System.out.println("Balance " +amount);
	}
	void display()
	{
		System.out.println(acct_no+" "+name+" "+amount);
	}}
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		a1.insert(123,50000, "Rashmi");
		a1.display();
		a1.checkbalance();
		a1.deposite(5000);
		a1.withdraw(2000);
		a1.checkbalance();

	}

}
