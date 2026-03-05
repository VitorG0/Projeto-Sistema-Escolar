package entidade;

public class Funcionario {
    public String Nome;
    private double Salario;
    public String Cargo;
    
    public Funcionario() {
    	
    }

    public Funcionario(String Nome, String Cargo, double Salario) {
        this.Nome = Nome;
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public String getNome() {
        return Nome;
    }
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return Cargo;
    }
    
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSalario() {
        return Salario;
    }
    
    public void setSalario(double Salario) {
    	this.Salario = Salario;
    }
}