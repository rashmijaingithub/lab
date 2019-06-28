package learning.m.pack1;
class Adder
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}



public class Methodoverloadingpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(10, 11));
		System.out.println(Adder.add(10,11, 12));
		

	}

}
