package SGBDConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta {
    public static ResultSet ConsultaTudo() throws SQLException {
        String sql = "select * from loinc";

        Connection conn = Conexao.ConectarSemParametro();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }

    public static ResultSet ConsultaPeloLongCommonName(String longCommonName) throws SQLException {
        String sql = "select * from loinc where long_common_name = \"" + longCommonName +"\"";

        Connection conn = Conexao.ConectarSemParametro();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }

    public static ResultSet ConsultaPeloShortName(String shortName) throws SQLException {
        String sql = "select * from loinc where shortname = \"" + shortName +"\"";

        Connection conn = Conexao.ConectarSemParametro();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }
    //Faz uma consulta parcial em RELATEDNAMES2
    public static ResultSet ConsultaPorUmRelatedName(String relatedName) throws SQLException {
        String sql = "select * from loinc where relatednames2 LIKE \"%" + relatedName +"%\"";

        Connection conn = Conexao.ConectarSemParametro();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }

    public static ResultSet ConsultaPorComponent(String component) throws SQLException {
        String sql = "select * from loinc where component = \"" + component +"\"";

        Connection conn = Conexao.ConectarSemParametro();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        return rs;
    }
}