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

public class panel_manage_passenger extends javax.swing.JPanel {
    
    private interface_manage dao_manage;

    private void handleSubmit() {
        String passport = txt_passport.getText().trim();
        String name_user = txt_name.getText().trim();
        String address = txt_address.getText().trim();
        String mobile_number = txt_phone.getText().trim();
        String email = txt_email.getText().trim();

        if (dao_manage.addPassenger(passport, email, address, mobile_number, email)) {
            JOptionPane.showMessageDialog(this, "Passenger berhasil ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadTableData();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan Passenger.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleEdit() {
        int selectedRow = table_passenger.getSelectedRow();
        if (selectedRow >= 0) {
            int idPassenger = Integer.parseInt(table_passenger.getValueAt(selectedRow, 0).toString()); // Ambil id_passenger
            String passport = txt_passport.getText().trim(); // Ambil passport dari field input
            String name_user = txt_name.getText().trim();
            String address = txt_address.getText().trim();
            String mobile_number = txt_phone.getText().trim();
            String email = txt_email.getText().trim();

            if (dao_manage.updatePassenger(idPassenger, passport, name_user, address, mobile_number, email)) {
                JOptionPane.showMessageDialog(this, "Passenger berhasil diperbarui!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadTableData(); // Memuat data terbaru ke tabel
                resetForm();      // Mereset form setelah edit
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui Passenger.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih Passenger yang akan diedit.");
        }
    }

    private void handleDelete() {
        int selectedRow = table_passenger.getSelectedRow();
        if (selectedRow >= 0) {
            int idPassenger = Integer.parseInt(table_passenger.getValueAt(selectedRow, 0).toString()); // Ambil id_passenger
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus Passenger ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                if (dao_manage.deletePassenger(idPassenger)) {
                    JOptionPane.showMessageDialog(this, "Passenger berhasil dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadTableData(); 
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus Passenger.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih Passenger yang akan dihapus.");
        }
    }

    private void loadTableData() {
        try (Connection conn = database.getConnection();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM passenger")) {

            DefaultTableModel model = (DefaultTableModel) table_passenger.getModel();
            model.setRowCount(0); // Membersihkan table

            while (rs.next()) {
                int idPassenger = rs.getInt("id_passenger");
                String passport = rs.getString("passport");
                String name_user = rs.getString("name_user");
                String address = rs.getString("address");
                String mobile_number = rs.getString("mobile_number");
                String email = rs.getString("email");
                model.addRow(new Object[]{idPassenger, passport, name_user, address, mobile_number, email});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void populateFieldsFromSelection() {
        int selectedRow = table_passenger.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table_passenger.getModel();
            txt_passport.setText(model.getValueAt(selectedRow, 1).toString());
            txt_name.setText(model.getValueAt(selectedRow, 2).toString());
            txt_address.setText(model.getValueAt(selectedRow, 3).toString());
            txt_phone.setText(model.getValueAt(selectedRow, 4).toString());
            txt_email.setText(model.getValueAt(selectedRow, 5).toString());
        }
    }


    private void resetForm() {
        txt_passport.setText("");
        txt_name.setText("");
        txt_address.setText("");
        txt_phone.setText("");
        txt_email.setText("");
    }
    
    public void searchFlights() {
    // Ambil input pencarian dari satu text field
    String searchInput = txt_search.getText().trim();

    // Ambil model tabel dari JTable
    DefaultTableModel model = (DefaultTableModel) table_passenger.getModel();
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


    public panel_manage_passenger() {
        initComponents();
        dao_manage = new dao_manage();
        loadTableData();
        table_passenger.getSelectionModel().addListSelectionListener(e -> populateFieldsFromSelection());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_manage_passenger = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        DepartHeader1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_passenger = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_passport = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        pn_manage_passenger.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(106, 169, 214));

        DepartHeader1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader1.setForeground(new java.awt.Color(17, 90, 142));
        DepartHeader1.setText("Manage Passanger");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(DepartHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(DepartHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        table_passenger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table_passenger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Passenger", "Passport", "Name", "Address", "Mobile", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_passenger);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(106, 169, 214));
        jLabel7.setText("Name");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(106, 169, 214));
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(106, 169, 214));
        jLabel10.setText("Passanger List");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(106, 169, 214));
        jLabel11.setText("Mobile Phone");

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

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(106, 169, 214));
        jLabel12.setText("Passport");

        txt_passport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passportActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(106, 169, 214));
        jLabel13.setText("Email");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 169, 214));
        jLabel1.setText("Search Flight");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_manage_passengerLayout = new javax.swing.GroupLayout(pn_manage_passenger);
        pn_manage_passenger.setLayout(pn_manage_passengerLayout);
        pn_manage_passengerLayout.setHorizontalGroup(
            pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                        .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(31, 31, 31)))
                        .addGap(53, 53, 53)
                        .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(16, 16, 16)
                        .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel13))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save)
                .addGap(30, 30, 30)
                .addComponent(btn_edit)
                .addGap(29, 29, 29)
                .addComponent(btn_delete)
                .addGap(375, 375, 375))
        );
        pn_manage_passengerLayout.setVerticalGroup(
            pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        add(pn_manage_passenger, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        handleSubmit();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        handleEdit();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        handleDelete();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_passportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passportActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
        searchFlights();
    }//GEN-LAST:event_txt_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartHeader1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_manage_passenger;
    private javax.swing.JTable table_passenger;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_passport;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
