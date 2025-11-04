public class Livro extends Midia {
    private Integer qtdPaginas;
    private String autor;

    public Livro(String titulo, String editora, String dataPublicacao, Integer restricaoIdade, Integer qtdPaginas, String autor) {
        super(titulo, editora, dataPublicacao, restricaoIdade);

        if (qtdPaginas <= 0) {
            throw new IllegalArgumentException("a qtdPaginas do livro deve ser maior que 0");
        }

        if (autor.isBlank()) {
            throw new IllegalArgumentException("o campo autor não pode ser vazio");
        }

        this.qtdPaginas = qtdPaginas;
        this.autor = autor;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        if (qtdPaginas <= 0) {
            throw new IllegalArgumentException("a qtdPaginas do livro deve ser maior que 0");
        }
        this.qtdPaginas = qtdPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor.isBlank()) {
            throw new IllegalArgumentException("o campo autor não pode ser vazio");
        }
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "qtdPaginas=" + qtdPaginas +
                ", autor='" + autor + '\'' +
                '}';
    }
}
