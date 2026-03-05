// classe de funcionario
package entidades;

public class Funcionario {
    public String nome;
    private int salario;
    public String cargo;

    public Funcionario(String nome, String cargo, int salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }
}