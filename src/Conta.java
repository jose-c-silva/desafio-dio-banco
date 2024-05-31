public class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void transferencia(double valor, Conta contaDebito){
        this.sacar(valor);
        contaDebito.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

}
