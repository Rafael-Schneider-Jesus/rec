/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RsProduto;
import dao.ProdutoDAO;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import tools.Util;
import viewPesquisa.JDlgClienteP;

/**
 *
 * @author u08649973108
 */
public class JDlgProduto extends javax.swing.JPanel {
       boolean incluindo;

    /**
     * Creates new form jDlgProduto
     */
    JDlgProduto jDlgProduto;
    public JDlgProduto() {
        initComponents();
        jDlgProduto = new JDlgProduto();
       
    }


   JDlgProduto(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private JDlgProduto(Frame parent, boolean modal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public RsProduto viewBean() {
        RsProduto produto = new RsProduto();
        
        produto.setRsIdProduto(Util.strInt(jtxtCodigo.getText()));
        produto.setRsSabor(jtxtsabor.getText() );
        produto.setRsCopoOuCasquinha(jCbocopo.getSelectedIndex());
        produto.setRsTamanho(jCbotamanho.getSelectedIndex());
        
     
        
        return produto;
    };
    
     public void beanView(RsProduto Produto) {
        jtxtCodigo.setText( Util.intStr(Produto.getRsIdProduto()) ); // AQUI
        jtxtsabor.setText(Produto.getRsSabor());
        jCbocopo.setSelectedIndex(Produto.getRsCopoOuCasquinha());
        jCbotamanho.setSelectedIndex(Produto.getRsTamanho());
     
    };
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCbocopo = new javax.swing.JComboBox<>();
        jCbotamanho = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtsabor = new javax.swing.JTextField();
        jbtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnpesquisar = new javax.swing.JButton();
        jBtnComfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();

        jLabel1.setText("codigo");

        jLabel3.setText("copo ou casquinha");

        jLabel4.setText("tamanho");

        jCbocopo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Copo", "casquinha" }));
        jCbocopo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbocopoActionPerformed(evt);
            }
        });

        jCbotamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "G", "P" }));

        jLabel5.setText("sabor");

        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });

        jtxtsabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsaborActionPerformed(evt);
            }
        });

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnpesquisar.setText("pesquisar");
        jBtnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnpesquisarActionPerformed(evt);
            }
        });

        jBtnComfirmar.setText("comfimar");
        jBtnComfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnIncluir.setText("incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnComfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnpesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtCodigo)
                            .addComponent(jCbocopo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtsabor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jCbotamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbocopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbotamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExcluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnComfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnIncluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jtxtsaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsaborActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
                Util.habilitar(true, jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho,  jBtnCancelar, jBtnComfirmar);
         
         Util.habilitar(false, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
         
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        // TODO add your handling code here:
               if ((Util.perguntar("Deseja excluir o registro?") == true)){
            RsProduto produto = viewBean();
                   ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.delete(produto);
            Util.msg("Exclusão realizada com sucesso");
        } else {
            Util.msg("Exclusão cancelada com sucesso");
        }      
        Util.limp(jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho);
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jBtnComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComfirmarActionPerformed
        // TODO add your handling code here:
                if (incluindo == true) {
                RsProduto produto = viewBean();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.insert(produto);
        }else{
           RsProduto produto = viewBean(); 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(produto);
        }
        
         Util.habilitar(false, jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho, jBtnCancelar, jBtnComfirmar);
             
         Util.habilitar(true, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
         
        Util.limp(jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho);
    }//GEN-LAST:event_jBtnComfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
            Util.habilitar(false, jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho,  jBtnCancelar, jBtnComfirmar);
       
        Util.habilitar(false, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
       
         Util.limp(jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho);
        Util.msg("Operação Cancelada");

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
              Util.habilitar(true, jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho,  jBtnCancelar, jBtnComfirmar);
        
        Util.habilitar(false, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
        
           Util.limp(jtxtCodigo, jCbocopo, jtxtsabor, jCbotamanho);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpesquisarActionPerformed
       // viewPesquisa.JDlgProduto.setVisible(true);
        JDlgClienteP jDlgClienteP = new JDlgClienteP();
        jDlgClienteP.setVisible(true);
    }//GEN-LAST:event_jBtnpesquisarActionPerformed

    private void jCbocopoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbocopoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbocopoActionPerformed
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
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            JDlgProduto dialog = new JDlgProduto(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnComfirmar;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnpesquisar;
    private javax.swing.JComboBox<String> jCbocopo;
    private javax.swing.JComboBox<String> jCbotamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtsabor;
    // End of variables declaration//GEN-END:variables

    private void addWindowListener(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
