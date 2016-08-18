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
    String THREE_PLAYER_BUTTON = "3 H";
    String FOUR_PLAYER_BUTTON = "4 H";
    String THREE_PLAYER_PC_BUTTON = "3 H 1 PC";
    String TWO_PLAYER_PC_BUTTON = "2 H 2 PC";
    String ONE_PLAYER_PC_BUTTON = "1 H 3 PC";
}
