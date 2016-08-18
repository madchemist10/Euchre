package constants;

/**
 * This interface contains all the constants used throughout this euker
 * application.
 */
public interface Constants {
    /*Title of game*/
    String EUKER = "Euker";

    int FRAME_PADDING = 25;

    /*Size of mainFrame*/
    int WIDTH_FRAME = FRAME_PADDING;
    int HEIGHT_FRAME = (FRAME_PADDING * 5);

    /*Size of GamePlayChoice*/
    int WIDTH_GAME_PLAY = 100;
    int HEIGHT_GAME_PLAY = 200;


    /*StatusPanel*/
    String STATUS_PANEL = "Status Panel";
    String WINNER = "Winner: ";
    String CURRENT_TURN = "Current Turn: ";

    /*Button labels for game play popup*/
    String TWO_PLAYER_BUTTON = "2 H";
    String FOUR_PLAYER_BUTTON = "4 H";
    String THREE_PLAYER_PC_BUTTON = "3 H 1 PC";
    String TWO_PLAYER_PC_BUTTON = "2 H 2 PC";
    String ONE_PLAYER_PC_BUTTON = "1 H 3 PC";

    /*Suits*/
    String CLUBS = "CLUBS";
    String HEARTS = "HEARTS";
    String SPADES = "SPADES";
    String DIAMONDS = "DIAMONDS";

    /*Values of cards*/
    String ACE = "ACE";
    String KING = "KING";
    String QUEEN = "QUEEN";
    String JACK = "JACK";
    String TEN = "TEN";
    String NINE = "NINE";
    String EIGHT = "EIGHT";
    String SEVEN = "SEVEN";
    String SIX = "SIX";
    String FIVE = "FIVE";
    String FOUR = "FOUR";
    String THREE = "THREE";
    String TWO = "TWO";

    /**Number of iterations to shuffle a deck of cards.*/
    int SHUFFLE_ITERATIONS = 100;

    /**Maximum number of cards a player can have at any given time.
     * 5 for normal hand, 6 if you are the dealer.*/
    int MAX_PLAYER_CARD_COUNT = 6;

    /**Number of cards in a euker deck.*/
    int EUKER_CARD_COUNT = 24;

    /*Orientation of each player.*/
    String LEFT = "LEFT";
    String RIGHT = "RIGHT";
    String TOP = "TOP";
    String BOTTOM = "BOTTOM";
}
