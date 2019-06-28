package learning.m.pack1;


class student{
	int id;
	String name;
	
}


public class Classobject {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 student s1= new student();
	 student s2=new student();
	 s1.id=100;
	 s1.name="Rashmi";
	 s2.id=200;
	 s2.name="jain";
		
		System.out.println(s1.id+" "+s1.name);
		//System.out.println(s1.name);
		System.out.println(s2.id+" " +s2.name);

	}

}
