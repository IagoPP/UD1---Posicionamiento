/*
 * GridBagLayoutDemo.java is a 1.4 application that requires no other files.
 */

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JLabel label;
        Color color;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            // natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        // turquoise
        label = new JLabel("hola");
        label.setOpaque(true);
        color = new Color(76, 235, 169);
        label.setBackground(color);

        c.gridx = 0;
        c.gridy = 0;

        c.gridheight = 4;
        pane.add(label, c);

        // temporal
        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.BLACK);

        c.gridx = 0;
        c.gridy = 4;
        c.ipadx = 100;
        c.ipady = 100;
        c.gridheight = 4;
        pane.add(label, c);

        // green
        label = new JLabel();
        label.setOpaque(true);
        color = new Color(56, 120, 0);
        label.setBackground(color);
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        pane.add(label, c);

        // blue
        label = new JLabel();
        label.setOpaque(true);
        color = new Color(1, 80, 159);
        label.setBackground(color);
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 6;
        pane.add(label, c);

        /*
         * button = new JButton("Button 3");
         * c.gridx = 2;
         * c.gridy = 0;
         * pane.add(button, c);
         * 
         * button = new JButton("Long-Named Button 4");
         * c.ipady = 40; // make this component tall
         * c.weightx = 0.0;
         * c.gridwidth = 3;
         * c.gridx = 0;
         * c.gridy = 1;
         * pane.add(button, c);
         * 
         * button = new JButton("5");
         * c.ipady = 0; // reset to default
         * c.weighty = 1.0; // request any extra vertical space
         * c.anchor = GridBagConstraints.PAGE_END; // bottom of space
         * c.insets = new Insets(10, 0, 0, 0); // top padding
         * c.gridx = 1; // aligned with button 2
         * c.gridwidth = 2; // 2 columns wide
         * c.gridy = 2; // third row
         * pane.add(button, c);
         */
    }

    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        // Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(2000, 300);
        // Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}