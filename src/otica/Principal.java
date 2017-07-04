package otica;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rico Azeredo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setIcon();
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
        btnCadastro = new javax.swing.JButton();
        btnPesquisaResumida = new javax.swing.JButton();
        btnPesquisaCompleta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        menuPrograma = new javax.swing.JMenu();
        menuCadastro = new javax.swing.JMenuItem();
        menuPesqResumida = new javax.swing.JMenuItem();
        menuPesqCompleta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOARES ÓTICA - CONTROLE");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jPanel1.setOpaque(false);

        btnCadastro.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCadastro.setText("ABRIR CADASTRO");
        btnCadastro.setPreferredSize(new java.awt.Dimension(210, 80));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnPesquisaResumida.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPesquisaResumida.setText("PESQUISA RESUMIDA");
        btnPesquisaResumida.setPreferredSize(new java.awt.Dimension(210, 80));
        btnPesquisaResumida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaResumidaActionPerformed(evt);
            }
        });

        btnPesquisaCompleta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPesquisaCompleta.setText("PESQUISA COMPLETA");
        btnPesquisaCompleta.setPreferredSize(new java.awt.Dimension(210, 80));
        btnPesquisaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCompletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisaResumida, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(282, 282, 282))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaResumida, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 510, 240));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SOARES ÓTICA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/óculos.png"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 2330, 1400));

        menuPrograma.setText("Programa");
        menuPrograma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        menuCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuCadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuCadastro.setText("ABRIR CADASTRO");
        menuCadastro.setSelected(true);
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });
        menuPrograma.add(menuCadastro);

        menuPesqResumida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuPesqResumida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuPesqResumida.setText("PESQUISA RESUMIDA");
        menuPesqResumida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesqResumidaActionPerformed(evt);
            }
        });
        menuPrograma.add(menuPesqResumida);

        menuPesqCompleta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuPesqCompleta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuPesqCompleta.setText("PESQUISA COMPLETA");
        menuPesqCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesqCompletaActionPerformed(evt);
            }
        });
        menuPrograma.add(menuPesqCompleta);

        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuPrograma.add(jMenuItem1);

        menuBarra.add(menuPrograma);

        setJMenuBar(menuBarra);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        this.btnCadastroActionPerformed(evt);
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null,"Deseja sair do programa?");
        if(resposta==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuPesqResumidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesqResumidaActionPerformed
        this.btnPesquisaResumidaActionPerformed(evt);
    }//GEN-LAST:event_menuPesqResumidaActionPerformed

    private void menuPesqCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesqCompletaActionPerformed
        this.btnPesquisaCompletaActionPerformed(evt);
    }//GEN-LAST:event_menuPesqCompletaActionPerformed

    private void btnPesquisaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCompletaActionPerformed
        PesqCompleta frmPesqCompleta = new PesqCompleta();
        frmPesqCompleta.setVisible(true);
    }//GEN-LAST:event_btnPesquisaCompletaActionPerformed

    private void btnPesquisaResumidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaResumidaActionPerformed
        PesqResumida frmPesqResumida = new PesqResumida();
        frmPesqResumida.setVisible(true);
    }//GEN-LAST:event_btnPesquisaResumidaActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        Cadastro frmCadastro = new Cadastro();
        frmCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnPesquisaCompleta;
    private javax.swing.JButton btnPesquisaResumida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuCadastro;
    private javax.swing.JMenuItem menuPesqCompleta;
    private javax.swing.JMenuItem menuPesqResumida;
    private javax.swing.JMenu menuPrograma;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone_oculos.png")));
    }
}