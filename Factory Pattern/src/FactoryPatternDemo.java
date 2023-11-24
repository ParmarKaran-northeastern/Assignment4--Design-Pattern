

/**
 * 
 * @author apple
 * @version 1.0
 * 
 * The FactoryPatternDemo class demonstrates the use of the Factory Pattern
 * to create and display different shapes.
 */
public class FactoryPatternDemo {

    /**
     * The main method of the FactoryPatternDemo class.
     * It creates a ShapeFactory, obtains instances of Circle, Rectangle, and Square,
     * and calls their draw methods to display their respective drawings.
     *
     * @param args Command line arguments (not used in this demo).
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}


