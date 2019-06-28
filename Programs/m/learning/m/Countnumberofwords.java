package learning.m;

public class Countnumberofwords {

	
	public static void main(String args[])
	{
		String str="    India Is My Country";
		int count=0;
		
		//System.out.println(str.charAt(0));
		
		for(int i=0;i<str.length();i++)
		{
			if ((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count +" "+ "words");
		
	}
	
}
