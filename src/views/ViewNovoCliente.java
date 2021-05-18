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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author IdeaSofist
 */
public class ViewNovoCliente extends javax.swing.JFrame {

    /**
     * Creates new form ViewNovoCliente
     */
    
    /* Variáveis uteis*/
     private String salvar_alterar = "salvar";
    private String id = "";
    private String contato = null;
    
    String dataHoje = null;

    String dataNiver = "";
    
    
    public ViewNovoCliente() {
        initComponents();
         setaricon();
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

        bSair = new javax.swing.JPanel();
        bSalvar = new javax.swing.JPanel();
        bAlterar = new javax.swing.JPanel();
        bExcluir = new javax.swing.JPanel();
        bLimpar = new javax.swing.JPanel();
        bPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        tBairro = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        tFone = new javax.swing.JFormattedTextField();
        tEndereco = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        jDia = new javax.swing.JComboBox<>();
        jMes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(999, 555));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSair.setOpaque(false);
        bSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bSairLayout = new javax.swing.GroupLayout(bSair);
        bSair.setLayout(bSairLayout);
        bSairLayout.setHorizontalGroup(
            bSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        bSairLayout.setVerticalGroup(
            bSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(bSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, 40, 35));

        bSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalvar.setOpaque(false);
        bSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bSalvarLayout = new javax.swing.GroupLayout(bSalvar);
        bSalvar.setLayout(bSalvarLayout);
        bSalvarLayout.setHorizontalGroup(
            bSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        bSalvarLayout.setVerticalGroup(
            bSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(bSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 130, 30));

        bAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAlterar.setOpaque(false);
        bAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAlterarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bAlterarLayout = new javax.swing.GroupLayout(bAlterar);
        bAlterar.setLayout(bAlterarLayout);
        bAlterarLayout.setHorizontalGroup(
            bAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        bAlterarLayout.setVerticalGroup(
            bAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(bAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 140, 30));

        bExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bExcluir.setOpaque(false);
        bExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bExcluirLayout = new javax.swing.GroupLayout(bExcluir);
        bExcluir.setLayout(bExcluirLayout);
        bExcluirLayout.setHorizontalGroup(
            bExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        bExcluirLayout.setVerticalGroup(
            bExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(bExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 130, 30));

        bLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bLimpar.setOpaque(false);
        bLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bLimparLayout = new javax.swing.GroupLayout(bLimpar);
        bLimpar.setLayout(bLimparLayout);
        bLimparLayout.setHorizontalGroup(
            bLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        bLimparLayout.setVerticalGroup(
            bLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(bLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 150, 30));

        bPesquisar.setBackground(new java.awt.Color(44, 44, 84));
        bPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        bPesquisar.setBorder(null);
        bPesquisar.setOpaque(false);
        getContentPane().add(bPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 26));

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 190));

        tBairro.setBackground(new java.awt.Color(47, 47, 73));
        tBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tBairro.setForeground(new java.awt.Color(255, 255, 255));
        tBairro.setBorder(null);
        tBairro.setOpaque(false);
        getContentPane().add(tBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 390, 290, 24));

        tNome.setBackground(new java.awt.Color(47, 47, 73));
        tNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tNome.setForeground(new java.awt.Color(255, 255, 255));
        tNome.setBorder(null);
        tNome.setOpaque(false);
        getContentPane().add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 370, 30));

        tFone.setBackground(new java.awt.Color(47, 47, 73));
        tFone.setBorder(null);
        tFone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tFone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tFone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFoneKeyReleased(evt);
            }
        });
        getContentPane().add(tFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 370, -1));

        tEndereco.setBackground(new java.awt.Color(47, 47, 73));
        tEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tEndereco.setForeground(new java.awt.Color(255, 255, 255));
        tEndereco.setBorder(null);
        tEndereco.setOpaque(false);
        getContentPane().add(tEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 370, 24));

        tEmail.setBackground(new java.awt.Color(47, 47, 73));
        tEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tEmail.setForeground(new java.awt.Color(255, 255, 255));
        tEmail.setBorder(null);
        tEmail.setOpaque(false);
        getContentPane().add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 428, 290, 24));

        jDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 80, -1));

        jMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        getContentPane().add(jMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 185, -1));

        jLabel2.setBackground(new java.awt.Color(47, 47, 73));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" /");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 355, 10, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaClientes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bSairMouseClicked

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        // TODO add your handling code here:
        setar_campos();
    }//GEN-LAST:event_tbClientesMouseClicked

    private void bAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAlterarMouseClicked
        // TODO add your handling code here:
        preparar_alterar();
    }//GEN-LAST:event_bAlterarMouseClicked

    private void bLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLimparMouseClicked
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_bLimparMouseClicked

    private void bSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseClicked
        // TODO add your handling code here:
        if ((tNome.getText().isEmpty()) || contato == null) {
            JOptionPane.showMessageDialog(null, "Nome/Fone são campos obrigatórios!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else  
            if (salvar_alterar.equals("salvar")) {
                          
                salvarCliente();
                
                listarClientes();
                limparCampos();
               
            } else {
                    
                alterar();
                listarClientes();
            }
    }//GEN-LAST:event_bSalvarMouseClicked

    private void bExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseClicked
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_bExcluirMouseClicked

    private void tFoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFoneKeyReleased
        // TODO add your handling code here:
        contato = "digitou";
    }//GEN-LAST:event_tFoneKeyReleased

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
            java.util.logging.Logger.getLogger(ViewNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNovoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bAlterar;
    private javax.swing.JPanel bExcluir;
    private javax.swing.JPanel bLimpar;
    private javax.swing.JTextField bPesquisar;
    private javax.swing.JPanel bSair;
    private javax.swing.JPanel bSalvar;
    private javax.swing.JComboBox<String> jDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JFormattedTextField tFone;
    private javax.swing.JTextField tNome;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables

    
    
    // INÍCIO Método para pegar data Niver e validar
    private void pegarDataNiver() {
        if (jDia.getSelectedItem().toString().equals("Dia") || jMes.getSelectedItem().toString().equals("Mês")) {
            dataNiver = "";
        } else {
            dataNiver = jDia.getSelectedItem().toString() + " de " + jMes.getSelectedItem();

        }
    }
     // FIM Método para pegar data Niver e validar
    
    
    // INÍCIO Método para listar Clientes na tabela
    public void listarClientes() {

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
                + "email Email ,"
                + "strftime('%d/%m/%Y',data_cadastro) as Cadastro"
                + "  from clientes ";
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
            tbClientes.getColumnModel().getColumn(7).setPreferredWidth(20); // Cadastro

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    // FIM Método para listar Clientes na tabela

    
    
    // INÍCIO Método para setar id de cliente para alterar ou excluir
    public void setar_campos() {
        int setar = tbClientes.getSelectedRow();
        id = tbClientes.getModel().getValueAt(setar, 0).toString();
        contato = "dados";

        dataNiver = tbClientes.getModel().getValueAt(setar, 2).toString();

         
        // contato = tbClientes.getModel().getValueAt(setar, 5).toString();

    }
    // FIM Método para setar id de cliente para alterar ou excluir
    
    
    // INÍCIO Método para setar campos para alterar dados de cliente
    public void preparar_alterar() {

        salvar_alterar = "Alterar";

        if (id == null) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);
        } else {

            int setar = tbClientes.getSelectedRow();
            id = tbClientes.getModel().getValueAt(setar, 0).toString();

            if (dataNiver.length() > 1) {

                jDia.setSelectedItem(dataNiver.substring(0, 2));
                jMes.setSelectedItem(dataNiver.substring(6));
            } else {
                jDia.setSelectedItem("Dia");
                jMes.setSelectedItem("Mês");
            }
            tNome.setText(tbClientes.getModel().getValueAt(setar, 1).toString());
            dataNiver = tbClientes.getModel().getValueAt(setar, 2).toString();
            tEndereco.setText(tbClientes.getModel().getValueAt(setar, 3).toString());
            tBairro.setText(tbClientes.getModel().getValueAt(setar, 4).toString());
            tFone.setText(tbClientes.getModel().getValueAt(setar, 5).toString());
            tEmail.setText(tbClientes.getModel().getValueAt(setar, 6).toString());

        }
    }
    // FIM Método para setar campos para alterar dados de cliente
    
    
     //INÍCIO Método para limpar campos
    private void limparCampos() {

        id = null;
        tNome.setText(null);
        jDia.setSelectedItem("Dia");
        jMes.setSelectedItem("Mês");
        tEndereco.setText(null);
        tBairro.setText(null);
        tFone.setText(null);
        tEmail.setText(null);
         
        contato = null;
    }
    //FIM Método para limpar campos
    
    // Início Método para salvar um Cliente
    private void salvarCliente() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        pegarDataNiver();

        String sql = "INSERT  INTO clientes "
                + "( nome, "
                + "nascimento,   "
                + "endereco, "
                + "bairro, "
                + "fone, "
                + "email , "
                + "data_cadastro ) "
                + " VALUES (?,?,?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, tNome.getText());
            stmt.setString(2, dataNiver);
            stmt.setString(3, tEndereco.getText());
            stmt.setString(4, tBairro.getText());
            stmt.setString(5, tFone.getText());
            stmt.setString(6, tEmail.getText());
            stmt.setString(7, dataHoje);

            // A linha abaixo atualiza os dados     
            int adicionado = stmt.executeUpdate();

            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                listarClientes();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar Cliente " + "\n" + e , "Atençao!" ,JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // Fim Método para salvar um Cliente
    
    
    
    // INÍCIO Método para alterar dados de Cliente
    private void alterar() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        pegarDataNiver();

        String sql = "UPDATE clientes SET "
                + "nome =? ,"
                + "nascimento =? , "
                + "endereco =? , "
                + "bairro =? ,"
                + "fone =? ,"
                + "email =?"
                + " WHERE idclientes =? ";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tNome.getText());
            stmt.setString(2, dataNiver);
            stmt.setString(3, tEndereco.getText());
            stmt.setString(4, tBairro.getText());
            stmt.setString(5, tFone.getText());
            stmt.setString(6, tEmail.getText());

            stmt.setString(7, id);

            //   pst.setString(6,txtIdCli.getText());
            if ((tNome.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Nome/Fone são campos obrigatórios!" , "Atençao!" ,JOptionPane.WARNING_MESSAGE);

            } else {

                // A linha abaixo atualiza os dados     
                int adicionado = stmt.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados de Clientes alterados com sucesso!");
                    listarClientes();
                    limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // FIM Método para alterar dados de Cliente
    
    
    
    //INÍCIO Método para Excluír Cliente
    private void excluir() {

        java.sql.Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir este Cliente?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            String sql = "DELETE FROM clientes where idclientes =?";
            try {
                stmt = con.prepareStatement(sql);
                stmt.setString(1, id);
                int apagado = stmt.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                    listarClientes();
                    limparCampos();

                }

            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Cliente não pode ser excluído!" , "Atençao!" ,JOptionPane.ERROR_MESSAGE);
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee);
                System.out.println(ee);
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }

        }

    }
    //FIM Método para Excluír Cliente
    
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