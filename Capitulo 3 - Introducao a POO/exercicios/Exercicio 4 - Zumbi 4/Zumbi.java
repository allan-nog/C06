public class Zumbi {
    public String nome;
    public double vida;

    double mostrarVida(){
        return this.vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if (this.vida >= quantia){
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        } else {
            return false;
        }
    }
}
