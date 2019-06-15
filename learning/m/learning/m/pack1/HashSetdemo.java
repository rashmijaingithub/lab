package learning.m.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetdemo {

	public static void main(String[] args) {
	
		TreeSet<String> values=new TreeSet<String>();
		values.add("Selenium");
		values.add("QTP");
		values.add("sss");
		values.add("Rashmi");
		values.add("1");
		//System.out.println(values);
		for(String e:values)
		{
			System.out.println(e);
		}
		

	}

}
