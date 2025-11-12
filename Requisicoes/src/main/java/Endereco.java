public class Endereco {

    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;


    public Endereco(EnderecoDTO enderecoDTO) {
        this.cep = enderecoDTO.cep();
        this.rua = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.cidade = enderecoDTO.localidade();
        this.estado = enderecoDTO.estado();
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
