import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double pi = 3.1415;
        int piInteiro = (int) pi;
        System.out.println(pi);
        System.out.println(piInteiro);

        System.out.println("-----------");
        double numero = 2;
        int numero1 = (int) numero;
        System.out.println(numero);
        System.out.println(numero1);

        int idade = 20;
        long idade1 = idade;
        int idade2 = (int) idade1;  
        System.out.println(idade2);
        
        float pi1 = 3.1415f;
        double pi2 = pi1;
        float pi3 = (float) pi2;
        System.out.println(pi3);

        char letra = 'A';
        String letra1 = String.valueOf(letra);
        String letra2 = Character.toString(letra);
        String letra3 = "" + letra;
        System.out.println(letra1);
        System.out.println(letra2);
        System.out.println(letra3);

        String faculdade = "Inatel";
        char primeiraLetra = faculdade.charAt(0);
        System.out.println(primeiraLetra);

        System.out.printf("Olá, mundo!");
        System.out.println("\nOlá, mundo 2!");
        System.out.printf("Hello world %d", 2);
        System.out.printf("\nInatel %.2f", 3.1415);
        System.out.printf("\nFaculdade %s", "Inatel");

        System.out.println("\n-------------------------");
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Entre com sua idade: ");
        int idade3 = teclado.nextInt();
        System.out.print("Entre com sua altura: ");
        double altura = teclado.nextDouble();
        // teclado.nextLine(); // Limpa o buffer (pega o \n)
        System.out.print("Entre com o seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("%d anos, %.2fm de altura, %s \n", idade3, altura, nome);
    }
}
