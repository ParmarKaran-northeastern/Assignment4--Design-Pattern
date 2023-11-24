
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apple
 * @version 3.0
 */

public class StateTest {
    
   /**
     * Default constructor for the RoverTest class.
     */ 
    public StateTest() {
    }

   
    
    
    Rover r = new Rover();
    
     /**
     * Tests the pressRightPedal method of the Rover class.
     * 
     * Test Cases:
     * 1. Rover should always start in "At Rest" state.
     *    Assertion: The current state should be "At Rest".
     * 
     * 2. When at rest, pressing right pedal twice should not move the rover.
     *    Assertion: The current state should remain "At Rest".
     * 
     * 3. When at rest, pressing right pedal once should move the rover.
     *    Assertion: The current state should be "Move Forward".
     */
    
    @Test
    public void testPressRightPedal() {
        
        // Test Case 1
        assertEquals("At Rest",r.currentState.name);
        
        // Test Case 2
        r.pressRightPedal(2);
        assertEquals("At Rest",r.currentState.name);
        
       // Test Case 3
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
    }

   /**
     * Placeholder method for testing the printStateAndSubState method of the Rover class.
     */
    
    @Test
    public void testPrintStateAndSubState() {
    }


    /**
     * Placeholder method for testing the main method of the Rover class.
     */
    
    @Test
    public void testMain() {
    }
    
}
