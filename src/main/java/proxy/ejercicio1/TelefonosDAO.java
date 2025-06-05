package proxy.ejercicio1;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class TelefonosDAO {
    private Connection obtenerConexion() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/proxyPOO2", "root", "123456");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Telefono> telefonoPorIdPersona(int id) {
        String sql = "SELECT numero " + "FROM telefonos " + "WHERE idPersona = ?;";

        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            Set<Telefono> telefonos = new HashSet<>();
            while (result.next()) {
                telefonos.add(new Telefono(result.getString(1)));
            }
            return telefonos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
