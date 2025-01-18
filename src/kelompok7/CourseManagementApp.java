/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok7;

/**
 *
 * @author hgil0
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CourseManagementApp extends JFrame {
    private JTextField namaMatkulField;
    private JTextField kodeMatkulField;
    private JTextField sksField;
    private JTable table;
    private DefaultTableModel tableModel;

    public CourseManagementApp() {
        setTitle("Manajemen Daftar Matkul");
        setSize(1563, 795);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("DAFTAR MATKUL");
        labelTitle.setBounds(350, 20, 350, 40);
        panel.add(labelTitle);

        JLabel namaMatkulLabel = new JLabel("Nama Matkul:");
        namaMatkulLabel.setBounds(10, 50, 300, 25);
        panel.add(namaMatkulLabel);

        namaMatkulField = new JTextField();
        namaMatkulField.setBounds(120, 50, 200, 25);
        panel.add(namaMatkulField);

        JLabel kodeMatkulLabel = new JLabel("Kode Matkul:");
        kodeMatkulLabel.setBounds(10, 80, 100, 25);
        panel.add(kodeMatkulLabel);

        kodeMatkulField = new JTextField();
        kodeMatkulField.setBounds(120, 80, 200, 25);
        panel.add(kodeMatkulField);

        JLabel sksLabel = new JLabel("SKS:");
        sksLabel.setBounds(10, 110, 100, 25);
        panel.add(sksLabel);

        sksField = new JTextField();
        sksField.setBounds(120, 110, 200, 25);
        panel.add(sksField);

        JButton createButton = new JButton("Create");
        createButton.setBounds(10, 150, 90, 25);
        panel.add(createButton);

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(110, 150, 90, 25);
        panel.add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(210, 150, 90, 25);
        panel.add(deleteButton);

        JButton printButton = new JButton("Print");
        printButton.setBounds(310, 150, 90, 25);
        panel.add(printButton);

        JLabel searchLabel = new JLabel("Search By Kode Matkul:");
        searchLabel.setBounds(10, 190, 150, 25);
        panel.add(searchLabel);

        JTextField searchField = new JTextField();
        searchField.setBounds(170, 190, 150, 25);
        panel.add(searchField);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(330, 190, 90, 25);
        panel.add(searchButton);

        tableModel = new DefaultTableModel(new String[]{"ID", "Nama Matkul", "Kode Matkul", "SKS"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 230, 560, 120);
        panel.add(scrollPane);

        add(panel);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk membuat data matkul
                String namaMatkul = namaMatkulField.getText();
                String kodeMatkul = kodeMatkulField.getText();
                String sks = sksField.getText();
                // Tambahkan data ke tabel
                tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, namaMatkul, kodeMatkul, sks});
                clearFields();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk memperbarui data matkul
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    tableModel.setValueAt(namaMatkulField.getText(), selectedRow, 1);
                    tableModel.setValueAt(kodeMatkulField.getText(), selectedRow, 2);
                    tableModel.setValueAt(sksField.getText(), selectedRow, 3);
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data yang ingin diupdate!");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk menghapus data matkul
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    tableModel.removeRow(selectedRow);
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!");
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk mencari data matkul berdasarkan kode matkul
                String kodeMatkul = searchField.getText();
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    if (tableModel.getValueAt(i, 2).equals(kodeMatkul)) {
                        table.setRowSelectionInterval(i, i);
                        namaMatkulField.setText((String) tableModel.getValueAt(i, 1));
                        kodeMatkulField.setText((String) tableModel.getValueAt(i, 2));
                        sksField.setText((String) tableModel.getValueAt(i, 3));
                        break;
                    }
                }
            }
        });

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk mencetak data matkul
                try {
                    table.print();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error printing: " + ex.getMessage());
                }
            }
        });
    }

    private void clearFields() {
        namaMatkulField.setText("");
        kodeMatkulField.setText("");
        sksField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CourseManagementApp().setVisible(true);
            }
        });
    }
}
