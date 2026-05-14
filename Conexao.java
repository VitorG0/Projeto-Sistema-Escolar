package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/escola";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "1234";

    public static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = conectar();
        if (conn != null) {
            System.out.println("Teste de conexão OK");
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Falha na conexão");
        }
    }
}