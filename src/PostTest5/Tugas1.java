/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTest5;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RizkyKiwa
 */
public class Tugas1 extends javax.swing.JFrame {
public DefaultTableModel model;
    /**
     * Creates new form Tugas1
     */
    public Tugas1() {
        initComponents();
    }
    public void inittable(){
        model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("No.Telepon");
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Kota Asal");
        jTable1.setModel(model);
    }
    
    void tipehuruf(KeyEvent x){
        if(Character.isAlphabetic(x.getKeyChar())){
            x.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa Memasukkan Karakter Bertipe Angka","kesalahan",JOptionPane.WARNING_MESSAGE);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), null));

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel6.setText("TABEL PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), null));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("NAMA");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NO. TELEPON");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("KOTA ASAL");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ALAMAT");

        nama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                namaCaretUpdate(evt);
            }
        });
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        telepon.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                teleponCaretUpdate(evt);
            }
        });
        telepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teleponKeyTyped(evt);
            }
        });

        alamat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                alamatCaretUpdate(evt);
            }
        });

        buttonGroup1.add(laki);
        laki.setText("Laki-Laki");

        buttonGroup1.add(perempuan);
        perempuan.setText("Perempuan");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SAMARINDA", "TARAKAN", "BALIKPAPAN", "TENGGARONG", "BERAU", "BONTANG", "PPU" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "No. Telepon", "Alamat", "Jenis Kelamin", "Kota Asal"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTable1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tambah.setText("TAMBAH");
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tambahMouseEntered(evt);
            }
        });
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telepon)
                            .addComponent(alamat)
                            .addComponent(nama)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(laki)
                                .addGap(18, 18, 18)
                                .addComponent(perempuan))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(laki)
                    .addComponent(perempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(update)
                    .addComponent(hapus)
                    .addComponent(tambah))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        nama.setEnabled(true);
        alamat.setEnabled(true);
        telepon.setEnabled(true);
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_tambahActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        inittable();
    }//GEN-LAST:event_formComponentShown

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseEntered
    // TODO add your handling code here:
    //    if (nama.getText().length()==0||telepon.getText().length()==0 || alamat.getText().length()==0){
    //   tambah.setEnabled(false); }
    // else { tambah.setEnabled(true);}
    }//GEN-LAST:event_tambahMouseEntered

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
         Object[] data = new Object[5];
        data[0] = nama.getText();
        data[1] = telepon.getText();
        data[2] = alamat.getText();
        data[4] = jComboBox1.getSelectedItem();
        if (laki.isSelected()){
           data[3] = laki.getText();
        }
        else if (perempuan.isSelected()==true){
           data[3] = perempuan.getText();
        }
        model.addRow(data);
        
        update.setEnabled(true);
        hapus.setEnabled(true);
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        nama.requestFocus();
    }//GEN-LAST:event_hapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        int baris = jTable1.getSelectedRow();
//        
//        String nama_edit = jTable1.getValueAt(baris,0).toString();
//        String telepon_edit = jTable1.getValueAt(baris,1).toString();
//        String alamat_edit = jTable1.getValueAt(baris,2).toString();
//        String asal_edit = jTable1.getValueAt(baris,4).toString();
//        
//        nama.setText(nama_edit);
//        telepon.setText(telepon_edit);
//        alamat.setText(alamat_edit);
//        jComboBox1.setSelectedItem(asal_edit);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        nama.setText("");
        telepon.setText("");
        alamat.setText("");
        
        nama.setEnabled(false);
        telepon.setEnabled(false);
        alamat.setEnabled(false);
        simpan.setEnabled(false);
        update.setEnabled(false);
        hapus.setEnabled(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void namaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_namaCaretUpdate
        // TODO add your handling code here:
        if(nama.getText().length() !=0 && telepon.getText().length() !=0 && alamat.getText().length() !=0 ){
            simpan.setEnabled(true);
        }
        else{
            simpan.setEnabled(false);
            update.setEnabled(false);
            hapus.setEnabled(false);
        }
    }//GEN-LAST:event_namaCaretUpdate

    private void teleponCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_teleponCaretUpdate
        // TODO add your handling code here:
        if(nama.getText().length() !=0 && telepon.getText().length() !=0 && alamat.getText().length() !=0){
            simpan.setEnabled(true);
        }
        else{
            simpan.setEnabled(false);
            update.setEnabled(false);
            hapus.setEnabled(false);
            }
    }//GEN-LAST:event_teleponCaretUpdate

    private void alamatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_alamatCaretUpdate
        // TODO add your handling code here:
        if(nama.getText().length() !=0 && telepon.getText().length() !=0 && alamat.getText().length() !=0){
            simpan.setEnabled(true);
        }
        else{
            simpan.setEnabled(false);
            update.setEnabled(false);
            hapus.setEnabled(false);
            }
    }//GEN-LAST:event_alamatCaretUpdate

    private void jTable1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1CaretPositionChanged

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        try{
            int baris = jTable1.getSelectedRow();

            jTable1.setValueAt(nama.getText(), baris, 0);
            jTable1.setValueAt(telepon.getText(), baris, 1);
            jTable1.setValueAt(alamat.getText(), baris, 2);
            jTable1.setValueAt(laki.getText(), baris, 3);
            jTable1.setValueAt(perempuan.getText(), baris, 3);
            jTable1.setValueAt(jComboBox1.getSelectedItem(), baris, 4);
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this,"table belum dipilih","kesalahan",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateMouseClicked

    private void teleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleponKeyTyped
        // TODO add your handling code here:
        tipehuruf(evt);
    }//GEN-LAST:event_teleponKeyTyped

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
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton hapus;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField telepon;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}