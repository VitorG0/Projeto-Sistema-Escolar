package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InserirAlunoTeste {

    public static void main(String[] args) {
        Connection conn = Conexao.conectar();
        if (conn == null) {
            System.out.println("Falha na conexão com o banco.");
            return;
        }

        try {
            PreparedStatement insert = conn.prepareStatement(
                    "INSERT INTO aluno (nome, matricula, turma) VALUES (?, ?, ?)");
            insert.setString(1, "TesteAluno");
            insert.setInt(2, 9999);
            insert.setString(3, "X1");
            int quantidade = insert.executeUpdate();
            insert.close();

            System.out.println("Inseridos: " + quantidade + " registro(s).\n");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT id_aluno, nome, matricula, turma FROM aluno ORDER BY id_aluno DESC LIMIT 5");

            System.out.println("Ultimos alunos na tabela:");
            while (rs.next()) {
                System.out.println("id_aluno: " + rs.getInt("id_aluno") +
                        ", nome: " + rs.getString("nome") +
                        ", matricula: " + rs.getInt("matricula") +
                        ", turma: " + rs.getString("turma"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
