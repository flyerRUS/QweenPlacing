package objects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by Daniil on 21.06.2017.
 */
public class GraphPanel extends JPanel {
    public GraphPanel() {
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rect = new Rectangle(50,50, 100, 100);
        g2.draw(rect);
    }

}
