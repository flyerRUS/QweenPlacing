package frames;

import objects.GraphPanel;

import javax.swing.*;
import java.awt.geom.Rectangle2D;

public class MainFrame extends JFrame {

    private GraphPanel graphPanel;

    public MainFrame(){
        super();
        this.setTitle("Queen Placing v 0.1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
        graphPanel = new GraphPanel();
        this.add(graphPanel);
    }

}
