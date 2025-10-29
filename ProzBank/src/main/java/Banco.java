import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String agencia;
    private List<Conta> contas;


    public Banco(String agencia) {
        this.agencia = agencia;
        this.contas = new ArrayList<>();
    }

    public Conta buscarConta(String nrConta) {
        for (Conta conta : contas) {
            if (nrConta.equals(conta.getNrConta())) {
                return conta;
            }
        }
        return null;
    }

    public void adicinarConta(Conta conta) {
        this.contas.add(conta);
    }

    public String getAgencia() {
        return agencia;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "agencia='" + agencia + '\'' +
                ", contas=" + contas +
                '}';
    }
}
