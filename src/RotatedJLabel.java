import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class RotatedJLabel extends JLabel {
    public RotatedJLabel(String text) {
        super(text);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gx = (Graphics2D) g;
        gx.rotate(Math.PI/2, this.getVisibleRect().getX() + getWidth()/2, this.getVisibleRect().getY() + getHeight()/2);
        super.paintComponent(g);
    }

}
