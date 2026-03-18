public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Zumbi 1";
        zumbi1.vida = 90;

        zumbi2.nome = "Zumbi 2";
        zumbi2.vida = 10;

        System.out.println("O " + zumbi1.nome + " tem " + zumbi1.mostrarVida() + " de vida");
        System.out.println("O " + zumbi2.nome + " tem " + zumbi2.mostrarVida() + " de vida");

        zumbi1.transfereVida(zumbi2, 50);

        System.out.println("Agora o " + zumbi1.nome + " tem " + zumbi1.mostrarVida() + " de vida");
        System.out.println("Agora o " + zumbi2.nome + " tem " + zumbi2.mostrarVida() + " de vida");
    }
}