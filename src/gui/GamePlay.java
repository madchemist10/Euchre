package gui;

import constants.Constants;

/**
 * Enum to represent possible game play types.
 */
public enum GamePlay {

    TWO_PLAYER (Constants.TWO_PLAYER_BUTTON),
    FOUR_PLAYER(Constants.FOUR_PLAYER_BUTTON),
    THREE_PLAYER_PLUS_PC(Constants.THREE_PLAYER_PC_BUTTON),
    TWO_PLAYER_PLUS_PC(Constants.TWO_PLAYER_PC_BUTTON),
    ONE_PLAYER_PLUS_PC(Constants.ONE_PLAYER_PC_BUTTON);

    /**String representation of a game play type.*/
    private String text;

    /**
     * Constructor to create a game play type.
     * @param text String representation of the game play type.
     */
    GamePlay(String text){
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
