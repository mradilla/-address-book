package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL {

    private static String url = "jdbc:mysql://localhost/libretaDirecciones";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "mradilla";
    private static Connection con;

    public static void conectar() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontró el driver");
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer la conexion.");
            ex.printStackTrace();
        }

    }

    public static ResultSet consultar(String query) {
        try {
            return con.createStatement().executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("SQL error: " + ex.getMessage());
        }
        return null;
    }

    public static void eliminar(String query) {
        try {
            con.prepareStatement(query).executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void insertar(String query) {
        try {
            con.prepareStatement(query).execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void editar(String query) {
        try {
            con.prepareStatement(query).executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
