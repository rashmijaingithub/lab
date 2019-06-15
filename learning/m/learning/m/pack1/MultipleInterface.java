package learning.m.pack1;

interface printable1 
{
	void print();
}

interface showable extends printable1
{
	void show();
}
class MultipleInterface implements showable {
	
	public void print()
	{
		System.out.println("print");
	}
	public void show()
	{
		System.out.println("show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInterface obj=new MultipleInterface();
		obj.print();
		obj.show();
		

	}

}
