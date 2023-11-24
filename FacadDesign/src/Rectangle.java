
/**
 * @author apple
 * @version 2.0
 * 
 * The Rectangle class represents a rectangular shape that can be drawn.
 * It implements the Shape interface, providing a specific implementation
 * for drawing a rectangle.
 */
public class Rectangle implements Shape {

    /**
     * Draws a rectangle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     */
    @Override
    public  String draw() {
        System.out.println("Rectangle::draw()");
        return null;
    }
}
