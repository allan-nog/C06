import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas = 3;

        System.out.print("Quantidade de lanches consumidos na primeira hora: ");
        int primeiraHora = teclado.nextInt();

        System.out.print("Quantidade de lanches consumidos na segunda hora: ");
        int segundaHora = teclado.nextInt();

        System.out.print("Quantidade de lanches consumidos na terceira hora: ");
        int terceiraHora = teclado.nextInt();

        int soma = primeiraHora + segundaHora + terceiraHora;
        double media = (double) soma / horas;

        System.out.println("Total: " + soma);
        System.out.println("Média: " + media);

        teclado.close();
    }
}
