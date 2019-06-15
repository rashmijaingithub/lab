package learning.m.pack1;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add(1111111);
		obj1.add('H');
		obj1.add("Selenium");
		obj1.add("Selenium");
		obj1.add(12.34);
		//System.out.println(obj1);
		//System.out.println("Value of obj1 " +obj1.get(3));
		int size_arraylist=obj1.size();
		for(int i=0;i<size_arraylist;i++)
		{
			System.out.println("Values from arraylist " +obj1.get(i));
		}
		

	}

}
