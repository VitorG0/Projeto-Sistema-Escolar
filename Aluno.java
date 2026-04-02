package entidade;

public class Aluno {

    public String nome;
    public int id_aluno;

    public Aluno() {
    }

    public Aluno(String nome, int id_aluno) {
        this.nome = nome;
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getid_aluno() {
        return id_aluno;
    }

    public void setid_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }
    
}