
public class Professor extends Pessoa {
    private String disciplinaTitular;

    public Professor(String nome, String disciplinaTitular) {
        super(nome);
        this.disciplinaTitular = disciplinaTitular;
    }

    public String getDisciplinaTitular() {
        return disciplinaTitular;
    }
}
