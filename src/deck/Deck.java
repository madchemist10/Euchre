package deck;


import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a deck of cards.
 */
public class Deck {
    /**List of all cards for a complete deck.*/
    public final ArrayList<Card> DECK_OF_CARDS = new ArrayList<>(52);

    /**
     * Constructor to create a new complete deck of cards.
     */
    public Deck(){
        createDeckOfCards();
    }

    /**
     * Create a new deck of cards.
     */
    private void createDeckOfCards(){
        for(Suit suit : Suit.values()){
            for(Value value : Value.values()){
                this.DECK_OF_CARDS.add(new Card(suit, value));
            }
        }
    }

    /**
     * Shuffle a deck of cards, a specified number of iterations.
     * @param deck deck of cards to shuffle.
     * @param iterations number of iterations to shuffle.
     * @return shuffled deck of cards.
     */
    public static ArrayList<Card> shuffleDeckOfCards(ArrayList<Card> deck, int iterations){
        /*Create random number generator.*/
        Random randomGenerator = new Random(System.currentTimeMillis());
        /*create deck to hold shuffled cards equal to size of given deck.*/
        ArrayList<Card> shuffledDeck = new ArrayList<>(deck.size());
        /*Remove each card from given deck and place in shuffled deck.*/
        while(deck.size() > 0){
            int randomNumber = randomGenerator.nextInt(deck.size()-1);
            shuffledDeck.add(deck.remove(randomNumber));
        }
        /*Recursively shuffle until iterations are equal to 0.*/
        if(iterations > 0){
            iterations--;
            shuffleDeckOfCards(shuffledDeck,iterations);
        }
        return shuffledDeck;
    }
}
