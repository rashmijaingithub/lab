package learning.m;

import java.util.HashMap;

public class TestHashMap {

	public static void main (String args[])
	{
		HashMap< String, String> map=new HashMap<String, String>();
		map.put("City1", "London");
		map.put("City2", "Bangalore");
		map.put("City3", "Delhi");
		System.out.println(map);
		
		for(String i: map.keySet())
		{
			System.out.println(i);
		}
		for(String i: map.values())
		{
			System.out.println(i);
		}
		
	}
	
}
