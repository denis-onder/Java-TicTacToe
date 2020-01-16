package tictactoe;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameScreen screen = new GameScreen();
                screen.setVisible(true);
            }
        });
    }
}
