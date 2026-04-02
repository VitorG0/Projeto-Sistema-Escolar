package entidade;

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
        
        
        Escola b = new Escola();
        
        b.setNome("ITJ");
        b.setid_escola(1234);
        b.setEndereco("rua das flores");

        System.out.println("\n===== ESCOLA =====");
        System.out.println("\nEscola: " + b.getNome());
        System.out.println("ID: " + b.getid_escola());
        System.out.println("Endereco: " + b.getEndereco());
        
        
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