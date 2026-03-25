public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    void mostrarInfoArma(){
        System.out.println("A arma " + this.nome + " ( " + this.descricao + ") tem " + this.poder + " de poder e " + this.resistencia + " de resistência.");
    }
}
