package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values=new ArrayList();	
		values.add(404);
		values.add(449);
		values.add(503);
		
		//Comparator<Integer> c=(i,j)-> i%10>j%10?1:-1;
		
		Collections.sort(values, (i,j)-> i%10>j%10?1:-1);
		//Collections.reverse(values);
		for(Integer o :values)
		{
			System.out.println(o);
		}
	}


		
	}


