package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE escola");
            stmt.close();
            conn.close();
            System.out.println("Banco de dados criado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
