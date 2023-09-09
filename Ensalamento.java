import java.util.ArrayList;
import java.util.List;

public class Ensalamento {
    public static void main(String[] args) {

        Aluno[] alunos = {
                new Aluno("Alfredo", "TI"),
                new Aluno("Peterson", "ADM"),
                new Aluno("Wendel", "TI"),
                new Aluno("Ian", "ADM"),
                new Aluno("Debra", "TI"),
                new Aluno("Luana", "ADM"),
                new Aluno("Bruno", "TI"),
                new Aluno("Romeu", "ADM"),
                new Aluno("Julieta", "TI"),
                new Aluno("Maria", "ADM"),
                new Aluno("Capitú", "TI"),
                new Aluno("Bentinho", "ADM"),
                new Aluno("Amélia", "TI")
        };


        Professor[] professores = {
                new Professor("Mia", "POO do curso de TI"),
                new Professor("Saulo", "Estrutura de Dados do curso de TI"),
                new Professor("Paula", "BI do curso de ADM")
        };


        List<Turma> turmas = new ArrayList<>();

        for (Professor professor : professores) {
            Disciplina disciplina = new Disciplina(professor.getDisciplinaTitular());
            Turma turma = new Turma(professor, disciplina);
            for (Aluno aluno : alunos) {
                if (aluno.getCurso().equals(disciplina.getNome().split(" ")[4])) {
                    turma.adicionarAluno(aluno);
                }
            }
            turmas.add(turma);
        }


        for (Turma turma : turmas) {
            turma.mostrarDetalhes();
        }
    }
}
