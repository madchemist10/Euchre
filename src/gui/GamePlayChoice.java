package gui;

import constants.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Popup for the player to choose the play style wanted.
 * Layout:
 * -------------------------------- *
 * Choose your game play:
 *
 * |------------|
 * | TWO_PLAYER |
 * |------------|
 * |--------------|
 * | THREE_PLAYER |
 * |--------------|
 * |-------------|
 * | FOUR_PLAYER |
 * |-------------|
 * |----------------------|
 * | THREE_PLAYER_PLUS_PC |
 * |----------------------|
 * |--------------------|
 * | TWO_PLAYER_PLUS_PC |
 * |--------------------|
 * |--------------------|
 * | ONE_PLAYER_PLUS_PC |
 * |--------------------|
 * -------------------------------- *
 */
public class GamePlayChoice extends JFrame{

    /** Constraints to align buttons on frame.*/
    private final GridBagConstraints gridBagConstraints = new GridBagConstraints();
    /** Which game play style was chosen.*/
    public GamePlay gamePlay;
    /** Wait for choice to be made before continuing.*/
    private AtomicBoolean gamePlayChoice;

    /**
     * Create a new game play popup with buttons
     * for game play styles.
     */
    public GamePlayChoice(AtomicBoolean gamePlayChoice){
        this.gamePlayChoice = gamePlayChoice;
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(Constants.WIDTH_GAME_PLAY, Constants.HEIGHT_GAME_PLAY);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        createButtonWithCallback(GamePlay.TWO_PLAYER);

        gridBagConstraints.gridy++;
        createButtonWithCallback(GamePlay.THREE_PLAYER);

        gridBagConstraints.gridy++;
        createButtonWithCallback(GamePlay.FOUR_PLAYER);

        gridBagConstraints.gridy++;
        createButtonWithCallback(GamePlay.THREE_PLAYER_PLUS_PC);

        gridBagConstraints.gridy++;
        createButtonWithCallback(GamePlay.TWO_PLAYER_PLUS_PC);

        gridBagConstraints.gridy++;
        createButtonWithCallback(GamePlay.ONE_PLAYER_PLUS_PC);
        this.setVisible(true);
    }

    /**
     * Create a button for the given game play and
     * callback.
     * @param gamePlay type of game play for the player to play.
     */
    private void createButtonWithCallback(GamePlay gamePlay){
        JButton button = new JButton(gamePlay.toString());
        button.addActionListener(new ButtonActionListener(this,gamePlay));
        this.add(button,gridBagConstraints);
    }

    /**
     * Exit this panel after a button has been pressed.
     */
    private void exitFrame(){
        this.setVisible(false);
        this.gamePlayChoice.set(true);
    }

    /**
     * Set the game play for the button that has been pressed.
     */
    private static class ButtonActionListener implements ActionListener{
        private final WeakReference<GamePlayChoice> wPlayPopup;
        private final GamePlay gamePlay;

        ButtonActionListener(GamePlayChoice playPopup, GamePlay gamePlay){
            this.wPlayPopup = new WeakReference<>(playPopup);
            this.gamePlay = gamePlay;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            GamePlayChoice playPopup = this.wPlayPopup.get();
            if(playPopup == null){
                return;
            }
            playPopup.gamePlay = this.gamePlay;
            playPopup.exitFrame();
        }
    }

}
