import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author apple
 * @version 2.0
 * 
 * The ShapeTester class is responsible for testing the functionality of the ShapeMaker class,
 * which is designed to create and draw various shapes such as Circle, Rectangle, and Square.
 * The class contains individual test methods for each shape to ensure their drawing methods
 * produce the expected output.
 * 
 */
public class ShapeTester {
    
    /**
     * Constructs a new instance of ShapeTester.
     * The constructor is empty as there is no need for initialization.
     */
    public ShapeTester() {
    }
    
    // Create an instance of ShapeMaker to use its methods for testing
    ShapeMaker shapeMaker = new ShapeMaker();
  
    /**
     * This test method is designed to test the drawing functionality of the Circle class.
     * It creates an instance of Circle and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawCircle method.
     */
    @Test
    public void testingCircle() {
        // Create an instance of Circle
        Circle cl = new Circle();

        // Assert that the draw method of Circle produces the expected output from ShapeMaker
        assertEquals(cl.draw(), shapeMaker.drawCircle());
    }

    /**
     * This test method is responsible for testing the drawing functionality of the Rectangle class.
     * It creates an instance of Rectangle and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawRectangle method.
     */
    @Test
    public void testingRectangle() {
        // Create an instance of Rectangle
        Rectangle rect = new Rectangle();

        // Assert that the draw method of Rectangle produces the expected output from ShapeMaker
        assertEquals(rect.draw(), shapeMaker.drawRectangle());
    }

    /**
     * This test method is designed to test the drawing functionality of the Square class.
     * It creates an instance of Square and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawSquare method.
     */
    @Test
    public void testingSquare() {
        // Create an instance of Square
        Square sq = new Square();

        // Assert that the draw method of Square produces the expected output from ShapeMaker
        assertEquals(sq.draw(), shapeMaker.drawSquare());
    }
}
