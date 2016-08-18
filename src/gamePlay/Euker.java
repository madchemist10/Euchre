package gamePlay;

import constants.Constants;
import deck.Card;
import deck.Deck;
import gui.GamePlay;
import gui.GamePlayChoice;
import player.Player;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Euker game that contains rules and deck of cards
 * for playing various versions of euker.
 */
public class Euker {

    /**Euker specific deck of cards.*/
    private final ArrayList<Card> eukerCards;
    /**List of players*/
    private final ArrayList<Player> players;

    /**
     * Create a new euker game.
     * Initialize deck of cards.
     */
    public Euker(){
        /*Make choice for what game style.*/
        AtomicBoolean gamePlayChoiceComplete = new AtomicBoolean(false);
        GamePlayChoice gamePlayChoice = new GamePlayChoice(gamePlayChoiceComplete);

        while(!gamePlayChoiceComplete.get()){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*Create temp set of cards to be shuffled.*/
        ArrayList<Card> tempEukerCards = createEukerDeckOfCards();
        /*Shuffle cards.*/
        this.eukerCards = Deck.shuffleDeckOfCards(tempEukerCards, Constants.SHUFFLE_ITERATIONS);
        /*Four players for euker.*/
        this.players = new ArrayList<>();
        GamePlay gamePlay = gamePlayChoice.gamePlay;
        switch(gamePlay){
            case TWO_PLAYER:
                this.players.add(new Player(false,1));    //player 1
                this.players.add(new Player(false,2));    //player 2
                break;
            case FOUR_PLAYER:
                this.players.add(new Player(false,1));    //player 1
                this.players.add(new Player(false,2));    //player 2
                this.players.add(new Player(false,3));    //player 3
                this.players.add(new Player(false,4));    //player 4
                break;
            case THREE_PLAYER_PLUS_PC:
                this.players.add(new Player(false,1));    //player 1
                this.players.add(new Player(false,2));    //player 2
                this.players.add(new Player(false,3));    //player 3
                this.players.add(new Player(true,4));     //player 4
                break;
            case TWO_PLAYER_PLUS_PC:
                this.players.add(new Player(false,1));    //player 1
                this.players.add(new Player(false,2));    //player 2
                this.players.add(new Player(true,3));     //player 3
                this.players.add(new Player(true,4));     //player 4
                break;
            case ONE_PLAYER_PLUS_PC:
                this.players.add(new Player(false,1));    //player 1
                this.players.add(new Player(true,2));     //player 2
                this.players.add(new Player(true,3));     //player 3
                this.players.add(new Player(true,4));     //player 4
                break;
        }
        dealCards();
    }

    /**
     * Deal all the cards to the players.
     *
     */
    private void dealCards(){
        int index = 0;
        boolean firstPass = true;
        while(index < Constants.EUKER_CARD_COUNT){
            int numCards = 2;
            if(!firstPass){
                numCards++;
            }
            for (Player player : players) {
                addCardsToPlayer(index, numCards, player);
                index += numCards;
            }
            firstPass = false;
        }
    }

    /**
     * Give player a number of cards from a given index in euker cards.
     * @param index current position in dealing cards from eukerCards
     * @param numCards number of cards to give this player.
     * @param player player being dealt cards.
     */
    private void addCardsToPlayer(int index, int numCards, Player player){
        for(int i = 0; i < numCards; i++) {
            player.addCardToHand(this.eukerCards.get(index+i));
        }

    }

    /**
     * Populate the eukerCards with valid
     * cards of all suits and A-9.
     */
    private static ArrayList<Card> createEukerDeckOfCards(){
        Deck fullDeck = new Deck();
        ArrayList<Card> eukerCards = new ArrayList<>(Constants.EUKER_CARD_COUNT);
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
