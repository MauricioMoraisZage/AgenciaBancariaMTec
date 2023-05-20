package AgenciaBancariaMTec;
import javax.swing.JOptionPane;

public class AcessarContasExistentes extends javax.swing.JFrame {
    ContaCliente conta1;
    Banco banco1;

    public AcessarContasExistentes() {
        initComponents();
    }
    public AcessarContasExistentes(Banco banco, ContaCliente conta) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Agencia Bancaria/ Acessar Contas existentes");
        conta1 = conta;
        banco1 = banco;
        String ver = String.valueOf(conta1.getNumConta());
        String verN = String.valueOf(conta1.getTitular());
        NConta.setText(ver);
        NomeConta.setText(verN);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Voltar2 = new javax.swing.JButton();
        ConsultarSaldo = new javax.swing.JButton();
        RealizarDeposito = new javax.swing.JButton();
        RealizarSaque = new javax.swing.JButton();
        RealizarTranf = new javax.swing.JButton();
        Movimentos = new javax.swing.JButton();
        NConta = new javax.swing.JLabel();
        NomeConta = new javax.swing.JLabel();
        Conta1 = new javax.swing.JLabel();
        Conta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Acessar Contas Existentes");

        Voltar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Voltar2.setForeground(new java.awt.Color(0, 153, 255));
        Voltar2.setText("Voltar");
        Voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27))))
        );

        ConsultarSaldo.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        ConsultarSaldo.setForeground(new java.awt.Color(0, 102, 255));
        ConsultarSaldo.setText("Consultar saldo");
        ConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSaldoActionPerformed(evt);
            }
        });

        RealizarDeposito.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        RealizarDeposito.setForeground(new java.awt.Color(0, 102, 255));
        RealizarDeposito.setText("Realizar depósito");
        RealizarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarDepositoActionPerformed(evt);
            }
        });

        RealizarSaque.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        RealizarSaque.setForeground(new java.awt.Color(0, 102, 255));
        RealizarSaque.setText("Realizar saque");
        RealizarSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarSaqueActionPerformed(evt);
            }
        });

        RealizarTranf.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        RealizarTranf.setForeground(new java.awt.Color(0, 102, 255));
        RealizarTranf.setText("Realizar transferência");
        RealizarTranf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarTranfActionPerformed(evt);
            }
        });

        Movimentos.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Movimentos.setForeground(new java.awt.Color(0, 102, 255));
        Movimentos.setText("Consultar movimentos");
        Movimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimentosActionPerformed(evt);
            }
        });

        Conta1.setText("Nome:");

        Conta2.setText("Conta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RealizarTranf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RealizarSaque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RealizarDeposito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsultarSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Movimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Conta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Conta1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeConta, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NConta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Conta2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NConta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeConta)
                    .addComponent(Conta1))
                .addGap(40, 40, 40)
                .addComponent(ConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RealizarDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RealizarSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RealizarTranf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Movimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSaldoActionPerformed
        try{
            JOptionPane.showMessageDialog(rootPane, "Saldo Actual: " +conta1.getSaldo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_ConsultarSaldoActionPerformed

    private void RealizarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarDepositoActionPerformed
        try {
            //Para deposito...
            String M1 = JOptionPane.showInputDialog(null, "Digite o tipo de moeda que quer depositar (Euro, Dolar, Kwanza): ");
            String T = JOptionPane.showInputDialog("Digite o valor do depósito: ");
            double valorDeposito = Double.valueOf(T);
            conta1.depositar(valorDeposito, M1.toUpperCase());
            double Conv = conta1.ConverterMoeda(M1.toUpperCase(), valorDeposito);      
            JOptionPane.showMessageDialog(null,"Depósito de: "+Conv+" KZ");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_RealizarDepositoActionPerformed

    private void RealizarSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarSaqueActionPerformed
        // TODO add your handling code here:
        try {
            //Para Sacar...
            //double VConvtdo = ConverterMoeda(MoedaI,valor);
            String Moeda = JOptionPane.showInputDialog("Digite o tipo de moeda que quer sacar (euro, dolar, kwanza): ");
            double valorSaque = Double.valueOf(JOptionPane.showInputDialog("Digite o valor do saque: "));
            conta1.sacar(valorSaque, Moeda.toUpperCase());                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_RealizarSaqueActionPerformed

    private void RealizarTranfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarTranfActionPerformed
        // TODO add your handling code here:
        try {
            //Para Transferencia de valores../////////////////////////////
            //transferir(double valor, ContaCliente outraConta, String MoedaI)
            int numeroContaDestino = Integer.valueOf(JOptionPane.showInputDialog("Digite o número da conta para transferir:  "));
                    ContaCliente contaDestino = banco1.buscarConta(numeroContaDestino);
                    if (contaDestino == null) {
                        JOptionPane.showMessageDialog(null,"Conta destino não encontrada!");
                    }
                    else if(contaDestino.getNumConta() == conta1.getNumConta()){
                        JOptionPane.showMessageDialog(null,"Impossível transferir money para você mesmo!");
                    }
                    else{
                        String Moeda = JOptionPane.showInputDialog("Digite a moeda da transferência (dolar, euro ou kwanza): ");
                        double valorTransf = Double.valueOf(JOptionPane.showInputDialog("Digite o valor da transferência: ")); 
                        conta1.transferir(valorTransf, contaDestino, Moeda.toUpperCase());   
                    }
     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_RealizarTranfActionPerformed

    private void MovimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovimentosActionPerformed
        setVisible(false);
        new movimentos(banco1,conta1).setVisible(true);
    }//GEN-LAST:event_MovimentosActionPerformed

    private void Voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar2ActionPerformed
        setVisible(false);
        new Menu(banco1,conta1).setVisible(true);
    }//GEN-LAST:event_Voltar2ActionPerformed

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
            java.util.logging.Logger.getLogger(AcessarContasExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcessarContasExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcessarContasExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcessarContasExistentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcessarContasExistentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarSaldo;
    private javax.swing.JLabel Conta1;
    private javax.swing.JLabel Conta2;
    private javax.swing.JButton Movimentos;
    private javax.swing.JLabel NConta;
    private javax.swing.JLabel NomeConta;
    private javax.swing.JButton RealizarDeposito;
    private javax.swing.JButton RealizarSaque;
    private javax.swing.JButton RealizarTranf;
    private javax.swing.JButton Voltar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
