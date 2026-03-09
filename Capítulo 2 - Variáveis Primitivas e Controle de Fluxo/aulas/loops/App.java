import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inatel = new Scanner(System.in);
        
        System.out.print("Entre com a quantidade: ");
        int qtd = inatel.nextInt();

        // while (qtd > 0) {
        //     System.out.println(qtd);
        //     qtd--;
        // }

        // do {
        //     System.out.println(qtd);
        //     qtd = qtd - 1;
        // } while (qtd > 0);

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int i = qtd; i > 0; i--){
            System.out.println(i);
        }

        int[] vetor = {1, 3, 6, 2};

        for (int numero: vetor){
            System.out.println(numero);
        }
        
        System.out.println("-------------------");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        inatel.close();

    }
}
