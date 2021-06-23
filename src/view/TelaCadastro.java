package view;

import model.Cliente;
import model.Produto;
import util.Converte;
import util.Mascara;

/**
 *
 * @author jeffe
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null);
        setMask();
        tfCliNome.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnButtons = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tbTela = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        lbCliNome = new javax.swing.JLabel();
        lbCliCPF = new javax.swing.JLabel();
        lbCliFone = new javax.swing.JLabel();
        lbCliCelular = new javax.swing.JLabel();
        lbCliEmail = new javax.swing.JLabel();
        tfCliNome = new javax.swing.JTextField();
        tfCliEmail = new javax.swing.JTextField();
        tfCliCPF = new javax.swing.JFormattedTextField();
        tfCliFone = new javax.swing.JFormattedTextField();
        tfCliCelular = new javax.swing.JFormattedTextField();
        pnProduto = new javax.swing.JPanel();
        lbProDescricao = new javax.swing.JLabel();
        tfProDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        spProEstoque = new javax.swing.JSpinner();
        cpAtivo = new javax.swing.JCheckBox();
        pnProPreco = new javax.swing.JPanel();
        lbProCusto = new javax.swing.JLabel();
        lbProVenda = new javax.swing.JLabel();
        tfProCusto = new javax.swing.JFormattedTextField();
        tfProVenda = new javax.swing.JFormattedTextField();
        lbProCodigo = new javax.swing.JLabel();
        tfProCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnTitulo.setBackground(new java.awt.Color(52, 131, 183));
        pnTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo.setText("Cadastro");
        pnTitulo.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/InfoSysLogo-Pequeno.png"))); // NOI18N
        pnTitulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnButtons.setBackground(new java.awt.Color(52, 131, 183));
        pnButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btGravar.setBackground(new java.awt.Color(255, 255, 255));
        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGravar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(73, 73, 73))
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar)
                    .addComponent(btLimpar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tbTela.setBackground(new java.awt.Color(255, 255, 255));

        lbCliNome.setText("Nome: ");

        lbCliCPF.setText("CPF: ");

        lbCliFone.setText("Telefone: ");

        lbCliCelular.setText("Celular:");

        lbCliEmail.setText("Email:");

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbCliCPF)
                        .addGap(33, 33, 33)
                        .addComponent(tfCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbCliNome)
                        .addGap(25, 25, 25)
                        .addComponent(tfCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnClienteLayout.createSequentialGroup()
                            .addComponent(lbCliCelular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addComponent(tfCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnClienteLayout.createSequentialGroup()
                            .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCliFone)
                                .addComponent(lbCliEmail))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfCliFone, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(tfCliEmail)))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliNome)
                    .addComponent(tfCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliCPF)
                    .addComponent(tfCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliFone))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliCelular))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliEmail))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        tbTela.addTab("Clientes", pnCliente);

        lbProDescricao.setText("Descrição: ");

        jLabel1.setText("Estoque: ");

        spProEstoque.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spProEstoqueStateChanged(evt);
            }
        });

        cpAtivo.setText("Ativo");

        pnProPreco.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço"));

        lbProCusto.setText("Custo: ");

        lbProVenda.setText("Venda: ");

        javax.swing.GroupLayout pnProPrecoLayout = new javax.swing.GroupLayout(pnProPreco);
        pnProPreco.setLayout(pnProPrecoLayout);
        pnProPrecoLayout.setHorizontalGroup(
            pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProPrecoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbProCusto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(lbProVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        pnProPrecoLayout.setVerticalGroup(
            pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProPrecoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProCusto)
                    .addComponent(lbProVenda)
                    .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        lbProCodigo.setText("Código:");

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnProPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(cpAtivo))
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbProDescricao)
                                    .addComponent(lbProCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfProCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProCodigo)
                    .addComponent(tfProCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProDescricao)
                    .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpAtivo))
                .addGap(18, 18, 18)
                .addComponent(pnProPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbTela.addTab("Produto", pnProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        if (tbTela.getSelectedComponent() == pnCliente)
            gravarCliente();
        else if (tbTela.getSelectedComponent() == pnProduto)
            gravarProduto();
    }//GEN-LAST:event_btGravarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        if (tbTela.getSelectedComponent() == pnCliente)
            limparCliente();
        else if (tbTela.getSelectedComponent() == pnProduto)
            limparProduto();
    }//GEN-LAST:event_btLimparActionPerformed

    private void spProEstoqueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spProEstoqueStateChanged
        int v = (int) spProEstoque.getValue();
        if (v < 0) spProEstoque.setValue(0);
    }//GEN-LAST:event_spProEstoqueStateChanged

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }
    
    private void setMask() {
        tfCliCPF.setFormatterFactory(Mascara.getCpfMask());
        tfCliFone.setFormatterFactory(Mascara.getFoneFixofMask());
        tfCliCelular.setFormatterFactory(Mascara.getCelularfMask());
        tfProCusto.setFormatterFactory(Mascara.getValorMask());
        tfProVenda.setFormatterFactory(Mascara.getValorMask());
    }
    
    private void limparCliente(){
        tfCliNome.setText("");
        tfCliCPF.setText("");
        tfCliFone.setText("");
        tfCliCelular.setText("");
        tfCliEmail.setText("");
        tfCliNome.requestFocus();
    }
    
    private void limparProduto(){
        tfProCodigo.setText("");
        tfProDescricao.setText("");
        spProEstoque.setValue(0);
        cpAtivo.setSelected(false);
        tfProCusto.setText("0,00");
        tfProVenda.setText("0,00");
        tfProCodigo.requestFocus();
    }
    
    private void gravarCliente(){
        String nome = tfCliNome.getText();
        String cpf = tfCliCPF.getText();
        String fone = tfCliFone.getText();
        String celular = tfCliCelular.getText();
        String email = tfCliEmail.getText();
        System.out.println(new Cliente (nome, cpf, fone, celular, email));
        limparCliente();
    }
    
    private void gravarProduto(){
        int codigo = Integer.parseInt(tfProCodigo.getText());
        String descricao = tfProDescricao.getText();
        int estoque = (int) spProEstoque.getValue();
        double custo = Converte.textToValue(tfProCusto.getText());
        double valor = Converte.textToValue(tfProVenda.getText());
        System.out.println(new Produto(codigo, descricao, estoque, custo, valor));
        limparProduto();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JCheckBox cpAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbCliCPF;
    private javax.swing.JLabel lbCliCelular;
    private javax.swing.JLabel lbCliEmail;
    private javax.swing.JLabel lbCliFone;
    private javax.swing.JLabel lbCliNome;
    private javax.swing.JLabel lbProCodigo;
    private javax.swing.JLabel lbProCusto;
    private javax.swing.JLabel lbProDescricao;
    private javax.swing.JLabel lbProVenda;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnProPreco;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSpinner spProEstoque;
    private javax.swing.JTabbedPane tbTela;
    private javax.swing.JFormattedTextField tfCliCPF;
    private javax.swing.JFormattedTextField tfCliCelular;
    private javax.swing.JTextField tfCliEmail;
    private javax.swing.JFormattedTextField tfCliFone;
    private javax.swing.JTextField tfCliNome;
    private javax.swing.JTextField tfProCodigo;
    private javax.swing.JFormattedTextField tfProCusto;
    private javax.swing.JTextField tfProDescricao;
    private javax.swing.JFormattedTextField tfProVenda;
    // End of variables declaration//GEN-END:variables
}
