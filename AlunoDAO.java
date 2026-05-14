package dao;

import conexao.Conexao;
import entidade.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public boolean inserir(Aluno aluno) {
        Connection conn = Conexao.conectar();
        if (conn == null) {
            System.out.println("Falha na conexão");
            return false;
        }

        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO aluno (nome, matricula, turma) VALUES (?, ?, ?)");
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getMatricula());
            stmt.setString(3, aluno.getTurma());
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Aluno> buscarTodos() {
        List<Aluno> lista = new ArrayList<>();
        Connection conn = Conexao.conectar();
        if (conn == null) {
            System.out.println("Falha na conexão");
            return lista;
        }

        PreparedStatement stmt = null;
        java.sql.ResultSet rs = null;
        try {
            stmt = conn.prepareStatement("SELECT nome, matricula, turma FROM aluno");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setTurma(rs.getString("turma"));
                lista.add(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lista;
    }
}