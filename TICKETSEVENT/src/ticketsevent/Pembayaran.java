    /**
 *
 * @author KH
 */
package ticketsevent;
import DB.DatabaseConnections ;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
public class Pembayaran extends javax.swing.JFrame {
    PreparedStatement pst;
    Connection con;
    ResultSet rs;
    Statement st;
    int flag = 0;
    int total, harga, jumlah;

    public Pembayaran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        email = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnCARIEVENT = new javax.swing.JButton();
        totalbayar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        totalbayar1 = new javax.swing.JTextField();
        tiketid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        idevent = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cekvoucher = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfvoucher = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pembayaranjpg/logo-bni-bank.jpg"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 100, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pembayaranjpg/pictBayar2editbayar.jpg"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 150, 40));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setText("Rincian Pemesanan");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 157, 29));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(3, 400));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 78, -1, 600));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel22.setText("Harga");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 57, 150, 10));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 57, 180, 10));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel24.setText("Metode Pembayaran");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 171, 29));

        jSeparator15.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 282, 355, 10));

        jSeparator17.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 434, 355, 10));

        email.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 288, 30));
        jPanel3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 297, 493, 10));
        jPanel3.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 348, 493, 10));
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 490, 10));

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel25.setText("Mimin Kasih Tau Tutorialnya Yaaa : )");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 78, 426, -1));

        jTextField17.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(153, 153, 153));
        jTextField17.setText("Pertama : Dipastikan Kamu Mempunyai Metode Pembayaran Dibawah Yaaa");
        jTextField17.setBorder(null);
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 113, 478, -1));

        jTextField18.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(153, 153, 153));
        jTextField18.setText("Kedua : Jika Kamu Sudah Punya Silahkan Pilih Dan Click Metode Pembayaran Kamuuu");
        jTextField18.setBorder(null);
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 133, 478, -1));

        jTextField19.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jTextField19.setText("Ketiga : Jika Sudah Kamu Akan Pindah Ke Pembayaran Kamu");
        jTextField19.setBorder(null);
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 153, 478, -1));

        jTextField20.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(153, 153, 153));
        jTextField20.setText("Keempat : Lalu Kamu Scan QR Code Yang Ada Di Pembayaran Kamu Dispastikan Benar yaa");
        jTextField20.setBorder(null);
        jPanel3.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 173, -1, -1));

        jTextField21.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(153, 153, 153));
        jTextField21.setText("Kelima : Horeee Pembayaran Kamu Berhasil Dilakukannn");
        jTextField21.setBorder(null);
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 193, 478, -1));

        jTextField22.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(153, 153, 153));
        jTextField22.setText("KeEnam : Jangan Lupa Click Tombol Rating Nya yaaaa");
        jTextField22.setBorder(null);
        jPanel3.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 213, 482, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 490, 37));

        jLabel36.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel36.setText("Nama Event Yang Kamu Pilih ");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jSeparator22.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 144, 350, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel4.setText("Voucher");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 390, 10));

        btnCARIEVENT.setBackground(new java.awt.Color(51, 255, 0));
        btnCARIEVENT.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCARIEVENT.setForeground(new java.awt.Color(255, 255, 255));
        btnCARIEVENT.setText("Cari Event");
        btnCARIEVENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCARIEVENTActionPerformed(evt);
            }
        });
        jPanel3.add(btnCARIEVENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 37));

        totalbayar.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        totalbayar.setBorder(null);
        totalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbayarActionPerformed(evt);
            }
        });
        jPanel3.add(totalbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 290, 40));

        jButton5.setBackground(new java.awt.Color(51, 255, 0));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Total Bayar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 120, 37));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel23.setText("TOTAL PEMBAYARAN");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));
        jPanel3.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 360, 20));

        jSeparator23.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 355, 10));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel3.setText("Email");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel2.setText("Nama Pemesan ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel5.setText("Nomor Tiket");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INDONESIA VS MALAYSIA", "ARCHATALA", "JAVA JAZZ", "KONSER AMAL", "HONNE", "FESTIVAL TANGGERANG", "LOUIS TOMLINSON", "MUSEUM ANGKUT", "FARM HOUSE LEMBANG", "DEVOYAGE", "DUFAN", "THE LOST WORLD CASTLE", "JOGJA BAY" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        totalbayar1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        totalbayar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalbayar1.setBorder(null);
        totalbayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbayar1ActionPerformed(evt);
            }
        });
        jPanel3.add(totalbayar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 490, 360, 40));

        tiketid.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        tiketid.setBorder(null);
        jPanel3.add(tiketid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 288, 30));

        name.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(153, 153, 153));
        name.setBorder(null);
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 350, 30));

        jSeparator24.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 355, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel6.setText("ID Event");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        idevent.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        idevent.setForeground(new java.awt.Color(153, 153, 153));
        idevent.setBorder(null);
        jPanel3.add(idevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 350, 30));

        jSeparator25.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 355, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pembayaranjpg/pictBayar3editbayar.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 150, 40));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("Rp.");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 50, -1));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 300, 20));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel7.setText("Jumlah Tiket");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        cekvoucher.setBackground(new java.awt.Color(51, 255, 0));
        cekvoucher.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cekvoucher.setForeground(new java.awt.Color(255, 255, 255));
        cekvoucher.setText("Cek Voucher");
        cekvoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekvoucherActionPerformed(evt);
            }
        });
        jPanel3.add(cekvoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 120, 37));

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 290, 30));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel10.setText("Bank");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 30));

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 250, 30));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel8.setText("Dana");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, 20));

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 250, 30));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel9.setText("Ovo");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, 20));

        tfvoucher.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jPanel3.add(tfvoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, 210, 30));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 490, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       name.setText(Logins.username.getText());
       email();
       Notiket();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        add();
        PembayaranOvo p = new PembayaranOvo () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        add();
        PembayaranDana p = new PembayaranDana () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        add();

        PembayaranBank p = new PembayaranBank () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        add();

        PembayaranDana p = new PembayaranDana () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        add();
        PembayaranBank p = new PembayaranBank () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        add();

        PembayaranOvo p = new PembayaranOvo () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      try 
      {
            if (jComboBox1.getSelectedItem().equals(" ")) {
                JOptionPane.showMessageDialog(null, "Masukan Nama Event Terlebih Dahulu", "Warning",
                    JOptionPane.WARNING_MESSAGE );
            } else {
                    harga = Integer.parseInt(totalbayar.getText());
                    jumlah = Integer.parseInt(jComboBox2.getSelectedItem().toString()) ;
                    total = harga * jumlah ;
                    totalbayar.setText (String.valueOf(total)) ;
                    totalbayar1.setText (String.valueOf(total)) ;
            }
            
        }   catch (HeadlessException |  NumberFormatException e) {
                System.out.println ("errorrrrrrs") ;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnCARIEVENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCARIEVENTActionPerformed
        try
            {
                con = new DatabaseConnections().setConnection();
                String sql = "SELECT *FROM obj.EVENTT WHERE EVENT_NAME = ? ";
                String events = jComboBox1.getSelectedItem().toString();

                pst = con.prepareStatement(sql);
                pst.setString(1, events);
                rs = pst.executeQuery();

                if(rs.next())
                {
                    totalbayar.setText(rs.getString("EVENT_PRICE"));
                    idevent.setText(rs.getString("EVENTID"));
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "EVENT TIDAK DITEMUKAN");
                }
            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_btnCARIEVENTActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cekvoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekvoucherActionPerformed
        try
            {
                con = new DatabaseConnections().setConnection();
                String sql = "SELECT * FROM Voucher WHERE Voucher_Name = ? ";
                String Voucher = tfvoucher.getText() ;
                pst = con.prepareStatement(sql);
                pst.setString(1, Voucher);

                rs = pst.executeQuery();
                if(rs.next())
                {
                    harga = Integer.parseInt(totalbayar.getText()) ;
                    Integer nilaivoucher = rs.getInt("Voucher_values");
                    int jumlahbayar = harga - nilaivoucher;                
                    totalbayar1.setText(String.valueOf(jumlahbayar));
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Vouchernya engga ada");
                }
            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_cekvoucherActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Menu M = new Menu () ;
        M.show () ;
        hide () ;
    }//GEN-LAST:event_jButton4MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void totalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalbayarActionPerformed

    private void totalbayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbayar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalbayar1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:        
//        try {
//                     con = new DatabaseConnections().setConnection();              
//                    InputStream in = new FileInputStream(new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\TICKETSEVENT\\src\\ticketsevent\\report.jrxml")) ;
//                    JasperDesign jd =JRXmlLoader.load(in) ; 
//                        
//                     String sql = "Select * From trans.TRANSACTIONS" ;
//                        
//                    JRDesignQuery newQuery = new JRDesignQuery () ;
//                         newQuery.setText(sql);
//                         jd.setQuery(newQuery);
//                     JasperReport jr = JasperCompileManager.compileReport(jd) ;
//                     HashMap para = new HashMap () ;                 
//                 JasperPrint j = JasperFillManager.fillReport(jr,para,con) ;
//                  JasperViewer.viewReport(j, false);
//                     OutputStream os = new FileOutputStream (new File("D:\\Report" )) ;
//                         JasperExportManager.exportReportToPdfStream(j,os) ;
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e) ;
//        }
    }//GEN-LAST:event_jLabel11MouseClicked
    public void Notiket()
    {    
        con = new DatabaseConnections().setConnection();
        try
        {
        String sql = "SELECT TIKETID FROM trans.TRANSACTIONS order by TIKETID desc";    
        st = con.createStatement();
        rs = st.executeQuery(sql);
            if(rs.next())
            {
                String ID = rs.getString("TIKETID");
                String potong = ID.substring(3);
                int nextid = Integer.parseInt(potong)+1;
                if (nextid <= 9)
                {
                    ID = "T00" + nextid;    
                }
                else if (nextid <= 99)
                {
                    ID = "T0" + nextid;
                }
              tiketid.setText(ID);  
            } 
            else
            {
                
                tiketid.setText("T001");
            }
        }
        
        catch (NumberFormatException | SQLException e)
        { System.err.println("eror");}
    }

      public void email()
      {
        con = new DatabaseConnections().setConnection();
        try
        {
 
        String sql = "SELECT EMAIL FROM human.USERS WHERE USERNAME = ?";
        pst = con.prepareStatement(sql);
            pst.setString(1, name.getText());
            rs = pst.executeQuery();
            
            while (rs.next()) {
                flag = 1;
                email.setText(rs.getString("EMAIL"));
            }
        } 
        catch (HeadlessException | SQLException e) {
            { System.err.println("eror");}
        }
    }
      
    public void add()
    {
        try
        {
            
                    
            String Notiket = tiketid.getText();
            String Event = jComboBox1.getSelectedItem().toString();
            String eventid = idevent.getText();
            String Username = name.getText();  
            Object Qty = jComboBox2.getSelectedItem();
            String SUBpay = totalbayar.getText();
            String Pay = totalbayar1.getText();
            //validation rule        
            if ("".equals(Event))
            {
                JOptionPane.showMessageDialog(null, "Empty Field Not allowed");
            }
        
            //connection with database 
            con = new DatabaseConnections().setConnection();
            String sql="insert into trans.TRANSACTIONS (TIKETID, EVENTID, EVENT_NAME, USERNAME, QTY, SUBTOTAL, TOTAL_PAY)"
                     + "values(?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            // for insert to database
            pst.setString(1, Notiket);
            pst.setString(2, eventid);
            pst.setString(3, Event);
            pst.setString(4, Username);
            pst.setObject(5, Qty);
            pst.setString(6, SUBpay);
            pst.setString(7, Pay);
            
            pst.executeUpdate();            
            JOptionPane.showMessageDialog(this, "Silahkan melakukan pembayaran");
            JOptionPane.showMessageDialog(this, "Terimakasih telah membeli tiket disini ka ");            
        }
    catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
            JOptionPane.showMessageDialog(this, "terjadi kesalahan sintak, coba hubungi admin aplikasi" );
        }
    }
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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCARIEVENT;
    private javax.swing.JButton cekvoucher;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idevent;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField name;
    private javax.swing.JTextField tfvoucher;
    public static javax.swing.JTextField tiketid;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextField totalbayar1;
    // End of variables declaration//GEN-END:variables
}