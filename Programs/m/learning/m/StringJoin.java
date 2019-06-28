package learning.m;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date= String.join("/", "12","03","2020")	;
		
		System.out.println(date);
		String time=String.join(":","12","10","12");
		System.out.println(time);
		
		String s1=String.join("-","Welcome","to","Java");
		System.out.println(s1);
		
		String s2="";
		String s3="Hello";
		String s4="Hello";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		int index1=s1.indexOf("to");
		System.out.println(index1);
		
		System.out.println(s1.contains("Welcome"));
		System.out.println(s1.contains("rashmi"));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.charAt(1));
		
		System.out.println(s1.endsWith("Java"));
		
		System.out.println(s1.lastIndexOf("o"));
		String replace="rashmia";
		System.out.println(replace.replace('a', 'e'));
		System.out.println(s1.trim());
	}
	

}
