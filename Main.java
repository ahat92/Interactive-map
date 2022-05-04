import javax.swing.*;
import java.awt.event.MouseAdapter;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CHS Map");
        JScrollPane scroll = new JScrollPane(new Map());
        JViewport vport = scroll.getViewport();
        MouseAdapter ma = new Drag.HandScrollListener();
        vport.addMouseMotionListener(ma);
        vport.addMouseListener(ma);
        frame.add(scroll);
        frame.setSize(1280,720);
        frame.setVisible(true);
    }
}