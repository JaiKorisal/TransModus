import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Window;

public class HomePage extends javax.swing.JFrame {
    public static String ActiveUser; // User struggles
    static Object existingInstance;
    // Creates new form HomePage
    public HomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeAllWindows();
            }
        });
    }

    private void closeAllWindows() {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTicketRes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRatingSystem = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnProfile1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        iconAboutUs = new javax.swing.JLabel();
        dispUser = new javax.swing.JLabel();
        ActiveClient = new javax.swing.JLabel(); // Stuggling
        btnRoutineMng = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdminPanel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        this.setUndecorated(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        btnTicketRes.setBackground(new java.awt.Color(204, 0, 0));
        btnTicketRes.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnTicketRes.setForeground(new java.awt.Color(0, 0, 0));
        btnTicketRes.setText("Book Tickets");
        btnTicketRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketResActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("Image/Ticket_IMG.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 356, 149, 140);

        btnRatingSystem.setBackground(new java.awt.Color(204, 0, 0));
        btnRatingSystem.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnRatingSystem.setForeground(new java.awt.Color(0, 0, 0));
        btnRatingSystem.setText("Leave a Review");
        btnRatingSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRatingSystemActionPerformed(evt);
            }
        });
        jPanel1.add(btnRatingSystem);
        btnRatingSystem.setBounds(690, 506, 190, 60);

        btnBooking.setBackground(new java.awt.Color(204, 0, 0));
        btnBooking.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(0, 0, 0));
        btnBooking.setText("Booking History");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnBooking);
        btnBooking.setBounds(470, 506, 190, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("Image/Feedback_15.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(690, 356, 184, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("Image/Profile_IMG.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 356, 130, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon("Image/Clock_IMG.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 356, 125, 146);

        btnProfile1.setBackground(new java.awt.Color(204, 0, 0));
        btnProfile1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        btnProfile1.setForeground(new java.awt.Color(0, 0, 0));
        btnProfile1.setText("User Profile");
        btnProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfile1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfile1);
        btnProfile1.setBounds(30, 506, 190, 60);

        jPanel2.setBackground(new java.awt.Color(179, 0, 0));

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel5.setText("T R A N S M O D U S");

        iconAboutUs.setIcon(new javax.swing.ImageIcon("Image/AboutUs_18.png")); // NOI18N
        iconAboutUs.setText("jLabel2");
        iconAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAboutUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 106);

        dispUser.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        dispUser.setForeground(new java.awt.Color(204, 0, 0));
        dispUser.setText("*User Not Found*");
        jPanel1.add(dispUser);
        dispUser.setBounds(140, 106, 40, 40);

        jLabel8.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Welcome,");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 150, 124, 40);

        btnAdminPanel.setBackground(new java.awt.Color(204, 0, 0));
        btnAdminPanel.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnAdminPanel.setForeground(new java.awt.Color(0, 0, 0));
        btnAdminPanel.setText("Admin HP");
        btnAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPanelActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminPanel);
        btnAdminPanel.setBounds(710, 135, 170, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("Image/Feedback_15.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 344, 148, 151));

        jLabel6.setIcon(new javax.swing.ImageIcon("Image/TransModus_BG_2.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(dispUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(btnRatingSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnTicketRes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnProfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dispUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnRatingSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnTicketRes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnProfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // REVIEW SYSTEM
    private void btnRatingSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRatingSystemActionPerformed
        ReviewSystem rev = new ReviewSystem();  
        rev.setVisible(true);
        rev.pack();
    }//GEN-LAST:event_btnRatingSystemActionPerformed
    
    // TICKET RESERVATION
    private void btnTicketResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketResActionPerformed
        TicketReservation_1 trs = new TicketReservation_1();  
        trs.setVisible(true);
        trs.pack();
    }//GEN-LAST:event_btnTicketResActionPerformed
    
    // USER PROFILE
    private void btnProfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfile1ActionPerformed
        UserProfile user = new UserProfile();  
        user.setVisible(true);
        user.pack();
    }//GEN-LAST:event_btnProfile1ActionPerformed

    // BOOKING HISTORY
    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        Booking bk = new Booking();  
        bk.setVisible(true);
        bk.pack();
    }//GEN-LAST:event_btnBookingActionPerformed

    // ADMIN PANEL & ROUTINE MANAGER
    private void btnAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPanelActionPerformed
        AdminPanel adp = new AdminPanel();
        adp.setVisible(true);
        adp.pack();
    }//GEN-LAST:event_btnAdminPanelActionPerformed

    private void iconAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconAboutUsMouseClicked
        AboutUs abt = new AboutUs();
        abt.setVisible(true);
        abt.pack();
    }//GEN-LAST:event_iconAboutUsMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminPanel;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnProfile1;
    private javax.swing.JButton btnRatingSystem;
    private javax.swing.JButton btnRoutineMng;
    private javax.swing.JButton btnTicketRes;
    public  javax.swing.JLabel dispUser;
    public  javax.swing.JLabel ActiveClient; //struggles
    private javax.swing.JLabel iconAboutUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}