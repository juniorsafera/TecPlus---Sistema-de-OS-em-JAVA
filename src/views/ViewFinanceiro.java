/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author IdeaSofist
 */
public class ViewFinanceiro extends javax.swing.JFrame {

    /**
     * Creates new form ViewFinanceiro
     */
    public ViewFinanceiro() {
        initComponents();
        setaricon();
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
        bHome = new javax.swing.JPanel();
        bCadastro = new javax.swing.JPanel();
        bEstoque = new javax.swing.JPanel();
        bSobre1 = new javax.swing.JPanel();
        bRelatorioOs = new javax.swing.JPanel();
        bRelatorioVendas = new javax.swing.JPanel();
        bRelatorioCaixa = new javax.swing.JPanel();
        bRelatorioClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
            .addGap(0, 90, Short.MAX_VALUE)
        );
        bSairLayout.setVerticalGroup(
            bSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 90, 40));

        bHome.setToolTipText(""); // NOI18N
        bHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bHome.setOpaque(false);
        bHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bHomeLayout = new javax.swing.GroupLayout(bHome);
        bHome.setLayout(bHomeLayout);
        bHomeLayout.setHorizontalGroup(
            bHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        bHomeLayout.setVerticalGroup(
            bHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(bHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 380, 50));

        bCadastro.setToolTipText(""); // NOI18N
        bCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCadastro.setOpaque(false);
        bCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCadastroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bCadastroLayout = new javax.swing.GroupLayout(bCadastro);
        bCadastro.setLayout(bCadastroLayout);
        bCadastroLayout.setHorizontalGroup(
            bCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        bCadastroLayout.setVerticalGroup(
            bCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 380, 40));

        bEstoque.setToolTipText(""); // NOI18N
        bEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEstoque.setOpaque(false);
        bEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEstoqueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bEstoqueLayout = new javax.swing.GroupLayout(bEstoque);
        bEstoque.setLayout(bEstoqueLayout);
        bEstoqueLayout.setHorizontalGroup(
            bEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        bEstoqueLayout.setVerticalGroup(
            bEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 322, 380, 40));

        bSobre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSobre1.setOpaque(false);
        bSobre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSobre1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bSobre1Layout = new javax.swing.GroupLayout(bSobre1);
        bSobre1.setLayout(bSobre1Layout);
        bSobre1Layout.setHorizontalGroup(
            bSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        bSobre1Layout.setVerticalGroup(
            bSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        getContentPane().add(bSobre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 371, 380, 45));

        bRelatorioOs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRelatorioOs.setOpaque(false);
        bRelatorioOs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRelatorioOsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bRelatorioOsLayout = new javax.swing.GroupLayout(bRelatorioOs);
        bRelatorioOs.setLayout(bRelatorioOsLayout);
        bRelatorioOsLayout.setHorizontalGroup(
            bRelatorioOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        bRelatorioOsLayout.setVerticalGroup(
            bRelatorioOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bRelatorioOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 520, 40));

        bRelatorioVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRelatorioVendas.setOpaque(false);
        bRelatorioVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRelatorioVendasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bRelatorioVendasLayout = new javax.swing.GroupLayout(bRelatorioVendas);
        bRelatorioVendas.setLayout(bRelatorioVendasLayout);
        bRelatorioVendasLayout.setHorizontalGroup(
            bRelatorioVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        bRelatorioVendasLayout.setVerticalGroup(
            bRelatorioVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bRelatorioVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 235, 520, 40));

        bRelatorioCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRelatorioCaixa.setOpaque(false);
        bRelatorioCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRelatorioCaixaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bRelatorioCaixaLayout = new javax.swing.GroupLayout(bRelatorioCaixa);
        bRelatorioCaixa.setLayout(bRelatorioCaixaLayout);
        bRelatorioCaixaLayout.setHorizontalGroup(
            bRelatorioCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        bRelatorioCaixaLayout.setVerticalGroup(
            bRelatorioCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bRelatorioCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 309, 520, 40));

        bRelatorioClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRelatorioClientes.setOpaque(false);
        bRelatorioClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRelatorioClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bRelatorioClientesLayout = new javax.swing.GroupLayout(bRelatorioClientes);
        bRelatorioClientes.setLayout(bRelatorioClientesLayout);
        bRelatorioClientesLayout.setHorizontalGroup(
            bRelatorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        bRelatorioClientesLayout.setVerticalGroup(
            bRelatorioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(bRelatorioClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 385, 520, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaFinanceiro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSairMouseClicked
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bSairMouseClicked

    private void bHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHomeMouseClicked
        // TODO add your handling code here:
        ViewHome home = new ViewHome();
        
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                        home.setVisible(true);
                        
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
        this.dispose();
    }//GEN-LAST:event_bHomeMouseClicked

    private void bCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastroMouseClicked
        // TODO add your handling code here:
        ViewCadastro cadastro = new ViewCadastro();
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                        cadastro.setVisible(true);
                        
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
        this.dispose();
    }//GEN-LAST:event_bCadastroMouseClicked

    private void bEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEstoqueMouseClicked
        // TODO add your handling code here:
        
         ViewEstoque estoque = new ViewEstoque();
        
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                        estoque.setVisible(true);
                        
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
        this.dispose();
    }//GEN-LAST:event_bEstoqueMouseClicked

    private void bSobre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSobre1MouseClicked
        // TODO add your handling code here:
        ViewSobre sobre = new ViewSobre();

        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {

            public void run() {

                try {

                    // Métodos
                    sobre.setVisible(true);

                    carregando.dispose();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    carregando.dispose();
                }
            }
        };
        t.start();
        // FIM Carregamento
        this.dispose();
    }//GEN-LAST:event_bSobre1MouseClicked

    private void bRelatorioOsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRelatorioOsMouseClicked
        // TODO add your handling code here:
        Relatorio_Os os = new Relatorio_Os();
        
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                        
                        os.setVisible(true);
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
    }//GEN-LAST:event_bRelatorioOsMouseClicked

    private void bRelatorioVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRelatorioVendasMouseClicked
        // TODO add your handling code here:
        RelatorioVendas vendas = new RelatorioVendas();
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                         
                        vendas.setVisible(true);
                        
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
    }//GEN-LAST:event_bRelatorioVendasMouseClicked

    private void bRelatorioCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRelatorioCaixaMouseClicked
        // TODO add your handling code here:
        Relatorio_caixa caixa = new Relatorio_caixa();
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                        caixa.setVisible(true);
                        
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
    }//GEN-LAST:event_bRelatorioCaixaMouseClicked

    private void bRelatorioClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRelatorioClientesMouseClicked
        // TODO add your handling code here:
        ViewClientesCadastrados clientes = new ViewClientesCadastrados();
        // Início Carregamento
        final ViewLoading carregando = new ViewLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {

                public void run() {

                    try {
                        
                        // Métodos
                        clientes.setVisible(true);
                        
                        carregando.dispose();
                         
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        carregando.dispose();
                    }
                }
            };
            t.start();
        // FIM Carregamento
    }//GEN-LAST:event_bRelatorioClientesMouseClicked

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
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFinanceiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bCadastro;
    private javax.swing.JPanel bEstoque;
    private javax.swing.JPanel bHome;
    private javax.swing.JPanel bRelatorioCaixa;
    private javax.swing.JPanel bRelatorioClientes;
    private javax.swing.JPanel bRelatorioOs;
    private javax.swing.JPanel bRelatorioVendas;
    private javax.swing.JPanel bSair;
    private javax.swing.JPanel bSobre1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

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