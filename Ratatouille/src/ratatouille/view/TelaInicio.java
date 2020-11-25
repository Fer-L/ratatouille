/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratatouille.view;

import java.awt.event.ActionListener;

/**
 *
 * @author carol
 */
public class TelaInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
    public TelaInicio() {
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
        canvas1 = new java.awt.Canvas();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1Logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemCadastro = new javax.swing.JMenuItem();
        jMenuItemConsulta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ratatouille");
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabelLogo.setAutoscrolls(true);

        jLabel1Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/top-view-circular-food-frame-with-vegetables.jpg"))); // NOI18N
        jLabel1Logo.setMaximumSize(new java.awt.Dimension(600, 333));
        jLabel1Logo.setMinimumSize(new java.awt.Dimension(600, 333));
        jLabel1Logo.setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1194, 1194, 1194)
                .addComponent(jLabelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 550));

        jMenuOpcoes.setBackground(new java.awt.Color(87, 63, 48));
        jMenuOpcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuOpcoes.setForeground(new java.awt.Color(255, 255, 255));
        jMenuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rato.png"))); // NOI18N
        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N

        jMenuItemCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita.png"))); // NOI18N
        jMenuItemCadastro.setText("Cadastrar receita");
        jMenuOpcoes.add(jMenuItemCadastro);

        jMenuItemConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita.png"))); // NOI18N
        jMenuItemConsulta.setText("Consultar receita");
        jMenuOpcoes.add(jMenuItemConsulta);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita.png"))); // NOI18N
        jMenu1.setText("Editar receita");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita.png"))); // NOI18N
        jMenuItem4.setText("Alterar receita");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita.png"))); // NOI18N
        jMenuItem2.setText("Excluir receita");
        jMenu1.add(jMenuItem2);

        jMenuOpcoes.add(jMenu1);

        jMenuBar1.add(jMenuOpcoes);

        jMenuSair.setBackground(new java.awt.Color(87, 63, 48));
        jMenuSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuSair.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1Logo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemCadastro;
    private javax.swing.JMenuItem jMenuItemConsulta;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
