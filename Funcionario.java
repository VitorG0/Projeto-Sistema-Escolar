package entidade;

public class Funcionario {
    public String Nome;
    private double Salario;
    public String Cargo;
    public int id_funcionario;


    public Funcionario(String Nome, String Cargo, double Salario, int id_funcionario) {
        this.Nome = Nome;
        this.Cargo = Cargo;
        this.Salario = Salario;
        this.id_funcionario = id_funcionario;
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
    public void getid_funcionario(int id_funcionario) {
    	this.id_funcionario = id_funcionario;
    }
    public int setid_funcionario() {
    	return id_funcionario;
    }
}