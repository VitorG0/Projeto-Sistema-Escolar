package entidade;


public class Aluno {

    private String nome;
    private int id_aluno;
    private int matricula;
    private String turma;

    public Aluno() {
    }

    public Aluno(String nome, int matricula, int id_aluno, String turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.id_aluno = id_aluno;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}