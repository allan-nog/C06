package Exercicios.Ex001;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de ingressos inteiros vendidos: ");
        int ingressosInteiros = teclado.nextInt();

        System.out.print("Valor do ingresso inteiro: ");
        float valorInteiro = Float.parseFloat(teclado.next().replace(",", "."));

        System.out.print("Quantidade de ingressos meia entrada vendidos: ");
        int ingressosMeiaEntrada = teclado.nextInt();

        System.out.print("Valor do ingresso meia entrada: ");
        float valorMeia = Float.parseFloat(teclado.next().replace(",", "."));

        float totalInteiro = ingressosInteiros * valorInteiro;
        float totalMeia = ingressosMeiaEntrada * valorMeia;
        float totalSessao = totalInteiro + totalMeia;
        float mediaIngresso = totalSessao / (ingressosInteiros + ingressosMeiaEntrada);

        System.out.printf("Total arrecadado com ingressos inteiros: %.2f", totalInteiro);
        System.out.printf("\nTotal arrecadado com meia-entrada: %.2f", totalMeia);
        System.out.printf("\nValor total arrecadado na sessão: %.2f", totalSessao);
        System.out.printf("\nValor médio pago por ingresso: %.2f\n", mediaIngresso);

        teclado.close();
    }
}