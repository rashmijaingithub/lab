import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(groups="pre-test")
	public void init()
	{
		//Assert.assertTrue(false);
		System.out.println("Init Resources");
	}

	@Test(groups="test", dependsOnGroups="pre-test")
	public void insert()
	{
		System.out.println("Inserting data ");
	}
	@Test(groups="test", dependsOnMethods="insert")
	public void select()
	{
		System.out.println("selecing  data ");
	}
	@Test(groups="test", dependsOnMethods="select")
	public void update()
	{
		System.out.println("updating  data ");
	}
	
	@Test(groups="test", dependsOnMethods= {"insert","update"})
	public void delete()
	{
		System.out.println("deleting  data ");
	}
	@Test(dependsOnGroups="test")
	public void cleanup()
	{
		System.out.println("closing resources ");
	}
}
