package game;
import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {

    private JLabel statusbar;

    Tetris() {
        statusbar = new JLabel(" SCORE: 0");
        this.add(statusbar, BorderLayout.SOUTH);
       
        this.setVisible(true);
        this.setTitle("Tetris");
            this.setSize(360, 500);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            

        Board board = new Board(this);
        add(board);
        board.start();
    }

    JLabel getStatusBar() {

        return statusbar;
    }

}
