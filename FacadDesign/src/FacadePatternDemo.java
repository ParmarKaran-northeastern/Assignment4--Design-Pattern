
/**
 
 * @author apple
 * @version 2.0
 * 
 * * The FacadePatternDemo class serves as a demonstration of the Facade design pattern.
 * It showcases the use of a simplified interface (facade) provided by the ShapeMaker class
 * to draw various shapes without exposing the complexities of the underlying shape implementations.
 *
 */
public class FacadePatternDemo {

    /**
     * The main method demonstrates the Facade design pattern by creating a ShapeMaker object
     * and using its simplified interface to draw a circle, rectangle, and square.
     *
     * @param args The command-line arguments passed to the program. These are not used in this demo.
     */
    public static void main(String[] args) {

        // Create a ShapeMaker object
        ShapeMaker shapeMaker = new ShapeMaker();

        // Draw a circle using the simplified interface
        shapeMaker.drawCircle();

        // Draw a rectangle using the simplified interface
        shapeMaker.drawRectangle();

        // Draw a square using the simplified interface
        shapeMaker.drawSquare();
    }
}
