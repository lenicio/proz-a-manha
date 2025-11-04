public class Dvd extends Midia {
    private Integer tempoDuracao;
    private boolean ehBluray;

    public Dvd(String titulo, String dataPublicacao, Integer restricaoIdade, Integer tempoDuracao) {
        super(titulo, dataPublicacao, restricaoIdade);
        if (tempoDuracao <= 0) {
            throw new IllegalArgumentException("o tempo de duração deve ser superior a 0");
        }
        this.tempoDuracao = tempoDuracao;
        this.ehBluray = false;
        System.out.println("Executando o 1º Construtor");
    }

    public Dvd(String titulo, String dataPublicacao, Integer restricaoIdade, Integer tempoDuracao, boolean ehBluray) {
        super(titulo, dataPublicacao, restricaoIdade);
        this.tempoDuracao = tempoDuracao;
        this.ehBluray = ehBluray;
        System.out.println("Executando o 2º Construtor");

    }

    public Integer getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(Integer tempoDuracao) {
        if (tempoDuracao <= 0) {
            throw new IllegalArgumentException("o tempo de duração deve ser superior a 0");
        }
        this.tempoDuracao = tempoDuracao;
    }

    public boolean isEhBluray() {
        return ehBluray;
    }

    public void setEhBluray(boolean ehBluray) {
        this.ehBluray = ehBluray;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "tempoDuracao=" + tempoDuracao +
                ", ehBluray=" + ehBluray +
                '}';
    }
}
