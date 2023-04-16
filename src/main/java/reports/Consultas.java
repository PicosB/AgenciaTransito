
package reports;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {

    public static InputStream Imagen() {
        String bd = "historialTramites";
        String url = "jdbc:mysql://localhost/" + bd;
        Conexion db = new Conexion(url);
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM historialTramites Z";
        InputStream inp = null;
        try {
            ps = db.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                inp = rs.getBinaryStream(3);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                db.desconectar();
            } catch (SQLException ex) {
            }
        }
        return inp;
    }

}
