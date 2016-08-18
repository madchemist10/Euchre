package player;

import deck.Card;

import java.util.ArrayList;

/**
 * Abstraction of a player, either computer
 * or not.
 */
abstract class APlayer implements IPlayer{
    /** flag to determine if this player is a computer.*/
    private final boolean isComputer;
    /** players unique identifier (1-4)*/
    private final int playerNumber;
    /** this players hand of cards*/
    protected final ArrayList<Card> hand = new ArrayList<>(5);

    /**
     * Constructor to create a new player with
     * parameter to determine if this player is
     * a computer or human.
     * @param isComputer true if computer, false if human
     */
    APlayer(boolean isComputer, int playerNumber){
        this.isComputer = isComputer;
        this.playerNumber = playerNumber;
    }

    /**
     * Add a new card to this player's hand.
     * @param card card to give this player.
     */
    abstract void addCardToHand(Card card);
}
