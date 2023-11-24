
/**
 * 
 * @author apple
 * @version 3.0
 
 The SingletonDemo class demonstrates the use of the Singleton Pattern.
 It showcases the instantiation of a singleton object of the SingleObject class
 and calls its showMessage method.
 * 
 */
public class SingletonDemo {

    /**
     * The main method of the SingletonPatternDemo class.
     * It showcases the instantiation of a singleton object and calls its showMessage method.
     *
     * @param args Command line arguments (not used in this demo).
     */
    public static void main(String[] args) {
        // Illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // Show the message
        object.showMessage();
    }
}
