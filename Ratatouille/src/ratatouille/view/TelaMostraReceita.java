/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratatouille.view;

import javax.swing.WindowConstants;
import ratatouille.model.entity.Receita;

/**
 *
 * @author carol
 */
public class TelaMostraReceita extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     * @param receita
     */
    public TelaMostraReceita(Receita receita) {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
     jTextAreaIngredientes.setText(receita.getIngredientes());
     jTextAreaPassos.setText(receita.getPassos());
     jTextFieldCategoria.setText(receita.getCategoria());
     jTextFieldNomeAutor.setText(receita.getNomeAutor());
     jTextFieldNomeReceita.setText(receita.getNomeDaReceita());
     jTextFieldRendimento.setText(Integer.toString(receita.getRendimentoPorcao()));
     jTextFieldTempo.setText(Float.toString(receita.getTempo()));
        
    }

    private TelaMostraReceita() {
        throw new UnsupportedOperationException("Not supported yet."); 
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeReceita = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRendimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTempo = new javax.swing.JTextField();
        jLabelNomeReceita1 = new javax.swing.JLabel();
        button3 = new java.awt.Button();
        jTextFieldCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIngredientes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPassos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setPreferredSize(new java.awt.Dimension(839, 704));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 236, 193));
        jPanel1.setFocusable(false);

        jTextFieldNomeReceita.setEditable(false);
        jTextFieldNomeReceita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeReceita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeReceita.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeReceitaActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Autor");

        jTextFieldNomeAutor.setEditable(false);
        jTextFieldNomeAutor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeAutor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAutorActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rendimento (porções)");

        jTextFieldRendimento.setEditable(false);
        jTextFieldRendimento.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldRendimento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldRendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRendimentoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Categoria ");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Passos");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tempo de preparo");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ingredientes");

        jTextFieldTempo.setEditable(false);
        jTextFieldTempo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTempo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTempoActionPerformed(evt);
            }
        });

        jLabelNomeReceita1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabelNomeReceita1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeReceita1.setText("Nome da receita");

        button3.setActionCommand("Voltar");
        button3.setBackground(new java.awt.Color(153, 153, 153));
        button3.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setLabel("Voltar");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jTextFieldCategoria.setEditable(false);
        jTextFieldCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });

        jTextAreaIngredientes.setEditable(false);
        jTextAreaIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaIngredientes.setColumns(20);
        jTextAreaIngredientes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaIngredientes);

        jTextAreaPassos.setEditable(false);
        jTextAreaPassos.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaPassos.setColumns(20);
        jTextAreaPassos.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPassos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeReceita1)
                            .addComponent(jTextFieldNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldRendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3)))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelNomeReceita1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rato.png"))); // NOI18N
        jLabel1.setText("Consulta de receitas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeReceitaActionPerformed

    private void jTextFieldNomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAutorActionPerformed

    private void jTextFieldRendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRendimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRendimentoActionPerformed

    private void jTextFieldTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTempoActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        TelaTabela telaTabela = new TelaTabela();
        telaTabela.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_button3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMostraReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMostraReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMostraReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMostraReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMostraReceita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNomeReceita1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaIngredientes;
    private javax.swing.JTextArea jTextAreaPassos;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldNomeAutor;
    private javax.swing.JTextField jTextFieldNomeReceita;
    private javax.swing.JTextField jTextFieldRendimento;
    private javax.swing.JTextField jTextFieldTempo;
    // End of variables declaration//GEN-END:variables
}
