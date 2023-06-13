package GUI;

import Listeners.ButtonAddListener;
import Listeners.ButtonViewListener;
import javax.swing.*;
import java.awt.*;

public class MenuSelection extends JPanel {

    WindowFrame frame;

    public MenuSelection(WindowFrame frame) {
        this.frame = frame;

        this.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Menu Selection");

        JButton button1 = new JButton("Add Customer");
        JButton button2 = new JButton("View Customer");
        JButton button3 = new JButton("Edit Customer");
        JButton button4 = new JButton("Delete Customer");
        JButton button5 = new JButton("Exit Program");

        button1.addActionListener(new ButtonAddListener(frame));
        button2.addActionListener(new ButtonViewListener(frame));

        panel1.add(label);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
    }
}
