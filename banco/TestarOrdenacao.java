package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestarOrdenacao {
    public static void main(String[] args) {
        List<ContaPoupanca> listaContas = new ArrayList<>();

        listaContas.add(new ContaPoupanca(102, "Ana", 1500.0));
        listaContas.add(new ContaPoupanca(101, "Bruno", 2500.0));
        listaContas.add(new ContaPoupanca(103, "Carlos", 800.0));
        listaContas.add(new ContaPoupanca(101, "Diana", 1200.0));

        Collections.sort(listaContas);

        System.out.println("--- Contas Ordenadas por Numero e Saldo ---");
        for (ContaPoupanca conta : listaContas) {
            System.out.println("Conta numero: " + conta.obterNumConta() + " | Saldo: R$ " + conta.getSaldo());
        }
    }
}