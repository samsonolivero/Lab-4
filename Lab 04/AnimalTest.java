/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void Test()
    {
    	Animal animal = new Animal("Orange", "Tiger", 62.0, 20.0);
    	Animal animalTwo = new Animal("Blue", "Penguin", 30.0, 20.0);
    	Animal animalThree = new Animal("Blue", "Penguin", 30.0, 20.0);
    	System.out.println(animal.toString());
    	System.out.println("Color: " + animal.getColor());
    	System.out.println("Name: " + animal.getName());
    	System.out.println("Weight: " + animal.getWeight());
    	System.out.println("Height: " + animal.getHeight());
    	
    	System.out.println("Test 1: " + animal.equals(animalTwo));
    	System.out.println("Test 2: " + animalTwo.equals(animalThree));
    	
    }
    
}

