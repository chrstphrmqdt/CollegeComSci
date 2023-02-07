import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EXAMGURO {
    private JFrame frame;
    private JTable table;
    private JTextField nameInput, positionInput, idInput;

    public static void main(String[] args) {
        EXAMGURO employeeData = new EXAMGURO();
        employeeData.createUI();
    }

    public void createUI() {
        frame = new JFrame("Employee Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        // create table
        String[] columnNames = {"Name", "Position", "ID"};
        Object[][] data = {};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);

        // create input fields
        nameInput = new JTextField();
        positionInput = new JTextField();
        idInput = new JTextField();

        // create add button
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addButtonClicked();
            }
        });

        // create delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteButtonClicked();
            }
        });

        // create input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(1, 5, 10, 10));
        inputPanel.add(nameInput);
        inputPanel.add(positionInput);
        inputPanel.add(idInput);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);

        // add components to frame
        frame.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);

        // display the frame
        frame.setVisible(true);
    }

    // add button clicked
    public void addButtonClicked() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[] { nameInput.getText(), positionInput.getText(), idInput.getText() });
    }

    // delete button clicked
    public void deleteButtonClicked() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(frame, "No row selected.");
        }
    }
}
