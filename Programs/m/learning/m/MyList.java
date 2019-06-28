package learning.m;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BWM");
		cars.add("Ford");
		
		System.out.println(cars);
		/*
		 * System.out.println(cars.get(1)); cars.set(1, "Maruthi"); cars.remove(2);
		 * System.out.println(cars); System.out.println(cars.size()); cars.clear();
		 * System.out.println(cars);
		 */
		/*
		 * for(int i=0;i<cars.size();i++) { System.out.println(cars.get(i)); }
		 */
//each for loop
		for(String i : cars)
		{
			System.out.println(i);
		}
		
	}

}
