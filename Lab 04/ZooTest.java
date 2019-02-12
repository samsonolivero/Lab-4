public class ZooTest
{
	public void emptyConstructorTest() throws AssertException
	{
		Zoo zoo = new Zoo(0);
		
		Assert.assertEquals(0, zoo.getCapacity());
		Assert.assertEquals(0.0, zoo.getTotalHeight());
		Assert.assertEquals(0, zoo.getAverageWeight());
		Assert.assertEquals(0, zoo.getAverageWeight("Blue"));
		Assert.assertEquals(null, zoo.getAnimals());
	}
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo(2);
		Animal ani = new Animal ("Orange", "Tiger", 16.0, 22.2);
		Animal ani2 = new Animal ("Orange", "Bird", 5.2, 2.2);
		Animal ani3 = new Animal ("Blue", "Penguin", 12.0, 3.0);
		zoo.addAnimal(ani);
		zoo.addAnimal(ani);
		zoo.addAnimal(ani2);
		zoo.addAnimal(ani3);
		
		System.out.println(zoo.toString());
		
		System.out.println("Capacity: " + zoo.getCapacity());
		System.out.println("Total Height: " + zoo.getTotalHeight());
		System.out.println("Average Weight: " + zoo.getAverageWeight());
		System.out.println("Average Height: " + zoo.getAverageWeight("Orange"));
		System.out.println("Animals: " + zoo.getAnimals());
		
		
	
	}
}