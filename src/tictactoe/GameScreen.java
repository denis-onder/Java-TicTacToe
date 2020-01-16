package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameScreen extends JFrame {

    private static final int NUMBER_OF_BUTTONS = 9;

    private JPanel root;

    public GameScreen() {
        setResizable(false);
        setSize(400,400);
        root.setLayout(new GridLayout(3, 3));

        drawButtons();

        add(root);

    }

    private void drawButtons() {
        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            // Create new JButton
            JButton btn = new JButton("ID: " + (i+1));
            // Attach click listener to button
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GameLogic.handleClick(btn);
                }
            });
            // Add button to grid
            root.add(btn);
        }
    }

}
