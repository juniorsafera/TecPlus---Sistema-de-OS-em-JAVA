/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.ConnectionFactory;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author IdeaSofist
 */
public class Relatorio_caixa extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio_caixa
     */
    
    /*
    *
    * Variáveis uteis
    *
     */
    NumberFormat formatarDouble = new DecimalFormat("0.00");
    
    
    
    public Relatorio_caixa() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEntrada = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSaida = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        tSaida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tDinheiro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tCartao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tValorTotalCaixa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jFim = new com.toedter.calendar.JDateChooser();
        bVerificar = new javax.swing.JButton();
        jInicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimentos no Caixa"));

        tbEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbEntrada);

        tbSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbSaida);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL SAÍDA R$"));

        tSaida.setEditable(false);
        tSaida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tSaida.setText("00,00");
        tSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSaidaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Saída R$:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL ENTRADA R$"));

        tDinheiro.setEditable(false);
        tDinheiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tDinheiro.setText("00,00");
        tDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDinheiroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Dinheiro R$:");

        tCartao.setEditable(false);
        tCartao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tCartao.setText("00,00");
        tCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCartaoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Cartão R$:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(tCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL CAIXA  R$"));

        tValorTotalCaixa.setEditable(false);
        tValorTotalCaixa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tValorTotalCaixa.setText("00,00");
        tValorTotalCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tValorTotalCaixaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("TOTAL R$:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tValorTotalCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tValorTotalCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione o período", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        bVerificar.setText("Gerar");
        bVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data Fim:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data Início:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFim, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bVerificar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSaidaActionPerformed

    private void tDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDinheiroActionPerformed

    private void tCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCartaoActionPerformed

    private void tValorTotalCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tValorTotalCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tValorTotalCaixaActionPerformed

    private void bVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificarActionPerformed
        // TODO add your handling code here:

        if (jInicio.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Informe a data Início do período desejado!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else if (jFim.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Informe a data Fim do período desejado!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);

        } else {

            final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {

                        // métodos
                        listarRelatorioCaixaEntrada();
                        listarRelatorioCaixaSaida();
                        totalCaixa();

                        carregando.dispose();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();

        }
    }//GEN-LAST:event_bVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio_caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio_caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVerificar;
    private com.toedter.calendar.JDateChooser jFim;
    private com.toedter.calendar.JDateChooser jInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tCartao;
    private javax.swing.JTextField tDinheiro;
    private javax.swing.JTextField tSaida;
    private javax.swing.JTextField tValorTotalCaixa;
    private javax.swing.JTable tbEntrada;
    private javax.swing.JTable tbSaida;
    // End of variables declaration//GEN-END:variables


    
    /*
    *
    * ÁREA PARA TODOS OS MÉTODOS
    *
     */
    
     // INÍCIO Método para setar icon do jFrame
    private void setaricon() {

        //  ImageIcon frameIcon = new ImageIcon("icon.png");
        //this.setIconImage(frameIcon.getImage());
        URL url = this.getClass().getResource("icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    // FIM Método para setar icon do jFrame
    
    
    //INÍCIO Método para converter a data para data em sql  
    public static String convertSql(String Data) {
        return Data.substring(6, 10) + "-" + Data.substring(3, 5) + "-" + Data.substring(0, 2);
    }
    //FIM Método para converter a data para data em sql  

    // INÍCIO Método listar relatório de entrada no caixa
    private void listarRelatorioCaixaEntrada() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT data_movimento Data , descricao Descrição , valor Valor_R$ , tipo_pagamento Pagamento , tipo_movimento Movimento FROM caixa       WHERE tipo_movimento = 'Entrada'  AND  data_movimento  BETWEEN   ?   AND    ? ORDER BY data_movimento";

        //String sql = "SELECT * FROM vendas where data_final = '2021-02-25'";
        try {
            stmt = con.prepareStatement(sql);

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            stmt.setString(1, convertSql(df.format(jInicio.getDate())));
            stmt.setString(2, convertSql(df.format(jFim.getDate())));
            //System.out.println(convertSql(df.format(jDataFim.getDate())));
            rs = stmt.executeQuery();

            listarRelatorioCaixaEntradaTotalDinheiro(); // Total calculado em dinheiro
            listarRelatorioCaixaEntradaTotalCartao();   // Total calculado em Cartão

            tbEntrada.setModel(DbUtils.resultSetToTableModel(rs));
            tbEntrada.setDefaultEditor(Object.class, null);
            //totalRelatorioCaixaEntrada();

            tbEntrada.getColumnModel().getColumn(0).setPreferredWidth(10); // Data
            tbEntrada.getColumnModel().getColumn(1).setPreferredWidth(350); // Descrição
            tbEntrada.getColumnModel().getColumn(2).setPreferredWidth(10); //Valor
            tbEntrada.getColumnModel().getColumn(3).setPreferredWidth(20); // Tipo Pagamento
            tbEntrada.getColumnModel().getColumn(4).setPreferredWidth(20); // Tipo Movimento

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    // FIM Método listar relatório de entrada no caixa

    // INÍCIO Método para calcular total entrada em dinheiro
    private void listarRelatorioCaixaEntradaTotalDinheiro() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT SUM(valor) FROM caixa  WHERE tipo_movimento = 'Entrada' AND tipo_pagamento = 'Dinheiro'  AND  data_movimento  BETWEEN   ?   AND    ?  ";

        //String sql = "SELECT * FROM vendas where data_final = '2021-02-25'";
        try {
            stmt = con.prepareStatement(sql);

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            stmt.setString(1, convertSql(df.format(jInicio.getDate())));
            stmt.setString(2, convertSql(df.format(jFim.getDate())));
            //System.out.println(convertSql(df.format(jDataFim.getDate())));
            rs = stmt.executeQuery();

            if (rs.next()) {

                Double v = 0.00;

                v = Double.parseDouble(rs.getString(1).replace(",", "."));

                tDinheiro.setText(String.valueOf(formatarDouble.format(v)).replace(".", ","));
                // valor_produto = Double.parseDouble(rs.getString(4).replace(",", "."));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    // FIM Método para calcular total entrada em dinheiro

    // INÍCIO Método para calcular total entrada em cartão
    private void listarRelatorioCaixaEntradaTotalCartao() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT SUM(valor) FROM caixa  WHERE tipo_movimento = 'Entrada' AND tipo_pagamento = 'Cartão'  AND  data_movimento  BETWEEN   ?   AND    ?  ";

        //String sql = "SELECT * FROM vendas where data_final = '2021-02-25'";
        try {
            stmt = con.prepareStatement(sql);

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            stmt.setString(1, convertSql(df.format(jInicio.getDate())));
            stmt.setString(2, convertSql(df.format(jFim.getDate())));
            //System.out.println(convertSql(df.format(jDataFim.getDate())));
            rs = stmt.executeQuery();

            if (rs.next()) {

                Double v = 0.00;

                v = Double.parseDouble(rs.getString(1).replace(",", "."));

                tCartao.setText(String.valueOf(formatarDouble.format(v)).replace(".", ","));
                // valor_produto = Double.parseDouble(rs.getString(4).replace(",", "."));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    // FIM Método para calcular total entrada em cartão

    // INÍCIO Método listar relatório de saída no caixa
    private void listarRelatorioCaixaSaida() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT data_movimento Data , descricao Descrição , valor Valor_R$ , tipo_pagamento Pagamento , tipo_movimento Movimento FROM caixa     WHERE tipo_movimento = 'Saida'   AND  data_movimento  BETWEEN   ?   AND    ? ORDER BY data_movimento";

        //String sql = "SELECT * FROM vendas where data_final = '2021-02-25'";
        try {
            stmt = con.prepareStatement(sql);

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            stmt.setString(1, convertSql(df.format(jInicio.getDate())));
            stmt.setString(2, convertSql(df.format(jFim.getDate())));
            //System.out.println(convertSql(df.format(jDataFim.getDate())));
            rs = stmt.executeQuery();

            tbSaida.setModel(DbUtils.resultSetToTableModel(rs));

            listarRelatorioCaixaSaidaTotal(); // Calculo total R$ Saída

            tbSaida.setDefaultEditor(Object.class, null);
            //totalRelatorioCaixaEntrada();

            tbSaida.getColumnModel().getColumn(0).setPreferredWidth(10); // Data
            tbSaida.getColumnModel().getColumn(1).setPreferredWidth(350); // Descrição
            tbSaida.getColumnModel().getColumn(2).setPreferredWidth(10); //Valor
            tbSaida.getColumnModel().getColumn(3).setPreferredWidth(20); // Tipo Pagamento
            tbSaida.getColumnModel().getColumn(4).setPreferredWidth(20); // Tipo Movimento

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    // FIM Método listar relatório de entrada no caixa

    // INÍCIO Método para calcular total saída
    private void listarRelatorioCaixaSaidaTotal() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT SUM(valor) FROM caixa  WHERE tipo_movimento = 'Saida'    AND  data_movimento  BETWEEN   ?   AND    ?  ";

        //String sql = "SELECT * FROM vendas where data_final = '2021-02-25'";
        try {
            stmt = con.prepareStatement(sql);

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            stmt.setString(1, convertSql(df.format(jInicio.getDate())));
            stmt.setString(2, convertSql(df.format(jFim.getDate())));
            //System.out.println(convertSql(df.format(jDataFim.getDate())));
            rs = stmt.executeQuery();

            if (rs.next()) {

                Double v = 0.00;

                v = Double.parseDouble(rs.getString(1).replace(",", "."));

                tSaida.setText(String.valueOf(formatarDouble.format(v)).replace(".", ","));
                // valor_produto = Double.parseDouble(rs.getString(4).replace(",", "."));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    // FIM Método para calcular total saída

    // INÍCIO Método para calcular o total de caixa 
    private void totalCaixa() {

        Double entradaDinheiro = Double.parseDouble(tDinheiro.getText().replace(",", "."));
        Double entradaCartao = Double.parseDouble(tCartao.getText().replace(",", "."));
        Double saida = Double.parseDouble(tSaida.getText().replace(",", "."));
        Double total = (entradaDinheiro + entradaCartao) - saida;

        tValorTotalCaixa.setText(String.valueOf(formatarDouble.format(total)).replace(".", ","));

    }
    // FIM Método para calcular o total de caixa 




}