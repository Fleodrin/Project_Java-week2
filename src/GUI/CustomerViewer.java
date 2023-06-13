package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerViewer extends JPanel {

    WindowFrame frame;

    public CustomerViewer(WindowFrame frame) {
        this.frame = frame;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Contact Info.");

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
    }
}
