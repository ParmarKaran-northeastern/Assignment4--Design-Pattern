
/**
 * @author apple
 * @version 2.0
 * 
 * The Square class represents a square shape that can be drawn.
 * It implements the Shape interface, providing a specific implementation
 * for drawing a square.
 *
 */
public class Square implements Shape {

    /**
     * Draws a square by printing a message to the console.
     * This method is part of the Shape interface implementation.
     */
    @Override
    public String draw() {
        return "Square:draw()";
    }
}
