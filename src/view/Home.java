/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author handiism
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        scrollPaneTransaksi = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        labelId = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        labelBarang = new javax.swing.JLabel();
        textFieldBarang = new javax.swing.JTextField();
        labelKuantitas = new javax.swing.JLabel();
        textFieldHargaSatuan = new javax.swing.JTextField();
        labelHargaSatuan = new javax.swing.JLabel();
        textFieldDiskon = new javax.swing.JTextField();
        labelDiskon = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        labelKasir = new javax.swing.JLabel();
        textFieldKasir = new javax.swing.JTextField();
        textFieldKuantitas = new javax.swing.JTextField();
        buttonHapus = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneTransaksi.setViewportView(tableTransaksi);

        labelId.setText("ID");

        textFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdActionPerformed(evt);
            }
        });

        labelBarang.setText("Nama Barang");

        textFieldBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBarangActionPerformed(evt);
            }
        });

        labelKuantitas.setText("Kuantitas");

        textFieldHargaSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHargaSatuanActionPerformed(evt);
            }
        });

        labelHargaSatuan.setText("Harga Satuan (Rp)");

        textFieldDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDiskonActionPerformed(evt);
            }
        });

        labelDiskon.setText("Diskon (0-100%)");

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        labelKasir.setText("Nama Kasir");

        textFieldKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldKasirActionPerformed(evt);
            }
        });

        textFieldKuantitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldKuantitasActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonReset.setText("Bersihkan Input");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelId)
                        .addComponent(textFieldId)
                        .addComponent(labelKasir)
                        .addComponent(labelBarang)
                        .addComponent(labelHargaSatuan)
                        .addComponent(textFieldHargaSatuan)
                        .addComponent(textFieldKasir)
                        .addComponent(textFieldBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addComponent(labelDiskon)
                    .addComponent(labelKuantitas)
                    .addComponent(buttonUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldDiskon)
                    .addComponent(textFieldKuantitas)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTransaksi)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKasir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKuantitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldKuantitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHargaSatuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDiskon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonReset)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdActionPerformed

    private void textFieldBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBarangActionPerformed

    private void textFieldHargaSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHargaSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHargaSatuanActionPerformed

    private void textFieldDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDiskonActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void textFieldKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldKasirActionPerformed

    private void textFieldKuantitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldKuantitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldKuantitasActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonResetActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JLabel labelBarang;
    private javax.swing.JLabel labelDiskon;
    private javax.swing.JLabel labelHargaSatuan;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelKasir;
    private javax.swing.JLabel labelKuantitas;
    private javax.swing.JScrollPane scrollPaneTransaksi;
    private javax.swing.JTable tableTransaksi;
    private javax.swing.JTextField textFieldBarang;
    private javax.swing.JTextField textFieldDiskon;
    private javax.swing.JTextField textFieldHargaSatuan;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldKasir;
    private javax.swing.JTextField textFieldKuantitas;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JButton getButtonHapus() {
        return buttonHapus;
    }

    public void setButtonHapus(javax.swing.JButton buttonHapus) {
        this.buttonHapus = buttonHapus;
    }

    public javax.swing.JButton getButtonReset() {
        return buttonReset;
    }

    public void setButtonReset(javax.swing.JButton buttonReset) {
        this.buttonReset = buttonReset;
    }

    public javax.swing.JButton getButtonTambah() {
        return buttonTambah;
    }

    public void setButtonTambah(javax.swing.JButton buttonTambah) {
        this.buttonTambah = buttonTambah;
    }

    public javax.swing.JButton getButtonUbah() {
        return buttonUbah;
    }

    public void setButtonUbah(javax.swing.JButton buttonUbah) {
        this.buttonUbah = buttonUbah;
    }

    public javax.swing.JLabel getLabelBarang() {
        return labelBarang;
    }

    public void setLabelBarang(javax.swing.JLabel labelBarang) {
        this.labelBarang = labelBarang;
    }

    public javax.swing.JLabel getLabelDiskon() {
        return labelDiskon;
    }

    public void setLabelDiskon(javax.swing.JLabel labelDiskon) {
        this.labelDiskon = labelDiskon;
    }

    public javax.swing.JLabel getLabelHargaSatuan() {
        return labelHargaSatuan;
    }

    public void setLabelHargaSatuan(javax.swing.JLabel labelHargaSatuan) {
        this.labelHargaSatuan = labelHargaSatuan;
    }

    public javax.swing.JLabel getLabelId() {
        return labelId;
    }

    public void setLabelId(javax.swing.JLabel labelId) {
        this.labelId = labelId;
    }

    public javax.swing.JLabel getLabelKasir() {
        return labelKasir;
    }

    public void setLabelKasir(javax.swing.JLabel labelKasir) {
        this.labelKasir = labelKasir;
    }

    public javax.swing.JLabel getLabelKuantitas() {
        return labelKuantitas;
    }

    public void setLabelKuantitas(javax.swing.JLabel labelKuantitas) {
        this.labelKuantitas = labelKuantitas;
    }

    public javax.swing.JScrollPane getScrollPaneTransaksi() {
        return scrollPaneTransaksi;
    }

    public void setScrollPaneTransaksi(javax.swing.JScrollPane scrollPaneTransaksi) {
        this.scrollPaneTransaksi = scrollPaneTransaksi;
    }

    public javax.swing.JTable getTableTransaksi() {
        return tableTransaksi;
    }

    public void setTableTransaksi(javax.swing.JTable tableTransaksi) {
        this.tableTransaksi = tableTransaksi;
    }

    public javax.swing.JTextField getTextFieldBarang() {
        return textFieldBarang;
    }

    public void setTextFieldBarang(javax.swing.JTextField textFieldBarang) {
        this.textFieldBarang = textFieldBarang;
    }

    public javax.swing.JTextField getTextFieldDiskon() {
        return textFieldDiskon;
    }

    public void setTextFieldDiskon(javax.swing.JTextField textFieldDiskon) {
        this.textFieldDiskon = textFieldDiskon;
    }

    public javax.swing.JTextField getTextFieldHargaSatuan() {
        return textFieldHargaSatuan;
    }

    public void setTextFieldHargaSatuan(javax.swing.JTextField textFieldHargaSatuan) {
        this.textFieldHargaSatuan = textFieldHargaSatuan;
    }

    public javax.swing.JTextField getTextFieldId() {
        return textFieldId;
    }

    public void setTextFieldId(javax.swing.JTextField textFieldId) {
        this.textFieldId = textFieldId;
    }

    public javax.swing.JTextField getTextFieldKasir() {
        return textFieldKasir;
    }

    public void setTextFieldKasir(javax.swing.JTextField textFieldKasir) {
        this.textFieldKasir = textFieldKasir;
    }

    public javax.swing.JTextField getTextFieldKuantitas() {
        return textFieldKuantitas;
    }

    public void setTextFieldKuantitas(javax.swing.JTextField textFieldKuantitas) {
        this.textFieldKuantitas = textFieldKuantitas;
    }
}
