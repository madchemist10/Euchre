package gamePlay;

import constants.Constants;
import deck.Card;
import deck.Deck;
import java.util.ArrayList;

/**
 * Euker game that contains rules and deck of cards
 * for playing various versions of euker.
 */
public class Euker {

    /**Euker specific deck of cards.*/
    private final ArrayList<Card> eukerCards;

    /**
     * Create a new euker game.
     * Initialize deck of cards.
     */
    public Euker(){
        /*Create temp set of cards to be shuffled.*/
        ArrayList<Card> tempEukerCards = createEukerDeckOfCards();
        /*Shuffle cards.*/
        this.eukerCards = Deck.shuffleDeckOfCards(tempEukerCards, Constants.SHUFFLE_ITERATIONS);
    }

    /**
     * Populate the eukerCards with valid
     * cards of all suits and A-9.
     */
    private static ArrayList<Card> createEukerDeckOfCards(){
        Deck fullDeck = new Deck();
        ArrayList<Card> eukerCards = new ArrayList<>(24);
        for(Card card : fullDeck.DECK_OF_CARDS){
            switch(card.getValue()){
                case ACE:
                case KING:
                case QUEEN:
                case JACK:
                case TEN:
                case NINE:
                    eukerCards.add(card);
                    break;
            }
        }
        return eukerCards;
    }
}
