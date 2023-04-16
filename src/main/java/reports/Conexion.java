
package reports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    static String bd = "agenciaTramites";
    static String login = "root";
    static String password = "adminadmin";
    Connection connection = null;

    //Metodo que devuelve conexion con la base de datos
    public Conexion(String url) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
        } catch (SQLException ex) {
        }
    }

}