package programs;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Javaversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.class.path"));
		
		String str="The quick brown fox ";
		int leng= str.length();
		
		System.out.println(leng);
		System.out.println(str.charAt(5));
		
		for(int i=leng-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
			
		}
		
	
	}
}
