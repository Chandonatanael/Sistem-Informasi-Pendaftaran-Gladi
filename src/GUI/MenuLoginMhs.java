/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chando
 */
public class MenuLoginMhs extends javax.swing.JFrame {

    /**
     * Creates new form MenuLogMhs
     */
    public MenuLoginMhs() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        btnPilihLokasiMhs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        lblNoTlp = new javax.swing.JLabel();
        txtNimMhs = new javax.swing.JTextField();
        txtAlamatMhs = new javax.swing.JTextField();
        txtNoTlpMhs = new javax.swing.JTextField();
        txtNamaMhs = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        lblNim = new javax.swing.JLabel();
        lblEditBiodata = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMhs = new javax.swing.JTable();
        lblLihatDaftarGladi = new javax.swing.JLabel();
        btnUpdateNim = new javax.swing.JButton();
        btnLogoutMhs = new javax.swing.JButton();
        btnUpdateNama = new javax.swing.JButton();
        btnUpdateAlamat = new javax.swing.JButton();
        btnUpdateTlp = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPilihLokasiMhs.setText("Pilih Lokasi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Menu Mahasiswa");

        lblAlamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAlamat.setText("Alamat");

        lblNoTlp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNoTlp.setText("No.Tlp");

        lblNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNama.setText("Nama");

        lblNim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNim.setText("Nim     ");

        lblEditBiodata.setText("Edit Biodata :");

        tblMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nim", "Nama", "Alamat", "No.Tlp"
            }
        ));
        jScrollPane1.setViewportView(tblMhs);

        lblLihatDaftarGladi.setText("Biodata Anda :");

        btnUpdateNim.setText("Update");

        btnLogoutMhs.setText("Log Out");

        btnUpdateNama.setText("Update");

        btnUpdateAlamat.setText("Update");

        btnUpdateTlp.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditBiodata, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihLokasiMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAlamat)
                            .addComponent(lblNoTlp))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAlamatMhs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtNamaMhs, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoTlpMhs)
                            .addComponent(txtNimMhs, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateNim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateTlp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLihatDaftarGladi))
                            .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnLogoutMhs)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLihatDaftarGladi)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPilihLokasiMhs)
                                .addGap(10, 10, 10)
                                .addComponent(lblEditBiodata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNimMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNim)
                                    .addComponent(btnUpdateNim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNama)
                                    .addComponent(btnUpdateNama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAlamatMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAlamat)
                                    .addComponent(btnUpdateAlamat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNoTlpMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNoTlp)
                                    .addComponent(btnUpdateTlp)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnLogoutMhs)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuLoginMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLoginMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLoginMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLoginMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLoginMhs().setVisible(true);
            }
        });
    }
    
    public String getTxtAlamatMhs() {
        return txtAlamatMhs.getText();
    }
    
    public String getTxtNamaMhs() {
        return txtNamaMhs.getText();
    }
    
    public String getTxtNimMhs() {
        return txtNimMhs.getText();
    }
    
    public String getTxtNoTlpMhs() {
        return txtNoTlpMhs.getText();
    }
    
    public void settable(String a, String b, String c, String d) {
        DefaultTableModel model = (DefaultTableModel) tblMhs.getModel();
        Object[] rowdat = new Object[4];
        rowdat[0] = a;
        rowdat[1] = b;
        rowdat[2] = c;
        rowdat[3] = d;
        model.addRow(rowdat);
    }
    
    public void remove() {
        DefaultTableModel model = (DefaultTableModel) tblMhs.getModel();
        model.removeRow(0);
    }
    
    public void PlhLokasiListener(ActionListener e) {
        btnPilihLokasiMhs.addActionListener(e);
    }

    public void UpdateNimListener(ActionListener e) {
        btnUpdateNim.addActionListener(e);
    }
    public void UpdateNamaListener(ActionListener e) {
        btnUpdateNama.addActionListener(e);
    }
    public void UpdateAlamatListener(ActionListener e) {
        btnUpdateAlamat.addActionListener(e);
    }
    
    public void UpdateTlpListener(ActionListener e) {
        btnUpdateTlp.addActionListener(e);
    }

    public void LogoutListener(ActionListener e) {
        btnLogoutMhs.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogoutMhs;
    private javax.swing.JButton btnPilihLokasiMhs;
    private javax.swing.JButton btnUpdateAlamat;
    private javax.swing.JButton btnUpdateNama;
    private javax.swing.JButton btnUpdateNim;
    private javax.swing.JButton btnUpdateTlp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblEditBiodata;
    private javax.swing.JLabel lblLihatDaftarGladi;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblNoTlp;
    private javax.swing.JTable tblMhs;
    private javax.swing.JTextField txtAlamatMhs;
    private javax.swing.JTextField txtNamaMhs;
    private javax.swing.JTextField txtNimMhs;
    private javax.swing.JTextField txtNoTlpMhs;
    // End of variables declaration//GEN-END:variables
}