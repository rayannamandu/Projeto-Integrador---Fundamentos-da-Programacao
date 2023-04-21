import entidades.ContaCorrente;
import entidades.ContaInvestimento;
import entidades.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 1000, 500, 20);
        ContaPoupanca cp = new ContaPoupanca(456, 2000, 0.01);
        ContaInvestimento ci = new ContaInvestimento(789, 5000, 0.08);


        cc.atualizarSaldo();
        cp.atualizarSaldo();
        ci.atualizarSaldo();

        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());
        System.out.println("Saldo da conta de investimento: " + ci.getSaldo());

        cc.depositar(500);
        cp.sacar(1000);
        ci.sacar(6000);

        System.out.println("Saldo da conta corrente após depósito: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança após saque: " + cp.getSaldo());
        System.out.println("Saldo da conta de investimento após saque: " + ci.getSaldo());

        cc.atualizarSaldo();
        cp.atualizarSaldo();
        ci.atualizarSaldo();

        System.out.println("Saldo da conta corrente após atualização: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança após atualização: " + cp.getSaldo());
        System.out.println("Saldo da conta de investimento após atualização: " + ci.getSaldo());


    }
}