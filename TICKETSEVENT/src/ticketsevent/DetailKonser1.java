/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketsevent;
//import DB.connector;
import DB.DatabaseConnections ;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author KH
 */
public class DetailKonser1 extends javax.swing.JFrame {
    PreparedStatement pst;
    Connection con;
    ResultSet rs;
    Statement st;

    /**
     * Creates new form DetailKonser1
     */
    public DetailKonser1() {
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

        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtstok = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/posterkonser1editsizedetail.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 530));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel9.setText("ARCHATALA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel4.setText("Jika Kamu Tertarik Dengan Event Ini  Silahkan Pilih Jumlah Tiket Kamu Dan Lanjutkan Ke Pembayaran");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 530, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setAlignmentX(2.0F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 250, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setAlignmentX(2.0F);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 330, 10));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setAlignmentX(2.0F);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 570, 20));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, 180));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Yukk ChekOut Pesanan Kamuuu");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 200, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel10.setText("Archatala adalah event yang diselenggarakan oleh SMA LABSCHOOL UPI BANDUNG LHOOOOO ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 480, 10));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Loner Lunnar.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 140, 20));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel12.setText("Lokasi :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 50, 20));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Maliq&D'essential");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 160, 20));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("The Changcuters");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 150, 20));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Mustache and Beard");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 190, 20));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Club Dangdut Racun");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 190, 20));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Pamungkas");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 120, 20));

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setAlignmentX(2.0F);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 590, 20));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel18.setText("Archatala adalah event yang diselenggarakan oleh SMA LABSCHOOL UPI BANDUNG LHOOOOO ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 480, 10));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel19.setText("Yukkkkkk Catat Tanggalnyaaaa Dibawah Ini");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 320, 20));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel20.setText("Bandung, Jawa Barat indonesia");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 190, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 50, -1));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel21.setText("18 januari 2020");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 90, 20));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel22.setText("Waktu :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 50, 20));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel23.setText("yang akan dimeriahkan oleh ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 230, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/checkoutpicteditsize.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 130, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/back.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 30));

        jLabel2.setText("SISA TIKET YANG TERSEDIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        txtstok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 200, 30));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("CheckOut");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        MenuKonser m = new MenuKonser () ;
        m.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel25MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        cekstok();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        Pembayaran p = new Pembayaran () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel24MouseClicked

    public void cekstok()
    {
        con = new DatabaseConnections().setConnection();  
        String sql = "select * from obj.EVENTT where EVENTID = 'E0007'";
        try{       
             st = con.createStatement();
             rs = st.executeQuery(sql);
             
            rs.next();
            {
                 int stok = rs.getInt("STOCK");
                 String a = Integer.toString(stok);
 
                 txtstok.setText(a);
             }
        }
        catch (SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(""+e.getMessage());
        }
    }
    
    //public void callprice()
//    {
//    try
//        {
//           con = new connector().setConnection();
//           
//            String sql = "select EVENT_PRICE from object.EVENTS where EVENTID = 'E0007'";
//            
//             st = con.createStatement();
//             rs = st.executeQuery(sql);
//             
//            Integer J = null;
//            Integer ID = rs.getInt("EVENT_PRICE");
//             while (rs.next())                
//            {
//                if (jRadioButton1.isSelected())
//                {                    
//                    J = ID*1;   
//                }
//                else if (jRadioButton2.isSelected())
//                {
//                    J = ID*2;
//                }
//                else if (jRadioButton3.isSelected())
//                {
//                    J = ID*3;
//                }                   
//            }
//              jLabel26.setText(String.valueOf(J));
//        }
//     catch(HeadlessException | SQLException e)
//        {
//            JOptionPane.showMessageDialog(this,e.getMessage());
//        }
//    }
    
    
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
            java.util.logging.Logger.getLogger(DetailKonser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailKonser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailKonser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailKonser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailKonser1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel txtstok;
    // End of variables declaration//GEN-END:variables
}