package entidade;

public class Escola {

    private String nome;
    private int id_escola;
    private String Endereco;

    public Escola() {
    }

    public Escola(String nome, int id_escola, String Endereco) {
        this.nome = nome;
        this.id_escola = id_escola;
        this.Endereco = Endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getid_escola() {
        return id_escola;
    }

    public void setid_escola(int id_escola) {
        this.id_escola = id_escola;
    }
    
    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

}