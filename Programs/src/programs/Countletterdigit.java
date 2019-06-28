package programs;

public class Countletterdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33" ;
		 int length=str.length();
		 int num=0;
		 int letter=0;
		 int space=0;
		 int other=0;
		 
		 char[] ch=str.toCharArray();
		 System.out.println(ch);
		for(int i=0;i<length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				num++;
			} else if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if (Character.isWhitespace(ch[i]))
				
			{
				space++;
			} else 
				
			{
				other++;
			}		
		}
		System.out.println("number of letters in the string is : "    +letter);
		System.out.println("number of digits in the string is : "    +num);
		System.out.println("number of spaces in the string is : "    +space);
		System.out.println("number of othersn the string is : "    +other);
	////////////////Write a Java program to capitalize the first letter of each word in a sentence
		//method 1
		/*
		 * String str2="the quick brown fox jumps over the lazy dog"; String
		 * str3=str2.toUpperCase(); System.out.println(str3);
		 * System.out.println(str3.toLowerCase());
		 */
		//method2 
		
		/*String str2="the quick brown fox jumps over the lazy dog"; 
		char ch1[]=str2.toCharArray();
		for(int i=0;i<str2.length();i++)
		{
		
		System.out.print(Character.toUpperCase(ch[i]));*/
		///Write a Java program to find the penultimate (next to last) word of a sentenc
		
	String string="The quick brown fox jumps over the lazy dog";
	  String str1[]=string.split(" ");
	
	  String str5=str1[str1.length-2];
	  System.out.println(str5);
	  String rev="dsaf";
	  char[] ch2=rev.toCharArray();
	  
         for(int i=rev.length()-1; i>=0;i--)
         {
        	 System.out.print(ch2[i]);
         }
		
		
	}

}
