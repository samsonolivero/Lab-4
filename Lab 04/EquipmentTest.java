public class EquipmentTest
{
	public void emptyConstructorTest() throws AssertException
	{
		Equipment equip = new Equipment("unknown/0,0.0,0.0,unknown");
		
		Assert.assertEquals("unknown", equip.getName());
		Assert.assertEquals(0, equip.getCount());
		Assert.assertEquals(0.0, equip.getTotalWeight());
		Assert.assertEquals(0.0, equip.getTotalPrice());
		Assert.assertEquals("unknown", equip.getDescription());
	}
	public void Test()
	{
		Equipment equip = new Equipment("batarang/1,2.0,50.0,A Boomerang for Bats");
		Equipment equip2 = new Equipment("batarang/1,2.0,50.0,A Boomerang for Bats");
		Equipment equip3 = new Equipment("Bomb/5,5.6,100.0,BOOM");
		
		System.out.println(equip.toString());
		
		System.out.println("Name: " + equip.getName());
		System.out.println("Count: " + equip.getCount());
		System.out.println("Total Weight: " + equip.getTotalWeight());
		System.out.println("Total Price: " + equip.getTotalPrice());
		System.out.println("Description: " + equip.getDescription());
		
		System.out.println(equip.equals(equip2));
		System.out.println(equip.equals(equip3));
	
	}
	
}
