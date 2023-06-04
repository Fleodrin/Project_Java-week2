package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerViewer extends JFrame {
    public CustomerViewer() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Contact Info.");

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
