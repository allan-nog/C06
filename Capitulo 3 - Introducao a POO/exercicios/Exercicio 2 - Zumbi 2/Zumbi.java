public class Zumbi {
    public String nome;
    public double vida;

    double mostrarVida(){
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
