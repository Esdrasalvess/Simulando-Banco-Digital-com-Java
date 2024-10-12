import Entities.Cliente;
import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Teste");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        cc.depositar(1234);
        cc.transferir(267, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}