package domain;

import SqlOps.ConexionSql;
import java.sql.*;

public class Credenciales {

    private static Connection conn = null;
    private static PreparedStatement stmt = null;
    private static ResultSet rs = null;
    private static String idUser = null;
    private static boolean estado = false;
    private static String query = null;

    public static boolean buscarEstudiante(String user, String pass, String dbUser, String dbPass) {
        try {
            query = String.format("SELECT idestudiantes FROM estudiantes WHERE user = '%s' AND pass = '%s'", user, pass);
            conn = ConexionSql.getConnection(dbUser, dbPass);
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                idUser = rs.getString("idestudiantes");
            }
            try {
                if (!idUser.equals("")) {
                    estado = true;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                ConexionSql.close(rs);
                ConexionSql.close(stmt);
                ConexionSql.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estado;
    }
    
    public static boolean buscarProfesor(String user, String pass, String dbUser, String dbPass) {
        try {
            query = String.format("SELECT idprofesores FROM profesores WHERE user = '%s' AND pass = '%s'", user, pass);
            conn = ConexionSql.getConnection(dbUser, dbPass);
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                idUser = rs.getString("idprofesores");
            }
            try {
                if (!idUser.equals("")) {
                    estado = true;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                ConexionSql.close(rs);
                ConexionSql.close(stmt);
                ConexionSql.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estado;
    }
    
    public static boolean buscarAdmin(String user, String pass, String dbUser, String dbPass) {
        try {
            query = String.format("SELECT idadmins FROM admins WHERE user = '%s' AND pass = '%s'", user, pass);
            conn = ConexionSql.getConnection(dbUser, dbPass);
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                idUser = rs.getString("idadmins");
            }
            try {
                if (!idUser.equals("")) {
                    estado = true;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                ConexionSql.close(rs);
                ConexionSql.close(stmt);
                ConexionSql.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estado;
    }
}
