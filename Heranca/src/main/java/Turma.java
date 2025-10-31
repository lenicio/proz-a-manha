import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String turno;
    private List<Aluno> alunos;

    public Turma(String nome, String turno) {
        this.nome = nome;
        this.turno = turno;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno alunos) {
        this.alunos.add(alunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", turno='" + turno + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
