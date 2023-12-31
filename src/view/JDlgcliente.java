/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.RsCliente;
import dao.ClienteDAO;
import tools.Util;

/**
 *
 * @author dell
 */
public class JDlgcliente extends javax.swing.JDialog {
boolean incluindo;
    /**
     * Creates new form JDlgcliente
     */
    public JDlgcliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
            Util.habilitar(false, jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero , jBtnCancelar, jBtnComfirmar, jTxtendereco);
            setTitle("Cliente");
            setLocationRelativeTo(null);
    }

    JDlgcliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public RsCliente viewBean() {
        RsCliente cliente = new RsCliente(); // criou o bean
        
        cliente.setRsIdcliente(Util.strInt(jTxtId.getText()));
        cliente.setRsSobrenome(jTxtSobre.getText());
        cliente.setRsCep(jTxtCep.getText());
        cliente.setRsDataCadastro(Util.strDate(jFmtCadastro.getText()));
        cliente.setRsDataNascimento(Util.strDate(jFmtnasc.getText()));
        cliente.setRsTelefone((jFmtTelefone.getText()));
        
        cliente.setRsGenero(jCboGenero.getSelectedIndex());
        cliente.setRsEstadoCivil(jCboEstado.getSelectedIndex());
        
        cliente.setRsNome(jTxtNome.getText());
        cliente.setRsEmail(jTxtEmail.getText());
        cliente.setRsCidade(jTxtCidade.getText());
        cliente.setRsProfissao(jTxtprof.getText());
        cliente.setRsEndereco(jTxtendereco.getText());
        cliente.setRsRendaAnual(Util.strInt(jTxtRenda.getText()));
        cliente.setRsNumeroDependentes((jTxtnumero.getText()));
        return cliente;
    };
    
     public void beanView(RsCliente cliente) {
        jTxtId.setText(Util.intStr(cliente.getRsIdcliente()));
        jTxtSobre.setText(cliente.getRsSobrenome());
        jTxtendereco.setText(cliente.getRsEndereco());
        jTxtCep.setText(cliente.getRsCep());
        jFmtCadastro.setText(Util.dateStr(cliente.getRsDataCadastro()));
        jFmtnasc.setText(Util.dateStr(cliente.getRsDataNascimento()));
        jFmtTelefone.setText((cliente.getRsTelefone()));
        jCboEstado.setSelectedIndex(cliente.getRsEstadoCivil());
        jCboGenero.setSelectedIndex(cliente.getRsGenero());
        
        jTxtNome.setText(cliente.getRsNome());
        jTxtEmail.setText(cliente.getRsEmail());
        jTxtCidade.setText(cliente.getRsCidade());
        jTxtprof.setText(cliente.getRsProfissao());
        jTxtRenda.setText(Util.intStr(cliente.getRsRendaAnual()));
        jTxtnumero.setText(cliente.getRsNumeroDependentes());
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFmtTelefone = new javax.swing.JFormattedTextField();
        jFmtnasc = new javax.swing.JFormattedTextField();
        jFmtCadastro = new javax.swing.JFormattedTextField();
        jTxtId = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jTxtSobre = new javax.swing.JTextField();
        jTxtCep = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtendereco = new javax.swing.JTextField();
        jCboGenero = new javax.swing.JComboBox<>();
        jTxtRenda = new javax.swing.JTextField();
        jCboEstado = new javax.swing.JComboBox<>();
        jTxtprof = new javax.swing.JTextField();
        jTxtnumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBtnAlterar = new javax.swing.JButton();
        jBtnpesquisar = new javax.swing.JButton();
        jBtnComfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSobreActionPerformed(evt);
            }
        });

        jCboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jCboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "solteiro", "Casado" }));

        jLabel1.setText("codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("Sobrenome");

        jLabel4.setText("Email");

        jLabel5.setText("Telefone");

        jLabel6.setText("endereco");

        jLabel7.setText("renda_anual");

        jLabel8.setText("cidade");

        jLabel9.setText("cep");

        jLabel10.setText("profissao");

        jLabel11.setText("numero_dependentes");

        jLabel13.setText("genero");

        jLabel14.setText("estado_civil");

        jLabel16.setText("data nascimento");

        jLabel17.setText("data cadastro ");

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

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCboGenero, 0, 1, Short.MAX_VALUE))
                        .addGap(300, 300, 300))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtnumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(jCboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtSobre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTxtprof))))))
                        .addGap(313, 313, 313))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17)
                                    .addComponent(jFmtCadastro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTxtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnComfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnpesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExcluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnpesquisar)
                    .addComponent(jBtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnComfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnIncluir))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSobreActionPerformed

    private void jBtnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpesquisarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jBtnpesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
               Util.habilitar(false,jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero , jBtnCancelar, jBtnComfirmar, jTxtendereco);
       
       Util.habilitar(true, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
       
        Util.limp(jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero);
        Util.msg("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
                Util.habilitar(true, jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero , jBtnCancelar, jBtnComfirmar, jTxtendereco);
        
        Util.habilitar(false, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
        
    Util.limp(jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero, jTxtendereco);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
                 Util.habilitar(true, jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero , jBtnCancelar, jBtnComfirmar, jTxtendereco);
         
         Util.habilitar(false, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
         
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        // TODO add your handling code here:
               if ((Util.perguntar("Deseja excluir o registro?") == true)){
            RsCliente cliente = viewBean();
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.delete(cliente);
            Util.msg("Exclusão realizada com sucesso");
        } else {
            Util.msg("Exclusão cancelada com sucesso");
        }      
    Util.limp(jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero, jTxtendereco);
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jBtnComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComfirmarActionPerformed
        // TODO add your handling code here:
                if (incluindo == true) {
             RsCliente cliente = viewBean();
            ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.insert(cliente);
        }else{
             RsCliente cliente = viewBean();
            ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(cliente);
        }
           
        
         Util.habilitar(false, jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero , jBtnCancelar, jBtnComfirmar, jTxtendereco);
             
         Util.habilitar(true, jBtnAlterar, jbtnExcluir, jBtnIncluir, jBtnpesquisar);
         
     Util.limp(jTxtId, jTxtSobre,jTxtCep,jFmtCadastro ,jFmtnasc,jFmtTelefone,jCboEstado ,jCboGenero ,jTxtNome,
             jTxtEmail, jTxtCidade, jTxtprof, jTxtRenda ,jTxtnumero, jTxtendereco);
    }//GEN-LAST:event_jBtnComfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgcliente dialog = new JDlgcliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnComfirmar;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnpesquisar;
    private javax.swing.JComboBox<String> jCboEstado;
    private javax.swing.JComboBox<String> jCboGenero;
    private javax.swing.JFormattedTextField jFmtCadastro;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JFormattedTextField jFmtnasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtRenda;
    private javax.swing.JTextField jTxtSobre;
    private javax.swing.JTextField jTxtendereco;
    private javax.swing.JTextField jTxtnumero;
    private javax.swing.JTextField jTxtprof;
    private javax.swing.JButton jbtnExcluir;
    // End of variables declaration//GEN-END:variables
}
