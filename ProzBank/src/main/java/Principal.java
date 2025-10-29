public class Principal {
    public static void main(String[] args) {

        Banco banco = new Banco("0001");

        banco.adicinarConta(new Conta("Lenício Jr", "101010"));
        banco.adicinarConta(new Conta("Marcelo", "101011"));
        banco.adicinarConta(new Conta("Bruno", "101012"));

        Conta conta = banco.buscarConta("101010");
        conta.depositar(100.00);
        System.out.println(conta);

    }
}
