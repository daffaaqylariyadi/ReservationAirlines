package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Component;

public class FormMainAdmin extends javax.swing.JFrame {
    
    private boolean isPnFlightActive = false;
    private boolean isPnManageFlightActive = false;
    private boolean isPnTicketActive = false;
    private boolean isPnDasboardActive = false;
    private boolean isPnDManagePassengerActive = false;
    private boolean isPnDManageScheduleActive = false;
    private boolean isLoggedIn = false;

    private void resetPanelStatus() {
        isPnFlightActive = false;
        isPnManageFlightActive = false;
        isPnTicketActive = false;
        isPnDasboardActive = true;
        isPnDManagePassengerActive = false;
        isPnDManageScheduleActive = false;

        resetPanelColors(pn_flight, lb_flight);
        resetPanelColors(pn_ticket, lb_ticket);
        resetPanelColors(pn_dasboard, lb_dasboard);
        resetPanelColors(pn_manage_passenger, lb_manage_passenger);
        resetPanelColors(pn_manage_schedule, lb_manage_schedule);
    }

    private void resetPanelColors(javax.swing.JPanel panel, javax.swing.JLabel label) {
        panel.setBackground(new Color(106, 169, 214));
        label.setForeground(new Color(204, 204, 204));
    }

    public FormMainAdmin() {
    initComponents();
    titleBar1.initJFram(this);

    // Atur lokasi frame di tengah layar
    setLocationRelativeTo(null);

    // Reset status panel dan setel default ke dashboard
    resetPanelStatus();
    isPnDasboardActive = true;
    pn_dasboard.setBackground(new Color(106, 169, 214));
    lb_dasboard.setForeground(new Color(255, 255, 255));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_flight = new javax.swing.JPanel();
        lb_flight = new javax.swing.JLabel();
        pn_ticket = new javax.swing.JPanel();
        lb_ticket = new javax.swing.JLabel();
        pn_dasboard = new javax.swing.JPanel();
        lb_dasboard = new javax.swing.JLabel();
        pn_manage_passenger = new javax.swing.JPanel();
        lb_manage_passenger = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pn_manage_schedule = new javax.swing.JPanel();
        lb_manage_schedule = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        pn_manage_flight = new javax.swing.JPanel();
        lb_manage_flight = new javax.swing.JLabel();
        panel_kanan = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panel_utama = new javax.swing.JPanel();
        panel_dasboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_schedule = new javax.swing.JLabel();
        btn_book = new javax.swing.JLabel();
        titleBar1 = new javaswingdev.swing.titlebar.TitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_kiri.setBackground(new java.awt.Color(106, 169, 214));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ngefly");

        pn_flight.setBackground(new java.awt.Color(106, 169, 214));
        pn_flight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_flightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_flightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_flightMouseExited(evt);
            }
        });

        lb_flight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_flight.setForeground(new java.awt.Color(204, 204, 204));
        lb_flight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-schedule-16 (3).png"))); // NOI18N
        lb_flight.setText("Schedule Flight");

        javax.swing.GroupLayout pn_flightLayout = new javax.swing.GroupLayout(pn_flight);
        pn_flight.setLayout(pn_flightLayout);
        pn_flightLayout.setHorizontalGroup(
            pn_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_flightLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lb_flight, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_flightLayout.setVerticalGroup(
            pn_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_flight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pn_ticket.setBackground(new java.awt.Color(106, 169, 214));
        pn_ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_ticketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_ticketMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_ticketMouseExited(evt);
            }
        });

        lb_ticket.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_ticket.setForeground(new java.awt.Color(204, 204, 204));
        lb_ticket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reservation_ticket.png"))); // NOI18N
        lb_ticket.setText("Reservation Ticket");

        javax.swing.GroupLayout pn_ticketLayout = new javax.swing.GroupLayout(pn_ticket);
        pn_ticket.setLayout(pn_ticketLayout);
        pn_ticketLayout.setHorizontalGroup(
            pn_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ticketLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_ticket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_ticketLayout.setVerticalGroup(
            pn_ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ticketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_dasboard.setBackground(new java.awt.Color(106, 169, 214));
        pn_dasboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_dasboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_dasboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_dasboardMouseExited(evt);
            }
        });

        lb_dasboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_dasboard.setForeground(new java.awt.Color(204, 204, 204));
        lb_dasboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard.png"))); // NOI18N
        lb_dasboard.setText("Dashboard");

        javax.swing.GroupLayout pn_dasboardLayout = new javax.swing.GroupLayout(pn_dasboard);
        pn_dasboard.setLayout(pn_dasboardLayout);
        pn_dasboardLayout.setHorizontalGroup(
            pn_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasboardLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_dasboard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_dasboardLayout.setVerticalGroup(
            pn_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_dasboard, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pn_manage_passenger.setBackground(new java.awt.Color(106, 169, 214));
        pn_manage_passenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_manage_passengerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_manage_passengerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_manage_passengerMouseExited(evt);
            }
        });

        lb_manage_passenger.setBackground(new java.awt.Color(204, 204, 204));
        lb_manage_passenger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_manage_passenger.setForeground(new java.awt.Color(204, 204, 204));
        lb_manage_passenger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manage_passenger.png"))); // NOI18N
        lb_manage_passenger.setText("Manage Passanger");

        javax.swing.GroupLayout pn_manage_passengerLayout = new javax.swing.GroupLayout(pn_manage_passenger);
        pn_manage_passenger.setLayout(pn_manage_passengerLayout);
        pn_manage_passengerLayout.setHorizontalGroup(
            pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_manage_passengerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lb_manage_passenger)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pn_manage_passengerLayout.setVerticalGroup(
            pn_manage_passengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_passengerLayout.createSequentialGroup()
                .addComponent(lb_manage_passenger, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ngefly Air (1) (3a).png"))); // NOI18N

        pn_manage_schedule.setBackground(new java.awt.Color(106, 169, 214));
        pn_manage_schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_manage_scheduleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_manage_scheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_manage_scheduleMouseExited(evt);
            }
        });

        lb_manage_schedule.setBackground(new java.awt.Color(204, 204, 204));
        lb_manage_schedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_manage_schedule.setForeground(new java.awt.Color(204, 204, 204));
        lb_manage_schedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-schedule-16.png"))); // NOI18N
        lb_manage_schedule.setText("Manage Schedule");

        javax.swing.GroupLayout pn_manage_scheduleLayout = new javax.swing.GroupLayout(pn_manage_schedule);
        pn_manage_schedule.setLayout(pn_manage_scheduleLayout);
        pn_manage_scheduleLayout.setHorizontalGroup(
            pn_manage_scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_manage_scheduleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lb_manage_schedule)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_manage_scheduleLayout.setVerticalGroup(
            pn_manage_scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_scheduleLayout.createSequentialGroup()
                .addComponent(lb_manage_schedule, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_logout.setBackground(new java.awt.Color(17, 90, 142));
        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-16.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setBorderPainted(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        pn_manage_flight.setBackground(new java.awt.Color(106, 169, 214));
        pn_manage_flight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_manage_flightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_manage_flightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_manage_flightMouseExited(evt);
            }
        });

        lb_manage_flight.setBackground(new java.awt.Color(204, 204, 204));
        lb_manage_flight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_manage_flight.setForeground(new java.awt.Color(204, 204, 204));
        lb_manage_flight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manage_flight.png"))); // NOI18N
        lb_manage_flight.setText("Manage Flight");

        javax.swing.GroupLayout pn_manage_flightLayout = new javax.swing.GroupLayout(pn_manage_flight);
        pn_manage_flight.setLayout(pn_manage_flightLayout);
        pn_manage_flightLayout.setHorizontalGroup(
            pn_manage_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_manage_flightLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_manage_flight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_manage_flightLayout.setVerticalGroup(
            pn_manage_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_manage_flightLayout.createSequentialGroup()
                .addComponent(lb_manage_flight, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_kiriLayout = new javax.swing.GroupLayout(panel_kiri);
        panel_kiri.setLayout(panel_kiriLayout);
        panel_kiriLayout.setHorizontalGroup(
            panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dasboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_flight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_ticket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_manage_passenger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_manage_schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_kiriLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_manage_flight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_kiriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panel_kiriLayout.setVerticalGroup(
            panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kiriLayout.createSequentialGroup()
                .addGroup(panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_kiriLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9))
                    .addGroup(panel_kiriLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(110, 110, 110)
                .addComponent(pn_dasboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_manage_passenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_manage_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_manage_flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(panel_kiri, java.awt.BorderLayout.LINE_START);

        panel_kanan.setBackground(new java.awt.Color(255, 204, 204));
        panel_kanan.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(106, 169, 214));
        jLabel2.setText("WELCOME TO NGEFLY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(834, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panel_kanan.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        panel_utama.setBackground(new java.awt.Color(255, 255, 255));
        panel_utama.setLayout(new java.awt.BorderLayout());

        panel_dasboard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setText("Airplane Booking System ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setText("for all based industries");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Simply define your services and providess, display their availability, and \n");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("you will have clients booth old and new making bookings 24/7.");

        btn_schedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 2.png"))); // NOI18N
        btn_schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_scheduleMouseClicked(evt);
            }
        });

        btn_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 1_1.png"))); // NOI18N
        btn_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_dasboardLayout = new javax.swing.GroupLayout(panel_dasboard);
        panel_dasboard.setLayout(panel_dasboardLayout);
        panel_dasboardLayout.setHorizontalGroup(
            panel_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dasboardLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dasboardLayout.createSequentialGroup()
                        .addComponent(btn_book)
                        .addGap(30, 30, 30)
                        .addComponent(btn_schedule))
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        panel_dasboardLayout.setVerticalGroup(
            panel_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dasboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addGroup(panel_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_book)
                    .addComponent(btn_schedule))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        panel_utama.add(panel_dasboard, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        panel_kanan.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_kanan, java.awt.BorderLayout.CENTER);
        getContentPane().add(titleBar1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pn_manage_scheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_scheduleMouseExited
        // TODO add your handling code here:
        if (!isPnDManageScheduleActive) {
            pn_manage_schedule.setBackground(new Color(106, 169, 214));
            lb_manage_schedule.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pn_manage_scheduleMouseExited

    private void pn_manage_scheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_scheduleMouseEntered
        // TODO add your handling code here:
        if (!isPnDManageScheduleActive) {
            pn_manage_schedule.setBackground(new Color(106, 169, 214));
            lb_manage_schedule.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_pn_manage_scheduleMouseEntered

    private void pn_manage_scheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_scheduleMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnDManageScheduleActive = true;

        pn_manage_schedule.setBackground(new Color(106,169,214));
        lb_manage_schedule.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_manage_schedule());
        panel_utama.repaint();
        panel_utama.revalidate();
        
        pn_dasboard.setVisible(false);
        lb_dasboard.setVisible(false);
    }//GEN-LAST:event_pn_manage_scheduleMouseClicked

    private void pn_manage_passengerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_passengerMouseExited
        // TODO add your handling code here:
        if (!isPnDManagePassengerActive) {
            pn_manage_passenger.setBackground(new Color(106, 169, 214));
            lb_manage_passenger.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pn_manage_passengerMouseExited

    private void pn_manage_passengerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_passengerMouseEntered
        // TODO add your handling code here:
        if (!isPnDManagePassengerActive) {
            pn_manage_passenger.setBackground(new Color(106, 169, 214));
            lb_manage_passenger.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_pn_manage_passengerMouseEntered

    private void pn_manage_passengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_passengerMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnDManagePassengerActive = true;

        pn_manage_passenger.setBackground(new Color(106,169,214));
        lb_manage_passenger.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_manage_passenger());
        panel_utama.repaint();
        panel_utama.revalidate();
        
        pn_dasboard.setVisible(false);
        lb_dasboard.setVisible(false);
    }//GEN-LAST:event_pn_manage_passengerMouseClicked

    private void pn_dasboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dasboardMouseExited
        // TODO add your handling code here:
        if (!isPnDasboardActive) {
            pn_dasboard.setBackground(new Color(106, 169, 214));
            lb_dasboard.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pn_dasboardMouseExited

    private void pn_dasboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dasboardMouseEntered
        // TODO add your handling code here:
        if (!isPnDasboardActive) {
            pn_dasboard.setBackground(new Color(106, 169, 214));
            lb_dasboard.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_pn_dasboardMouseEntered

    private void pn_dasboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dasboardMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnDasboardActive = true;

//        panel_dasboard.setVisible(true);
        
        pn_dasboard.setBackground(new Color(106,169,214));
        lb_dasboard.setForeground(new Color(255, 255, 255));

        panel_utama.repaint();
        panel_utama.revalidate();
        
    }//GEN-LAST:event_pn_dasboardMouseClicked

    private void pn_ticketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ticketMouseExited
        // TODO add your handling code here:
        if (!isPnTicketActive) {
            pn_ticket.setBackground(new Color(106, 169, 214));
            lb_ticket.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pn_ticketMouseExited

    private void pn_ticketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ticketMouseEntered
        // TODO add your handling code here:
        if (!isPnTicketActive) {
            pn_ticket.setBackground(new Color(106, 169, 214));
            lb_ticket.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_pn_ticketMouseEntered

    private void pn_ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ticketMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnTicketActive = true;

        pn_ticket.setBackground(new Color(106,169,214));
        lb_ticket.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_reservations());
        panel_utama.repaint();
        panel_utama.revalidate();
        
        pn_dasboard.setVisible(false);
        lb_dasboard.setVisible(false);
    }//GEN-LAST:event_pn_ticketMouseClicked

    private void pn_flightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_flightMouseExited
        // TODO add your handling code here:
        if (!isPnFlightActive) {
            pn_flight.setBackground(new Color(106, 169, 214));
            lb_flight.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pn_flightMouseExited

    private void pn_flightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_flightMouseEntered
        // TODO add your handling code here:
        if (!isPnFlightActive) {
            pn_flight.setBackground(new Color(106, 169, 214));
            lb_flight.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_pn_flightMouseEntered

    private void pn_flightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_flightMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnFlightActive = true;

        pn_flight.setBackground(new Color(106,169,214));
        lb_flight.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_flight());
        panel_utama.repaint();
        panel_utama.revalidate();
        
        pn_dasboard.setVisible(false);
        lb_dasboard.setVisible(false);
    }//GEN-LAST:event_pn_flightMouseClicked

    private void btn_scheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_scheduleMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnTicketActive = true;

        pn_ticket.setBackground(new Color(106,169,214));
        lb_ticket.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_flight());
        panel_utama.repaint();
        panel_utama.revalidate();
        
        pn_dasboard.setVisible(false);
        lb_dasboard.setVisible(false);
    }//GEN-LAST:event_btn_scheduleMouseClicked

    private void btn_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnTicketActive = true;

        pn_ticket.setBackground(new Color(106,169,214));
        lb_ticket.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_reservations());
        panel_utama.repaint();
        panel_utama.revalidate();
        
        pn_dasboard.setVisible(false);
        lb_dasboard.setVisible(false);
    }//GEN-LAST:event_btn_bookMouseClicked

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        JOptionPane.showMessageDialog(this, "Anda telah logout.");
        
        this.setVisible(false);
        role mainFrame = new role();
        mainFrame.setVisible(true);
        
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void pn_manage_flightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_flightMouseClicked
        // TODO add your handling code here:
        resetPanelStatus();
        isPnManageFlightActive = true;

        pn_manage_flight.setBackground(new Color(106,169,214));
        lb_manage_flight.setForeground(new Color(255, 255, 255));

        panel_utama.removeAll();
        panel_utama.add(new panel_manage_flight());
        panel_utama.repaint();
        panel_utama.revalidate();
    }//GEN-LAST:event_pn_manage_flightMouseClicked

    private void pn_manage_flightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_flightMouseEntered
        // TODO add your handling code here:
        if (!isPnManageFlightActive) {
            pn_manage_flight.setBackground(new Color(106, 169, 214));
            lb_manage_flight.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_pn_manage_flightMouseEntered

    private void pn_manage_flightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_manage_flightMouseExited
        // TODO add your handling code here:
        if (!isPnManageFlightActive) {
            pn_manage_flight.setBackground(new Color(106, 169, 214));
            lb_manage_flight.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pn_manage_flightMouseExited

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
            java.util.logging.Logger.getLogger(FormMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_book;
    public javax.swing.JButton btn_logout;
    private javax.swing.JLabel btn_schedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_dasboard;
    public javax.swing.JLabel lb_flight;
    private javax.swing.JLabel lb_manage_flight;
    private javax.swing.JLabel lb_manage_passenger;
    private javax.swing.JLabel lb_manage_schedule;
    public javax.swing.JLabel lb_ticket;
    private javax.swing.JPanel panel_dasboard;
    private javax.swing.JPanel panel_kanan;
    private javax.swing.JPanel panel_kiri;
    private javax.swing.JPanel panel_utama;
    private javax.swing.JPanel pn_dasboard;
    public javax.swing.JPanel pn_flight;
    private javax.swing.JPanel pn_manage_flight;
    private javax.swing.JPanel pn_manage_passenger;
    private javax.swing.JPanel pn_manage_schedule;
    public javax.swing.JPanel pn_ticket;
    private javaswingdev.swing.titlebar.TitleBar titleBar1;
    // End of variables declaration//GEN-END:variables
}
