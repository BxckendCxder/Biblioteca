package SqlOps;
import java.sql.*;

public class ConexionSql {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/biblioteca?useSSL=false";
    //private static final String JDBC_USER = "root";
    
    public static Connection getConnection(String JDBC_USER, String JDBC_PASS) throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}