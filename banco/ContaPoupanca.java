package banco;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    public ContaPoupanca(int numero, String dono, double saldo) {
        super(numero, dono, saldo);
    }

    @Override
    public int compareTo(ContaPoupanca outra) {

        int comparacaoNumero = Integer.compare(this.obterNumConta(), outra.obterNumConta());
        
        if (comparacaoNumero != 0) {
            return comparacaoNumero;
        }
        
        return Double.compare(this.getSaldo(), outra.getSaldo());
    }
}