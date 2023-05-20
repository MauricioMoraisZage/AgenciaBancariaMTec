package AgenciaBancariaMTec;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Banco{
    public List<ContaCliente>contas;
    //public List<ContaCliente>ContasEmp;
   
    public Banco() {
        contas = new ArrayList<>();
    }
    public void abrirConta(TipoConta tipo, String nom, String bi, ArrayList<String>Tel) {         
        contas.add(new ContaCliente(tipo, nom, bi, Tel));
    }
    
    public ContaCliente buscarConta(int NumConta) {
        for (ContaCliente conta : contas) {
            if (conta.getNumConta() == NumConta) {
                return conta;
            }
        } return null;
    }
    
    public void eliminarConta(int numConta) {
        ContaCliente conta = buscarConta(numConta);
        if (conta != null) {
            contas.remove(conta);
            JOptionPane.showMessageDialog(null, "Conta " + numConta + " eliminada com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Conta " + numConta + " não encontrada.");
        }
    }
    
}

