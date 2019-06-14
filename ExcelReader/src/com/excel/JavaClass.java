package com.excel;

import java.util.ArrayList;
import java.util.List;

public class JavaClass {

	public static void main(String[] args) 
	{
		
  List <String> menu= new ArrayList<>();
     
menu.add("Veg");
menu.add("nveg");
menu.add("nveg");
menu.add("veg");
menu.add("nveg");
menu.add("veg");
List <String> menu1=new ArrayList<>();
for(int i=0; i<menu.size();i++)
{
	//System.out.println(menu);
	String list=menu.get(i);
	if(list.equals("nveg"))
	{
		menu1.add(list);
	}	
}

System.out.println(menu1);
	}

}
