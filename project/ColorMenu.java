package game;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

    public class ColorMenu extends JFrame {

        private String[] colorNameArray = {"GRAY", "LIGHT GRAY","WHITE", "BLACK"};
        private Color []colorListArray= {Color.gray,Color.lightGray,Color.white, Color.BLACK};
        JList colorList;
    
            ColorMenu(){

                JLabel label = new JLabel();
                label.setText("Select Color");
                label.setFont(new Font("DialogInput", Font.BOLD,30));
                this.add(label);

                colorList = new JList(colorNameArray);
                colorList.setFont(new Font("DialogInput",Font.BOLD,30));
                colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                this.add(colorList);
        
                EventHandler handler = new EventHandler();
                colorList.addListSelectionListener(handler);

                this.setLayout(new FlowLayout());
                this.setTitle("TETRIS");
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);           
                this.setSize(300,500);           
                this.setLocationRelativeTo(null);
                this.setVisible(true);
                this.setResizable(false);
                this.getContentPane().setBackground(Color.blue);
    
    }
    
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){

            Board.gameBGC = colorListArray[colorList.getSelectedIndex()];

            new Tetris();
            dispose();
        }
    }  
}
