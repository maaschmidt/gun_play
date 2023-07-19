package screens;

import tools.Globais;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author maaschmidt
 */
public class TelaInicial extends javax.swing.JFrame {

    String player;

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        Globais.tocarSom("src/sounds/metralhadora.wav");
        Globais.ajustarImagem(getClass().getResource("/images/background/inicial.jpg"), lblFundo);
        lblNome.setVisible(false);
        txtNome.setVisible(false);
        btnNext.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        btnNext.setFont(new java.awt.Font("Checkpoint Charlie", 0, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("NEXT");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(600, 430, 120, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Checkpoint Charlie", 0, 87)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUNPLAY");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 80, 740, 94);

        btnSair.setFont(new java.awt.Font("Checkpoint Charlie", 0, 15)); // NOI18N
        btnSair.setForeground(new java.awt.Color(204, 204, 204));
        btnSair.setText("EXIT");
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(10, 440, 70, 24);

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setFont(new java.awt.Font("Ani", 0, 15)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setToolTipText("");
        txtNome.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtNome.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(260, 250, 200, 30);

        lblNome.setFont(new java.awt.Font("Checkpoint Charlie", 0, 15)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("PLAYER NAME");
        lblNome.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblNome);
        lblNome.setBounds(260, 230, 120, 18);

        btnIniciar.setFont(new java.awt.Font("Checkpoint Charlie", 0, 24)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("START");
        btnIniciar.setBorder(null);
        btnIniciar.setBorderPainted(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        btnIniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIniciarKeyPressed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(0, 240, 720, 29);

        lblFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 730, 490);

        setSize(new java.awt.Dimension(726, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (txtNome.getText().trim().length() >= 3
                && txtNome.getText().trim().length() <= 10) {
            player = txtNome.getText().toUpperCase();
            TelaHistoria tela = new TelaHistoria(player);
            tela.setVisible(true);
            dispose();
        } else {
            Globais.exibirMensagem("Insira um nome entre 3 e 10 caracteres");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        btnIniciar.setVisible(false);
        lblNome.setVisible(true);
        txtNome.setVisible(true);
        btnNext.setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtNome.getText().trim().length() >= 2
                    && txtNome.getText().trim().length() <= 10) {
                player = txtNome.getText().toUpperCase();
                TelaHistoria tela = new TelaHistoria(player);
                tela.setVisible(true);
                dispose();
            } else {
                Globais.exibirMensagem("Insira um nome entre 3 e 10 caracteres");
            }
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnIniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIniciarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIniciar.setVisible(false);
            lblNome.setVisible(true);
            txtNome.setVisible(true);
            btnNext.setVisible(true);
        }
    }//GEN-LAST:event_btnIniciarKeyPressed

    private void ajustarImagem(String caminho, JLabel label) {
        try {
            ImageIcon imageIcon = new ImageIcon(caminho);
            Image img = imageIcon.getImage();
            Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledimageIcon = new ImageIcon(imgScale);
            label.setIcon(scaledimageIcon);
        } catch (Exception ex) {
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaInicial().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}