package learning.m;

import java.util.ArrayList;

public class ListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Rashmi";
		
		ArrayList<String> Names=new ArrayList<>();
		Names.add("Rashmi");
		Names.add("Ramya");
		Names.add("Swetha");
		for(String str:Names)
		{
			if(str.equals(str1))
			{
				System.out.println("Rashmi is present");
			}
		}
		
	}

}
