package view;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JButton;
import com.sun.jdi.connect.spi.Connection;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import koneksi.database;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.beans.Statement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import dao.controller_abstract;
import dao.dao_abstract;

public class panel_seats extends javax.swing.JPanel {

    private controller_abstract dao_abstract;
    private boolean isPnSeatsActive = false;
    
    private void resetPanelStatus() {
    isPnSeatsActive = false;
    }

    private static void toggleSeat(JButton button) {
        // Ubah semua tombol ke warna default
        for (Component component : button.getParent().getComponents()) {
            if (component instanceof JButton && component != button) {
                JButton otherButton = (JButton) component;
                otherButton.setBackground(Color.LIGHT_GRAY);
                otherButton.setForeground(Color.BLACK);
            }
        }
        button.setBackground(new Color(106,169,214));
        button.setForeground(Color.WHITE);
    }

    private void handleSeatSelection(String seatNumber) {
       dao_abstract.handleSeatSelection(seatNumber);
        JOptionPane.showMessageDialog(null, "Seat " + seatNumber + " selected!");
    }
    
    public panel_seats() {
    initComponents();
    dao_abstract = new dao_abstract();

    // Set label sesuai dengan data dari database
    dao_abstract.setFieldReservationsToLabel("flight_code", result_code);
    dao_abstract.setFieldReservationsToLabel("flight_source", result_from);
    dao_abstract.setFieldReservationsToLabel("destination", result_to);
    dao_abstract.setFieldReservationsToLabel("flight_date", result_date);
    dao_abstract.setFieldReservationsToLabel("flight_class", result_class);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_seat_pindah = new javax.swing.JPanel();
        E5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        VerticalSeperator1 = new javax.swing.JSeparator();
        B5 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        FlightNoHeader9 = new javax.swing.JLabel();
        FlightNoHeader10 = new javax.swing.JLabel();
        FlightNoHeader11 = new javax.swing.JLabel();
        FlightNoHeader12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        C4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        result_from = new javax.swing.JLabel();
        result_code = new javax.swing.JLabel();
        DepartHeader = new javax.swing.JLabel();
        RightExit = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        LeftExit = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        LeftDoor6 = new javax.swing.JPanel();
        btn_continue = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        WorkingModeHeader = new javax.swing.JLabel();
        D6 = new javax.swing.JButton();
        HorizontalSeperator1 = new javax.swing.JSeparator();
        C6 = new javax.swing.JButton();
        result_to = new javax.swing.JLabel();
        B6 = new javax.swing.JButton();
        DestinationCountry = new javax.swing.JLabel();
        A6 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        Row2 = new javax.swing.JLabel();
        Row1 = new javax.swing.JLabel();
        RightDoor = new javax.swing.JPanel();
        A2 = new javax.swing.JButton();
        DepartHeader2 = new javax.swing.JLabel();
        result_class = new javax.swing.JLabel();
        D1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        FlightNoHeader4 = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        Row6 = new javax.swing.JLabel();
        OriginCountry1 = new javax.swing.JLabel();
        Row5 = new javax.swing.JLabel();
        result_date = new javax.swing.JLabel();
        Row4 = new javax.swing.JLabel();
        FlightNoHeader1 = new javax.swing.JLabel();
        Row3 = new javax.swing.JLabel();
        FlightNoHeader2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        panel_seat_pindah.setBackground(new java.awt.Color(255, 255, 255));

        E5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        E5.setText("E");
        E5.setFocusPainted(false);
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        D5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        D5.setText("D");
        D5.setFocusPainted(false);
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        C5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        C5.setText("C");
        C5.setFocusPainted(false);
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        VerticalSeperator1.setBackground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setForeground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        B5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B5.setText("B");
        B5.setFocusPainted(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        A5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A5.setText("A");
        A5.setFocusPainted(false);
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        F4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        F4.setText("F");
        F4.setFocusPainted(false);
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        E4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        E4.setText("E");
        E4.setFocusPainted(false);
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        D4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        D4.setText("D");
        D4.setFocusPainted(false);
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(106, 169, 214));

        FlightNoHeader9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader9.setForeground(new java.awt.Color(255, 255, 255));
        FlightNoHeader9.setText("SEATS");

        FlightNoHeader10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader10.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader10.setText("PASSENGER");

        FlightNoHeader11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader11.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader11.setText("CONFIRM");

        FlightNoHeader12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader12.setForeground(new java.awt.Color(17, 90, 142));
        FlightNoHeader12.setText("RESERVATION");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot3.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gariz2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(FlightNoHeader12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(FlightNoHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(FlightNoHeader11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
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
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FlightNoHeader12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightNoHeader11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        C4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        C4.setText("C");
        C4.setFocusPainted(false);
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B4.setText("B");
        B4.setFocusPainted(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        A4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A4.setText("A");
        A4.setFocusPainted(false);
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        result_from.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_from.setForeground(new java.awt.Color(106, 169, 214));
        result_from.setText("XXX");

        result_code.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        result_code.setForeground(new java.awt.Color(106, 169, 214));
        result_code.setText("XXX");

        DepartHeader.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader.setText("Select Seat");

        RightExit.setBackground(new java.awt.Color(52, 79, 88));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout RightExitLayout = new javax.swing.GroupLayout(RightExit);
        RightExit.setLayout(RightExitLayout);
        RightExitLayout.setHorizontalGroup(
            RightExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightExitLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap())
        );
        RightExitLayout.setVerticalGroup(
            RightExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightExitLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        LeftExit.setBackground(new java.awt.Color(52, 79, 88));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout LeftExitLayout = new javax.swing.GroupLayout(LeftExit);
        LeftExit.setLayout(LeftExitLayout);
        LeftExitLayout.setHorizontalGroup(
            LeftExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        LeftExitLayout.setVerticalGroup(
            LeftExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftExitLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftDoor6Layout = new javax.swing.GroupLayout(LeftDoor6);
        LeftDoor6.setLayout(LeftDoor6Layout);
        LeftDoor6Layout.setHorizontalGroup(
            LeftDoor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        LeftDoor6Layout.setVerticalGroup(
            LeftDoor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        btn_continue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_continue.setText("CONTINUE");
        btn_continue.setFocusPainted(false);
        btn_continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continueActionPerformed(evt);
            }
        });

        F6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        F6.setText("F");
        F6.setFocusPainted(false);
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        E6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        E6.setText("E");
        E6.setFocusPainted(false);
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        WorkingModeHeader.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        WorkingModeHeader.setText("Booking");

        D6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        D6.setText("D");
        D6.setFocusPainted(false);
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        C6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        C6.setText("C");
        C6.setFocusPainted(false);
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        result_to.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_to.setForeground(new java.awt.Color(106, 169, 214));
        result_to.setText("XXX");

        B6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B6.setText("B");
        B6.setFocusPainted(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        DestinationCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinationCountry.setForeground(new java.awt.Color(102, 102, 102));
        DestinationCountry.setText("TO");

        A6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A6.setText("A");
        A6.setFocusPainted(false);
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        F5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        F5.setText("F");
        F5.setFocusPainted(false);
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        Row2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Row2.setForeground(new java.awt.Color(204, 204, 204));
        Row2.setText("2");

        Row1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Row1.setForeground(new java.awt.Color(204, 204, 204));
        Row1.setText("1");

        javax.swing.GroupLayout RightDoorLayout = new javax.swing.GroupLayout(RightDoor);
        RightDoor.setLayout(RightDoorLayout);
        RightDoorLayout.setHorizontalGroup(
            RightDoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        RightDoorLayout.setVerticalGroup(
            RightDoorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        A2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A2.setText("A");
        A2.setFocusPainted(false);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        DepartHeader2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader2.setText("Depart");

        result_class.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_class.setForeground(new java.awt.Color(106, 169, 214));
        result_class.setText("XXX");

        D1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        D1.setText("D");
        D1.setFocusPainted(false);
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        C1.setText("C");
        C1.setFocusPainted(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B1.setText("B");
        B1.setFocusPainted(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        FlightNoHeader4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader4.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader4.setText("CLASS");

        A1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A1.setText("A");
        A1.setFocusPainted(false);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        Row6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Row6.setForeground(new java.awt.Color(204, 204, 204));
        Row6.setText("6");

        OriginCountry1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry1.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry1.setText("FROM");

        Row5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Row5.setForeground(new java.awt.Color(204, 204, 204));
        Row5.setText("5");

        result_date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        result_date.setForeground(new java.awt.Color(106, 169, 214));
        result_date.setText("XXX");

        Row4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Row4.setForeground(new java.awt.Color(204, 204, 204));
        Row4.setText("4");

        FlightNoHeader1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader1.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader1.setText("DATE");

        Row3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Row3.setForeground(new java.awt.Color(204, 204, 204));
        Row3.setText("3");

        FlightNoHeader2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader2.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader2.setText("FLIGHT");

        btn_back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_back.setText("BACK");
        btn_back.setFocusPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        F1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        F1.setText("F");
        F1.setFocusPainted(false);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        E1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        E1.setText("E");
        E1.setFocusPainted(false);
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        F3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        F3.setText("F");
        F3.setFocusPainted(false);
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        E3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        E3.setText("E");
        E3.setFocusPainted(false);
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        C3.setText("C");
        C3.setFocusPainted(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B3.setText("B");
        B3.setFocusPainted(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        A3.setText("A");
        A3.setFocusPainted(false);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        F2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        F2.setText("F");
        F2.setFocusPainted(false);
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        E2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        E2.setText("E");
        E2.setFocusPainted(false);
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        D2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        D2.setText("D");
        D2.setFocusPainted(false);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        C2.setText("C");
        C2.setFocusPainted(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B2.setText("B");
        B2.setFocusPainted(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        D3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        D3.setText("D");
        D3.setFocusPainted(false);
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_seat_pindahLayout = new javax.swing.GroupLayout(panel_seat_pindah);
        panel_seat_pindah.setLayout(panel_seat_pindahLayout);
        panel_seat_pindahLayout.setHorizontalGroup(
            panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_seat_pindahLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DepartHeader2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_seat_pindahLayout.createSequentialGroup()
                            .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                    .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90))
                                .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                    .addComponent(result_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(44, 44, 44)))
                            .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(result_class, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_seat_pindahLayout.createSequentialGroup()
                            .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OriginCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(result_to, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_seat_pindahLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_seat_pindahLayout.createSequentialGroup()
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(WorkingModeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(VerticalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(DepartHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LeftDoor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(LeftExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Row1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Row2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Row3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Row4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Row5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Row6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(RightExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result_code)
                            .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(RightDoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        panel_seat_pindahLayout.setVerticalGroup(
            panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(VerticalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                .addComponent(DepartHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(LeftDoor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LeftExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(Row1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Row2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Row3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Row4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Row5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Row6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(result_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RightDoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RightExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(DepartHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OriginCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestinationCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result_from, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_to, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_seat_pindahLayout.createSequentialGroup()
                                .addComponent(FlightNoHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(result_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(FlightNoHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(HorizontalSeperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(WorkingModeHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_seat_pindahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_continue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        add(panel_seat_pindah, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
    toggleSeat(E5);
    handleSeatSelection("E5");
    }//GEN-LAST:event_E5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        toggleSeat(D5);
        handleSeatSelection("D5");
    }//GEN-LAST:event_D5ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        toggleSeat(C5);
        handleSeatSelection("C5");
    }//GEN-LAST:event_C5ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        toggleSeat(B5);
        handleSeatSelection("B5");
    }//GEN-LAST:event_B5ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        toggleSeat(A5);
        handleSeatSelection("A5");
    }//GEN-LAST:event_A5ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        toggleSeat(F4);
        handleSeatSelection("F4");
    }//GEN-LAST:event_F4ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        toggleSeat(E5);
        handleSeatSelection("E4");
    }//GEN-LAST:event_E4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        toggleSeat(D4);
        handleSeatSelection("D4");
    }//GEN-LAST:event_D4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        toggleSeat(C4);
        handleSeatSelection("C4");
    }//GEN-LAST:event_C4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        toggleSeat(B4);
        handleSeatSelection("B4");
    }//GEN-LAST:event_B4ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        toggleSeat(A4);
        handleSeatSelection("A4");
    }//GEN-LAST:event_A4ActionPerformed

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed
        resetPanelStatus();
        isPnSeatsActive = true;

        this.removeAll();
        this.add(new panel_passenger());
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_btn_continueActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        toggleSeat(F6);
        handleSeatSelection("F6");
    }//GEN-LAST:event_F6ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        toggleSeat(E6);
        handleSeatSelection("E6");
    }//GEN-LAST:event_E6ActionPerformed
    
    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        toggleSeat(D6);
        handleSeatSelection("D6");
    }//GEN-LAST:event_D6ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        toggleSeat(C6);
        handleSeatSelection("C6");
    }//GEN-LAST:event_C6ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        toggleSeat(B6);
        handleSeatSelection("B6");
    }//GEN-LAST:event_B6ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
      toggleSeat(A6);
      handleSeatSelection("A6");
    }//GEN-LAST:event_A6ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        toggleSeat(F5);
        handleSeatSelection("F5");
    }//GEN-LAST:event_F5ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        toggleSeat(A2);
        handleSeatSelection("A2");
    }//GEN-LAST:event_A2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        toggleSeat(D1);
        handleSeatSelection("D1");
    }//GEN-LAST:event_D1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        toggleSeat(C1);
        handleSeatSelection("C1");
    }//GEN-LAST:event_C1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    toggleSeat(B1);
    handleSeatSelection("B1");
    }//GEN-LAST:event_B1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
    toggleSeat(A1);
    handleSeatSelection("A1");
    }//GEN-LAST:event_A1ActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        resetPanelStatus();
        isPnSeatsActive = true;

        this.removeAll();
        this.add(new panel_reservations());
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_btn_backActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        toggleSeat(F1);
        handleSeatSelection("F1");
    }//GEN-LAST:event_F1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        toggleSeat(E1);
        handleSeatSelection("E1");
    }//GEN-LAST:event_E1ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        toggleSeat(F3);
        handleSeatSelection("F3");
    }//GEN-LAST:event_F3ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        toggleSeat(E3);
        handleSeatSelection("E3");
    }//GEN-LAST:event_E3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        toggleSeat(C3);
        handleSeatSelection("C3");
    }//GEN-LAST:event_C3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        toggleSeat(B3);
        handleSeatSelection("B3");
    }//GEN-LAST:event_B3ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        toggleSeat(A3);
        handleSeatSelection("A3");
    }//GEN-LAST:event_A3ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        toggleSeat(F2);
        handleSeatSelection("F2");
    }//GEN-LAST:event_F2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        toggleSeat(E2);
        handleSeatSelection("E2");
    }//GEN-LAST:event_E2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        toggleSeat(D2);
        handleSeatSelection("D2");
    }//GEN-LAST:event_D2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        toggleSeat(C2);
        handleSeatSelection("C2");
    }//GEN-LAST:event_C2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        toggleSeat(B2);
        handleSeatSelection("B2");
    }//GEN-LAST:event_B2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        toggleSeat(D3);
        handleSeatSelection("D3");
    }//GEN-LAST:event_D3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JLabel DepartHeader;
    private javax.swing.JLabel DepartHeader2;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JLabel FlightNoHeader1;
    private javax.swing.JLabel FlightNoHeader10;
    private javax.swing.JLabel FlightNoHeader11;
    private javax.swing.JLabel FlightNoHeader12;
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JLabel FlightNoHeader4;
    private javax.swing.JLabel FlightNoHeader9;
    private javax.swing.JSeparator HorizontalSeperator1;
    private javax.swing.JPanel LeftDoor6;
    private javax.swing.JPanel LeftExit;
    private javax.swing.JLabel OriginCountry1;
    private javax.swing.JPanel RightDoor;
    private javax.swing.JPanel RightExit;
    private javax.swing.JLabel Row1;
    private javax.swing.JLabel Row2;
    private javax.swing.JLabel Row3;
    private javax.swing.JLabel Row4;
    private javax.swing.JLabel Row5;
    private javax.swing.JLabel Row6;
    private javax.swing.JSeparator VerticalSeperator1;
    private javax.swing.JLabel WorkingModeHeader;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_continue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_seat_pindah;
    private javax.swing.JLabel result_class;
    private javax.swing.JLabel result_code;
    private javax.swing.JLabel result_date;
    private javax.swing.JLabel result_from;
    private javax.swing.JLabel result_to;
    // End of variables declaration//GEN-END:variables


}
