package deck;

import javax.swing.*;

/**
 * Representation of a card to be included in a
 * deck of cards.
 */
public class Card extends JButton {

    /**This cards suit.*/
    private final Suit suit;
    /**This cards value.*/
    private final Value value;

    /**
     * Constructor to create a new card that has a suit and
     * value.
     * @param suit SPADES, CLUBS, HEARTS, DIAMONDS
     * @param value A,K,Q,J,10,9,8,7,6,5,4,3,2
     */
    Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }

    /**
     * Retrieve this card's suit.
     * @return this card's suit.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Retrieve this card's value.
     * @return this card's value
     */
    public Value getValue() {
        return value;
    }
}
