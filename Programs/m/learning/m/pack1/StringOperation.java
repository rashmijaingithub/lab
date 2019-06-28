package learning.m.pack1;

public class StringOperation {

	public static void main (String args[])
	{
		String sPopularTopic1="Selenium Automation Framework";
		String sPopularTopic2="Basic Java Tutorial";
		//Compare two strings
		//two strings equal it will show true or else false
		boolean bCompare=sPopularTopic1.equals(sPopularTopic2);
		System.out.println("The result of compare "+bCompare);
		//This would return single character at the index value from string
		char cIndex=sPopularTopic1.charAt(5);
		System.out.println("Value of char index 5 " +cIndex);
		//Contains: this would return true if passes string containing in the another string
		boolean bContains=sPopularTopic1.contains("Framework");
		System.out.println("value contains "+bContains);
		//Index: This would return the starting index of the passed string
		int iIndex=sPopularTopic1.indexOf("Framework");
		System.out.println("Value of Index of the string "+iIndex);
		//Substring first index: This would return the substring of the string from passed index number
		String subString=sPopularTopic1.substring(iIndex);
		System.out.println("VAlue of substring " +subString);
		//substring first and lastindex: this would return the sub string from first to end index  
	subString=sPopularTopic1.substring(8, 19);
	System.out.println("Value of substring from first to end "+subString);
	//tolower: This would return complete string in lower case
	String sLower=sPopularTopic1.toLowerCase();
	System.out.println("To lower case : "+sLower);
	//Split: It breaks string into two parts from passed argument and store it in array;
	String [] asplit=sPopularTopic1.split("Automation");
	System.out.println("First Split value : "+asplit[0]);
	System.out.println("Second split value : "+asplit[1]);
	//replace char in the string
	String sReplace=sPopularTopic1.replace('e', 'r');
	System.out.println("replace value :" +sReplace);
	
	String sReplace1=sPopularTopic1.trim();
	System.out.println("sdsd " +sReplace1);
	
	
	
	
	}
}
