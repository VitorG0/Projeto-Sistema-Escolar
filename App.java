package entidade;

import entidade.Aluno;
import entidade.Funcionario;
import entidade.Professor;
import entidade.disciplina;

public class App {

    public static void main(String[] args) {

        Aluno a = new Aluno();

        a.setNome("Pedro");
        a.setid_aluno(1200);

        System.out.println("===== ALUNO =====");
        System.out.println("Aluno: " + a.getNome());
        System.out.println("Matricula: " + a.getid_aluno());
        
        
        
        Funcionario b = new Funcionario(null, null, 0, 0);
        
        b.setNome("aroldo");
        b.setSalario(2000);
        b.setCargo("cordenador");
        b.setid_funcionario();

        System.out.println("\n===== FUNCIONARIO =====");
        System.out.println("\n Funcionario: " + b.getNome());
        System.out.println("salario: " + b.getSalario());
        System.out.println("Cargo: " + b.getCargo());
        
        
        Professor c = new Professor(null, 0, 0);
        
        c.setNome("Rodrigo");
        c.setId_professor(40);
        c.setSalario(2500);
        
        System.out.println("\n===== PROFESSOR =====");
        System.out.println("Professor: " + c.getNome());
        System.out.println("salario: " + c.getSalario());
       
        escola d = new escola(null, null, 0);
        
        d.setendereço("rua do padeiro 21");
        d.setnome("ITJ");
        d.setid_escola(1);
        
        System.out.println("\n===== Escola =====");
        System.out.println("\n escola: " + d.getnome());
        System.out.println("endereço: " + d.getendereço());
        
        disciplina e = new disciplina(null, 0);
        
        e.setNome("historia");
        e.setId_disciplina(0);
        
        System.out.println("\n===== disciplina =====");
        System.out.println("\n disciplina: " + e.getNome());
     
       
    }
    
    
}

		