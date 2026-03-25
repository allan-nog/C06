public class Personagem {
    public String nome;
    public int pontos;
    public Arma arma;

    void usarArma(){
        System.out.println(this.nome + " está usando a " + this.arma.nome);
        this.arma.resistencia -= 2;
    }

    void tomarDano(){
        System.out.println(this.nome + " tomou dano!");
        this.pontos -= 5;
        System.out.println("Vida atual: " + this.pontos);
    }
}
