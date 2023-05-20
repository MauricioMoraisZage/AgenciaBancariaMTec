package AgenciaBancariaMTec;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Criando os Tipos de Contas e Moedas do Banco...
enum TipoConta{ PESSOAL, EMPRESARIAL }

//Aplicando Polimorfismo....da Class Operações
public class ContaCliente{
    //Criando variaveis da conta
    private static int next=1;  //valor das contas automatico...
    private int ContN;
    private TipoConta ContaTipo;
    private double Saldo=0;
    private ArrayList<String> Movimentos;
    private boolean Bloqueada;
    private String Nome;
    private String BI;
    private ArrayList<String>Telfs = new ArrayList<>(); //Pra guardar os Telefones
    
    //Para Conversões de moedas...
    private double dolar = 1.00, euro = 0.9, kz = 500;
    String TipoM = " KZ";
    
    ContaCliente(){ }
    public ContaCliente(TipoConta tpoCont, String nom, String bi, ArrayList<String> telfs){
        this.ContaTipo = tpoCont;
        this.ContN = next++;
        this.Nome = nom;
        this.BI = bi;
        this.Saldo = 0;
        this.Movimentos = new ArrayList<>();
        Bloqueada = false;
        this.Telfs.addAll(telfs);
    }
    
    //Retorna o Titular da Conta...
    public String getTitular() {
        return Nome;
    }
    //Retorna o Titular da Conta...
    public String getBI() {
        return BI;
    }
    //Pegando o numero de conta...
    public int getNumConta() {  
        return ContN;
    }
    //Pegando o tipo de conta...
    public TipoConta getTipoConta() { 
        return ContaTipo;
    }
    //Pegando o Saldo da Conta...
    public String getSaldo() {
        Movimentos.add("Consulta de Saldo na conta!!!");
        return Saldo +TipoM;
    }
    //Pegando o Estado da Conta...
    public boolean isBloqueada() { 
        return Bloqueada;
    }

    //Depositanto na conta...
    public void depositar(double valor, String Moeda) {
        double VConvtd = ConverterMoeda(Moeda,valor);
        
        if (!Bloqueada) {
            Saldo += VConvtd;
            Movimentos.add("Depósito de " +VConvtd+getMoeda());
            //JOptionPane.showMessageDialog(null,"Operação realizada! Depósito de: "+VConvtd+getMoeda());
        }
    }  
    
    //Extrair Valor na conta...
    public void sacar(double valor, String Moeda) {
        double VConvtd = ConverterMoeda(Moeda, valor);
        
        if(!Bloqueada) {
            if ( (Saldo - VConvtd) < 5000) {//A conta será bloqueada se o Saldo for menor q 5000...
                Bloqueada = true;
                Movimentos.add("Conta bloqueada por saldo insuficiente");
            } 
            else {
                Saldo -= VConvtd;
                Movimentos.add("Saque de " +VConvtd+getMoeda());
                JOptionPane.showMessageDialog(null, "Operação realizada! Saque de: "+VConvtd +getMoeda());
            }
        }
    }
   
    //Transferir Dinheiro...
    public void transferir(double valor, ContaCliente outraConta, String Moeda){
        double VConvtd = ConverterMoeda(Moeda, valor);
        if(!Bloqueada) {
            if ( (Saldo - VConvtd) < 5000) {//A conta será bloqueada se o Saldo for menor q 5000...
                Bloqueada = true;
                Movimentos.add("Conta bloqueada por saldo insuficiente após a transferencia");
            } 
            else {
                Saldo -= VConvtd;
                Movimentos.add("Transferência de " + VConvtd+getMoeda() +" para a conta: " + outraConta.getNumConta());
                outraConta.depositar(VConvtd, Moeda);
                JOptionPane.showMessageDialog(null, "Operação realizada! Transferencia de: "+VConvtd+getMoeda());
            }
        }
    }
    
    //Consultar o movimento feito na conta...
    public ArrayList<String> getMovimentos(){
        return Movimentos;
    }
    //Mostrar Telefones das empresas...
    public ArrayList<String> getTel(){
        return Telfs;
    }
    
    public double ConverterMoeda(String Moeda, double v) {  
        if (Moeda.equals("KWANZA") || Moeda.equals("AOA") || Moeda.equals("KZ") || Moeda.equals("K")){
            return (v);
        }
        else if (Moeda.equals("DOLAR") || Moeda.equals("USA") || Moeda.equals("$") || Moeda.equals("D")){
            return (v*dolar*kz);
        }
        else if (Moeda.equals("EURO") || Moeda.equals("EUR") || Moeda.equals("E")){
            return (v*euro*kz);
        }
        else{
            JOptionPane.showMessageDialog(null,"Erro ao converter moeda! apenas [euro, dolar e kwanza]");
        }
        return 0;
    }
    
    private String getMoeda(){   
        return TipoM;
    }    

}   