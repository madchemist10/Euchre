package player;

/**
 * Abstraction of a player, either computer
 * or not.
 */
abstract class APlayer implements IPlayer{
    /** flag to determine if this player is a computer.*/
    private boolean isComputer = false;

    /**
     * Constructor to create a new player with
     * parameter to determine if this player is
     * a computer or human.
     * @param isComputer true if computer, false if human
     */
    APlayer(boolean isComputer){
        this.isComputer = isComputer;
    }
}
