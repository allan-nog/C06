public class Zumbi {
    public String nome;
    public int vida;
    public int fome;
    public int forca;

    void andar(){
        System.out.println(nome + " está andandando lentamente...");
    }

    void atacar(String alvo){
        System.out.println(nome + " atacou " + alvo);
    }

    void receberDano(int dano){
        this.vida -= dano;
    }

    void comerCerebro(){
        this.fome -= 10;
    }
}
