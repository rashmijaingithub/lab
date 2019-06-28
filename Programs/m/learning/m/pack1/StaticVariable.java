package learning.m.pack1;

class staticvar
{
	int i;
	static String name="Rashmi";
	
	staticvar(int in, String n)
	{
		i=in;
	}
	void display()
	{
		System.out.println(+i+" "+name);
	}
}


public class StaticVariable {

	public static void main(String[] args) {
		staticvar s1=new staticvar(3,"rashmi");
		s1.display();
		
		
	
		

	}

}
