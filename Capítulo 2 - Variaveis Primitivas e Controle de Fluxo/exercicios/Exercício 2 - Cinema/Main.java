public class Main {
    public static void main(String[] args) {
        var ingressosInteiros = 8;
        var ingressosMeiaEntrada = 5;
        var valorInteiro = 30.00;
        var valorMeia = 15.00;

        var totalInteiro = ingressosInteiros * valorInteiro;
        var totalMeia = ingressosMeiaEntrada * valorMeia;
        var totalSessao = totalInteiro + totalMeia;
        var media = totalSessao / (ingressosInteiros + ingressosMeiaEntrada);

        System.out.println("Total arrecadado com ingressos inteiros: " + totalInteiro);
        System.out.println("Total arrecadado com meia-entrada: " + totalMeia);
        System.out.println("Valor total arrecadado na sessão: " + totalSessao);
        System.out.println("Valor médio pago por ingresso: " + media);

    }
}