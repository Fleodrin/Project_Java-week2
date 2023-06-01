package GUI;

import javax.swing.*;

public class CustomerAdder extends JFrame {
    public CustomerAdder() {
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
        JTextField fieldID = new JTextField(10);
        labelID.setLabelFor(fieldID);

        panel.add(labelID);
        panel.add(fieldID);

        SpringUtilities.makeCompactGrid(panel, 1, 2, 6, 6, 6, 6);

        this.setSize(300, 300);
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
