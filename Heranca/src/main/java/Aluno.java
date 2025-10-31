import java.util.Random;

public class Aluno extends Pessoa {
    private final String matricula;
    private Curso curso;

    public Aluno(String nome, String cpf, int idade, Curso curso) {
        super(nome, cpf, idade);

        Random random = new Random();
        this.matricula = String.valueOf(random.nextInt(999999));
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                ", matricula='" + matricula + '\'' +
                ", curso=" + curso +
                '}';
    }
}
