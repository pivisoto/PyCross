/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Enrico
 */
public class TelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
        super("Administração de usuários");
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x646464));
        readJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nomeTextFieldTelaAdmin = new javax.swing.JTextField();
        senhaTextFieldTelaAdmin = new javax.swing.JTextField();
        pontuacaoTextFieldTelaAdmin = new javax.swing.JTextField();
        cadastrarButtonTelaAdmin = new javax.swing.JButton();
        atualizarButtonTelaAdmin = new javax.swing.JButton();
        deletarButtonTelaAdmin = new javax.swing.JButton();
        sairButtonTelaAdmin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuariosTableTelaAdmin = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeTextFieldTelaAdmin.setBackground(new java.awt.Color(100, 100, 100));
        nomeTextFieldTelaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        nomeTextFieldTelaAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        nomeTextFieldTelaAdmin.setCaretColor(new java.awt.Color(255, 255, 255));
        nomeTextFieldTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldTelaAdminActionPerformed(evt);
            }
        });

        senhaTextFieldTelaAdmin.setBackground(new java.awt.Color(100, 100, 100));
        senhaTextFieldTelaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        senhaTextFieldTelaAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        senhaTextFieldTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldTelaAdminActionPerformed(evt);
            }
        });

        pontuacaoTextFieldTelaAdmin.setBackground(new java.awt.Color(100, 100, 100));
        pontuacaoTextFieldTelaAdmin.setForeground(new java.awt.Color(255, 255, 255));
        pontuacaoTextFieldTelaAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "pontuacao", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pontuacaoTextFieldTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontuacaoTextFieldTelaAdminActionPerformed(evt);
            }
        });

        cadastrarButtonTelaAdmin.setBackground(new java.awt.Color(75, 139, 190));
        cadastrarButtonTelaAdmin.setText("Cadastrar");
        cadastrarButtonTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonTelaAdminActionPerformed(evt);
            }
        });

        atualizarButtonTelaAdmin.setBackground(new java.awt.Color(75, 139, 190));
        atualizarButtonTelaAdmin.setText("Atualizar");
        atualizarButtonTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonTelaAdminActionPerformed(evt);
            }
        });

        deletarButtonTelaAdmin.setBackground(new java.awt.Color(75, 139, 190));
        deletarButtonTelaAdmin.setText("Deletar");
        deletarButtonTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonTelaAdminActionPerformed(evt);
            }
        });

        sairButtonTelaAdmin.setBackground(new java.awt.Color(255, 212, 59));
        sairButtonTelaAdmin.setText("Sair");
        sairButtonTelaAdmin.setBorderPainted(false);
        sairButtonTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonTelaAdminActionPerformed(evt);
            }
        });

        usuariosTableTelaAdmin.setBackground(new java.awt.Color(100, 100, 100));
        usuariosTableTelaAdmin.setForeground(new java.awt.Color(100, 100, 100));
        usuariosTableTelaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "senha", "pontuacao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuariosTableTelaAdmin.setGridColor(new java.awt.Color(100, 100, 100));
        usuariosTableTelaAdmin.setSelectionBackground(new java.awt.Color(100, 100, 100));
        usuariosTableTelaAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuariosTableTelaAdminKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(usuariosTableTelaAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sairButtonTelaAdmin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeTextFieldTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(senhaTextFieldTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pontuacaoTextFieldTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrarButtonTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(atualizarButtonTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deletarButtonTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(sairButtonTelaAdmin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextFieldTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaTextFieldTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pontuacaoTextFieldTelaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletarButtonTelaAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastrarButtonTelaAdmin)
                        .addComponent(atualizarButtonTelaAdmin)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonTelaAdminActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonTelaAdminActionPerformed

    private void deletarButtonTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonTelaAdminActionPerformed
        Usuario u = new Usuario();
        u.setId(Integer.parseInt(usuariosTableTelaAdmin.getValueAt(usuariosTableTelaAdmin.getSelectedRow(), 0).toString()));
        UsuarioDAO dao = new UsuarioDAO();
        dao.delete(u);
        
        nomeTextFieldTelaAdmin.setText("");
        senhaTextFieldTelaAdmin.setText("");
        pontuacaoTextFieldTelaAdmin.setText("");
        readJTable();
    }//GEN-LAST:event_deletarButtonTelaAdminActionPerformed

    private void atualizarButtonTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonTelaAdminActionPerformed
        
        if (usuariosTableTelaAdmin.getSelectedRow() != -1) {
            Usuario u = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();
            u.setId(Integer.parseInt(usuariosTableTelaAdmin.getValueAt(usuariosTableTelaAdmin.getSelectedRow(), 0).toString()));
            u.setNome(nomeTextFieldTelaAdmin.getText());
            u.setSenha(senhaTextFieldTelaAdmin.getText());
            u.setPontuacao(Integer.parseInt(pontuacaoTextFieldTelaAdmin.getText()));
            dao.update(u);
            
            nomeTextFieldTelaAdmin.setText("");
            senhaTextFieldTelaAdmin.setText("");
            pontuacaoTextFieldTelaAdmin.setText("");
            readJTable();
        }
    }//GEN-LAST:event_atualizarButtonTelaAdminActionPerformed

    private void cadastrarButtonTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonTelaAdminActionPerformed
        Usuario u = new Usuario();
        u.setNome(nomeTextFieldTelaAdmin.getText());
        u.setSenha(senhaTextFieldTelaAdmin.getText());
        u.setPontuacao(Integer.parseInt(pontuacaoTextFieldTelaAdmin.getText()));
        UsuarioDAO dao = new UsuarioDAO();
        dao.create(u);
        
        nomeTextFieldTelaAdmin.setText("");
        senhaTextFieldTelaAdmin.setText("");
        pontuacaoTextFieldTelaAdmin.setText("");
        readJTable();
    }//GEN-LAST:event_cadastrarButtonTelaAdminActionPerformed

    private void pontuacaoTextFieldTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontuacaoTextFieldTelaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pontuacaoTextFieldTelaAdminActionPerformed

    private void senhaTextFieldTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextFieldTelaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextFieldTelaAdminActionPerformed

    private void nomeTextFieldTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldTelaAdminActionPerformed

    }//GEN-LAST:event_nomeTextFieldTelaAdminActionPerformed

    private void usuariosTableTelaAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariosTableTelaAdminKeyReleased
        if (usuariosTableTelaAdmin.getSelectedRow() != -1) {
            nomeTextFieldTelaAdmin.setText(usuariosTableTelaAdmin.getValueAt(usuariosTableTelaAdmin.getSelectedRow(), 0).toString());
            senhaTextFieldTelaAdmin.setText(usuariosTableTelaAdmin.getValueAt(usuariosTableTelaAdmin.getSelectedRow(), 1).toString());
            pontuacaoTextFieldTelaAdmin.setText(usuariosTableTelaAdmin.getValueAt(usuariosTableTelaAdmin.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_usuariosTableTelaAdminKeyReleased
    public void readJTable() {
        DefaultTableModel model = (DefaultTableModel) usuariosTableTelaAdmin.getModel();
        model.setNumRows(0);
        
        UsuarioDAO dao = new UsuarioDAO();
        
        for (Usuario u : dao.read()) {
            Object[] dados = {u.getId(), u.getNome(), u.getSenha(), u.getPontuacao()};
            model.addRow(dados);
        }
    }

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
            java.util.logging.Logger.getLogger(TelaAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButtonTelaAdmin;
    private javax.swing.JButton cadastrarButtonTelaAdmin;
    private javax.swing.JButton deletarButtonTelaAdmin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeTextFieldTelaAdmin;
    private javax.swing.JTextField pontuacaoTextFieldTelaAdmin;
    private javax.swing.JButton sairButtonTelaAdmin;
    private javax.swing.JTextField senhaTextFieldTelaAdmin;
    private javax.swing.JTable usuariosTableTelaAdmin;
    // End of variables declaration//GEN-END:variables
}
