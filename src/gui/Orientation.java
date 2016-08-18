package gui;

import constants.Constants;

/**
 * Enum to represent possible orientations for a player.
 */
public enum Orientation {

    LEFT (Constants.LEFT),
    RIGHT (Constants.RIGHT),
    TOP (Constants.TOP),
    BOTTOM(Constants.BOTTOM);

    /**String representation of an orientations for a player.*/
    private String text;

    /**
     * Constructor to create a new orientations for a player.
     * @param text String representation of the orientations for a player.
     */
    Orientation(String text){
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
