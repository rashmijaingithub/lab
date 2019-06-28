package learning.m.pack1;

interface Drawable{
	void draw();
}

class Rectangle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Circle");
	}
}

public class TestInteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stubd
		
		Drawable d;
		d=new Rectangle1();
		d.draw();

	}

}
