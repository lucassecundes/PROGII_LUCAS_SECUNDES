/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progii_lucas_secundes;

import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmeEndereco = new javax.swing.JMenuItem();
        jmeUsuario = new javax.swing.JMenuItem();
        jmePerfil = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmCadastro.setText("Cadastrar");

        jmeEndereco.setText("ENDEREÇO");
        jmeEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmeEnderecoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmeEndereco);

        jmeUsuario.setText("USUARIO");
        jmeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmeUsuarioActionPerformed(evt);
            }
        });
        jmCadastro.add(jmeUsuario);

        jmePerfil.setText("PERFIL");
        jmePerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmePerfilActionPerformed(evt);
            }
        });
        jmCadastro.add(jmePerfil);

        jMenuBar1.add(jmCadastro);

        jMenu2.setText("Lista");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmeEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmeEnderecoActionPerformed
        
        CadastrarEndereco cadastrarEndereco  = new CadastrarEndereco();
        cadastrarEndereco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastrarEndereco.setVisible(true); // display frame
    }//GEN-LAST:event_jmeEnderecoActionPerformed

    private void jmeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmeUsuarioActionPerformed
       
        CadastrarUsuario cadastrarUsuario  = new CadastrarUsuario();
        cadastrarUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastrarUsuario.setVisible(true); // display frame
    }//GEN-LAST:event_jmeUsuarioActionPerformed

    private void jmePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmePerfilActionPerformed
        
        CadastrarPerfil cadastrarPerfil  = new CadastrarPerfil();
        cadastrarPerfil.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastrarPerfil.setVisible(true); // display frame
    }//GEN-LAST:event_jmePerfilActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmeEndereco;
    private javax.swing.JMenuItem jmePerfil;
    private javax.swing.JMenuItem jmeUsuario;
    // End of variables declaration//GEN-END:variables
}