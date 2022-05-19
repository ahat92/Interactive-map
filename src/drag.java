import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class drag extends MouseAdapter {
    private final Point pp = new Point();
    @Override public void mouseDragged(MouseEvent e) {
        System.out.println("prick");
        JViewport vport = (JViewport)e.getSource();
        JComponent label = (JComponent)vport.getView();
        Point cp = e.getPoint();
        Point vp = vport.getViewPosition();
        vp.translate(pp.x-cp.x, pp.y-cp.y);
        label.scrollRectToVisible(new Rectangle(vp, vport.getSize()));
        pp.setLocation(cp);
    }
    @Override public void mousePressed(MouseEvent e) {
        System.out.println("ahhhhhhhhhhhhh");
        pp.setLocation(e.getPoint());
    }
}