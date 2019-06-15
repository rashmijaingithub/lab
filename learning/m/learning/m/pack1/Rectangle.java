package learning.m.pack1;

//import org.apache.xerces.util.SynchronizedSymbolTable;

class TestRectangle
{
	int length;
	int width;
	
	void insert(int l,int w)
	{
		length=l;
		width=w;	
	}
	void display()
	{
	System.out.println(length*width);
}}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestRectangle t1=new TestRectangle();
		TestRectangle t2=new TestRectangle();
		t1.insert(20, 30);
		t2.insert(50, 60);
		t1.display();
		t2.display();
		
		}
	

}
