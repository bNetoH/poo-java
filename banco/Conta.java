package banco;

public class Conta {
    private int numero;
    private String dono;
    protected double saldo;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int obterNumConta() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}