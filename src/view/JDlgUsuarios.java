/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RsUsuarios;
import dao.UsuariosDAO;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import viewPesquisa.JDlgUsuariosPesquisar;


/**
 *
 * @author Usuario VCP
 */
public class JDlgUsuarios extends javax.swing.JDialog {

    boolean incluindo;
    MaskFormatter mascaraCpf;
    MaskFormatter mascaraData;

    /**
     * Creates new form Je
     */
    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Usuarios");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha,jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
        
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    
    public RsUsuarios viewBean() {
        RsUsuarios usuarios = new RsUsuarios(); // criou o bean
        
        usuarios.setRsIdusuarios(Util.strInt(jTxtCodigo.getText()));
        usuarios.setRsApelido(jTxtApelido.getText());
   //     usuarios.setRsAtivo(jChbAtivo.isSelected() == true ? "Sim" : "Não");
        usuarios.setRsCpf(jFmtCpf.getText());
        usuarios.setRsNasc(Util.strDate(jFmtData.getText()));
        usuarios.setRsNivel(jCboNivel.getSelectedIndex());
        usuarios.setRsNome(jTxtNome.getText());
        usuarios.setRsSenha(jPwfSenha.getText());
        return usuarios;
    };
    
     public void beanView(RsUsuarios usuarios) {
        jTxtCodigo.setText(Util.intStr(usuarios.getRsIdusuarios()));
        jTxtApelido.setText(usuarios.getRsApelido());
        jTxtNome.setText(usuarios.getRsNome());
        jFmtCpf.setText(usuarios.getRsCpf());
        jFmtData.setText(Util.dateStr(usuarios.getRsNasc()));
        jPwfSenha.setText(usuarios.getRsSenha());
        jCboNivel.setSelectedIndex(usuarios.getRsNivel());
//       if (usuarios.getRsAtivo().equals("Sim")) {
//            jChbAtivo.setSelected(true);
//       }else{jChbAtivo.setSelected(false);
//       }   
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExlcuir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jPwfSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCboNivel = new javax.swing.JComboBox<>();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jChbAtivo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTxtApelido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExlcuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jBtnExlcuir.setText("Excluir");
        jBtnExlcuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExlcuirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmado.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jLabel6.setText("Data de Nascimento");

        jLabel7.setText("Senha");

        jPwfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwfSenhaActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Convidado", "Financeiro" }));
        jCboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboNivelActionPerformed(evt);
            }
        });

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel8.setText("Nível");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jChbAtivo.setText("Ativo");

        jLabel2.setText("Nome");

        jTxtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApelidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apelido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPwfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jTxtNome)))
                            .addComponent(jChbAtivo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jBtnExlcuir)
                                .addGap(14, 14, 14)
                                .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChbAtivo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExlcuir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
      Util.habilitar(false, jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha, jBtnCancelar, jBtnConfirmar);
      
      Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
      
        Util.limp(jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha);
        Util.msg("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgUsuariosPesquisar jDlgUsuariosPesquisar = new JDlgUsuariosPesquisar(null, true);
        jDlgUsuariosPesquisar.setTelaAnterior(this);        
        jDlgUsuariosPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha, jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
        
        Util.limp(jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha, jBtnCancelar, jBtnConfirmar);
        
        Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
        
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExlcuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExlcuirActionPerformed
        // TODO add your handling code here:
        if ((Util.perguntar("Deseja excluir o registro?") == true)){
           RsUsuarios usuarios = viewBean();
            UsuariosDAO usuariosDAO = new UsuariosDAO();
            usuariosDAO.delete(usuarios);
            Util.msg("Exclusão realizada com sucesso");
        } else {
            Util.msg("Exclusão cancelada com Sucesso");
        }      
        Util.limp(jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha);
    }//GEN-LAST:event_jBtnExlcuirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
       if (incluindo == true) {
              RsUsuarios usuarios = viewBean();  
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.insert(usuarios);
             Util.habilitar(false, jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha, jBtnCancelar, jBtnConfirmar);
             
             Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
        }else{
            RsUsuarios usuarios = viewBean();  
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.update(usuarios);
         Util.habilitar(true, jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha, jBtnCancelar, jBtnConfirmar);
         
         Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
         
         Util.limp(jTxtApelido, jTxtCodigo, jTxtNome, jChbAtivo, jCboNivel, 
                jFmtCpf, jFmtData, jPwfSenha);
       }
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jPwfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwfSenhaActionPerformed

    private void jCboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboNivelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCboNivelActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApelidoActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExlcuir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboNivel;
    private javax.swing.JCheckBox jChbAtivo;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPwfSenha;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
