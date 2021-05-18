/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.ConnectionFactory;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author IdeaSofist
 */
public class ViewOs extends javax.swing.JFrame {

    /**
     * Creates new form TelaOs
     */
    // Variáveis útils
    NumberFormat formatarDouble = new DecimalFormat("0.00");
    String tipoPagamento = "";

    String idCliente = null;
    String tipo_pagamento = null;
    Double valorEntrada = 0.0;

    String dataHoje = null;
    
    // variável para justificar se está recebendo entrada para validar forma de pagamento
    String receberEntrada = "nao";
    
    // variável para justificar valor do serviço
    String informavalor = "nao";
    
    
    public ViewOs() {
        initComponents();
         setaricon();
        pegarDataAtual();
        listarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btCancelar = new javax.swing.JPanel();
        btSalvar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        tAparelho = new javax.swing.JTextField();
        tTecnico = new javax.swing.JTextField();
        tServico = new javax.swing.JTextField();
        tDefeito = new javax.swing.JTextField();
        tPesquisar = new javax.swing.JTextField();
        tNomeCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tObservacoes = new javax.swing.JTextArea();
        cbSituacao = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        bValor = new javax.swing.JPanel();
        tValor = new javax.swing.JTextField();
        tTotalPagar = new javax.swing.JTextField();
        tEntrada = new javax.swing.JTextField();
        rCartao = new javax.swing.JRadioButton();
        rDinheiro = new javax.swing.JRadioButton();
        btEntrada = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c = new javax.swing.JLabel();

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orçamento", "Ordem de Serviço" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.setOpaque(false);
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btCancelarLayout = new javax.swing.GroupLayout(btCancelar);
        btCancelar.setLayout(btCancelarLayout);
        btCancelarLayout.setHorizontalGroup(
            btCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        btCancelarLayout.setVerticalGroup(
            btCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 130, 40));

        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setOpaque(false);
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btSalvarLayout = new javax.swing.GroupLayout(btSalvar);
        btSalvar.setLayout(btSalvarLayout);
        btSalvarLayout.setHorizontalGroup(
            btSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        btSalvarLayout.setVerticalGroup(
            btSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 120, 40));

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tbClientes.setOpaque(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 120));

        tAparelho.setBackground(new java.awt.Color(47, 47, 73));
        tAparelho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tAparelho.setForeground(new java.awt.Color(255, 255, 255));
        tAparelho.setBorder(null);
        tAparelho.setMinimumSize(new java.awt.Dimension(0, 23));
        tAparelho.setOpaque(false);
        getContentPane().add(tAparelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 255, 370, 26));

        tTecnico.setBackground(new java.awt.Color(47, 47, 73));
        tTecnico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tTecnico.setForeground(new java.awt.Color(255, 255, 255));
        tTecnico.setBorder(null);
        tTecnico.setMinimumSize(new java.awt.Dimension(0, 23));
        tTecnico.setOpaque(false);
        getContentPane().add(tTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 370, 23));

        tServico.setBackground(new java.awt.Color(47, 47, 73));
        tServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tServico.setForeground(new java.awt.Color(255, 255, 255));
        tServico.setBorder(null);
        tServico.setMinimumSize(new java.awt.Dimension(0, 23));
        tServico.setOpaque(false);
        getContentPane().add(tServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 295, 370, 26));

        tDefeito.setBackground(new java.awt.Color(47, 47, 73));
        tDefeito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tDefeito.setForeground(new java.awt.Color(255, 255, 255));
        tDefeito.setBorder(null);
        tDefeito.setMinimumSize(new java.awt.Dimension(0, 23));
        tDefeito.setOpaque(false);
        getContentPane().add(tDefeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 220, 24));

        tPesquisar.setBackground(new java.awt.Color(73, 73, 96));
        tPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        tPesquisar.setToolTipText("Pesquise por ID ou Nome");
        tPesquisar.setBorder(null);
        tPesquisar.setMinimumSize(new java.awt.Dimension(0, 23));
        tPesquisar.setOpaque(false);
        tPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(tPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 24));

        tNomeCliente.setEditable(false);
        tNomeCliente.setBackground(new java.awt.Color(47, 47, 73));
        tNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        tNomeCliente.setBorder(null);
        tNomeCliente.setMinimumSize(new java.awt.Dimension(0, 23));
        tNomeCliente.setOpaque(false);
        getContentPane().add(tNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 216, 370, 24));

        tObservacoes.setColumns(20);
        tObservacoes.setLineWrap(true);
        tObservacoes.setRows(3);
        jScrollPane3.setViewportView(tObservacoes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 200, 80));

        cbSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Em Orçamento", "Orçamento Aprovado", "Orçamento Reprovado", "Entregue", "Abandonado pelo Cliente", "Aguardando Peças", "Em Serviço", "Serviço Pronto", "Concluído ( Entregue )" }));
        cbSituacao.setBorder(null);
        getContentPane().add(cbSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 200, 30));

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orçamento", "Ordem de Serviço" }));
        cbTipo.setBorder(null);
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 200, 30));

        bValor.setOpaque(false);
        bValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bValorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bValorLayout = new javax.swing.GroupLayout(bValor);
        bValor.setLayout(bValorLayout);
        bValorLayout.setHorizontalGroup(
            bValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        bValorLayout.setVerticalGroup(
            bValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 140, 40));

        tValor.setEditable(false);
        tValor.setBackground(new java.awt.Color(47, 47, 73));
        tValor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tValor.setForeground(new java.awt.Color(255, 255, 255));
        tValor.setText(" 00,00");
        tValor.setBorder(null);
        tValor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tValor.setOpaque(false);
        tValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tValorMouseClicked(evt);
            }
        });
        getContentPane().add(tValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 35));

        tTotalPagar.setEditable(false);
        tTotalPagar.setBackground(new java.awt.Color(47, 47, 73));
        tTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        tTotalPagar.setText(" 00,00");
        tTotalPagar.setBorder(null);
        tTotalPagar.setOpaque(false);
        getContentPane().add(tTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 100, 33));

        tEntrada.setEditable(false);
        tEntrada.setBackground(new java.awt.Color(47, 47, 73));
        tEntrada.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tEntrada.setForeground(new java.awt.Color(255, 255, 255));
        tEntrada.setText(" 00,00");
        tEntrada.setBorder(null);
        tEntrada.setOpaque(false);
        getContentPane().add(tEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 100, 28));

        buttonGroup1.add(rCartao);
        rCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rCartaoMouseClicked(evt);
            }
        });
        rCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCartaoActionPerformed(evt);
            }
        });
        getContentPane().add(rCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 20, -1));

        buttonGroup1.add(rDinheiro);
        rDinheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rDinheiroMouseClicked(evt);
            }
        });
        rDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDinheiroActionPerformed(evt);
            }
        });
        getContentPane().add(rDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 20, -1));

        btEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrada.setOpaque(false);
        btEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntradaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btEntradaLayout = new javax.swing.GroupLayout(btEntrada);
        btEntrada.setLayout(btEntradaLayout);
        btEntradaLayout.setHorizontalGroup(
            btEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        btEntradaLayout.setVerticalGroup(
            btEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(btEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Entrada");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 120, 28));

        jPanel1.setBackground(new java.awt.Color(1, 160, 63));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 90, 30));

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaOs.png"))); // NOI18N
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void tPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisarKeyReleased
        // TODO add your handling code here:
        pesquisarCliente();
    }//GEN-LAST:event_tPesquisarKeyReleased

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        // TODO add your handling code here:
        setar_campos();
    }//GEN-LAST:event_tbClientesMouseClicked

    private void btEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntradaMouseClicked
        // TODO add your handling code here:
        adicionarEntrada();
    }//GEN-LAST:event_btEntradaMouseClicked

    private void tValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tValorMouseClicked
        // TODO add your handling code here:
        if (cbTipo.getSelectedItem() == "Ordem de Serviço") {
            adicionarValor();
        } else {

        }
    }//GEN-LAST:event_tValorMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        // TODO add your handling code here:
         if (idCliente == null) {
            JOptionPane.showMessageDialog(this, "Selecione um Cliente!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if (tAparelho.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o Aparelho!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if (tDefeito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o Defeito!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if (cbTipo.getSelectedItem() == "Ordem de Serviço" && tServico.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o Serviço a ser feito ou altere o tipo para Orçamento!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if (cbSituacao.getSelectedItem() == "--Selecione--") {
            JOptionPane.showMessageDialog(this, "Informe a Situação!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if (receberEntrada == "sim" && tipo_pagamento == null) {           
            JOptionPane.showMessageDialog(this, "Informe a forma de pagamento de entrada R$!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if ((cbTipo.getSelectedItem() == "Ordem de Serviço") && (informavalor == "nao")) {
            JOptionPane.showMessageDialog(this, "Informe o valor do serviço!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else{
           // JOptionPane.showMessageDialog(this, "Salvo!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
             salvar();
        }
    }//GEN-LAST:event_btSalvarMouseClicked

    private void bValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bValorMouseClicked
        // TODO add your handling code here:
         if (cbTipo.getSelectedItem() == "Ordem de Serviço") {
            adicionarValor();
             informavalor = "sim";
        } else {
             JOptionPane.showMessageDialog(this, "O valor será informado após orçamento ou mude o tipo para (Ordem de serviço)!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bValorMouseClicked

    private void rDinheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rDinheiroMouseClicked
        // TODO add your handling code here:
        tipo_pagamento = "Dinheiro";
    }//GEN-LAST:event_rDinheiroMouseClicked

    private void rCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rCartaoMouseClicked
        // TODO add your handling code here:
        tipo_pagamento = "Cartão";
    }//GEN-LAST:event_rCartaoMouseClicked

    private void rDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDinheiroActionPerformed
        // TODO add your handling code here:
        tipo_pagamento = "Dinheiro";
    }//GEN-LAST:event_rDinheiroActionPerformed

    private void rCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCartaoActionPerformed
        // TODO add your handling code here:
        tipo_pagamento = "Cartão";
    }//GEN-LAST:event_rCartaoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bValor;
    private javax.swing.JPanel btCancelar;
    private javax.swing.JPanel btEntrada;
    private javax.swing.JPanel btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel c;
    private javax.swing.JComboBox<String> cbSituacao;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rCartao;
    private javax.swing.JRadioButton rDinheiro;
    private javax.swing.JTextField tAparelho;
    private javax.swing.JTextField tDefeito;
    private javax.swing.JTextField tEntrada;
    private javax.swing.JTextField tNomeCliente;
    private javax.swing.JTextArea tObservacoes;
    private javax.swing.JTextField tPesquisar;
    private javax.swing.JTextField tServico;
    private javax.swing.JTextField tTecnico;
    private javax.swing.JTextField tTotalPagar;
    private javax.swing.JTextField tValor;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables

// INÍCIO Método para listar Clientes na tabela
    private void listarClientes() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT "
                + "idclientes ID, "
                + "nome Nome, "
                + "nascimento  Aniversário , "
                + "endereco Endereço, "
                + "bairro Bairro, "
                + "fone Fone ,"
                + "email Email "
                + "  FROM clientes ORDER BY nome ";
        try {
            stmt = con.prepareStatement(sql);
            rs = rs = stmt.executeQuery();

            tbClientes.setModel(DbUtils.resultSetToTableModel(rs));

            tbClientes.setDefaultEditor(Object.class, null);

            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(5); // ID
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(80); // Nome
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(30); // Nascimento
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(100); // Endereço
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(50); // Bairro
            tbClientes.getColumnModel().getColumn(5).setPreferredWidth(70); // Fone
            tbClientes.getColumnModel().getColumn(6).setPreferredWidth(100); // Email

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    // FIM Método para listar Clientes na tabela
    
    //INÍCIO Método para pegar a data atual do sistema
    private void pegarDataAtual() {

        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd");
        dataHoje = formatarDate.format(data);

    }
    //FIM Método para pegar a data atual do sistema
    
    
    
    //INÍCIO Método para pesquisar Cliente por Id ou Nome
    private void pesquisarCliente() {
        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT "
                + "idclientes ID, "
                + "nome Nome, "
                + "nascimento  Aniversário , "
                + "endereco Endereço, "
                + "bairro Bairro, "
                + "fone Fone ,"
                + "email Email "
                + " FROM clientes WHERE nome    LIKE ? OR idclientes LIKE ? ";

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, tPesquisar.getText() + "%");
            stmt.setString(2, tPesquisar.getText() + "%");
            rs = stmt.executeQuery();

            // Usar a biblioteca *rs2xml* para listar dados
            tbClientes.setModel(DbUtils.resultSetToTableModel(rs));

            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(5); // ID
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(80); // Nome
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(30); // Nascimento
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(100); // Endereço
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(50); // Bairro
            tbClientes.getColumnModel().getColumn(5).setPreferredWidth(70); // Fone
            tbClientes.getColumnModel().getColumn(6).setPreferredWidth(100); // Email

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    //FIM Método para pesquisar Cliente por Id ou Nome
    
    
    // INÍCIO Método para setar id de cliente e nome  
    public void setar_campos() {
        int setar = tbClientes.getSelectedRow();
        idCliente = tbClientes.getModel().getValueAt(setar, 0).toString();
        tNomeCliente.setText(tbClientes.getModel().getValueAt(setar, 1).toString());

    }
    // FIM Método para setar id de usuário para alterar ou excluir
    
    
    
    
    
    //INÍCIO Método para adicionar entrada 
    private void adicionarEntrada() {

        String p = null;
        Double entrada = 0.0;
        Double valor = 0.0;
        Double total = 0.0;
        p = JOptionPane.showInputDialog("Digite o valor de entrada:");
        if (p.isEmpty()) {

        } else {
            entrada = Double.parseDouble(p.toString().replace(",", "."));
            receberEntrada = "sim";

        }
        tEntrada.setText(String.valueOf(formatarDouble.format(entrada)).replace(".", ","));

        total = Double.parseDouble(tValor.getText().replace(",", ".")) - Double.parseDouble(tEntrada.getText().replace(",", "."));

        tTotalPagar.setText(String.valueOf(formatarDouble.format(total)).replace(".", ","));
        //tEntrada.setEnabled(true);
        
        
        //c.setEnabled(true);
        //rCartao.setEnabled(true);
        
        //c.setSelected(false);
        //rCartao.setSelected(false);
        

    }
    //FIM Método para adicionar entrada 
    
    
    
    //INÍCIO Método para adicionar o valor do serviço
    private void adicionarValor() {
        String entrada = null;
        Double valor = 0.0;
        Double total = 0.0;
        entrada = JOptionPane.showInputDialog("Digite o valor do Serviço:");

        if (entrada != null) {
            valor = Double.parseDouble(entrada.toString().replace(",", "."));
            tValor.setText(String.valueOf(formatarDouble.format(valor)).replace(".", ","));
            tTotalPagar.setText(String.valueOf(formatarDouble.format(valor)).replace(".", ","));
        } else {

        }
    }
    // FIM Método para adicionar o valor do serviço
    
    
    // INÍCIO Método para salvar Ordem de serviço ou Orçamento
    private void salvar() {
        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT  INTO ordem_servicos "
                + "( aparelho, "
                + "defeito,   "
                + "servico, "
                + "tecnico  ,"
                + "observacao , "
                + "situacao , "
                + "tipo , "
                + "valor_total , "
                + "valor_entrada , "
                + "valor_pagar , "
                + "data_solicitado ,"
                + "clientes_idclientes ) "
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, tAparelho.getText());
            stmt.setString(2, tDefeito.getText());
            stmt.setString(3, tServico.getText());
            stmt.setString(4, tTecnico.getText());
            stmt.setString(5, tObservacoes.getText());
            stmt.setString(6, cbSituacao.getSelectedItem().toString());
            stmt.setString(7, cbTipo.getSelectedItem().toString());
            stmt.setString(8, tValor.getText().replace(",", "."));
            stmt.setString(9, tEntrada.getText().replace(",", "."));
            stmt.setString(10, tTotalPagar.getText().replace(",", "."));
            stmt.setString(11, dataHoje);
            stmt.setString(12, idCliente);

            
             
            
            
            // A linha abaixo atualiza os dados     
            int adicionado = stmt.executeUpdate();
            if (adicionado > 0) {
             
                
                JOptionPane.showMessageDialog(null, cbTipo.getSelectedItem().toString() + " Salvo com Sucesso!");
                
                imprimir_ao_registrar_os();
                
                 

                // Válidar se o cliente deu entrada para registrar no caixa
                if ( receberEntrada=="nao") {
 
                } else {
                    valorEntrada = Double.parseDouble(tEntrada.getText().toString().replace(",", "."));
                    registrarEntradaCaixa();
                }
                limparFormulario();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // FIM Método para salvar Ordem de serviço ou Orçamento
    
    
    // INÍCIO Método para limpar campos
    private void limparFormulario() {

        idCliente = null;

        tNomeCliente.setText(null);
        tAparelho.setText(null);
        tDefeito.setText(null);
        tServico.setText(null);
        cbTipo.setSelectedItem("Orçamento");
        cbSituacao.setSelectedItem("--Selecione--");
        //tValor.setEnabled(false);
       // tTotalPagar.setEnabled(false);

        tValor.setText("00,00");
        tEntrada.setText("00,00");
        tTotalPagar.setText("00,00");

        tTecnico.setText(null);
        tObservacoes.setText(null);
         
    }
    //FIM Método para limpar campos
    
    // INÍCIO Método para registrar o movimento do caixa ao adicionar entrada
    private void registrarEntradaCaixa() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT  INTO caixa "
                + "( descricao, "
                + "  valor , "
                + "tipo_movimento , "
                + "tipo_pagamento , "
                + "data_movimento)  "
                + " VALUES (?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, "Entrada de serviço (" + tServico.getText() + ") de: " + tNomeCliente.getText());
            stmt.setString(2, (String.valueOf(formatarDouble.format(valorEntrada)).replace(",", ".")));
            stmt.setString(3, "Entrada");
            stmt.setString(4, tipo_pagamento);
            stmt.setString(5, dataHoje);

            // A linha abaixo valida os campos obgtorios
            int adicionado = stmt.executeUpdate();
            if (adicionado > 0) {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // FIM Método para registrar o movimento do caixa ao adicionar entrada
    
    
    // INÍCIO Método para imprimir os registrada
    private void imprimir_ao_registrar_os() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        final ViewLoading carregando = new ViewLoading();

        carregando.setVisible(true);
        
        Thread t = new Thread(){
            
            public void run() {

                try {
                    // Usando a classe JasperPrint para preparar a impressão
                    JasperPrint print = JasperFillManager.fillReport("src/util/imprimir_ao_registrar_os.jasper", null, con);
                    carregando.dispose();
                    JasperViewer.viewReport(print, false);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    carregando.dispose();
                } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
            }
         } ;
        
            t.start();    
        }
     // FIM Método para imprimir os registrada
    
    // INÍCIO Método para setar icon do jFrame
    private void setaricon() {

        //  ImageIcon frameIcon = new ImageIcon("icon.png");
        //this.setIconImage(frameIcon.getImage());
        URL url = this.getClass().getResource("icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    // FIM Método para setar icon do jFrame

}