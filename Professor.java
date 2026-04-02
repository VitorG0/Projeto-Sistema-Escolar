package entidade;

public class Professor {

    private String nome;
    private int id_professor;
    private double salario;

    public Professor(String nome, int id_professor, double salario) {
        this.nome = nome;
        this.id_professor = id_professor;
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setId_professor(int id_professor){
        this.id_professor = id_professor;
    }

    public int getId_professor(){
        return id_professor;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}