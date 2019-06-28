package learning.m.pack1;

public class string {
	public static void main (String args[])
	{
		/*String sPopularTopic="Selenium Framwork" ;
		int ilength=sPopularTopic.length();
		System.out.println("Popular Topic " +sPopularTopic);
		System.out.println("length " +ilength);*/
		
		String sPopularTopic_1="Selenium Automation Framework";
		String sPopulartopic_2="Basic java";
		String sSpace="";
		
		//print using concat string
		//String1.concat(String2)
		System.out.println("First output");
		System.out.println(sPopularTopic_1.concat(sPopulartopic_2));
		//Another way of using String Concat
		System.out.println("second output");
		System.out.println("Selenium Automation Framework".concat(sPopulartopic_2));
		
		//print 
		// //"String1" + "String2";
		System.out.println("Third output");
		System.out.println("Selenium Automation Framework"+"Basic java");
		System.out.println("fourth output");
		System.out.println("Selenium Automation Framework"+sSpace+"Basic java");
	}

	
}
