package player;

/**
 * Interface for defining a player.
 * Define all actions that all players may
 * perform here.
 */
interface IPlayer {

    /**
     * Gives a player the ability
     * to perform a move.
     */
    void performMove();

    /**
     * Gives a player the ability to pass
     * on a trump call.
     * @return true if this player passes,
     *          false if this player does not pass.
     */
    boolean passOnTrump();

    /**
     * Gives a player in a three player game
     * the ability to swap his hand for the
     * spare fourth hand before game play begins.
     * @return true if swap is desired,
     *          false if swap not desired.
     */
    boolean swapHandForSpare();
}
