import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.print("Digite um número(1 a 10): ");
        int num = teclado.nextInt();

        while (num != x) {
            System.out.print("Número INCORRETO! Digite outro: ");
            num = teclado.nextInt();
        }

        System.out.println("Parabéns, você ACERTOU!");

        teclado.close();
    }
}
