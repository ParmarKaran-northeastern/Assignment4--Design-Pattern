

/**
 * 
 * @author apple
 * @version 1.0
 * 
 * The Rectangle class represents a rectangular shape that can be drawn.
 * It implements the Shape interface, providing a specific implementation
 * for drawing a rectangle.
 * 
 */
public class Rectangle implements Shape {

    /**
     * Draws a rectangle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     * It provides a specific behavior for drawing a rectangle.
     * No parameters are required for this method.
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}



