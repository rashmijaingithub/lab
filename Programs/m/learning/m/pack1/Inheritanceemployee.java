package learning.m.pack1;
//The idea behind inheritance in java is that you can create new classes that are built upon existing classes.
//For Method Overriding (so runtime polymorphism can be achieved).
//For Code Reusability
class employee
{
	float salary=40000;
	
}


public class Inheritanceemployee extends employee{
int  bonus=10000;
	public static void main(String[] args) {
		Inheritanceemployee p=new Inheritanceemployee();
		System.out.println("programmer slary"  +p.salary);
		System.out.println("bonus of the programmer" +p.bonus);
	}

}
