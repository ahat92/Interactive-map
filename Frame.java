import org.piccolo2d.PCanvas;
import org.piccolo2d.extras.PFrame;
import org.piccolo2d.nodes.PText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
    MouseAdapter ma;
    JViewport vport;
    JScrollPane scroll;
    int width = 1280;
    int length = 720;
    int scale = 1;

    Frame() {
        this.setLayout(new GridLayout(1,1));
        this.add(new Map());
        this.setSize(1280, 720);
        setVisible(true);
    }

    public class Map extends PCanvas implements ActionListener {
        JLayer sad;
        public JLabel titleWord;
        public Map(){
            titleWord = new JLabel("CHESS");
            titleWord.setFont(new Font(Font.SERIF,Font.ITALIC,100));
            PText ahhh = new PText("Damn");
            this.getLayer().addChild(ahhh);
            this.add(titleWord);
        }

        public void actionPerformed (ActionEvent e){

        }
    }
}
