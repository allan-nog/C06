public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        Arma a1 = new Arma();

        a1.nome = "AK47";
        a1.poder = 92;
        a1.resistencia = 480;
        a1.descricao = "fuzil de assalto soviético";

        p1.nome = "Allan";
        p1.pontos = 100;
        p1.arma = a1;

        a1.mostrarInfoArma();

        p1.usarArma();
        p1.tomarDano();

        a1.mostrarInfoArma();
    }
}
