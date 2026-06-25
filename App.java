package entidade;

import conexao.Conexao;
import java.sql.Connection;

public class App {

    public static void main(String[] args) {

        // Abre a conexão com o banco
        Connection conexao = Conexao.conectar();

        if (conexao == null) {
            System.out.println("Não foi possível conectar ao banco de dados.");
            return;
        }

        AlunoDao alunoDao = new AlunoDao(conexao);

        try {
            // --- Salvar um aluno ---
            Aluno novoAluno = new Aluno("Maria Silva", 1001, 0, "Turma A");
            alunoDao.salvar(novoAluno);

            // --- Buscar o aluno pelo ID ---
            Aluno encontrado = alunoDao.buscarPorId(1);
            if (encontrado != null) {
                System.out.println("Aluno encontrado: " + encontrado.getNome()
                        + " | Matrícula: " + encontrado.getMatricula()
                        + " | Turma: " + encontrado.getTurma());
            } else {
                System.out.println("Aluno não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha a conexão ao terminar
            try {
                conexao.close();
                System.out.println("Conexão encerrada.");
            } catch (Exception e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}