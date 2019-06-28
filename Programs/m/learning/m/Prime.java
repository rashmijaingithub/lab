package learning.m;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j;
		int count=0;
	
		if (i<=0)
		{
			System.out.println("not valid number ");
			
			System.exit(1);
					}
		for(j=2;j<i;j++){
		
			if(i%j==0)
			{
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("not a prime number");
		}
		else {
			System.out.println("prime number");
		}
	}
}


