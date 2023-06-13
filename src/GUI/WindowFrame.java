package GUI;

import XManagment.CustomerManager;
import javax.swing.*;

public class WindowFrame extends JFrame {
    CustomerManager customerManager;
    MenuSelection menuselection;
    CustomerAdder customeradder;
    CustomerViewer customerviewer;

    public WindowFrame(CustomerManager customerManager) {
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Frame");

        this.customerManager = customerManager;
        menuselection  = new MenuSelection(this);
        customeradder = new CustomerAdder(this);
        customerviewer = new CustomerViewer(this, this.customerManager);

        this.add(menuselection);

        this.setVisible(true);
    }

    public void setupPanel(JPanel panel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
        this.revalidate();
        this.repaint();
    }

    public MenuSelection getMenuselection() {
        return menuselection;
    }

    public void setMenuselection(MenuSelection menuselection) {
        this.menuselection = menuselection;
    }

    public CustomerAdder getCustomeradder() {
        return customeradder;
    }

    public void setCustomeradder(CustomerAdder customeradder) {
        this.customeradder = customeradder;
    }

    public CustomerViewer getCustomerviewer() {
        return customerviewer;
    }

    public void setCustomerviewer(CustomerViewer customerviewer) {
        this.customerviewer = customerviewer;
    }
}
