public class Kart {

    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(String cilindradas, int velocidadeMaxima){
        this.motor = new Motor();

        motor.cilindradas = cilindradas;
        motor.velocidadeMaxima = velocidadeMaxima;

        motor.mostraInfo();
    }

    public void pular(){
        System.out.println(this.nome + " pulou.");
    }

    public void soltarTurbo(){
        System.out.println(this.nome + " soltou o turbo.");
    }

    public void fazerDrift(){
        System.out.println(this.nome + " fez um drift.");
    }
}

