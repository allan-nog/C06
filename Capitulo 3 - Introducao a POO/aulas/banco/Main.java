public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.saldo = 700;
        conta.numeroConta = 1234;
        conta.limite = 400;
        conta.nomeDono = "Allan";

        System.out.println("Na conta de " + conta.nomeDono + " numero " +  conta.numeroConta + " tem R$" + conta.saldo);

        conta.deposito(1000);
        System.out.println("Na conta de " + conta.nomeDono + " numero " +  conta.numeroConta + " tem R$" + conta.saldo);

        conta.saque(500);
        System.out.println("Na conta de " + conta.nomeDono + " numero " +  conta.numeroConta + " tem R$" + conta.saldo);
    }
}