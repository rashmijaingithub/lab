package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we cannot use indexing so we use list
		List<Integer> values=new ArrayList();	
		values.add(404);
		values.add(449);
		values.add(503);
		//values.add(0, 2);
	
		//System.out.println(values);
		/*
		 * Iterator it=values.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		/*
		 * for(int i=0;i<values.size();i++) { System.out.println(values.get(i)); }
		 */
		Comparator<Integer> c=new Comparator<Integer>()
				{
			public int compare(Integer i, Integer j)
			{
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
				};
		Collections.sort(values, c);
		//Collections.reverse(values);
		for(Integer o :values)
		{
			System.out.println(o);
		}
	}

}
