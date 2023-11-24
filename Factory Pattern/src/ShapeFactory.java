
/**
 * 
 * @author apple
 * @version 1.0
 * 
 * The ShapeFactory class is responsible for creating different shape objects.
 * It follows the Factory Pattern to encapsulate the object creation process.
 * 
 */
public class ShapeFactory {

    /**
     * Gets a shape object based on the given shape type.
     * 
     * @param shapeType A string representing the type of shape to be created
     *                  (e.g., "CIRCLE", "RECTANGLE", "SQUARE").
     * @return A concrete implementation of the Shape interface based on the provided type.
     *         Returns null if the provided shapeType is not recognized.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        // Returns null if the provided shapeType is not recognized.
        return null;
    }
}


