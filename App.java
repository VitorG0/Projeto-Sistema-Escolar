package main;

import entidade.Aluno;
import entidade.Funcionario;
import entidade.Professor;

public class App {

    public static void main(String[] args) {

        Aluno a = new Aluno();

        a.setNome("Pedro");
        a.setMatricula(5444);
        a.setTurma("3a");

        System.out.println("===== ALUNO =====");
        System.out.println("Aluno: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Turma: " + a.getTurma());
        
        
        Funcionario b = new Funcionario();
        
        b.setNome("aroldo");
        b.setSalario(2000);
        b.setCargo("cordenador");

        System.out.println("\n===== FUNCIONARIO =====");
        System.out.println("\n Funcionario: " + b.getNome());
        System.out.println("salario: " + b.getSalario());
        System.out.println("Cargo: " + b.getCargo());
        
        
        Professor c = new Professor();
        
        c.setNome("Rodrigo");
        c.setDisciplina("POO");
        c.setSalario(2500);
        
        System.out.println("\n===== PROFESSOR =====");
        System.out.println("Professor: " + c.getNome());
        System.out.println("salario: " + c.getSalario());
        System.out.println("Disciplina: " + c.getDisciplina());
        
        
    }
}