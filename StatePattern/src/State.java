/**
 * The State class represents an abstract state that can be extended to create specific states for a rover.
 * It defines basic attributes and methods that can be overridden by subclasses to implement specific behavior.
 * 
 * @author apple
 * @version 3.0
 */
public class State {
    // Attributes representing the name and sub-state of the state
    protected String name = "NULL";
    protected String subState = "NULL";

    /**
     * Default constructor for the State class.
     */
    State() {}

    /**
     * Simulates the action of pressing the right pedal a certain number of times.
     * This method is intended to be overridden by subclasses to implement state-specific behavior.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return Always returns false by default. Subclasses may override and provide their own logic.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Simulates the action of pressing the right pedal for a specific duration.
     * This method is intended to be overridden by subclasses to implement state-specific behavior.
     * 
     * @param numOfSecondsPressed The number of seconds the right pedal is pressed.
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {}

    /**
     * Simulates the action of pressing the left pedal a certain number of times.
     * This method is intended to be overridden by subclasses to implement state-specific behavior.
     * 
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return Always returns false by default. Subclasses may override and provide their own logic.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

    /**
     * Simulates the action of pressing the left pedal for a specific duration.
     * This method is intended to be overridden by subclasses to implement state-specific behavior.
     * 
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     * @return Always returns false by default. Subclasses may override and provide their own logic.
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    /**
     * Simulates the action of pressing the left pedal for a specific duration without returning a value.
     * This method is intended to be overridden by subclasses to implement state-specific behavior.
     * 
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     */
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}
}
