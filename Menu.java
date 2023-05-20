/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgenciaBancariaMTec;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    Banco banco = new Banco();             
    ContaCliente conta;
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Agencia Bancaria");
    }
    //Recebendo os dados da Tabela JTable ao voltar para MeuBanco...
    Menu(Banco banco1, ContaCliente conta1) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Agencia Bancaria - Mauricio");
         conta = conta1;
         banco = banco1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcessarContaExistente = new javax.swing.JButton();
        EliminarConta = new javax.swing.JButton();
        SairExit = new javax.swing.JButton();
        VerTodasContas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        CriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AcessarContaExistente.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        AcessarContaExistente.setForeground(new java.awt.Color(0, 102, 255));
        AcessarContaExistente.setText("Acessar uma conta existente");
        AcessarContaExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessarContaExistenteActionPerformed(evt);
            }
        });

        EliminarConta.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        EliminarConta.setForeground(new java.awt.Color(0, 102, 255));
        EliminarConta.setText("Eliminar Contas");
        EliminarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarContaActionPerformed(evt);
            }
        });

        SairExit.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        SairExit.setForeground(new java.awt.Color(0, 102, 255));
        SairExit.setText("Sair");
        SairExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairExitActionPerformed(evt);
            }
        });

        VerTodasContas.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        VerTodasContas.setForeground(new java.awt.Color(0, 102, 255));
        VerTodasContas.setText("Ver Todas as Contas");
        VerTodasContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTodasContasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Banco MTec");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CriarConta.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        CriarConta.setForeground(new java.awt.Color(0, 102, 255));
        CriarConta.setText("Criar nova conta");
        CriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AcessarContaExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerTodasContas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SairExit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AcessarContaExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VerTodasContas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SairExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcessarContaExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessarContaExistenteActionPerformed
        try {
            String T = JOptionPane.showInputDialog("Digite o número da conta: ");
            int NumConta = Integer.valueOf(T);
            conta = banco.buscarConta(NumConta);

            if ((conta == null) || (conta.getNumConta()!= NumConta)){
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
            else{
                setVisible(false);
                new AcessarContasExistentes(banco,conta).setVisible(true);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }//GEN-LAST:event_AcessarContaExistenteActionPerformed

    private void EliminarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarContaActionPerformed
        try {
            String T = JOptionPane.showInputDialog("Digite o número da conta a ser eliminada: ");
            int numConta = Integer.valueOf(T);
            banco.eliminarConta(numConta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_EliminarContaActionPerformed

    private void SairExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairExitActionPerformed
        // TODO add your handling code here
        try {
            int a = JOptionPane.showConfirmDialog(null, "Voce quer terminar?", "Alert", JOptionPane.YES_NO_OPTION);
            if(a==0){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_SairExitActionPerformed

    private void VerTodasContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTodasContasActionPerformed
        try {
            String op = JOptionPane.showInputDialog("[1-Pessoal, 2-Empresarial, 3-Todas Contas]\nEscolha uma opção: ");
            int ver = Integer.valueOf(op);
            if(ver==1){
                setVisible(false);
                new VerContasCliente(banco,conta).setVisible(true);
            }
            else if(ver==2){
                setVisible(false);
                new VerContasEmpresas(banco,conta).setVisible(true);
            }
            else if(ver==3){
                setVisible(false);
                new TodasContas(banco,conta).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Opção inválida!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_VerTodasContasActionPerformed

    private void CriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarContaActionPerformed
        try{
            String T = JOptionPane.showInputDialog("Escolha o tipo de conta ( 1-Pessoal, 2-Empresarial ): ");
            int tipo = Integer.valueOf(T);
            TipoConta tipoConta;
            if(tipo==1){
                tipoConta = TipoConta.PESSOAL;
                String Nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
                String BI = JOptionPane.showInputDialog("Digite o BI do cliente: ");

                ArrayList<String> Tels = new ArrayList<>();
                String tel = JOptionPane.showInputDialog("Digite o Telefone do cliente: ");
                Tels.add(tel);
                Tels.add(" ");
                Tels.add(" ");
                banco.abrirConta(tipoConta, Nome, BI, Tels);
                Tels.clear();
                JOptionPane.showMessageDialog(null, "Conta pessoal criada com sucesso!");
            }
            else if(tipo==2){
                tipoConta = TipoConta.EMPRESARIAL;
                String Nome = JOptionPane.showInputDialog("Digite o nome da Empresa: ");
                String NIF = JOptionPane.showInputDialog("Digite a identificação da empresa[NIF]: ");
                String Socios = JOptionPane.showInputDialog("Quantos Sócios tem a Empresa[1,2,3...]: ");
                int N = Integer.valueOf(Socios);
                ArrayList<String> Telfs = new ArrayList<>();
                if(N>3){
                    JOptionPane.showMessageDialog(null, "A Empresa tem muitos Sócios, Precisamos no máximo 3 telefones!");
                    N=3;
                    for(int i=0; i<N; i++){
                        String tel = JOptionPane.showInputDialog("Digite o Nome e o Telefone do Sócio"+(i+1)+": ");
                        Telfs.add(tel);
                    }
                    banco.abrirConta(tipoConta, Nome, NIF, Telfs);
                    Telfs.clear();
                }
                else if(N==2){
                    for(int i=0; i<2; i++){
                        String tel = JOptionPane.showInputDialog("Digite o Nome e o Telefone do Sócio "+(i+1)+": ");
                        Telfs.add(tel);
                    }
                    Telfs.add("0");
                    banco.abrirConta(tipoConta, Nome, NIF, Telfs);
                    Telfs.clear();
                }
                else if(N==1){
                    String tel = JOptionPane.showInputDialog("Digite o Nome e o Telefone do Sócio 1: ");
                    Telfs.add(tel);
                    Telfs.add("0");
                    Telfs.add("0");
                    banco.abrirConta(tipoConta, Nome, NIF, Telfs);
                    Telfs.clear();
                }
                else{
                    for(int i=0; i<N; i++){
                        String tel = JOptionPane.showInputDialog("Digite o Nome e o Telefone do Sócio "+(i+1)+": ");
                        Telfs.add(tel);
                    }
                    banco.abrirConta(tipoConta, Nome, NIF, Telfs);
                    Telfs.clear();
                }
                JOptionPane.showMessageDialog(null, "Conta empresarial criada com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Opção invalida!!!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
    }//GEN-LAST:event_CriarContaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcessarContaExistente;
    private javax.swing.JButton CriarConta;
    private javax.swing.JButton EliminarConta;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton SairExit;
    private javax.swing.JButton VerTodasContas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
