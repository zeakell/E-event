/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketsevent;

//import DB.connector;
import DB.DatabaseConnections ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DetailWisata3 extends javax.swing.JFrame {

    /**
     * Creates new form DetailWisata3
     */
    public DetailWisata3() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(990, 2143));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setText("DEVOYAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 191, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 787, 10));

        jLabel55.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel55.setText("SISA TIKET YANG TERSEDIA");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2020, -1, -1));

        txtstok.setEditable(false);
        txtstok.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtstok.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtstok.setBorder(null);
        jPanel1.add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2050, 210, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("KAMU MAU KE EROPA TAPI GAJADI  KARENA MAHAL?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 951, 20));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel3.setText("APAAN SIH MIN DEVOYAGE ITU ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, 810, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("ADMIN SIH MAU NGASIH TAU AJA Sekarang, keliling Eropa tidak perlu jauh-jauh, cukup ke Devoyager Bogor saja.  : )");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 779, 21));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Bisa di bilang Devoyager adalah tempat yang tepat untuk memenuhi kebutuhan liburan Sobat native");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 326, -1, 14));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel6.setText("Kamu Masih Belom Percaya? Atau tambah Kepo Tentang DEVOYAGE? Scroll terus dong sampe bawahhh :)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 303, 779, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("DEVOYAGE itu Salah satu kawasan wisata Baru yang sedang menjadi viral dan trending topic di media sosial adalah Devoyager Bogor. ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Ada juga yang menyebut tempat ini sebagai Kampung Eropa Bogor.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Tempat yang mempunyai luas kurang lebih 1,5 hektar ini menawarkan berbagai macam wisata kekinian berupa spot selfie ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 244, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("dengan bangunan bergaya eropa. Berada di sini bakal membuat semua orang tertipu, karena bangunannya yang dibangun dengan sangat detail.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel11.setText("Mimin Engga Bohong Kan? DEVOYAGE itu Memang Kayak Di Eropaaaa..");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1855, 491, -1));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 518, 112, -1));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Karena Berada di tengah kawasan yang sejuk dan teduh Dan Juga Hadir dengan berbagai macam hiburan berupa gaya eropa asli Lhooo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, -1, -1));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Di tambah dengan hadirnya 150 titik spot foto yang bakal menghabiskan waktu. Serta berbagai macam menu kuliner nan mantap dan menggoda lidah");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 367, -1, -1));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Jadi Kamu Bisa Bersantai Dan Pasti Nya Engga Akan kelaperan Dehhhhh ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 388, -1, 14));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Rasanya memang seperti mimpi pastinya, karena tidak mungkin kawasan eropa ini berada di Bogor.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 455, -1, -1));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Devoyager memang menghadirkan nuansa dengan sungai-sungai yang bisa di kayuh dengan perahu-perahu kecil ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 476, -1, -1));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Mengelilingi bangunan tua dengan warna-warni klasik Sungguh, nuansa yang tidak bisa diungkapkan dengan kata-kata atau dengan ekspresi apa pun");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 497, -1, -1));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel19.setText("KAMU MASIH BELOM PERCAYA??? NIH MIMIN ADA KOK FOTONYA DIBAWAH : )");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 608, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wisata3jpg/pictWisata3aeditsize.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 636, 670, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wisata3jpg/pictWisata3b.jpg"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1034, -1, 380));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wisata3jpg/pictWisata3c.jpg"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1432, 670, -1));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel24.setText("Ini beneran Atau Mimpi Sih Min?");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 432, 465, -1));

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel25.setText("Nah Kamu Jadi kepengen Kesana kan? Mimin Saranin Sih bawa Pasangan Atau keluarga yaaaaa Apa Lagi Bawa Gebetan Bisa Langsung Jadian Kayaknyaaa:)");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1878, 820, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1839, 670, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1987, 840, -1));

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel28.setText("Untuk Kamu Yang Ingin Ke DEVOYAGE Bisa Beli Tiketnnya Dibawah Yaa Scroll terusss Yaaaaa");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1930, 654, -1));

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel29.setText("Alamat kawasan ini berada di Komplek Bogor nirwana Residance, Jl. Boulevard CBD, Mulyaharja Bogor Selatan, Kota Bogor, Jawa Barat, 16135.");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1898, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(3, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(3, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 2003, -1, -1));

        jLabel33.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel33.setText("YUK DAPATKAN TIKET DENGAN CHECKOUT!");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2010, 341, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/back.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 2050, 110, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/checkoutpicteditsize.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 2030, 120, 90));

        jLabel27.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel27.setText("CheckOut");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 2130, 70, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2163, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        MenuWisata2 m = new MenuWisata2 () ;
        m.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel23MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    cekstok();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        Pembayaran p = new Pembayaran () ;
        p.show () ;
        hide () ;
    }//GEN-LAST:event_jLabel26MouseClicked
PreparedStatement pst;
    Connection con;
    ResultSet rs;
    Statement st;

    
    public void cekstok()
    {
        con = new DatabaseConnections().setConnection();  
        String sql = "select * from obj.EVENTT where EVENTID = 'E0003'";
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
            java.util.logging.Logger.getLogger(DetailWisata3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailWisata3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailWisata3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailWisata3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailWisata3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
