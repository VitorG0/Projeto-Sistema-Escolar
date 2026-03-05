package entidade;

public class Professor {

    private String nome;
    private String disciplina;
    private double salario;

    public Professor() {
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}