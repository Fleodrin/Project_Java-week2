package GUI;

import Customer.CustomerInput;
import XManagment.CustomerManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class CustomerViewer extends JPanel {

    WindowFrame frame;
    CustomerManager customerManager;

    public CustomerViewer(WindowFrame frame, CustomerManager customerManager) {
        this.frame = frame;
        this.customerManager = customerManager;

        System.out.println("***" + customerManager.size() + "***");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Contact Info.");

        for (int i = 0; i < customerManager.size(); i++) {
            Vector row = new Vector();
            CustomerInput si = customerManager.get(i);
            row.add(si.getId());
            row.add(si.getName());
            row.add(si.getEmail());
            row.add(si.getPhone());
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
    }
}
