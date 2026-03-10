public class Faculdade {
    public String nome;
    private Professor professor; // Associação

    public void ministrarAulas(){
        professor.ministrarAula();
    }
}
