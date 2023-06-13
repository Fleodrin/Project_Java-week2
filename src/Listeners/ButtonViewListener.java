package Listeners;

import GUI.CustomerViewer;
import GUI.WindowFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewListener implements ActionListener {

    WindowFrame frame;

    public ButtonViewListener(WindowFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        CustomerViewer viewer = frame.getCustomerviewer();
        frame.setupPanel(viewer);
    }
}
