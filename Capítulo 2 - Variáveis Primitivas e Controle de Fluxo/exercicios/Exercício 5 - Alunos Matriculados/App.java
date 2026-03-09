import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de alunos matriculados em C06: ");
        int qtdAlunos = teclado.nextInt();
        
        switch (qtdAlunos) {
            case 10:
            case 20:
                System.out.println("A sala utilizada será a I-6");
                break;
            case 30:
                System.out.println("A sala utilizada será a I-5");
                break;
            default:
                System.out.println("Número incorreto!");
                break;
        }
        teclado.close();
    }
}
