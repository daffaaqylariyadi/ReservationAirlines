package view;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.xdevapi.Table;
import koneksi.database;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.beans.Statement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panel_flight extends javax.swing.JPanel {
    
    private void loadTableData() {
        try (Connection conn = database.getConnection();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM flight")) {

            DefaultTableModel model = (DefaultTableModel) table_schedule.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String flight_code = rs.getString("flight_code");
                String flight_source = rs.getString("flight_source");
                String destination = rs.getString("destination");
                Date flight_date = rs.getDate("flight_date");
                model.addRow(new Object[]{flight_code, flight_source, destination, flight_date});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
   public void searchFlights() {
    // Ambil input pencarian dari satu text field
    String searchInput = txt_search.getText().trim();

    // Ambil model tabel dari JTable
    DefaultTableModel model = (DefaultTableModel) table_schedule.getModel();
    model.setRowCount(0); // Bersihkan tabel sebelum menampilkan hasil baru

    // Query pencarian fleksibel menggunakan klausa LIKE
    String query = "SELECT flight_code, flight_source, destination, flight_date " +
                   "FROM flight " +
                   "WHERE flight_source LIKE ? OR destination LIKE ? OR flight_date LIKE ?";

    try (Connection conn = database.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        // Tambahkan wildcard '%' untuk pencarian parsial
        String searchPattern = "%" + searchInput + "%";
        stmt.setString(1, searchPattern);
        stmt.setString(2, searchPattern);
        stmt.setString(3, searchPattern);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String flightCode = rs.getString("flight_code");
            String flightSource = rs.getString("flight_source");
            String flightDestination = rs.getString("destination");
            String flightDate = rs.getString("flight_date");

            // Tambahkan data ke model tabel
            model.addRow(new Object[]{flightCode, flightSource, flightDestination, flightDate});
        }
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
}


    
    public panel_flight() {
        initComponents();
        loadTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_schedule = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        DepartHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        table_schedule.setAutoCreateRowSorter(true);
        table_schedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table_schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Code", "Flight Source", "Flight Destination", "Flight Takeof Date"
            }
        ));
        table_schedule.setFocusable(false);
        table_schedule.setGridColor(new java.awt.Color(106, 169, 214));
        table_schedule.setInheritsPopupMenu(true);
        table_schedule.setSelectionBackground(new java.awt.Color(106, 169, 214));
        table_schedule.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table_schedule);

        jPanel2.setBackground(new java.awt.Color(106, 169, 214));

        DepartHeader.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader.setForeground(new java.awt.Color(17, 90, 142));
        DepartHeader.setText("Schedule Flight");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepartHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(DepartHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 90, 142));
        jLabel1.setText("Search Flight");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
        searchFlights();
    }//GEN-LAST:event_txt_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_schedule;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
