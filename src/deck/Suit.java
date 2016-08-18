package deck;

import constants.Constants;

/**
 * Enum to represent possible suits for a card.
 */
public enum Suit {

    CLUBS (Constants.CLUBS),
    SPADES(Constants.SPADES),
    HEARTS(Constants.HEARTS),
    DIAMONDS(Constants.DIAMONDS);

    /**String representation of a suit of a card.*/
    private String text;

    /**
     * Constructor to create a new suit.
     * @param text String representation of the suit.
     */
    Suit(String text){
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
