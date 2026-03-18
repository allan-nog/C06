public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();

        zumbi.nome = "Zumbi";
        zumbi.vida = 90;
        zumbi.fome = 70;
        zumbi.forca = 50;

        zumbi.andar();
        zumbi.atacar("Zumbi 2");
        zumbi.receberDano(50);
        zumbi.comerCerebro();

        System.out.println("O " + zumbi.nome + " tem " + zumbi.vida + " de vida, " + zumbi.fome + " de fome e " + zumbi.forca + " de força.");
    }
}