package objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniil on 21.06.2017.
 */
public class GraphPanel extends JPanel {
    public GraphPanel() {
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rect = new Rectangle(5,5, 100, 100);
        g2.draw(rect);
    }



}
