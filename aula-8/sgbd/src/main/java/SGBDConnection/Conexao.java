package SGBDConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection ConectarSemParametro() {
            String url = "jdbc:sqlite:src/database/loinc.db";
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
    }

    public static Connection ConectarComParametro(String enderecoDatabase) {
            String url = "jdbc:sqlite:" + enderecoDatabase;
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return conn;
    }

    public static void FecharConexao(Connection connection)
    {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}

