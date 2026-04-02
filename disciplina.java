package entidade;

public class disciplina {
    public String nome;
    public int id_disciplina;

    public disciplina(String nome, int id_disciplina) {
        this.nome = nome;
        this.id_disciplina = id_disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }
}