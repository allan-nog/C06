public class Professor extends Pessoa {
    public String disciplina; // Todos podem assistir uma aula
    private double[] notas; // Todas as notas somente o professor tem acesso
    protected String materiais; // Somente os matriculados tem acesso aos materiais

    public void ministrarAula(){ // Todos podem assistir uma aula
        System.out.println("Aula de " + disciplina);
    }

    @Override // Sobreescrita
    public void falar(){
        System.out.println("Explicar matéria");
    }
}
