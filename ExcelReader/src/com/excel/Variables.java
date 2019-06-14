package com.excel;

public class Variables {
	
char ch;
	
	public static void main (String args[])
	{
		Variables obj=new Variables();
		Variables obj2=new Variables();
	obj.ch='a';
	obj2.ch='z';
	
	switch(obj2.ch)
	{
	case 'a':
		System.out.println("voval");
		break;
	case 'i':
		System.out.println("voval");
		break;
	case 'e':
		System.out.println("voval");
		break;
	case 'o':
		System.out.println("voval");
		break;
	case 'u':
		System.out.println("voval");
		break;
		
		default :
			
			System.out.println(obj2.ch + " is not voval");
	}
	}

}
