package learning.m.pack1;
//If a class have entity reference then will use aggregation
//ex: Employee obj has contains many informations such as id, name, emailId etc. It contains one more object named address, 
//which contains its own informations such as city, state, country, zipcode etc. as given below.
class emp
{
	int id;
	String name;
	Address address;


emp(int id, String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}

void display()
{
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+ address.state+" "+address.Country);
	
}}
class Address
{
	String city,state,Country;
	Address(String city,String state, String Country)
	{
		this.city=city;
		this.state=state;
		this.Country=Country;
	}
	
}

public class Aggregation {

	public static void main(String[] args) {
		
		Address addresses1=new Address("gzb","UP","india");
		Address addresses2=new Address("gno","UP","india");
		
		emp e1=new emp(123,"rashmi",addresses1);
		
		emp e2=new emp(234,"jain",addresses2);
		e1.display();
		e2.display();
	}

}
