package entidades;
//classe de professor
public class Professor {
    public String nome;
    private int salario;
    public String disciplina;

    public Professor(String nome, String disciplina, int salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getSalario() {
        return salario;
    }
}