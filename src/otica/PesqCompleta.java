
package otica;

import java.awt.Toolkit;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Rico Azeredo
 */
public class PesqCompleta extends javax.swing.JFrame {
    
    ConexaoBanco Banco = new ConexaoBanco();
    static boolean Alterar = false; //chave Alterar
    public int ID;
    public String pesq = null;
    /**
     * Creates new form PesqCompleta
     */
    public PesqCompleta() {
        initComponents();
        setIcon();
        Banco.conexao(); //inicia a conexão com o BD
                
        Date data = new Date();
        
        String dataString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
        dataString = sdfr.format(data);
        txtData.setText(dataString);
        
        txtPesquisa.requestFocus();
               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lblData = new java.awt.Label();
        txtData = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PanAdicao3 = new javax.swing.JPanel();
        label16 = new java.awt.Label();
        txtAltura = new javax.swing.JTextField();
        label17 = new java.awt.Label();
        txtD = new javax.swing.JTextField();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        txtDNP7 = new javax.swing.JTextField();
        txtDNP8 = new javax.swing.JTextField();
        lblUf53 = new java.awt.Label();
        lblUf54 = new java.awt.Label();
        lblUf55 = new java.awt.Label();
        lblUf56 = new java.awt.Label();
        txtLongEsfDir = new javax.swing.JTextField();
        txtLongeCilDir = new javax.swing.JTextField();
        txtLongeEixDir = new javax.swing.JTextField();
        lblUf57 = new java.awt.Label();
        lblUf58 = new java.awt.Label();
        lblUf59 = new java.awt.Label();
        txtPertoEsfDir = new javax.swing.JTextField();
        txtPertoCilDir = new javax.swing.JTextField();
        txtPertoEixDir = new javax.swing.JTextField();
        lblUf60 = new java.awt.Label();
        lblUf61 = new java.awt.Label();
        lblUf62 = new java.awt.Label();
        lblUf63 = new java.awt.Label();
        txtLongeEsfEsq = new javax.swing.JTextField();
        txtLongeCilEsq = new javax.swing.JTextField();
        txtLongeEixEsq = new javax.swing.JTextField();
        lblUf64 = new java.awt.Label();
        lblUf65 = new java.awt.Label();
        lblUf66 = new java.awt.Label();
        lblUf67 = new java.awt.Label();
        txtPertoEsfEsq = new javax.swing.JTextField();
        txtPertoCilEsq = new javax.swing.JTextField();
        txtPertoEixEsq = new javax.swing.JTextField();
        lblUf68 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        lblUf1 = new java.awt.Label();
        lblUf2 = new java.awt.Label();
        lblUf3 = new java.awt.Label();
        panDados = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new java.awt.Label();
        txtCidade = new javax.swing.JTextField();
        lblUf = new java.awt.Label();
        jLabel9 = new javax.swing.JLabel();
        cmbEstados = new javax.swing.JComboBox();
        label2 = new java.awt.Label();
        txtMail = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        txtTel = new javax.swing.JFormattedTextField();
        label4 = new java.awt.Label();
        txtCel = new javax.swing.JFormattedTextField();
        panTituloLente = new javax.swing.JPanel();
        lblUf20 = new java.awt.Label();
        panTrata = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkTratAR = new javax.swing.JCheckBox();
        chkTratFoto = new javax.swing.JCheckBox();
        chkTratColor = new javax.swing.JCheckBox();
        txtTrata = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chkOcCliente = new javax.swing.JCheckBox();
        chkMetalTT = new javax.swing.JCheckBox();
        chkMetalNy = new javax.swing.JCheckBox();
        chkAcetTT = new javax.swing.JCheckBox();
        chkAcetNy = new javax.swing.JCheckBox();
        panEntrValSi = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEntrega = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JTextField();
        txtSinal = new javax.swing.JTextField();
        txtRestante = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        panDadosLentes = new javax.swing.JPanel();
        chkMFocal = new javax.swing.JCheckBox();
        txtMultifocais = new javax.swing.JTextField();
        chkVSimples = new javax.swing.JCheckBox();
        txtVisaoSimples = new javax.swing.JTextField();
        txtBifocais = new javax.swing.JTextField();
        chkBFocais = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SOARES ÓTICA - Pesquisa Completa");
        setPreferredSize(new java.awt.Dimension(1010, 1270));
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1010, 1390));

        jPanel6.setAutoscrolls(true);
        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 1390));

        panHeader.setBackground(new java.awt.Color(0, 51, 255));
        panHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblData.setBackground(new java.awt.Color(0, 51, 255));
        lblData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("DATA");

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Lucida Bright", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SOARES ÓTICA");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        label16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        label16.setText("Altura");

        txtAltura.setEditable(false);
        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        label17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        label17.setText("D");

        txtD.setEditable(false);
        txtD.setBackground(new java.awt.Color(255, 255, 255));
        txtD.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        label18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        label18.setText("DNP");

        label19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        label19.setText("DNP");

        txtDNP7.setEditable(false);
        txtDNP7.setBackground(new java.awt.Color(255, 255, 255));
        txtDNP7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtDNP8.setEditable(false);
        txtDNP8.setBackground(new java.awt.Color(255, 255, 255));
        txtDNP8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblUf53.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf53.setName(""); // NOI18N
        lblUf53.setText("O.D.");

        lblUf54.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf54.setText("Eixo");

        lblUf55.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf55.setText("Esf.");

        lblUf56.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf56.setText("Cil.");

        txtLongEsfDir.setEditable(false);
        txtLongEsfDir.setBackground(new java.awt.Color(255, 255, 255));
        txtLongEsfDir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtLongeCilDir.setEditable(false);
        txtLongeCilDir.setBackground(new java.awt.Color(255, 255, 255));
        txtLongeCilDir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtLongeEixDir.setEditable(false);
        txtLongeEixDir.setBackground(new java.awt.Color(255, 255, 255));
        txtLongeEixDir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblUf57.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf57.setText("Eixo");

        lblUf58.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf58.setText("Esf.");

        lblUf59.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf59.setText("Cil.");

        txtPertoEsfDir.setEditable(false);
        txtPertoEsfDir.setBackground(new java.awt.Color(255, 255, 255));
        txtPertoEsfDir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtPertoCilDir.setEditable(false);
        txtPertoCilDir.setBackground(new java.awt.Color(255, 255, 255));
        txtPertoCilDir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtPertoEixDir.setEditable(false);
        txtPertoEixDir.setBackground(new java.awt.Color(255, 255, 255));
        txtPertoEixDir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblUf60.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf60.setName(""); // NOI18N
        lblUf60.setText("O.D.");

        lblUf61.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf61.setText("Eixo");

        lblUf62.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf62.setText("Esf.");

        lblUf63.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf63.setText("Cil.");

        txtLongeEsfEsq.setEditable(false);
        txtLongeEsfEsq.setBackground(new java.awt.Color(255, 255, 255));
        txtLongeEsfEsq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtLongeCilEsq.setEditable(false);
        txtLongeCilEsq.setBackground(new java.awt.Color(255, 255, 255));
        txtLongeCilEsq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtLongeEixEsq.setEditable(false);
        txtLongeEixEsq.setBackground(new java.awt.Color(255, 255, 255));
        txtLongeEixEsq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblUf64.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf64.setName(""); // NOI18N
        lblUf64.setText("O.E.");

        lblUf65.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf65.setText("Eixo");

        lblUf66.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf66.setText("Esf.");

        lblUf67.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUf67.setText("Cil.");

        txtPertoEsfEsq.setEditable(false);
        txtPertoEsfEsq.setBackground(new java.awt.Color(255, 255, 255));
        txtPertoEsfEsq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtPertoCilEsq.setEditable(false);
        txtPertoCilEsq.setBackground(new java.awt.Color(255, 255, 255));
        txtPertoCilEsq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtPertoEixEsq.setEditable(false);
        txtPertoEixEsq.setBackground(new java.awt.Color(255, 255, 255));
        txtPertoEixEsq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lblUf68.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf68.setName(""); // NOI18N
        lblUf68.setText("O.E.");

        javax.swing.GroupLayout PanAdicao3Layout = new javax.swing.GroupLayout(PanAdicao3);
        PanAdicao3.setLayout(PanAdicao3Layout);
        PanAdicao3Layout.setHorizontalGroup(
            PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanAdicao3Layout.createSequentialGroup()
                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                                        .addComponent(lblUf55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLongEsfDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUf56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLongeCilDir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                                        .addComponent(lblUf62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLongeEsfEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUf63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLongeCilEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                                        .addComponent(lblUf61, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLongeEixEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                                        .addComponent(lblUf54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLongeEixDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblUf64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(390, 390, 390)
                                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                                        .addComponent(lblUf58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPertoEsfDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUf59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPertoCilDir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUf57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblUf68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                                        .addComponent(lblUf66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPertoEsfEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUf67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPertoCilEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUf65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPertoEixEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPertoEixDir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addComponent(lblUf53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(388, 388, 388)
                                .addComponent(lblUf60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNP7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNP8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        PanAdicao3Layout.setVerticalGroup(
            PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanAdicao3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblUf53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUf60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblUf55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtLongEsfDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblUf56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUf58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPertoEsfDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUf59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPertoCilDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUf54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLongeEixDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPertoEixDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUf57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLongeCilDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUf64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblUf68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUf62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLongeEsfEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUf63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLongeCilEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPertoEixEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPertoCilEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUf67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPertoEsfEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUf66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanAdicao3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblUf65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUf61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLongeEixEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(29, 29, 29)
                .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtDNP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanAdicao3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PanAdicao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblUf1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf1.setForeground(new java.awt.Color(255, 255, 255));
        lblUf1.setName(""); // NOI18N
        lblUf1.setText("LONGE");

        lblUf2.setAlignment(java.awt.Label.CENTER);
        lblUf2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf2.setForeground(new java.awt.Color(255, 255, 255));
        lblUf2.setName(""); // NOI18N
        lblUf2.setText("ADIÇÃO");

        lblUf3.setAlignment(java.awt.Label.RIGHT);
        lblUf3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf3.setForeground(new java.awt.Color(255, 255, 255));
        lblUf3.setName(""); // NOI18N
        lblUf3.setText("PERTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblUf1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(lblUf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label1.setText("CLIENTE");

        label3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label3.setText("ENDEREÇO");

        txtEndereco.setEditable(false);
        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCidade.setText("CIDADE");

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblUf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf.setText("UF");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("REGISTROS ENCONTRADOS");

        cmbEstados.setEditable(true);
        cmbEstados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmbEstados.setForeground(new java.awt.Color(51, 51, 51));
        cmbEstados.setMaximumRowCount(27);
        cmbEstados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  -", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cmbEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbEstados.setLightWeightPopupEnabled(false);
        cmbEstados.setName(""); // NOI18N

        label2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label2.setText("E-mail");

        txtMail.setEditable(false);
        txtMail.setBackground(new java.awt.Color(255, 255, 255));
        txtMail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        label5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label5.setText("TEL.");

        txtTel.setEditable(false);
        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        label4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label4.setText("CELULAR");

        txtCel.setEditable(false);
        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout panDadosLayout = new javax.swing.GroupLayout(panDados);
        panDados.setLayout(panDadosLayout);
        panDadosLayout.setHorizontalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panDadosLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtCliente))
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cmbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEndereco)))
        );
        panDadosLayout.setVerticalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panTituloLente.setBackground(new java.awt.Color(0, 0, 0));

        lblUf20.setAlignment(java.awt.Label.CENTER);
        lblUf20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUf20.setForeground(new java.awt.Color(255, 255, 255));
        lblUf20.setName(""); // NOI18N
        lblUf20.setText("LENTES");

        javax.swing.GroupLayout panTituloLenteLayout = new javax.swing.GroupLayout(panTituloLente);
        panTituloLente.setLayout(panTituloLenteLayout);
        panTituloLenteLayout.setHorizontalGroup(
            panTituloLenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLenteLayout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(lblUf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTituloLenteLayout.setVerticalGroup(
            panTituloLenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panTrata.setBackground(new java.awt.Color(0, 0, 0));
        panTrata.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRATAMENTO");

        javax.swing.GroupLayout panTrataLayout = new javax.swing.GroupLayout(panTrata);
        panTrata.setLayout(panTrataLayout);
        panTrataLayout.setHorizontalGroup(
            panTrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTrataLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTrataLayout.setVerticalGroup(
            panTrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTrataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        chkTratAR.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkTratAR.setForeground(new java.awt.Color(51, 51, 51));
        chkTratAR.setText("AR");
        chkTratAR.setEnabled(false);

        chkTratFoto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkTratFoto.setForeground(new java.awt.Color(51, 51, 51));
        chkTratFoto.setText("Fotosenssíveis");
        chkTratFoto.setEnabled(false);

        chkTratColor.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkTratColor.setForeground(new java.awt.Color(255, 255, 255));
        chkTratColor.setText(" Coloração");
        chkTratColor.setEnabled(false);

        txtTrata.setEditable(false);
        txtTrata.setBackground(new java.awt.Color(255, 255, 255));
        txtTrata.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("AR");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Fotosenssíveis");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Coloração");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(chkTratAR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(81, 81, 81)
                .addComponent(chkTratFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(chkTratColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(46, 46, 46)
                .addComponent(txtTrata, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTratAR)
                    .addComponent(chkTratFoto)
                    .addComponent(chkTratColor)
                    .addComponent(txtTrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ARMAÇÃO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        chkOcCliente.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkOcCliente.setForeground(new java.awt.Color(255, 255, 255));
        chkOcCliente.setText("Oc Cliente");
        chkOcCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chkOcCliente.setEnabled(false);
        chkOcCliente.setFocusable(false);
        chkOcCliente.setOpaque(false);

        chkMetalTT.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkMetalTT.setForeground(new java.awt.Color(51, 51, 51));
        chkMetalTT.setText("Metal tt");
        chkMetalTT.setEnabled(false);

        chkMetalNy.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkMetalNy.setForeground(new java.awt.Color(51, 51, 51));
        chkMetalNy.setText("Metal Ny");
        chkMetalNy.setEnabled(false);
        chkMetalNy.setOpaque(false);

        chkAcetTT.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkAcetTT.setForeground(new java.awt.Color(51, 51, 51));
        chkAcetTT.setText("Acetato tt");
        chkAcetTT.setEnabled(false);
        chkAcetTT.setOpaque(false);

        chkAcetNy.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkAcetNy.setForeground(new java.awt.Color(255, 255, 255));
        chkAcetNy.setText("Acetato Ny");
        chkAcetNy.setEnabled(false);

        panEntrValSi.setBackground(new java.awt.Color(0, 0, 204));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor R$");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sinal R$");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Restante   R$");

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Entrega");

        txtEntrega.setEditable(false);
        txtEntrega.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrega.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEntrega)
                .addContainerGap())
        );

        txtValor.setEditable(false);
        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtSinal.setEditable(false);
        txtSinal.setBackground(new java.awt.Color(255, 255, 255));
        txtSinal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtRestante.setEditable(false);
        txtRestante.setBackground(new java.awt.Color(255, 255, 255));
        txtRestante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRestante.setForeground(new java.awt.Color(255, 0, 0));
        txtRestante.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panEntrValSiLayout = new javax.swing.GroupLayout(panEntrValSi);
        panEntrValSi.setLayout(panEntrValSiLayout);
        panEntrValSiLayout.setHorizontalGroup(
            panEntrValSiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrValSiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panEntrValSiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEntrValSiLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRestante))
                    .addGroup(panEntrValSiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panEntrValSiLayout.setVerticalGroup(
            panEntrValSiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEntrValSiLayout.createSequentialGroup()
                .addGroup(panEntrValSiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panEntrValSiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panEntrValSiLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panEntrValSiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panEntrValSiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Ref.");

        txtRef.setEditable(false);
        txtRef.setBackground(new java.awt.Color(255, 255, 255));
        txtRef.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Obs.");

        txtObs.setEditable(false);
        txtObs.setBackground(new java.awt.Color(255, 255, 255));
        txtObs.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panDadosLentes.setForeground(new java.awt.Color(255, 255, 255));

        chkMFocal.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkMFocal.setForeground(new java.awt.Color(255, 255, 255));
        chkMFocal.setText("Multifocais");
        chkMFocal.setEnabled(false);

        txtMultifocais.setEditable(false);
        txtMultifocais.setBackground(new java.awt.Color(255, 255, 255));
        txtMultifocais.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        chkVSimples.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkVSimples.setForeground(new java.awt.Color(255, 255, 255));
        chkVSimples.setText("Visão Simples");
        chkVSimples.setEnabled(false);
        chkVSimples.setFocusPainted(false);
        chkVSimples.setFocusable(false);
        chkVSimples.setHideActionText(true);

        txtVisaoSimples.setEditable(false);
        txtVisaoSimples.setBackground(new java.awt.Color(255, 255, 255));
        txtVisaoSimples.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtBifocais.setEditable(false);
        txtBifocais.setBackground(new java.awt.Color(255, 255, 255));
        txtBifocais.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        chkBFocais.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        chkBFocais.setForeground(new java.awt.Color(255, 255, 255));
        chkBFocais.setText("Bifocais");
        chkBFocais.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel20.setText("Visão Simples");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel21.setText("Bifocais");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel22.setText("Multifocais");

        javax.swing.GroupLayout panDadosLentesLayout = new javax.swing.GroupLayout(panDadosLentes);
        panDadosLentes.setLayout(panDadosLentesLayout);
        panDadosLentesLayout.setHorizontalGroup(
            panDadosLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLentesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(chkVSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVisaoSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(chkBFocais, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBifocais, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(chkMFocal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMultifocais, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        panDadosLentesLayout.setVerticalGroup(
            panDadosLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLentesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panDadosLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMultifocais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkMFocal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addGroup(panDadosLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBifocais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkBFocais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGroup(panDadosLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkVSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(txtVisaoSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnFechar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setActionCommand("");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Digite o Nome:");

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyTyped(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tabClientes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tabClientes.setUpdateSelectionOnSort(false);
        tabClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabClientes);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setText("Oc. Clientes");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setText("Metal TT");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setText("Metal Ny");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setText("Acetato tt");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel19.setText("Acetato Ny");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panTituloLente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panTrata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PanAdicao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panDadosLentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(chkOcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(72, 72, 72)
                        .addComponent(chkMetalTT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(80, 80, 80)
                        .addComponent(chkMetalNy, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addGap(65, 65, 65)
                        .addComponent(chkAcetTT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addGap(77, 77, 77)
                        .addComponent(chkAcetNy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(panEntrValSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel10))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PanAdicao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panTituloLente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panDadosLentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(panTrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkOcCliente)
                        .addComponent(jLabel16))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkMetalTT)
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkMetalNy)
                        .addComponent(jLabel17)
                        .addComponent(chkAcetTT)
                        .addComponent(chkAcetNy)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)))
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panEntrValSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jScrollPane1.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        Alterar = true;
        //Habilitar os campos
        
            txtCliente.setEditable(true);
            txtEndereco.setEditable(true);
            txtCidade.setEditable(true);
            cmbEstados.setEditable(true);
            txtMail.setEditable(true);
            txtTel.setEditable(true);
            txtCel.setEditable(true);
            
            //Adição
            //Longe Olho Direito
            txtLongEsfDir.setEnabled(true);
            txtLongeCilDir.setEnabled(true);
            txtLongeEixDir.setEnabled(true);
            
            //Longe Olho Esquerdo
            txtLongeEsfEsq.setEditable(true);
            txtLongeCilEsq.setEditable(true);
            txtLongeEixEsq.setEditable(true);
            
            //Perto Olho Direito
            txtPertoEsfDir.setEditable(true);
            txtPertoCilDir.setEditable(true);
            txtPertoEixDir.setEditable(true);
            
            //Perto Olho Esquerdo
            txtPertoEsfEsq.setEditable(true);
            txtPertoCilEsq.setEditable(true);
            txtPertoEixEsq.setEditable(true);
            
            //Altura, DNP
            txtAltura.setEditable(true);
            txtD.setEditable(true);
            txtDNP7.setEditable(true);
            txtDNP8.setEditable(true);
            
            //Lentes
            chkVSimples.setEnabled(true);
            txtVisaoSimples.setEditable(true);
            chkBFocais.setEnabled(true);
            txtBifocais.setEditable(true);
            chkMFocal.setEnabled(true);
            txtMultifocais.setEditable(true);
            
            //Tratamento
            chkTratAR.setEnabled(true);
            chkTratFoto.setEnabled(true);
            chkTratColor.setEnabled(true);
            txtTrata.setEditable(true);
            
            //Armação
            chkOcCliente.setEnabled(true);
            chkMetalTT.setEnabled(true);
            chkMetalNy.setEnabled(true);
            chkAcetTT.setEnabled(true);
            chkAcetNy.setEnabled(true);
            
            txtRef.setEditable(true);
            txtObs.setEditable(true);
            
            //Entrega, valor e restante
            txtEntrega.setEditable(true);
            txtValor.setEditable(true);
            txtSinal.setEditable(true);
            txtRestante.setEditable(true);
            
            btnSalvar.setEnabled(true);
            btnAlterar.setEnabled(false);
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int resposta = JOptionPane.showConfirmDialog(null,"Deseja excluir este registro?");
        if(resposta == JOptionPane.YES_OPTION){
            try{
                PreparedStatement apagar = Banco.Conn.prepareStatement("DELETE FROM dados WHERE id=?"); 
                
                int id = Integer.parseInt(Banco.Rs.getString("id"));
                JOptionPane.showMessageDialog(null,"O id é "+id);
                
                apagar.setInt(1,id);
                apagar.executeUpdate();
                JOptionPane.showMessageDialog(null,"Exclusão Realizada com Sucesso");
                
                //Atualiza a consulta
                Banco.executaSQL("SELECT * FROM dados");
            }catch(SQLException ex){
                Logger.getLogger(PesqCompleta.class.getName()).log(Level.SEVERE,null,ex);                
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
       
        //Fechando apenas a janela
        this.dispose();
        
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        PreencherTabela("SELECT * FROM dados WHERE UPPER (cliente) LIKE '%"+txtPesquisa.getText().toUpperCase()+"%'");
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
        try {
            PreparedStatement alteracao = Banco.Conn.prepareStatement("UPDATE dados SET cliente=?, endereco=?,cidade=?,uf=?,email=?,telefone=?,celular=?,esf_long_od=?,cil_long_od=?,"
                    + "eix_long_od=?,esf_long_oe=?,cil_long_oe=?,eix_long_oe=?,esf_pert_od=?,cil_pert_od=?,eix_pert_od=?,esf_pert_oe=?,cil_pert_oe=?,eix_pert_oe=?,altura=?,d=?,dnp_esq=?,"
                    + "dnp_dir=?,v_simples=?,txt_v_simples=?,bifocais=?,txt_bifocais=?,multi_focal=?,txt_multifocal=?,ar=?,foto=?,coloracao=?,obs_tratamento=?,oc_simples=?,metal_tt=?,"
                    + "metal_ny=?,acetato_tt=?,acetato_ny=?,ref=?,obs=?,entrega=?,valor=?,sinal=?,restante=? WHERE id=?");
            
            int id = Integer.parseInt(Banco.Rs.getString("id"));
            
            alteracao.setString(1,txtCliente.getText());
            alteracao.setString(2,txtEndereco.getText());
            alteracao.setString(3,txtCidade.getText());
            alteracao.setString(4,(String)cmbEstados.getSelectedItem());
            alteracao.setString(5,txtMail.getText());
            alteracao.setString(6,txtTel.getText());
            alteracao.setString(7,txtCel.getText());
            
            //Adição
            //Longe Olho Direito
            alteracao.setString(8,txtLongEsfDir.getText());
            alteracao.setString(9,txtLongeCilDir.getText());
            alteracao.setString(10,txtLongeEixDir.getText());
            
            //Longe Olho Esquerdo
            alteracao.setString(11,txtLongeEsfEsq.getText());
            alteracao.setString(12,txtLongeCilEsq.getText());
            alteracao.setString(13,txtLongeEixEsq.getText());
                
            //Perto Olho Direito
            alteracao.setString(14,txtPertoEsfDir.getText());
            alteracao.setString(15,txtPertoCilDir.getText());
            alteracao.setString(16,txtPertoEixDir.getText());
            
            //Perto Olho Esquerdo
            alteracao.setString(17,txtPertoEsfEsq.getText());
            alteracao.setString(18,txtPertoCilEsq.getText());
            alteracao.setString(19,txtPertoEixEsq.getText());
            
            //Altura, D, DNP
            alteracao.setString(20,txtAltura.getText());
            alteracao.setString(21,txtD.getText());
            alteracao.setString(22,txtDNP7.getText());
            alteracao.setString(23,txtDNP8.getText());
            
            alteracao.setBoolean(24, chkVSimples.isSelected());
            alteracao.setString(25, txtVisaoSimples.getText());
            alteracao.setBoolean(26, chkBFocais.isSelected());
            alteracao.setString(27, txtBifocais.getText());
            alteracao.setBoolean(28, chkMFocal.isSelected()); //checkbox Multifocais
            alteracao.setString(29, txtMultifocais.getText());
            
             //Tratamento
            alteracao.setBoolean(30, chkTratAR.isSelected()); //checkbox AR
            alteracao.setBoolean(31, chkTratFoto.isSelected()); //checkbox fotosensível
            alteracao.setBoolean(32, chkTratColor.isSelected()); //checkbox Coloração
            alteracao.setString(33, txtTrata.getText()); // Campo de texto do tratamento

            //Armação
            alteracao.setBoolean(34, chkOcCliente.isSelected()); //checkbox óculo do cliente
            alteracao.setBoolean(35, chkMetalTT.isSelected()); //checkbox Metal TT
            alteracao.setBoolean(36, chkMetalNy.isSelected()); //checkbox Metal NY
            alteracao.setBoolean(37, chkAcetTT.isSelected()); //chkbox acetato tt
            alteracao.setBoolean(38, chkAcetNy.isSelected()); //chkbox acetato ny

            alteracao.setInt(39, Integer.parseInt(txtRef.getText())); //campo ref
            alteracao.setString(40, txtObs.getText()); //campo obs

            //Entrega e valores
            alteracao.setString(41, txtEntrega.getText()); //campo data de entrega
            
            alteracao.setString(42, txtValor.getText()); //campo de valor total do produto
            alteracao.setString(43, txtSinal.getText()); //campo do valor do sinal
           
            //restante();
            alteracao.setString(44, txtRestante.getText());
            alteracao.setInt(45, id);
            
            alteracao.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            
            //Atualiza consulta
            Banco.executaSQL("SELECT * FROM dados"); // indica consulta
            
            //Habilitar os campos
        
            txtCliente.setEditable(false);
            txtEndereco.setEditable(false);
            txtCidade.setEditable(false);
            cmbEstados.setEditable(false);
            txtMail.setEditable(false);
            txtTel.setEditable(false);
            txtCel.setEditable(false);
            
            //Adição
            //Longe Olho Direito
            txtLongEsfDir.setEnabled(false);
            txtLongeCilDir.setEnabled(false);
            txtLongeEixDir.setEnabled(false);
            
            //Longe Olho Esquerdo
            txtLongeEsfEsq.setEditable(false);
            txtLongeCilEsq.setEditable(false);
            txtLongeEixEsq.setEditable(false);
            
            //Perto Olho Direito
            txtPertoEsfDir.setEditable(false);
            txtPertoCilDir.setEditable(false);
            txtPertoEixDir.setEditable(false);
            
            //Perto Olho Esquerdo
            txtPertoEsfEsq.setEditable(false);
            txtPertoCilEsq.setEditable(false);
            txtPertoEixEsq.setEditable(false);
            
            //Altura, DNP
            txtAltura.setEditable(false);
            txtD.setEditable(false);
            txtDNP7.setEditable(false);
            txtDNP8.setEditable(false);
            
            //Lentes
            chkVSimples.setEnabled(false);
            txtVisaoSimples.setEditable(false);
            chkBFocais.setEnabled(false);
            txtBifocais.setEditable(false);
            chkMFocal.setEnabled(false);
            txtMultifocais.setEditable(false);
            
            //Tratamento
            chkTratAR.setEnabled(false);
            chkTratFoto.setEnabled(false);
            chkTratColor.setEnabled(false);
            txtTrata.setEditable(false);
            
            //Armação
            chkOcCliente.setEnabled(false);
            chkMetalTT.setEnabled(false);
            chkMetalNy.setEnabled(false);
            chkAcetTT.setEnabled(false);
            chkAcetNy.setEnabled(false);
            
            txtRef.setEditable(false);
            txtObs.setEditable(false);
            
            //Entrega, valor e restante
            txtEntrega.setEditable(false);
            txtValor.setEditable(false);
            txtSinal.setEditable(false);
            txtRestante.setEditable(false);
            
            btnSalvar.setEnabled(false);
            btnAlterar.setEnabled(true);
            
            Alterar = false;
            
        } catch (SQLException ex) {
            Logger.getLogger(PesqCompleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClientesMouseClicked
        
        String nome = ""+tabClientes.getValueAt(tabClientes.getSelectedRow(),1);
        Banco.executaSQL("SELECT * From dados WHERE cliente='"+nome+"'");
        try {
            Banco.Rs.first();
            txtCliente.setText(Banco.Rs.getString("cliente"));
            txtEndereco.setText(Banco.Rs.getString("endereco"));
            txtCidade.setText(Banco.Rs.getString("cidade"));
            cmbEstados.setSelectedItem(Banco.Rs.getString("uf"));
            txtMail.setText(Banco.Rs.getString("email"));
            txtTel.setText(Banco.Rs.getString("telefone"));
            txtCel.setText(Banco.Rs.getString("celular"));
            
            //Adição
            //Longe Olho Direito
            txtLongEsfDir.setText(Banco.Rs.getString("esf_long_od"));
            txtLongeCilDir.setText(Banco.Rs.getString("cil_long_od"));
            txtLongeEixDir.setText(Banco.Rs.getString("eix_long_od"));
            
            //Longe Olho Esquerdo
            txtLongeEsfEsq.setText(Banco.Rs.getString("esf_long_oe"));
            txtLongeCilEsq.setText(Banco.Rs.getString("cil_long_oe"));
            txtLongeEixEsq.setText(Banco.Rs.getString("eix_long_oe"));
            
            //Perto Olho Direito
            txtPertoEsfDir.setText(Banco.Rs.getString("esf_pert_od"));
            txtPertoCilDir.setText(Banco.Rs.getString("cil_pert_od"));
            txtPertoEixDir.setText(Banco.Rs.getString("eix_pert_od"));
            
            //Perto Olho Esquerdo
            txtPertoEsfEsq.setText(Banco.Rs.getString("esf_pert_oe"));
            txtPertoCilEsq.setText(Banco.Rs.getString("cil_pert_oe"));
            txtPertoEixEsq.setText(Banco.Rs.getString("eix_pert_oe"));
            
            //Altura, DNP
            txtAltura.setText(Banco.Rs.getString("altura"));
            txtD.setText(Banco.Rs.getString("d"));
            txtDNP7.setText(Banco.Rs.getString("dnp_esq"));
            txtDNP8.setText(Banco.Rs.getString("dnp_dir"));
            
            //Lentes
            chkVSimples.setSelected(Banco.Rs.getBoolean("v_simples"));
            txtVisaoSimples.setText(Banco.Rs.getString("txt_v_simples"));
            chkBFocais.setSelected(Banco.Rs.getBoolean("bifocais"));
            txtBifocais.setText(Banco.Rs.getString("txt_bifocais"));
            chkMFocal.setSelected(Banco.Rs.getBoolean("multi_focal"));
            txtMultifocais.setText(Banco.Rs.getString("txt_multifocal"));
            
            //Tratamento
            chkTratAR.setSelected(Banco.Rs.getBoolean("ar"));
            chkTratFoto.setSelected(Banco.Rs.getBoolean("foto"));
            chkTratColor.setSelected(Banco.Rs.getBoolean("coloracao"));
            txtTrata.setText(Banco.Rs.getString("obs_tratamento"));
            
            //Armação
            chkOcCliente.setSelected(Banco.Rs.getBoolean("oc_simples"));
            chkMetalTT.setSelected(Banco.Rs.getBoolean("metal_tt"));
            chkMetalNy.setSelected(Banco.Rs.getBoolean("metal_ny"));
            chkAcetTT.setSelected(Banco.Rs.getBoolean("acetato_tt"));
            chkAcetNy.setSelected(Banco.Rs.getBoolean("acetato_ny"));
            
            txtRef.setText(Integer.toString(Banco.Rs.getInt("ref")));
            txtObs.setText(Banco.Rs.getString("obs"));
            
            //Entrega, valor e restante
            txtEntrega.setText(Banco.Rs.getString("entrega"));
            txtValor.setText(Banco.Rs.getString("valor"));
            txtSinal.setText(Banco.Rs.getString("sinal"));
            txtRestante.setText(Banco.Rs.getString("restante"));
            
        } catch (SQLException ex) {
            Logger.getLogger(PesqCompleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_tabClientesMouseClicked

    private void txtPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyTyped
        // Eliminará os números e os caracteres q entra no campo pesquisa.
        String caracteres = "0987654321'@#$%¨&*()|!=?/ ";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();//Consume(): consome a entrada e não executa
            JOptionPane.showMessageDialog(null,"Digite apenas o nome.");
        }
    }//GEN-LAST:event_txtPesquisaKeyTyped

    public void PreencherTabela(String SQL){
        ArrayList dados = new ArrayList(); //cirando uma lista de array
        String[] colunas = new String[]{"ID","CLIENTE","TELEFONE","CELULAR","ENTREGA"};
        Banco.executaSQL(SQL);
        
        try {
            Banco.Rs.first();
        
            do{
                
                dados.add(new Object[]{Banco.Rs.getInt("id"),Banco.Rs.getString("cliente"),Banco.Rs.getString("telefone"),Banco.Rs.getString("celular"),Banco.Rs.getString("entrega")});
                   
            } while(Banco.Rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(PesqCompleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados,colunas);
        tabClientes.setModel(modelo);
        
        tabClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabClientes.getColumnModel().getColumn(0).setResizable(false);
                        
        tabClientes.getColumnModel().getColumn(1).setPreferredWidth(450);
        tabClientes.getColumnModel().getColumn(1).setResizable(false);
        
        tabClientes.getColumnModel().getColumn(2).setPreferredWidth(170);
        tabClientes.getColumnModel().getColumn(2).setResizable(false);
        
        tabClientes.getColumnModel().getColumn(3).setPreferredWidth(170);
        tabClientes.getColumnModel().getColumn(3).setResizable(false);
        
        tabClientes.getColumnModel().getColumn(4).setPreferredWidth(140);
        tabClientes.getColumnModel().getColumn(4).setResizable(false);
        
        tabClientes.getTableHeader().setResizingAllowed(false);
        tabClientes.setAutoscrolls(rootPaneCheckingEnabled);
        tabClientes.setAutoResizeMode(tabClientes.AUTO_RESIZE_OFF);
        tabClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(PesqCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesqCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesqCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesqCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesqCompleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanAdicao3;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAcetNy;
    private javax.swing.JCheckBox chkAcetTT;
    private javax.swing.JCheckBox chkBFocais;
    private javax.swing.JCheckBox chkMFocal;
    private javax.swing.JCheckBox chkMetalNy;
    private javax.swing.JCheckBox chkMetalTT;
    private javax.swing.JCheckBox chkOcCliente;
    private javax.swing.JCheckBox chkTratAR;
    private javax.swing.JCheckBox chkTratColor;
    private javax.swing.JCheckBox chkTratFoto;
    private javax.swing.JCheckBox chkVSimples;
    private javax.swing.JComboBox cmbEstados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label lblCidade;
    private java.awt.Label lblData;
    private java.awt.Label lblUf;
    private java.awt.Label lblUf1;
    private java.awt.Label lblUf2;
    private java.awt.Label lblUf20;
    private java.awt.Label lblUf3;
    private java.awt.Label lblUf53;
    private java.awt.Label lblUf54;
    private java.awt.Label lblUf55;
    private java.awt.Label lblUf56;
    private java.awt.Label lblUf57;
    private java.awt.Label lblUf58;
    private java.awt.Label lblUf59;
    private java.awt.Label lblUf60;
    private java.awt.Label lblUf61;
    private java.awt.Label lblUf62;
    private java.awt.Label lblUf63;
    private java.awt.Label lblUf64;
    private java.awt.Label lblUf65;
    private java.awt.Label lblUf66;
    private java.awt.Label lblUf67;
    private java.awt.Label lblUf68;
    private javax.swing.JPanel panDados;
    private javax.swing.JPanel panDadosLentes;
    private javax.swing.JPanel panEntrValSi;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panTituloLente;
    private javax.swing.JPanel panTrata;
    private javax.swing.JTable tabClientes;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBifocais;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtDNP7;
    private javax.swing.JTextField txtDNP8;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtEntrega;
    private javax.swing.JTextField txtLongEsfDir;
    private javax.swing.JTextField txtLongeCilDir;
    private javax.swing.JTextField txtLongeCilEsq;
    private javax.swing.JTextField txtLongeEixDir;
    private javax.swing.JTextField txtLongeEixEsq;
    private javax.swing.JTextField txtLongeEsfEsq;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMultifocais;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPertoCilDir;
    private javax.swing.JTextField txtPertoCilEsq;
    private javax.swing.JTextField txtPertoEixDir;
    private javax.swing.JTextField txtPertoEixEsq;
    private javax.swing.JTextField txtPertoEsfDir;
    private javax.swing.JTextField txtPertoEsfEsq;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtRestante;
    private javax.swing.JTextField txtSinal;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtTrata;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVisaoSimples;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone_oculos.png")));
    }
}
