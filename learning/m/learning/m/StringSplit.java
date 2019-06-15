package learning.m;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome to split world";  
		//System.out.println("returning words:");  
		for(String w:s1.split("\\s",3)){  
		//System.out.println(w);  
		}
		for(String w:s1.split("t", 0))
		{
			System.out.println(w);
		}
		
		
		}  }
