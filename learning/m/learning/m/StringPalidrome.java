package learning.m;

public class StringPalidrome {
	
	public   boolean palindrome(String str)
	{
		//String str="rashmi";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);	
		}
		//System.out.println(reverse);
		
		if(str.equalsIgnoreCase(reverse))
		{
		 //System.out.println("Palindrome");
		 return true;
		}else
		{
			//System.out.println("String is not palindrome");
			return false;
		}
	}
		
		public static void main(String args[])
		{
			//System.out.println(palindrome("nitin"));
			//System.out.println(palindrome("rashmi"));
			StringPalidrome obj=new StringPalidrome();
			System.out.println(obj.palindrome("nitin"));
			System.out.println(obj.palindrome("rashmi"));
		}
		
	}
	


