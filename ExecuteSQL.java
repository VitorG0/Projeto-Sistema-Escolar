package conexao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;

public class ExecuteSQL {

    public static void main(String[] args) {
        Connection conn = Conexao.conectar();
        if (conn == null) {
            System.out.println("Falha na conexão");
            return;
        }

        String sql = "";
        BufferedReader reader = null;
        Statement stmt = null;

        try {
            reader = new BufferedReader(new FileReader("ProjetoEscolar.sql"));
            String line;
            while ((line = reader.readLine()) != null) {
                sql = sql + line + "\n";
            }
            reader.close();

            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();

            System.out.println("Tabelas criadas com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}