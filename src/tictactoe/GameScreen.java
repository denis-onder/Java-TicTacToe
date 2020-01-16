package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameScreen extends JFrame {

    private static final int NUMBER_OF_BUTTONS = 9;

    private JPanel root;

    private JButton[] buttons = new JButton[NUMBER_OF_BUTTONS];

    public GameScreen() {
        // Config
        setResizable(false);
        setSize(400,400);
        root.setLayout(new GridLayout(3, 3));
        // Draw buttons
        drawButtons();
        // Add root panel to frame
        add(root);

    }

    private void drawButtons() {
        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            // Create new JButton
            JButton btn = new JButton(" ");
            // Styles
            btn.setBackground(root.getBackground());
            btn.setBorder(BorderFactory.createLineBorder(Color.white));
            btn.setForeground(Color.white);
            btn.setFont(new Font("Arial", Font.PLAIN, 40));
            // Attach click listener to button
            int finalI = i;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleClick(btn, finalI);
                }
            });
            // Add button to grid and the buttons array
            root.add(btn);
            buttons[i] = btn;
        }
    }
    private void computerMove() {
        for (JButton btn:buttons) {
            System.out.println(btn);
        }
    }
    private void handleClick(JButton btn, int index) {
        btn.setText("X");
        System.out.println(index);
//        computerMove();
    }
}
