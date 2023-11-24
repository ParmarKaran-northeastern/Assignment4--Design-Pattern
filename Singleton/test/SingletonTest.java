
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apple
 * @version 3.0
 * 
 */
public class SingletonTest {
    
    public SingletonTest() {
    }
  
    /**
     * Test method for checking if the getInstance() method always returns the same instance of the SingleObject class.
     * This method gets two instances of the SingleObject class using the getInstance() method,
     * and finally, it checks if both instances are equal, meaning that they refer to the same object in memory.
     */
    @Test
    public void testInstance() {
        SingleObject obj1=SingleObject.getInstance();
        SingleObject obj2=SingleObject.getInstance();
        assertTrue(obj1.equals(obj2));
    }

    /**
     * Test of Message method, of class SingleObject.
     */
    @Test
    public void testMessage() {
    }

   
    /**
     * Test of Identifier method, of class SingleObject.
     */
    @Test
    public void testIdentifier() {
    }
}
