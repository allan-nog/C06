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
            if (num < x){
                System.out.print("Muito baixo! Digite outro: ");
            } else {
                System.out.print("Muito alto! Digite outro: ");
            }
            num = teclado.nextInt();
        }

        System.out.println("Parabéns, você ACERTOU!");

        teclado.close();
    }
}
