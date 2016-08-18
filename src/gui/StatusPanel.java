package gui;

import constants.Constants;

import javax.swing.*;
import java.awt.*;
import java.lang.ref.WeakReference;

public class StatusPanel extends JPanel {
    public JLabel winnerLabel;

    public StatusPanel(){
        JLabel statusPanelLabel = new JLabel(Constants.STATUS_PANEL);
        this.winnerLabel = new JLabel(Constants.CURRENT_TURN);
        this.setLayout(new GridBagLayout());
        GridBagConstraints statusConstraints = new GridBagConstraints();
        statusConstraints.gridx = 0;
        statusConstraints.gridy = 0;
        this.add(statusPanelLabel,statusConstraints);
        statusConstraints.gridy++;
        this.add(this.winnerLabel,statusConstraints);
    }


    public void updateWinnerLabel(String winnerText){
        SwingUtilities.invokeLater(new UpdateWinnerLabel(this,winnerText));
    }

    private static class UpdateWinnerLabel implements Runnable{
        private WeakReference<StatusPanel> wStatusPanel;
        private String winnerText;

        UpdateWinnerLabel(StatusPanel statusPanel, String winnerText){
            this.wStatusPanel = new WeakReference<>(statusPanel);
            this.winnerText = winnerText;
        }
        @Override
        public void run() {
            StatusPanel statusPanel = this.wStatusPanel.get();
            if(statusPanel == null){
                return;
            }
            statusPanel.winnerLabel.setText(this.winnerText);
        }
    }
}
