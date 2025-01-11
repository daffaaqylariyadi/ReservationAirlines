package view;

import dao.controller_abstract;
import dao.dao_abstract;
import koneksi.database;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class panel_confirm extends javax.swing.JPanel {
    
    private controller_abstract dao_abstract;

private boolean isPnConfirmActive = false;

private void resetPanelStatus() {
    isPnConfirmActive = false;
}

    public panel_confirm() {
        initComponents();
        dao_abstract = new dao_abstract();
        
        dao_abstract.setFieldSeatToLabel("seat_number", result_seat);

        dao_abstract.setFieldPassengerToLabel("passport", txt_passport);
        dao_abstract.setFieldPassengerToLabel("name_user", txt_name);
        dao_abstract.setFieldPassengerToLabel("address", txt_address);
        dao_abstract.setFieldPassengerToLabel("mobile_number", txt_phone);
        dao_abstract.setFieldPassengerToLabel("email", txt_email);

        dao_abstract.setFieldReservationsToLabel("flight_code", result_code);
        dao_abstract.setFieldReservationsToLabel("flight_source", result_from);
        dao_abstract.setFieldReservationsToLabel("destination", result_to);
        dao_abstract.setFieldReservationsToLabel("flight_date", result_date);
        dao_abstract.setFieldReservationsToLabel("flight_class", result_class); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_confirm_ini = new javax.swing.JPanel();
        OwnerName = new javax.swing.JLabel();
        txt_passport = new javax.swing.JLabel();
        txt_name = new javax.swing.JLabel();
        FlightNoHeader1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        result_seat = new javax.swing.JLabel();
        FlightNoHeader14 = new javax.swing.JLabel();
        FlightNoHeader15 = new javax.swing.JLabel();
        result_from = new javax.swing.JLabel();
        DestinationCountry = new javax.swing.JLabel();
        result_to = new javax.swing.JLabel();
        PlaneIcon = new javax.swing.JLabel();
        FlightNoHeader2 = new javax.swing.JLabel();
        result_date = new javax.swing.JLabel();
        OriginCountry4 = new javax.swing.JLabel();
        result_code = new javax.swing.JLabel();
        FlightNoHeader17 = new javax.swing.JLabel();
        DepartHeader3 = new javax.swing.JLabel();
        MainLogo4 = new javax.swing.JLabel();
        HorizontalSeperator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
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
        result_class = new javax.swing.JLabel();
        FlightNoHeader4 = new javax.swing.JLabel();
        FlightNoHeader16 = new javax.swing.JLabel();
        FlightNoHeader18 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JLabel();
        txt_address = new javax.swing.JLabel();
        txt_email = new javax.swing.JLabel();
        FlightNoHeader19 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panel_confirm_ini.setBackground(new java.awt.Color(255, 255, 255));

        OwnerName.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName.setForeground(new java.awt.Color(102, 102, 102));
        OwnerName.setText("Please remember passport No. for flight cancellation.");

        txt_passport.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_passport.setText("XXXXXX");

        txt_name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_name.setText("XXXXX");

        FlightNoHeader1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader1.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader1.setText("SEAT");

        btn_save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_save.setText("SAVE AS TEXT FILE");
        btn_save.setFocusPainted(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_close.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_close.setText("CLOSE");
        btn_close.setFocusPainted(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(106, 169, 214));
        jPanel2.setForeground(new java.awt.Color(106, 169, 214));

        result_seat.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        result_seat.setForeground(new java.awt.Color(255, 255, 255));
        result_seat.setText("XX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(result_seat)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result_seat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        FlightNoHeader14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader14.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader14.setText("Passport");

        FlightNoHeader15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader15.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader15.setText("Name");

        result_from.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_from.setForeground(new java.awt.Color(106, 169, 214));
        result_from.setText("XXX");

        DestinationCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinationCountry.setForeground(new java.awt.Color(102, 102, 102));
        DestinationCountry.setText("TO");

        result_to.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_to.setForeground(new java.awt.Color(106, 169, 214));
        result_to.setText("XXX");

        PlaneIcon.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        FlightNoHeader2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader2.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader2.setText("DATE");

        result_date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_date.setForeground(new java.awt.Color(106, 169, 214));
        result_date.setText("XXX");

        OriginCountry4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry4.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry4.setText("FROM");

        result_code.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        result_code.setForeground(new java.awt.Color(106, 169, 214));
        result_code.setText("XXX");

        FlightNoHeader17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader17.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader17.setText("FLIGHT");

        DepartHeader3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader3.setText("Booking Summary");

        MainLogo4.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        MainLogo4.setForeground(new java.awt.Color(255, 255, 255));
        MainLogo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barcode.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(106, 169, 214));

        FlightNoHeader6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader6.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader6.setText("SEATS");

        FlightNoHeader7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader7.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader7.setText("PASSENGER");

        FlightNoHeader5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader5.setForeground(new java.awt.Color(255, 255, 255));
        FlightNoHeader5.setText("CONFIRM");

        FlightNoHeader8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader8.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader8.setText("RESERVATION");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot3.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(FlightNoHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(FlightNoHeader6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(FlightNoHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
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
                        .addGap(78, 78, 78))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FlightNoHeader8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        result_class.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_class.setForeground(new java.awt.Color(106, 169, 214));
        result_class.setText("XXX");

        FlightNoHeader4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader4.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader4.setText("CLASS");

        FlightNoHeader16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader16.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader16.setText("Mobile Phone");

        FlightNoHeader18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader18.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader18.setText("Address");

        txt_phone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_phone.setText("XXXXX");

        txt_address.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_address.setText("XXXXXX");

        txt_email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_email.setText("XXXXX");

        FlightNoHeader19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader19.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader19.setText("Email");

        javax.swing.GroupLayout panel_confirm_iniLayout = new javax.swing.GroupLayout(panel_confirm_ini);
        panel_confirm_ini.setLayout(panel_confirm_iniLayout);
        panel_confirm_iniLayout.setHorizontalGroup(
            panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_confirm_iniLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                        .addComponent(DepartHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE))
                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                        .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(OwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_code)
                                    .addComponent(FlightNoHeader17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OriginCountry4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_class, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_to, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)))
                .addComponent(PlaneIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_confirm_iniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(169, 169, 169))
        );
        panel_confirm_iniLayout.setVerticalGroup(
            panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_confirm_iniLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlaneIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433))
                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DepartHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                .addComponent(OwnerName)
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_passport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FlightNoHeader14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FlightNoHeader18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlightNoHeader19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(result_to, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addComponent(OriginCountry4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(result_class, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_confirm_iniLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(FlightNoHeader17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(MainLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(panel_confirm_iniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        add(panel_confirm_ini, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        btn_save.setText("SAVED");
        btn_save.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Boarding pass has been saved.", "", JOptionPane.PLAIN_MESSAGE);
        System.out.println("#### BOARDING PASS SAVED ####");
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
    resetPanelStatus();
    isPnConfirmActive = true;
   
    this.removeAll();
    this.add(new panel_reservations());
    this.repaint();
    this.revalidate();
    }//GEN-LAST:event_btn_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartHeader3;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JLabel FlightNoHeader1;
    private javax.swing.JLabel FlightNoHeader14;
    private javax.swing.JLabel FlightNoHeader15;
    private javax.swing.JLabel FlightNoHeader16;
    private javax.swing.JLabel FlightNoHeader17;
    private javax.swing.JLabel FlightNoHeader18;
    private javax.swing.JLabel FlightNoHeader19;
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JLabel FlightNoHeader4;
    private javax.swing.JLabel FlightNoHeader5;
    private javax.swing.JLabel FlightNoHeader6;
    private javax.swing.JLabel FlightNoHeader7;
    private javax.swing.JLabel FlightNoHeader8;
    private javax.swing.JSeparator HorizontalSeperator1;
    private javax.swing.JLabel MainLogo4;
    private javax.swing.JLabel OriginCountry4;
    private javax.swing.JLabel OwnerName;
    private javax.swing.JLabel PlaneIcon;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panel_confirm_ini;
    private javax.swing.JLabel result_class;
    private javax.swing.JLabel result_code;
    private javax.swing.JLabel result_date;
    private javax.swing.JLabel result_from;
    private javax.swing.JLabel result_seat;
    private javax.swing.JLabel result_to;
    private javax.swing.JLabel txt_address;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_name;
    private javax.swing.JLabel txt_passport;
    private javax.swing.JLabel txt_phone;
    // End of variables declaration//GEN-END:variables
}
