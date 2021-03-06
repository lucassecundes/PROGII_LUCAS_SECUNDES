/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progii_lucas_secundes;


import dao.PerfilDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Perfil;

/**
 *
 * @author aluno
 */
public class CadastrarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarPerfil
     */
    public CadastrarPerfil() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTPerfil.getModel();
        jTPerfil.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTPerfil.getModel();
        modelo.setNumRows(0);

        PerfilDAO pdao = new PerfilDAO();

        for (Perfil p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getIdPerfil(),
                p.getNome(),
                p.getDescricao()
                

            });

        }

    }
    
    public void readJTableForPerfil(String perfil) {
        DefaultTableModel modelo = (DefaultTableModel) jTPerfil.getModel();
        modelo.setNumRows(0);

        PerfilDAO pdao = new PerfilDAO();

        for (Perfil p : pdao.readForNome(perfil)) {

            modelo.addRow(new Object[]{
                p.getIdPerfil(),
                p.getNome(),
                p.getDescricao()
                

            });

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

        jLabel1 = new javax.swing.JLabel();
        jlbNomeP = new javax.swing.JLabel();
        jblDescricao = new javax.swing.JLabel();
        txtNomep = new javax.swing.JTextField();
        txtDescricaop = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPerfil = new javax.swing.JTable();
        jlbBusca = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        butBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PERFIL");

        jlbNomeP.setText("Nome");

        jblDescricao.setText("Descrição");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jTPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPerfil", "Nome", "Descricao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPerfilMouseClicked(evt);
            }
        });
        jTPerfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPerfilKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTPerfil);

        jlbBusca.setText("Buscar Nome");

        butBusca.setText("Buscar");
        butBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblDescricao)
                                    .addComponent(jlbNomeP))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricaop)
                                    .addComponent(txtNomep)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbBusca)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butBusca)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBusca)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butBusca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomeP)
                    .addComponent(txtNomep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jblDescricao)
                    .addComponent(txtDescricaop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbCancelar)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
      
        
        /**CadastrarPerfil cadastrarPerfil  = new CadastrarPerfil();
        cadastrarPerfil.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cadastrarPerfil.setVisible(true);
        */
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        
        Perfil p = new Perfil();
        PerfilDAO dao = new PerfilDAO();
        p.setNome(txtNomep.getText());
        p.setDescricao(txtDescricaop.getText());
        

        dao.create(p);

        txtNomep.setText("");
        txtDescricaop.setText("");
        

        readJTable();
                
        
        
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jTPerfilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPerfilKeyReleased
       
        if (jTPerfil.getSelectedRow() != -1) {

            txtNomep.setText(jTPerfil.getValueAt(jTPerfil.getSelectedRow(), 2).toString());
            txtDescricaop.setText(jTPerfil.getValueAt(jTPerfil.getSelectedRow(), 2).toString());
            

        }
        
        
    }//GEN-LAST:event_jTPerfilKeyReleased

    private void jTPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPerfilMouseClicked
        
        if (jTPerfil.getSelectedRow() != -1) {

            txtNomep.setText(jTPerfil.getValueAt(jTPerfil.getSelectedRow(), 1).toString());
            txtDescricaop.setText(jTPerfil.getValueAt(jTPerfil.getSelectedRow(), 2).toString());


        }
        
        
        
    }//GEN-LAST:event_jTPerfilMouseClicked

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        
        if (jTPerfil.getSelectedRow() != -1) {

            Perfil p = new Perfil();
            PerfilDAO dao = new PerfilDAO();
            p.setNome(txtNomep.getText());
            p.setDescricao(txtDescricaop.getText());
            p.setIdPerfil((int)jTPerfil.getValueAt(jTPerfil.getSelectedRow(), 0));
           
            dao.update(p);

            txtNomep.setText("");
            txtDescricaop.setText("");
           

            readJTable();

        }
        
        
        
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       
         if (jTPerfil.getSelectedRow() != -1) {

            Perfil p = new Perfil();
            PerfilDAO dao = new PerfilDAO();

            p.setIdPerfil((int) jTPerfil.getValueAt(jTPerfil.getSelectedRow(), 0));
            
            dao.delete(p);

            txtNomep.setText("");
            txtDescricaop.setText("");
            
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para deletar.");
        }
        
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void butBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscaActionPerformed
        
        
        readJTableForPerfil(txtBusca.getText());
        
        
    }//GEN-LAST:event_butBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPerfil;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel jblDescricao;
    private javax.swing.JLabel jlbBusca;
    private javax.swing.JLabel jlbNomeP;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtDescricaop;
    private javax.swing.JTextField txtNomep;
    // End of variables declaration//GEN-END:variables
}
