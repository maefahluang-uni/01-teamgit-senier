/**
 * 
 */

import org.junit.*;

/**
 * Test class for Counter class
 * 
 * @author [YourName]
 * @version [Current Date]
 *
 */
public class TestFeature1 {

	/**
	 * Test method for {@link util.Counter#increment()}.
	 */
	public util.Counter counter = null;

	@Before
	public void setUp() {
		counter = new util.Counter();
	}

	@Test
	public void testIncrementToEven(){
		counter._ctr = 5;
		counter.incrementToEven();
		Assert.assertEquals(6, counter._ctr);
	}
	
	
	@Test
	 public void testDecrementToEven() {
        counter.setCounter(-12); // Assuming there is a method to set the counter value
        counter.decrementToEven();
        Assert.assertEquals(-14, counter.getCounter()); // Assuming there is a method to get the counter value
    }
	
}
