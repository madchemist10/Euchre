package player;

import deck.Card;

/**
 * First player for this game.
 * Starts the game.
 */
public class Player extends APlayer{

    /**
     * Constructor to create a new Player with whether or not it is
     * a computer.
     * @param isComputer true if computer, false if human.
     */
    public Player(boolean isComputer, int playerNumber) {
        super(isComputer, playerNumber);
    }

    /**
     * {@inheritDoc}
     * @param card card to give this player.
     */
    @Override
    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void performMove() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean passOnTrump() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean swapHandForSpare() {
        return false;
    }
}
