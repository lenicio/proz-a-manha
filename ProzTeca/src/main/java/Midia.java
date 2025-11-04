public abstract class Midia {
    private String titulo;
    private String editora;
    private String dataPublicacao;
    private Integer restricaoIdade;

    public Midia(String titulo, String editora, String dataPublicacao, Integer restricaoIdade) {

        if (titulo.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }

        if (editora.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }
        if (dataPublicacao.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }
        if (restricaoIdade < 0 || restricaoIdade > 18) {
            throw new IllegalArgumentException("faixa de idade permitida 0-18");
        }

        this.titulo = titulo;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.restricaoIdade = restricaoIdade;
    }

    public Midia(String titulo, String dataPublicacao, Integer restricaoIdade) {

        if (titulo.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }

        if (dataPublicacao.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }
        if (restricaoIdade < 0 || restricaoIdade > 18) {
            throw new IllegalArgumentException("faixa de idade permitida 0-18");
        }

        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.restricaoIdade = restricaoIdade;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }

        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        if (editora.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }
        this.editora = editora;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        if (dataPublicacao.isBlank()) {
            throw new IllegalArgumentException("titulo não pode estar vazio");
        }
        this.dataPublicacao = dataPublicacao;
    }

    public Integer getRestricaoIdade() {
        return restricaoIdade;
    }

    public void setRestricaoIdade(Integer restricaoIdade) {
        if (restricaoIdade < 0 || restricaoIdade > 18) {
            throw new IllegalArgumentException("faixa de idade permitida 0-18");
        }
        this.restricaoIdade = restricaoIdade;
    }
}
