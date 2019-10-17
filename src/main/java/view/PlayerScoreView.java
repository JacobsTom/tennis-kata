package view;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerScoreView extends JPanel {

    private JLabel player;

    public PlayerScoreView(final String name, final Controller controller) {
        this.player = new JLabel(name);
        JButton b = new JButton("Increase score for " + name);

        this.setSize(200, 200);
        b.setBounds(20,20,150, 50);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.increaseScoreForPlayer(name);
                System.out.println(controller.getScoreForPlayer(name));
            }
        });

        this.setVisible(true);
        this.add(b);
    }


}
