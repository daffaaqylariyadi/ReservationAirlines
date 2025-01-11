package view;

import java.awt.*;
import java.sql.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import dao.controller_abstract;
import dao.dao_abstract;
import java.awt.event.ItemEvent;
import koneksi.database;

public class panel_reservations extends javax.swing.JPanel {
   
    private controller_abstract dao_abstract;
    private boolean isPnReservationsActive = false;

    private void resetPanelStatus() {
        isPnReservationsActive = false;
    }

    private void resetForm() {
        result_code.setText("");
        result_from.setText("");
        result_to.setText("");
        result_date.setText("");
        result_class.setText("");
        result_price.setText("");   
    }

    private void handleContinue() {

        if (combo_flight_code.getSelectedItem() == null || combo_source.getSelectedItem() == null || 
            combo_destination.getSelectedItem() == null || combo_date.getSelectedItem() == null || 
            combo_class.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String flight_code = (String) combo_flight_code.getSelectedItem();
        String flight_source = (String) combo_source.getSelectedItem();
        String destination = (String) combo_destination.getSelectedItem();
        String flight_date = (String) combo_date.getSelectedItem();
        String flight_class = (String) combo_class.getSelectedItem();

        if (dao_abstract.addFlight (flight_code, flight_source, destination, flight_date, flight_class)) {
            JOptionPane.showMessageDialog(this, "Flight berhasil ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            resetForm();
            this.add(new panel_seats());
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan flight.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String getFlightDetailsFromForm() {
        return combo_flight_code.getSelectedItem() + "," + combo_source.getSelectedItem() + "," + combo_destination.getSelectedItem() + "," + combo_date.getSelectedItem() + "," + combo_class.getSelectedItem();
    }

        // Helper method to validate form fields
    public boolean isFormInvalid() {
        return combo_flight_code.getSelectedItem() == null || 
               combo_source.getSelectedItem() == null || 
               combo_destination.getSelectedItem() == null || 
               combo_date.getSelectedItem() == null ||
               combo_class.getSelectedItem() == null;
    }
    
 
private void loadComboBoxData() {
        String query = "SELECT flight_code, flight_source, destination, flight_date FROM flight";
        try (Connection conn = database.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

//                combo_flight_code.removeAllItems(); // Clear existing items
//                combo_source.removeAllItems();
//                combo_destination.removeAllItems();
//                combo_date.removeAllItems(); // Clear existing items

            while (rs.next()) {
                String flight_code = rs.getString("flight_code");
                String flight_source = rs.getString("flight_source");
                String destination = rs.getString("destination");
                String flight_date = rs.getString("flight_date");

                combo_flight_code.addItem(flight_code);
                combo_source.addItem(flight_source);
                combo_destination.addItem(destination);
                combo_date.addItem(flight_date);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
}

    public panel_reservations() {
        initComponents();
        resetForm();
        this.dao_abstract = new dao_abstract();
        loadComboBoxData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_reservasi_ticket = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        FlightNoHeader6 = new javax.swing.JLabel();
        FlightNoHeader7 = new javax.swing.JLabel();
        FlightNoHeader5 = new javax.swing.JLabel();
        FlightNoHeader8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VerticalSeperator1 = new javax.swing.JSeparator();
        btn_continue = new javax.swing.JButton();
        result_from = new javax.swing.JLabel();
        DestinationCountry = new javax.swing.JLabel();
        result_to = new javax.swing.JLabel();
        HorizontalSeperator1 = new javax.swing.JSeparator();
        FlightNoHeader1 = new javax.swing.JLabel();
        result_date = new javax.swing.JLabel();
        OriginCountry1 = new javax.swing.JLabel();
        FlightNoHeader4 = new javax.swing.JLabel();
        result_class = new javax.swing.JLabel();
        result_price = new javax.swing.JLabel();
        FlightNoHeader10 = new javax.swing.JLabel();
        LastNameText = new javax.swing.JLabel();
        PassportNoText = new javax.swing.JLabel();
        DepartHeader3 = new javax.swing.JLabel();
        FirstNameText1 = new javax.swing.JLabel();
        FirstNameText2 = new javax.swing.JLabel();
        combo_destination = new javax.swing.JComboBox<>();
        combo_source = new javax.swing.JComboBox<>();
        combo_class = new javax.swing.JComboBox<>();
        FirstNameText3 = new javax.swing.JLabel();
        result_code = new javax.swing.JLabel();
        FirstNameText4 = new javax.swing.JLabel();
        combo_flight_code = new javax.swing.JComboBox<>();
        combo_date = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        panel_reservasi_ticket.setLayout(new java.awt.CardLayout());

        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel4.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(106, 169, 214));

        FlightNoHeader6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader6.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader6.setText("SEATS");

        FlightNoHeader7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader7.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader7.setText("PASSENGER");

        FlightNoHeader5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader5.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader5.setText("CONFIRM");

        FlightNoHeader8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader8.setForeground(new java.awt.Color(255, 255, 255));
        FlightNoHeader8.setText("RESERVATION");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot3.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(FlightNoHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(FlightNoHeader6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(FlightNoHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5)
                        .addGap(77, 77, 77))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FlightNoHeader6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FlightNoHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FlightNoHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        VerticalSeperator1.setBackground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setForeground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_continue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_continue.setText("CONTINUE");
        btn_continue.setFocusPainted(false);
        btn_continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continueActionPerformed(evt);
            }
        });

        result_from.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_from.setForeground(new java.awt.Color(106, 169, 214));
        result_from.setText("XXX");

        DestinationCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinationCountry.setForeground(new java.awt.Color(102, 102, 102));
        DestinationCountry.setText("TO");

        result_to.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_to.setForeground(new java.awt.Color(106, 169, 214));
        result_to.setText("XXX");

        FlightNoHeader1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader1.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader1.setText("DATE");

        result_date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_date.setForeground(new java.awt.Color(106, 169, 214));
        result_date.setText("XXX");

        OriginCountry1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry1.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry1.setText("FROM");

        FlightNoHeader4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader4.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader4.setText("CLASS");

        result_class.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_class.setForeground(new java.awt.Color(106, 169, 214));
        result_class.setText("XXX");

        result_price.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        result_price.setForeground(new java.awt.Color(106, 169, 214));
        result_price.setText("XXX");

        FlightNoHeader10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader10.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader10.setText("FLIGHT CODE");

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setText("Destination");

        PassportNoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoText.setText("Flight Takeof Date");

        DepartHeader3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader3.setText("Reservations");

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setText("Source");

        FirstNameText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText2.setText("Class");

        combo_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Destination" }));
        combo_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_destinationActionPerformed(evt);
            }
        });

        combo_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Source" }));
        combo_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sourceActionPerformed(evt);
            }
        });

        combo_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Class", "Economy", "Bussiness", "First Class" }));
        combo_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_classActionPerformed(evt);
            }
        });

        FirstNameText3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FirstNameText3.setForeground(new java.awt.Color(102, 102, 102));
        FirstNameText3.setText("PRICE");

        result_code.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        result_code.setForeground(new java.awt.Color(106, 169, 214));
        result_code.setText("XXX");

        FirstNameText4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText4.setText("Flight Code");

        combo_flight_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Flight Code" }));
        combo_flight_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_flight_codeActionPerformed(evt);
            }
        });

        combo_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Takeof Date" }));
        combo_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(DepartHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_flight_code, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PassportNoText)
                        .addComponent(FirstNameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_destination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo_class, 0, 390, Short.MAX_VALUE)
                        .addComponent(FirstNameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_date, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_source, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VerticalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_code, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OriginCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstNameText3)
                            .addComponent(result_class, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_price, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OriginCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_to, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(result_class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FirstNameText3)
                                    .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(VerticalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(DepartHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FirstNameText4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_flight_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstNameText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_source, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastNameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(PassportNoText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FirstNameText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, "card2");

        jPanel3.add(jPanel4, "card2");

        panel_reservasi_ticket.add(jPanel3, "card2");

        add(panel_reservasi_ticket, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void combo_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_classActionPerformed
        // TODO add your handling code here:
        String flight_class = (String) combo_class.getSelectedItem(); // Ambil pilihan dari ComboBox
        String resultItem = null; // Variabel untuk hasil item
        String fixedResult = null; // Variabel untuk hasil tetap

        if (flight_class != null) {
            switch (flight_class) {
                case "Economy":
                resultItem = "Economy";
                fixedResult = "1.000.000";
                break;
                case "Bussiness":
                resultItem = "Bussiness";
                fixedResult = "5.000.000";
                break;
                case "First Class":
                resultItem = "First Class";
                fixedResult = "100.000.000";
                break;
                default:
            }
        }
        
        result_class.setText(resultItem); // Tampilkan hasil item
        result_price.setText(fixedResult); // Tampilkan hasil tetap
    }//GEN-LAST:event_combo_classActionPerformed

    private void combo_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sourceActionPerformed

        String selectedItem = (String) combo_source.getSelectedItem();
        result_from.setText(selectedItem != null ? selectedItem : "");
    }//GEN-LAST:event_combo_sourceActionPerformed

    private void combo_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_destinationActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) combo_destination.getSelectedItem();
        result_to.setText(selectedItem != null ? selectedItem : "");
    }//GEN-LAST:event_combo_destinationActionPerformed

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed

        handleContinue();
        
        this.removeAll();
        this.add(new panel_seats());
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_btn_continueActionPerformed

    private void combo_flight_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_flight_codeActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) combo_flight_code.getSelectedItem();
        result_code.setText(selectedItem != null ? selectedItem : "");
    }//GEN-LAST:event_combo_flight_codeActionPerformed

    private void combo_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_dateActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) combo_date.getSelectedItem();
        result_date.setText(selectedItem != null ? selectedItem : "");
    }//GEN-LAST:event_combo_dateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartHeader3;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel FirstNameText2;
    private javax.swing.JLabel FirstNameText3;
    private javax.swing.JLabel FirstNameText4;
    private javax.swing.JLabel FlightNoHeader1;
    private javax.swing.JLabel FlightNoHeader10;
    private javax.swing.JLabel FlightNoHeader4;
    private javax.swing.JLabel FlightNoHeader5;
    private javax.swing.JLabel FlightNoHeader6;
    private javax.swing.JLabel FlightNoHeader7;
    private javax.swing.JLabel FlightNoHeader8;
    private javax.swing.JSeparator HorizontalSeperator1;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JLabel OriginCountry1;
    private javax.swing.JLabel PassportNoText;
    private javax.swing.JSeparator VerticalSeperator1;
    private javax.swing.JButton btn_continue;
    private javax.swing.JComboBox<String> combo_class;
    private javax.swing.JComboBox<String> combo_date;
    private javax.swing.JComboBox<String> combo_destination;
    private javax.swing.JComboBox<String> combo_flight_code;
    private javax.swing.JComboBox<String> combo_source;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panel_reservasi_ticket;
    private javax.swing.JLabel result_class;
    private javax.swing.JLabel result_code;
    private javax.swing.JLabel result_date;
    private javax.swing.JLabel result_from;
    private javax.swing.JLabel result_price;
    private javax.swing.JLabel result_to;
    // End of variables declaration//GEN-END:variables

}


