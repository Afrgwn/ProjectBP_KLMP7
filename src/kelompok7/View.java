package kelompok7;
//import com.sun.glass.ui.View;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        searchData = new javax.swing.JTextField();
        search = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        submit.setText("Create");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel2.setText("ABSENSI");

        jLabel3.setText("Nim");

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        jLabel4.setText("Kelas");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Nim", "Kelas"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jLabel5.setText("Search By ID");

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        back.setText("Home");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setText("Matkul");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                    .addComponent(kelas, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(print)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submit)
                            .addComponent(update)
                            .addComponent(delete)
                            .addComponent(print))
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jButton1))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadData() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
          String url = "jdbc:mysql://localhost:3306/java_users_db";
          String user = "root";  
          String password = "";  
          
          
          Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
     DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama","Nim","Kelas"}, 0);
             
      Table.setModel(model);
      String sql = "SELECT `id`, `nama`, `nim`, `kelas` FROM `java_users_db`.`absensi`";
      ResultSet rs = st.executeQuery(sql);
      String i, nm, n, k;
      while(rs.next()) {
      i = rs.getString("id");
      nm = rs.getString("nama");
      n = rs.getString("nim");
      k = rs.getString("kelas");
      model.addRow(new Object[]{i, nm, n, k});
      }
      con.close();
       }
      catch(Exception e){
      System.out.println("Error" + e.getMessage());
      }
     }
   
 
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // submit codingan
        String Nama, Nim, Kelas, query;
        
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";
        String password = "";
        
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
         
        if ("".equals(nama.getText())) { 
            JOptionPane.showMessageDialog(new JFrame(), "Nama is required", "Dialog", JOptionPane.ERROR_MESSAGE); }
        else if ("".equals(nim.getText())) 
        { JOptionPane.showMessageDialog(new JFrame(), "Nim is required", "Dialog", JOptionPane.ERROR_MESSAGE); } 
        else if ("".equals(kelas.getText())) 
        { JOptionPane.showMessageDialog(new JFrame(), "Kelas is required", "Dialog", JOptionPane.ERROR_MESSAGE); } 
        else {
            Nama = nama.getText(); 
            Nim = nim.getText(); 
            Kelas = kelas.getText(); 
            query = "INSERT INTO absensi (nama, nim, kelas) VALUES ('" + Nama + "','" + Nim + "','" + Kelas + "')"; 
            System.out.println("Nama: " + Nama + ", Nim: " + Nim + ", Kelas: " + Kelas); 
            st.executeUpdate(query);
            nama.setText(""); 
            nim.setText(""); 
            kelas.setText(""); 
            JOptionPane.showMessageDialog(null, "Register successfully processed.");
            loadData(); // Memanggil metode load data() untuk memperbarui tabel con.close();
            }
    } catch (Exception e) { 
        System.out.println("Error: " + e.getMessage()); 
        e.printStackTrace(); }  
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       String id, Nama, Nim, Kelas;
    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        con = DriverManager.getConnection(url, user, password);
        id = searchData.getText();
        Nama = nama.getText();
        Nim = nim.getText();
        Kelas = kelas.getText();
        if ("".equals(id)) { 
            JOptionPane.showMessageDialog(new JFrame(), "ID diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(Nama)) { 
            JOptionPane.showMessageDialog(new JFrame(), "Nama  diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(Nim)) { 
            JOptionPane.showMessageDialog(new JFrame(), "Nim diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(Kelas)) { 
            JOptionPane.showMessageDialog(new JFrame(), "Kelas diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "UPDATE `absensi` SET `nama` = ?, `nim` = ?, `kelas` = ? WHERE `id` = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Nama);
            pst.setString(2, Nim);
            pst.setString(3, Kelas);
            pst.setString(4, id);
            int rowsUpdated = pst.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Data berhasil diperbarui", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                loadData(); // Memanggil metode loadData() untuk memperbarui tabel
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Data tidak ditemukan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String id;
    int notFound = 0;
    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT `nama`, `nim`, `kelas` FROM `absensi` WHERE `id` = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        id = searchData.getText();
        if ("".equals(id)) { 
            JOptionPane.showMessageDialog(new JFrame(), "ID diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                notFound = 1;
            } 
            if (notFound == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Data tidak ditemukan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Jika data ditemukan, hapus data tersebut
                String deleteSql = "DELETE FROM `absensi` WHERE `id` = ?";
                PreparedStatement deletePst = con.prepareStatement(deleteSql);
                deletePst.setString(1, id);
                deletePst.executeUpdate();
                JOptionPane.showMessageDialog(new JFrame(), "Data berhasil dihapus", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                
                // Memanggil metode loadData() untuk memperbarui tabel
                loadData();
            }
        }
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       String id;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT `nama`, `nim`, `kelas` FROM `absensi` WHERE `id` = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        id = searchData.getText();
        if ("".equals(id)) { 
            JOptionPane.showMessageDialog(new JFrame(), "ID diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nama.setText(rs.getString("nama"));
                nim.setText(rs.getString("nim"));
                kelas.setText(rs.getString("kelas"));
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Data tidak ditemukan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_searchActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
    // scrpt 
    GenerateReport generatereport = new GenerateReport(); 
        generatereport.generateReport();
    
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
   
        Navigation frameSelanjutnya = new Navigation();
        frameSelanjutnya.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        matakuliah frameSelanjutnya = new matakuliah();
        frameSelanjutnya.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               View x = new View();
                try {
                    x.loadData();
                } catch (SQLException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
               x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JButton print;
    private javax.swing.JToggleButton search;
    private javax.swing.JTextField searchData;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
