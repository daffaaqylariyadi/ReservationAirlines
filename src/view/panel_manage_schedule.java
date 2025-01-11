package view;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
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
import dao.dao_manage;
import dao.interface_manage;

public class panel_manage_schedule extends javax.swing.JPanel {
    
    private interface_manage dao_manage;

    private void handleSubmit() {
        String flight_code = txt_flight_code.getText();
        String flight_source = txt_source.getText();
        String destination = txt_destination.getText();
        Date flight_date = new Date(date_takeof.getDate().getTime());

        if (dao_manage.addSchedule(flight_code, flight_source, destination, flight_date)) {
            JOptionPane.showMessageDialog(this, "Flight berhasil ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadTableData();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan flight.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void handleEdit() {
        int selectedRow = table_flight.getSelectedRow();
        if (selectedRow >= 0) {
            int idReservations = Integer.parseInt(table_flight.getValueAt(selectedRow, 0).toString()); // id_reservations
            String flight_code = txt_flight_code.getText();
            String flight_source = txt_source.getText();
            String destination = txt_destination.getText();
            Date flight_date = new Date(date_takeof.getDate().getTime());

            if (dao_manage.updateSchedule(idReservations, flight_code, flight_source, destination, flight_date)) {
                JOptionPane.showMessageDialog(this, "Flight berhasil diperbarui!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadTableData();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui flight.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih flight yang akan diedit.");
        }
    }

    private void handleDelete() {
        int selectedRow = table_flight.getSelectedRow();
        if (selectedRow >= 0) {
            int idReservations = Integer.parseInt(table_flight.getValueAt(selectedRow, 0).toString()); // id_reservations
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus flight ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                if (dao_manage.deleteSchedule(idReservations)) {
                    JOptionPane.showMessageDialog(this, "Flight berhasil dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadTableData();
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus flight.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih flight yang akan dihapus.");
        }
    }
     
    private void loadTableData() {
        try (Connection conn = database.getConnection();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_flight, flight_code, flight_source, destination, flight_date FROM flight")) {

            DefaultTableModel model = (DefaultTableModel) table_flight.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                int idReservations = rs.getInt("id_flight");
                String flight_code = rs.getString("flight_code");
                String flight_source = rs.getString("flight_source");
                String destination = rs.getString("destination");
                Date flight_date = rs.getDate("flight_date");
                model.addRow(new Object[]{idReservations, flight_code, flight_source, destination, flight_date});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        
    private void populateFieldsFromSelection() {
        int selectedRow = table_flight.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table_flight.getModel();
            txt_flight_code.setText(model.getValueAt(selectedRow, 1).toString());
            txt_source.setText(model.getValueAt(selectedRow, 2).toString());
            txt_destination.setText(model.getValueAt(selectedRow, 3).toString());
            date_takeof.setDate((Date) model.getValueAt(selectedRow, 4));
        }
    }

    private void resetForm() {
        txt_flight_code.setText("");
        txt_source.setText("");
        txt_destination.setText("");
        date_takeof.setDate(null);
    }
    
    public void searchFlights() {
    // Ambil input pencarian dari satu text field
    String searchInput = txt_search.getText().trim();

    // Ambil model tabel dari JTable
    DefaultTableModel model = (DefaultTableModel) table_flight.getModel();
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

        
    public panel_manage_schedule() {
        initComponents();
        dao_manage = new dao_manage();
        loadTableData();
        table_flight.getSelectionModel().addListSelectionListener(e -> populateFieldsFromSelection());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        DepartHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_flight = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date_takeof = new com.toedter.calendar.JDateChooser();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_flight_code = new javax.swing.JTextField();
        txt_source = new javax.swing.JTextField();
        txt_destination = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(106, 169, 214));

        DepartHeader.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader.setForeground(new java.awt.Color(17, 90, 142));
        DepartHeader.setText("Manage Schedule");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(DepartHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(DepartHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        table_flight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table_flight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Schedule", "Flight Code", "Flight Source", "Flight Destination", "Flight Takeof Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_flight);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 169, 214));
        jLabel4.setText("Source");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 169, 214));
        jLabel5.setText("Destination");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(106, 169, 214));
        jLabel8.setText("Flight List");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(106, 169, 214));
        jLabel6.setText("Takeof Date");

        btn_save.setBackground(new java.awt.Color(17, 90, 142));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setBorderPainted(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(17, 90, 142));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorderPainted(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 91, 91));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.setBorderPainted(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(106, 169, 214));
        jLabel3.setText("Flight Code");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 169, 214));
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(26, 26, 26)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel3))
                                    .addComponent(txt_flight_code, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel4)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel5)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_source, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addComponent(txt_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_save)
                                                .addGap(39, 39, 39)
                                                .addComponent(btn_edit)
                                                .addGap(37, 37, 37)
                                                .addComponent(btn_delete)))))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_takeof, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_flight_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_takeof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        handleDelete();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        handleSubmit();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        handleEdit();
    }//GEN-LAST:event_btn_editActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
        searchFlights();
    }//GEN-LAST:event_txt_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartHeader;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private com.toedter.calendar.JDateChooser date_takeof;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_flight;
    private javax.swing.JTextField txt_destination;
    private javax.swing.JTextField txt_flight_code;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_source;
    // End of variables declaration//GEN-END:variables
}
