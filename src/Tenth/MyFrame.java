package Tenth;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        JPanel titlePanel = new JPanel(new GridBagLayout());
        JLabel title = new JLabel("Welcome to Java Pizza. Choose the type of pizza.");
        titlePanel.add(title);

        JPanel panel = new JPanel();

        JButton button1 = new JButton("Combination Pizza");
        panel.add(button1);

        JButton button2 = new JButton("Potato pizza");
        panel.add(button2);

        JButton button3 = new JButton("Roasted meat pizza");
        panel.add(button3);

        JLabel countTitle = new JLabel("count");
        panel.add(countTitle);

        JTextField field = new JTextField(10);
        panel.add(field);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(titlePanel, BorderLayout.NORTH);
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.pack(); // Automatically adjust the frame size based on the preferred sizes of components
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
