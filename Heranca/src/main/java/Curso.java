import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
