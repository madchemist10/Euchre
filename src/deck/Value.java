package deck;

import constants.Constants;

/**
 * Enum to represent possible values for a card.
 */
public enum Value {

    ACE (Constants.ACE),
    KING (Constants.KING),
    QUEEN (Constants.QUEEN),
    JACK (Constants.JACK),
    TEN (Constants.TEN),
    NINE (Constants.NINE),
    EIGHT (Constants.EIGHT),
    SEVEN (Constants.SEVEN),
    SIX (Constants.SIX),
    FIVE (Constants.FIVE),
    FOUR (Constants.FOUR),
    THREE (Constants.THREE),
    TWO (Constants.TWO);

    /**String representation of a value.*/
    private String text;

    /**
     * Constructor to create a value.
     * @param text String representation of the value.
     */
    Value(String text){
        this.text = text;
    }

    /**
     * Overrode toString method.
     * @return String representation of the enum.
     */
    @Override
    public String toString() {
        return this.text;
    }
}
