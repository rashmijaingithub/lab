package learning.m.pack1;


class Stu{
	int rollno;
	String name;
	
	void insertRecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);}
}
public class TestStudent {

	public static void main(String[] args) {
		
		Stu s1=new Stu();
		Stu s2=new Stu();
		
		s1.insertRecord(10,"Rashmi");
		s2.insertRecord(20,"Jain");
		s1.displayInformation();
		s2.displayInformation();
		

	}

}
