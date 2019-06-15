package learning.m.pack1;

interface printable
{
	void print();
}

class A6 implements printable
{
	public void print()
	{
		System.out.println("print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A6 obj=new A6();
		obj.print();
		
	}

}
