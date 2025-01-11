package view;

import dao.controller_abstract;
import dao.dao_abstract;
import koneksi.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class panel_passenger extends javax.swing.JPanel {
    private controller_abstract dao_abstract;
    
    private boolean isPnPassengerActive = false;

    private void resetPanelStatus() {
        isPnPassengerActive = false;
    }
    
    private void resetForm() {
        txt_passport.setText("");
        txt_name.setText("");
        txt_address.setText("");
        txt_mobile.setText("");
        txt_email.setText("");
    }

    private void handleContinue() {
        if (txt_passport.getText().isEmpty() || txt_name.getText().isEmpty() ||
            txt_address.getText().isEmpty() || txt_mobile.getText().isEmpty() || 
            txt_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String passport = txt_passport.getText().trim();
        String name_user = txt_name.getText().trim();
        String address = txt_address.getText().trim();
        String mobile_number = txt_mobile.getText().trim();
        String email = txt_email.getText().trim();

        if (dao_abstract.addPassenger(passport, name_user, address, mobile_number, email)) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            resetForm();
            this.add(new panel_confirm());
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public panel_passenger() {
        initComponents();
        dao_abstract = new dao_abstract(); // Inisialisasi DAO
    
        // Set labels and JTextFields with corresponding data from ChildPassenger
        dao_abstract.setFieldSeatToLabel("seat_number", result_seat);
        dao_abstract.setFieldReservationsToLabel("flight_code", result_code);
        dao_abstract.setFieldReservationsToLabel("flight_source", result_from);
        dao_abstract.setFieldReservationsToLabel("destination", result_to);
        dao_abstract.setFieldReservationsToLabel("flight_date", result_date);
        dao_abstract.setFieldReservationsToLabel("flight_class", result_class);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_pessenger_ini = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FlightNoHeader6 = new javax.swing.JLabel();
        FlightNoHeader7 = new javax.swing.JLabel();
        FlightNoHeader5 = new javax.swing.JLabel();
        FlightNoHeader8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        VerticalSeperator1 = new javax.swing.JSeparator();
        btn_continue = new javax.swing.JButton();
        HorizontalSeperator1 = new javax.swing.JSeparator();
        btn_back = new javax.swing.JButton();
        WarningText3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        PassportNoText = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        DepartHeader3 = new javax.swing.JLabel();
        FirstNameText1 = new javax.swing.JLabel();
        WarningText1 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        LastNameText1 = new javax.swing.JLabel();
        txt_passport = new javax.swing.JTextField();
        FirstNameText2 = new javax.swing.JLabel();
        WarningText5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        result_seat = new javax.swing.JLabel();
        result_from = new javax.swing.JLabel();
        DestinationCountry = new javax.swing.JLabel();
        result_to = new javax.swing.JLabel();
        FlightNoHeader1 = new javax.swing.JLabel();
        result_date = new javax.swing.JLabel();
        OriginCountry1 = new javax.swing.JLabel();
        FlightNoHeader4 = new javax.swing.JLabel();
        result_class = new javax.swing.JLabel();
        FlightNoHeader9 = new javax.swing.JLabel();
        FlightNoHeader10 = new javax.swing.JLabel();
        result_code = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setLayout(new java.awt.CardLayout());

        panel_pessenger_ini.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(106, 169, 214));

        FlightNoHeader6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader6.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader6.setText("SEATS");

        FlightNoHeader7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader7.setForeground(new java.awt.Color(255, 255, 255));
        FlightNoHeader7.setText("PASSENGER");

        FlightNoHeader5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader5.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader5.setText("CONFIRM");

        FlightNoHeader8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader8.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader8.setText("RESERVATION");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot3.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(FlightNoHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(FlightNoHeader6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(FlightNoHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5)
                        .addGap(74, 74, 74))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FlightNoHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FlightNoHeader6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FlightNoHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

        btn_back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_back.setText("BACK");
        btn_back.setFocusPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        WarningText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText3.setForeground(new java.awt.Color(207, 0, 15));

        txt_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setText("Address");

        txt_address.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        PassportNoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoText.setText("Mobile");

        txt_mobile.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileActionPerformed(evt);
            }
        });

        DepartHeader3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader3.setText("Passenger Details");

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setText("Name");

        WarningText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText1.setForeground(new java.awt.Color(207, 0, 15));

        txt_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        LastNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText1.setText("Passport");

        txt_passport.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        FirstNameText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText2.setText("Email");

        WarningText5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText5.setForeground(new java.awt.Color(207, 0, 15));

        jPanel6.setBackground(new java.awt.Color(106, 169, 214));

        result_seat.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        result_seat.setForeground(new java.awt.Color(255, 255, 255));
        result_seat.setText("XX");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(result_seat)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result_seat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

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

        FlightNoHeader9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader9.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader9.setText("SEAT");

        FlightNoHeader10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader10.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader10.setText("FLIGHT CODE");

        result_code.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        result_code.setForeground(new java.awt.Color(106, 169, 214));
        result_code.setText("XXX");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(655, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_code)
                    .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OriginCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FlightNoHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result_class, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DepartHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(PassportNoText)
                            .addGap(117, 117, 117)
                            .addComponent(WarningText3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(FirstNameText2)
                            .addGap(126, 126, 126)
                            .addComponent(WarningText5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(WarningText1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(100, 100, 100)
                    .addComponent(VerticalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OriginCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result_to, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(FlightNoHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result_code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(DepartHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WarningText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PassportNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(WarningText3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FirstNameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WarningText5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(VerticalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(290, 290, 290)
                            .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_pessenger_ini.add(jPanel1, "card2");

        add(panel_pessenger_ini, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed
        
    handleContinue();
    
        panel_pessenger_ini.removeAll();
        panel_pessenger_ini.add(new panel_confirm());
        panel_pessenger_ini.repaint();
        panel_pessenger_ini.revalidate();
    }//GEN-LAST:event_btn_continueActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        resetPanelStatus();
        isPnPassengerActive = true;

        panel_pessenger_ini.removeAll();
        panel_pessenger_ini.add(new panel_seats());
        panel_pessenger_ini.repaint();
        panel_pessenger_ini.revalidate();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobileActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartHeader3;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel FirstNameText2;
    private javax.swing.JLabel FlightNoHeader1;
    private javax.swing.JLabel FlightNoHeader10;
    private javax.swing.JLabel FlightNoHeader4;
    private javax.swing.JLabel FlightNoHeader5;
    private javax.swing.JLabel FlightNoHeader6;
    private javax.swing.JLabel FlightNoHeader7;
    private javax.swing.JLabel FlightNoHeader8;
    private javax.swing.JLabel FlightNoHeader9;
    private javax.swing.JSeparator HorizontalSeperator1;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JLabel LastNameText1;
    private javax.swing.JLabel OriginCountry1;
    private javax.swing.JLabel PassportNoText;
    private javax.swing.JSeparator VerticalSeperator1;
    private javax.swing.JLabel WarningText1;
    private javax.swing.JLabel WarningText3;
    private javax.swing.JLabel WarningText5;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_continue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panel_pessenger_ini;
    private javax.swing.JLabel result_class;
    private javax.swing.JLabel result_code;
    private javax.swing.JLabel result_date;
    private javax.swing.JLabel result_from;
    private javax.swing.JLabel result_seat;
    private javax.swing.JLabel result_to;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_passport;
    // End of variables declaration//GEN-END:variables

    
}
