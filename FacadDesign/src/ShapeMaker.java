
/*
 * @author apple
 * @version 2.0
 */

/**
 * The ShapeMaker class represents a utility for drawing various shapes.
 * It uses instances of classes implementing the Shape interface to draw specific shapes.
 */
public class ShapeMaker {

    // Attributes
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Constructs a ShapeMaker object and initializes instances of Circle, Rectangle, and Square.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * Draws a circle using the stored Circle object.
     */
    public String drawCircle() {
       return circle.draw();
    }

    /**
     * Draws a rectangle using the stored Rectangle object.
     */
    public String drawRectangle() {
       return rectangle.draw();
    }

    /**
     * Draws a square using the stored Square object.
     */
    public String drawSquare() {
        return square.draw();
    }

   
}
