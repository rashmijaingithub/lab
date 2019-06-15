package learning.m.pack1;
//The this keyword can also be passed as an argument in the method. 
//It is mainly used in the event handling.

class s2
{
		void m (s2 obj)
{
	System.out.println("method invoked");
}
		
		void p()
		{
			m(this);
		}
}

public class thisarugumentmethod {

	public static void main(String[] args) {
		s2 s1=new s2();
		s1.p();

	}

}
