package learning.m.pack1;
//You can have any number of main methods in a class by method overloading. 
//But JVM calls main() method which receives string array as arguments only. Let's see the simple example:



public class MainMethodoverloading {
	
	public static void main (String arg[])
	{
		System.out.println("main with String []");
	}

public static void main (String arg)
{
	System.out.println("main with string");
}
public static void main ()
{
	System.out.println("main withput arg");
}
}
