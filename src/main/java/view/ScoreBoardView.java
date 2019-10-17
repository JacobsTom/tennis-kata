package view;

import controller.Controller;

import javax.swing.*;

public class ScoreBoardView extends JFrame {

    private Controller controller;

    public ScoreBoardView() {
        String player1 = JOptionPane.showInputDialog("Enter the name of player 1");
        String player2 = JOptionPane.showInputDialog("Enter the name of player 2");

        Controller controller = new Controller(player1, player2);

        this.setTitle("Tennis");
        this.setSize(1000, 500);

        PlayerScoreView psv1 = new PlayerScoreView(player1, controller);
        PlayerScoreView psv2 = new PlayerScoreView(player2, controller);

        this.add(psv1);
        this.add(psv2);
    }

    public void close() {
        System.exit(0);
    }
}
