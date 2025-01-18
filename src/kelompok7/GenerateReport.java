package kelompok7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

class GenerateReport {
   
    void generateReport() {
        try {
            // Gunakan file .jasper, bukan .jrxml
            String reportPath = "C:\\Users\\hgil0\\OneDrive\\Documents\\NetBeansProjects\\kelompok7\\build\\classes\\kelompok7\\report1.jasper";
            String url = "jdbc:mysql://localhost:3306/java_users_db";
            String user = "root";
            String password = "";

            // Membuat koneksi ke database
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // Mengisi laporan dengan data dari database
            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parameters, conn);
            
            // Menampilkan laporan menggunakan JasperViewer
            JasperViewer.viewReport(jasperPrint, false);
            
            // Menutup koneksi
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
