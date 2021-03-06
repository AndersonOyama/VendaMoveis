package ControleDeAcesso;

import Apresentacao.JFrameTelaAdmin;
import Util.HibernateUtil;
//import GerenciamentoDeFuncionarios.JFrameConsultarFrequencia;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.hibernate.Session;


public class JFrameTelaLogin extends javax.swing.JFrame {


    public JFrameTelaLogin() {
        initComponents();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButton_logar = new javax.swing.JButton();
        JPassword_senha = new javax.swing.JPasswordField();
        JTextField_login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("login"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        JButton_logar.setText("Entrar");
        JButton_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_logarActionPerformed(evt);
            }
        });

        JPassword_senha.setText("jPasswordField1");
        JPassword_senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JPassword_senhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JPassword_senhaFocusLost(evt);
            }
        });
        JPassword_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JPassword_senhaKeyPressed(evt);
            }
        });

        JTextField_login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                compo_automatico(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo_automatico(evt);
            }
        });
        JTextField_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextField_loginKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/redebras-topo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(JTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPassword_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(JButton_logar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(JTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPassword_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(JButton_logar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compo_automatico(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_compo_automatico
        if (JTextField_login.getText().equals("Login")) {
            JTextField_login.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_compo_automatico

    private void campo_automatico(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_automatico
        if (JTextField_login.getText().equals("")) {
            JTextField_login.setText("Login");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_campo_automatico

    private void JPassword_senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPassword_senhaFocusGained
        JPassword_senha.setText(null);             // TODO add your handling code here:
    }//GEN-LAST:event_JPassword_senhaFocusGained

    private void JPassword_senhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPassword_senhaFocusLost
        if (JPassword_senha.getText().equals("")) {
            JPassword_senha.setText("123456789");
        }
    }//GEN-LAST:event_JPassword_senhaFocusLost

    private void JButton_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_logarActionPerformed
        boolean login = new ControlaAcesso().permiteAcesso(JTextField_login.getText(), JPassword_senha.getText());
        if (login) {
            if (JTextField_login.getText().equals("admin")) {
//                new JFrameTelaAdmin();
            }
            dispose();
        }        // TODO add your handling code here:*/
    }//GEN-LAST:event_JButton_logarActionPerformed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void JPassword_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPassword_senhaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            boolean login = new ControlaAcesso().permiteAcesso(JTextField_login.getText(), JPassword_senha.getText());
            if (login) {
                if (JTextField_login.getText().equals("admin")) {
                   new JFrameTelaAdmin();
                }
                dispose();
            }

        }
    }//GEN-LAST:event_JPassword_senhaKeyPressed

    private void JTextField_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_loginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_loginKeyPressed

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
            java.util.logging.Logger.getLogger(JFrameTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_logar;
    private javax.swing.JPasswordField JPassword_senha;
    private javax.swing.JTextField JTextField_login;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
