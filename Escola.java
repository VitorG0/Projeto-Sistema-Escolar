package entidade;

public class Escola {

    private int id_escola;
    private String nome;
    private String endereco;

    public int getId_escola() {
        return id_escola;
    }

    public void setId_escola(int id_escola) {
        this.id_escola = id_escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}