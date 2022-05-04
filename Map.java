import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Map extends JPanel implements ActionListener {

    public Map(){
        JLabel titleWord = new JLabel("CHESS",SwingConstants.CENTER);
        titleWord.setFont(new Font(Font.SERIF,Font.ITALIC, 1000));
        this.add(titleWord);
    }

    public void actionPerformed (ActionEvent e){

    }



}