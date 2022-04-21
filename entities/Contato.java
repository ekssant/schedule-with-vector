package exerc01;

public class Contato {

    private String Nome;
    private long Identidade;
    private long Telefone;

    public Contato(String Nome, long Identidade, long Telefone) {
        this.Nome = Nome;
        this.Identidade = Identidade;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public long getIdentidade() {
        return Identidade;
    }

    public long getTelefone() {
        return Telefone;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdentidade(long Identidade) {
        this.Identidade = Identidade;
    }

    public void setTelefone(long Telefone) {
        this.Telefone = Telefone;
    }

}
