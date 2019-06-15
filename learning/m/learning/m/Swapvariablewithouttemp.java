package learning.m;

public class Swapvariablewithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="rashmi";
		String str2= "jain";
	
		System.out.println("before swap " +str1+ "" +str2);
		str1=str1+str2;
		System.out.println(str1);
		
		str2=str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println(str1);
		
		System.out.println("after swap "  +str1 +" " +str2);
		
		
		
	}

}
