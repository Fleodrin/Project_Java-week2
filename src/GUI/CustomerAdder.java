package GUI;

import javax.swing.*;

public class CustomerAdder extends JPanel {

    WindowFrame frame;

    public CustomerAdder(WindowFrame frame) {
        this.frame = frame;

        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
        JTextField fieldID = new JTextField(10);
        labelID.setLabelFor(fieldID);
        panel.add(labelID);
        panel.add(fieldID);

        JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
        JTextField fieldName = new JTextField(10);
        labelName.setLabelFor(fieldName);
        panel.add(labelName);
        panel.add(fieldName);

        JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
        JTextField fieldEmail = new JTextField(10);
        labelEmail.setLabelFor(fieldEmail);
        panel.add(labelEmail);
        panel.add(fieldEmail);

        JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
        JTextField fieldPhone = new JTextField(10);
        labelPhone.setLabelFor(fieldPhone);
        panel.add(labelPhone);
        panel.add(fieldPhone);

        panel.add(new JButton("save"));
        panel.add(new JButton("cancel"));

        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

        this.add(panel);
        this.setVisible(true);
    }
}
