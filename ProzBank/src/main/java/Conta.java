import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conta {
    private String nrConta;
    private String titular;
    private Double saldo;
    private List<String> extrato = new ArrayList<>();


    public Conta(String titular, String nrConta) {
        if (titular.isBlank()) {
            throw new IllegalArgumentException("o campo titular não pode estar vazio");
        }
        this.titular = titular;
        this.saldo = 0.00;
        this.nrConta = nrConta;
    }

    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("o valor deve ser maior que 0");
        }
        this.saldo += valor;
        extrato.add(
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")) +
                        " - Depósito - R$" + valor
        );
    }

    public void sacar(Double valor) {
        if (valor > saldo) {
            throw new UnsupportedOperationException("saldo insuficiente para operação");
        }
        this.saldo -= valor;
        extrato.add(
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")) +
                        " - Saque - R$" + valor
        );
    }

    public String getNrConta() {
        return nrConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.isBlank()) {
            throw new IllegalArgumentException("o campo titular não pode estar vazio");
        }
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<String> getExtrato() {
        return extrato;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nrConta='" + nrConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

