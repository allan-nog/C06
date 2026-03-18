import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("NPA: ");
        int npa = teclado.nextInt();

        if (npa >= 60) {
            System.out.println("Aluno aprovado!");
        } else if (npa < 30) {
            System.out.println("Aluno reprovado!");
        } else {
            System.out.print("NP3: ");
            int np3 = teclado.nextInt();

            double nfa = (npa + np3) / 2.0;

            if (nfa >= 50) {
                System.out.println("Aluno aprovado com NP3!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }
        teclado.close();
    }
}