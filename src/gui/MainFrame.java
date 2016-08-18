package gui;

import constants.Constants;
import gamePlay.Euker;

import javax.swing.*;
import java.awt.*;

/**
 * Top level frame for the gui.
 */
public class MainFrame extends JFrame{

    public MainFrame(Euker eukerGame){
        this.setLayout(new FlowLayout());
        this.setSize(Constants.WIDTH_FRAME, Constants.HEIGHT_FRAME);
        this.setTitle(Constants.EUKER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Helper method to validate drawn components.
     * @param c component that is to be validated.
     */
    public static void validateComponent(Component c){
        c.revalidate();
        c.repaint();
    }
}
