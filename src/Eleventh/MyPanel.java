package Eleventh;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    public MyPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                Graphics g = getGraphics();
                g.drawRect(x, y, 20, 20);
            }
        });
    }
}
