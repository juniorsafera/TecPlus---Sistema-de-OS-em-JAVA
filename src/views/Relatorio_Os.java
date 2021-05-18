/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.ConnectionFactory;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author IdeaSofist
 */
public class Relatorio_Os extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio_Os
     */
    public Relatorio_Os() {
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
        bVerificar = new javax.swing.JButton();
        jFim = new com.toedter.calendar.JDateChooser();
        jInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOs = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordem de serviços"));

        bVerificar.setText("Verificar");
        bVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data Início:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data Fim:");

        tbOs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbOs);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Situação:");

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Em Orçamento", "Orçamento Aprovado", "Orçamento Reprovado", "Entregue", "Aparelho Abandonado pelo Cliente", "Aguardando Peças", "Em Serviço", "Serviço Pronto", "Concluído ( Entregue )" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFim, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bVerificar)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificarActionPerformed
        // TODO add your handling code here:

        if(jInicio.getDate()==null){
            JOptionPane.showMessageDialog(this, "Informe a data Início do período desejado!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else  if(jFim.getDate()==null){
            JOptionPane.showMessageDialog(this, "Informe a data Fim do período desejado!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else  if (cbSituacao.getSelectedItem().equals("--Selecione--")){
            JOptionPane.showMessageDialog(this, "Informe a Situação da ordem de serviço!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else {
            listarOrdemServicos();
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
            java.util.logging.Logger.getLogger(Relatorio_Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio_Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio_Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio_Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio_Os().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVerificar;
    private javax.swing.JComboBox<String> cbSituacao;
    private com.toedter.calendar.JDateChooser jFim;
    private com.toedter.calendar.JDateChooser jInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbOs;
    // End of variables declaration//GEN-END:variables


    
    
    
     /*
    *
    * ÁREA PARA TODOS OS MÉTODOS
    *
     */
    
    
      
    
    
    
    //INÍCIO Método para converter a data para data em sql  
    public static String convertSql(String Data) {
        return Data.substring(6, 10) + "-" + Data.substring(3, 5) + "-" + Data.substring(0, 2);
    }
    //FIM Método para converter a data para data em sql  
    
    
    
    // INÍCIO Método listar Ordem de serviços
    private void listarOrdemServicos() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT    OSER.codigo_os  Código , servico Serviço, aparelho Aparelho, defeito Defeito, CLI.nome Cliente, strftime('%d/%m/%Y',data_solicitado) as  Solicitado ,valor_total  Total_R$,  situacao Situação FROM ordem_servicos as OSER inner join clientes as CLI on (CLI.idclientes = OSER.clientes_idclientes)  WHERE situacao = ?  AND data_solicitado  BETWEEN   ?   AND    ? ORDER BY data_solicitado";

        //String sql = "SELECT * FROM vendas where data_final = '2021-02-25'";
        try {
            stmt = con.prepareStatement(sql);

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            stmt.setString(1, cbSituacao.getSelectedItem().toString());
            stmt.setString(2, convertSql(df.format(jInicio.getDate())));
            stmt.setString(3, convertSql(df.format(jFim.getDate())));
            //System.out.println(convertSql(df.format(jDataFim.getDate())));
            rs = stmt.executeQuery();

            tbOs.setModel(DbUtils.resultSetToTableModel(rs));
            tbOs.setDefaultEditor(Object.class, null);
            //totalRelatorioCaixaEntrada();

            tbOs.getColumnModel().getColumn(0).setPreferredWidth(5); // Código
            tbOs.getColumnModel().getColumn(1).setPreferredWidth(80); // Serviço
            tbOs.getColumnModel().getColumn(2).setPreferredWidth(70); //Aparelho
            tbOs.getColumnModel().getColumn(3).setPreferredWidth(100); // Defeito
            tbOs.getColumnModel().getColumn(4).setPreferredWidth(80); // Cliente
            tbOs.getColumnModel().getColumn(5).setPreferredWidth(30); // Solicitado
            tbOs.getColumnModel().getColumn(6).setPreferredWidth(5); // Total_R$
            tbOs.getColumnModel().getColumn(7).setPreferredWidth(100); // Situação

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    //FIM Método listar Ordem de serviços




}