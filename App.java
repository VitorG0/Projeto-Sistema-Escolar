package entidade;

import dao.AlunoDAO;
import java.util.List;

public class App {

    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

        System.out.println("===== TESTE DO DAO =====\n");

        // 1. Inserir alunos
        System.out.println("1. Inserindo alunos no banco...");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        aluno1.setMatricula(5444);
        aluno1.setTurma("3A");
        boolean resultado1 = alunoDAO.inserir(aluno1);
        System.out.println("Aluno 1 inserido: " + (resultado1 ? "SIM" : "NAO") + "\n");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setMatricula(5445);
        aluno2.setTurma("3A");
        boolean resultado2 = alunoDAO.inserir(aluno2);
        System.out.println("Aluno 2 inserido: " + (resultado2 ? "SIM" : "NAO") + "\n");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("João");
        aluno3.setMatricula(5446);
        aluno3.setTurma("3B");
        boolean resultado3 = alunoDAO.inserir(aluno3);
        System.out.println("Aluno 3 inserido: " + (resultado3 ? "SIM" : "NAO") + "\n");

        // 2. Listar todos os alunos
        System.out.println("2. Listando todos os alunos do banco...\n");
        List<Aluno> listaAlunos = alunoDAO.buscarTodos();

        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado.\n");
        } else {
            System.out.println("Total de alunos: " + listaAlunos.size() + "\n");
            for (int i = 0; i < listaAlunos.size(); i++) {
                Aluno a = listaAlunos.get(i);
                System.out.println("Aluno " + (i + 1) + ":");
                System.out.println("  Nome: " + a.getNome());
                System.out.println("  Matricula: " + a.getMatricula());
                System.out.println("  Turma: " + a.getTurma());
                System.out.println();
            }
        }

        // 3. Demonstrar outras entidades
        System.out.println("===== OUTRAS ENTIDADES =====\n");

        Escola escola = new Escola();
        escola.setNome("ITJ");
        escola.setId_escola(1234);
        escola.setEndereco("Rua das Flores");

        System.out.println("ESCOLA:");
        System.out.println("  Nome: " + escola.getNome());
        System.out.println("  ID: " + escola.getId_escola());
        System.out.println("  Endereco: " + escola.getEndereco() + "\n");

        Professor professor = new Professor();
        professor.setNome("Rodrigo");
        professor.setDisciplina("POO");
        professor.setSalario(2500);

        System.out.println("PROFESSOR:");
        System.out.println("  Nome: " + professor.getNome());
        System.out.println("  Salario: " + professor.getSalario());
        System.out.println("  Disciplina: " + professor.getDisciplina());
    }
}

