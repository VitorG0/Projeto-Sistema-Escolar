package entidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AlunoDao {

    private Connection connection;

    public AlunoDao(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Aluno aluno) throws Exception {
        String sql = "INSERT INTO aluno (nome, matricula, turma) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getMatricula());
            stmt.setString(3, aluno.getTurma());
            stmt.executeUpdate();
            System.out.println("Aluno salvo com sucesso!");
        }
    }

    public Aluno buscarPorId(int id) throws Exception {
        String sql = "SELECT * FROM aluno WHERE id_aluno = ?";
        // ResultSet incluído no try-with-resources para fechar corretamente
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Aluno aluno = new Aluno();
                    aluno.setId_aluno(rs.getInt("id_aluno"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setMatricula(rs.getInt("matricula"));
                    aluno.setTurma(rs.getString("turma"));
                    return aluno;
                }
            }
        }
        return null;
    }
}