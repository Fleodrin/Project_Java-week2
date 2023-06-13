package Listeners;

import GUI.CustomerAdder;
import GUI.WindowFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAddListener implements ActionListener {
    WindowFrame frame;

    public ButtonAddListener(WindowFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        CustomerAdder adder = frame.getCustomeradder();
        frame.setupPanel(adder);
    }
}
