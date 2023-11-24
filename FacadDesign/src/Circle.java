

/**
 * @author apple
 * @version 2.0
 * 
 * 
 *  The Circle class represents a circular shape that can be drawn.
 * It implements the Shape interface, providing a specific implementation
 * for drawing a circle.
 *
 */
public class Circle implements Shape {

    /**
     * Draws a circle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     */
    @Override
    public String draw() {
        System.out.println("Circle::draw()");
        return null;
    }
}
