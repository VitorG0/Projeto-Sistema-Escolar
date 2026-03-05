// pacote onde ficam as entidades do sistema
package entidades;



// esse import aqui é pra vc conseguir digitar diretamento no terminal
import java.util.Scanner;

// é a classe principal
public class App {
    public static void main(String[] args) {
        // esse aq vai "ler" o seu teclado
        Scanner sc = new Scanner(System.in);

        // vai guardar as informação pra no final criar a lista
        java.util.List<Aluno> alunos = new java.util.ArrayList<>();
        java.util.List<Funcionario> funcionarios = new java.util.ArrayList<>();
        java.util.List<Professor> professores = new java.util.ArrayList<>();

        System.out.println("Digite os dados. Deixe o nome em branco para encerrar cada lista.");
        

        // Essa parte do codigo vai ler as informações de varios Alunos
        // aperta ENTER sem digitar nada pra passar pros funcionarios
        while (true) {
            System.out.print("Nome do aluno (ENTER para sair): ");
            String nome = sc.nextLine();
            if (nome.isBlank()) break;

            System.out.print("Turma: ");
            String turma = sc.nextLine();

            System.out.print("Matrícula: ");
            int matricula = Integer.parseInt(sc.nextLine());

            alunos.add(new Aluno(nome, turma, matricula));
        }

        // essa daqui vai ler dos Funcionários
        // aperta ENTER sem digitar nada pra passar pros professor
        while (true) {
            System.out.print("Nome do funcionário (ENTER para sair): ");
            String fnome = sc.nextLine();
            if (fnome.isBlank()) break;

            System.out.print("Cargo: ");
            String cargo = sc.nextLine();

            System.out.print("Salário: ");
            int salario = Integer.parseInt(sc.nextLine());

            funcionarios.add(new Funcionario(fnome, cargo, salario));
        }

        // vai ler dos professores
        while (true) {
            System.out.print("Nome do professor (ENTER para sair): ");
            String pnome = sc.nextLine();
            if (pnome.isBlank()) break;

            System.out.print("Disciplina: ");
            String disciplina = sc.nextLine();

            System.out.print("Salário: ");
            int psalario = Integer.parseInt(sc.nextLine());

            professores.add(new Professor(pnome, disciplina, psalario));
            
        }

        sc.close();

        //  ent, é aq que vai criar a lista
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome() + ", Turma: " + a.getTurma() + ", Matrícula: " + a.getMatricula());
        }

        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ", Cargo: " + f.getCargo() + ", Salário: " + f.getSalario());
        }

        System.out.println("\n--- Lista de Professores ---");
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome() + ", Disciplina: " + p.getDisciplina() + ", Salário: " + p.getSalario());
        }
    }
}