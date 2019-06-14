package com.excel;

import java.util.ArrayList;
import java.util.List;

public class Arrytest {

	public static void main(String[] args) {
		List testString = new ArrayList<>();
		testString.add("first");
		testString.add("second");
		
		for (Object string : testString) {
			System.out.println(string);
		}
		
		List<Integer> testInt = new ArrayList<>();
		testInt.add(1);
		testInt.add(2);
		
		for (Integer integer : testInt) {
			
		}
		
	}

}
