public class Conta {

    // Atributos
    public double saldo;
    public double limite;
    public int numeroConta;
    public String nomeDono;

    // Métodos
    public void deposito(double quantia){
        this.saldo += quantia;
    }

    public void saque(double quantia) {
        this.saldo -= quantia;
    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
