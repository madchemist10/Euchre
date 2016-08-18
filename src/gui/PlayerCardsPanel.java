package gui;

import deck.Card;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Representation of where a player's cards will be displayed.
 */
public class PlayerCardsPanel extends JPanel {

    /**Cards to be used by this player.*/
    private final ArrayList<Card> cards;
    /**Orientation where the player is seating.*/
    private final Orientation orientation;
    /**Placement constraints for grid.*/
    private final GridBagConstraints gridBagConstraints = new GridBagConstraints();

    /**
     * Create a new play set for this player's cards.
     * @param cards list of this player's cards.
     */
    PlayerCardsPanel(ArrayList<Card> cards, Orientation orientation){
        this.cards = cards;
        this.orientation = orientation;
        this.setLayout(new GridBagLayout());
        createCardPanel();
    }

    /**
     * Create the card panel that will display cards to the user.
     */
    private void createCardPanel(){
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        for(Card card: this.cards){
            this.add(card, gridBagConstraints);
            /*Choose which grid value to increment.*/
            switch(this.orientation){
                case LEFT:
                case RIGHT:
                    gridBagConstraints.gridy++;
                    break;
                case TOP:
                case BOTTOM:
                    gridBagConstraints.gridx++;
                    break;
            }
        }
    }
}
