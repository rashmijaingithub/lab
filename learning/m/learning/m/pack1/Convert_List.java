package learning.m.pack1;

import java.util.ArrayList;
import java.util.HashSet;

public class Convert_List {

	public static void main(String[] args) {
	
		HashSet<String> values=new HashSet<String>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Rashmi");
		values.add("1");
		//System.out.println(values);
	ArrayList <String>list=new ArrayList<>(values);
	System.out.println(list.get(3));
	
		

	}

}
