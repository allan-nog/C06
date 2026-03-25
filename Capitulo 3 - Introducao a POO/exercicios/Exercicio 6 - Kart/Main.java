public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Kart k1 = new Kart("50", 80);
        Kart k2 = new Kart("100", 130);

        k1.piloto = p1;
        k2.piloto = p2;
    }
}
