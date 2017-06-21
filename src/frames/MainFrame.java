package frames;

import objects.GraphPanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


/**
 * Created by Dmitriy on 21.06.2017.
 */
public class MainFrame extends JFrame {

    private JLabel sizeLabel;
    private JButton startButton;
    private JButton nextButton;
    private JButton preButton;
    private JPanel rightPanel;
    private JSpinner sizeSpinner;
    private GraphPanel graphPanel;

    public MainFrame() {
        super();
        this.setTitle("Queen Placing v 0.1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));



        //Create right panel
        rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(new LineBorder(Color.BLACK, 1, true));

        //Create label
        sizeLabel = new JLabel("Size of desk: ");


        //Create spinner
        sizeSpinner = new JSpinner(new SpinnerNumberModel(4, 0, 64, 1));


        startButton = new JButton("Start");
        startButton.setSize(100, 40);


        nextButton = new JButton("Next");
        nextButton.setEnabled(false);

        preButton = new JButton("Prev");
        preButton.setEnabled(false);


        rightPanel.add(sizeLabel);
        //rightPanel.add(Box.createVerticalStrut(25));
        rightPanel.add(sizeSpinner);
        //rightPanel.add(Box.createVerticalStrut(25));
        rightPanel.add(startButton);
        //rightPanel.add(Box.createVerticalStrut(25));
        rightPanel.add(nextButton);
        //rightPanel.add(Box.createVerticalStrut(25));
        rightPanel.add(preButton);

        graphPanel = new GraphPanel();
        getContentPane().add(graphPanel);


        getContentPane().add(rightPanel);
    }

}
