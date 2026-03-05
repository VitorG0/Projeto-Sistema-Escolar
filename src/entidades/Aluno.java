// sem muito oq falar, é a classe de aluno
package entidades;

public class Aluno {
    public String nome;
    private int matricula;
    public String turma;

    public Aluno(String nome, String turma, int matricula) {
        this.nome = nome;
        this.turma = turma;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}