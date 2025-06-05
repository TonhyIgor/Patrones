package proxy.ejercicio1;

import java.sql.*;
import java.util.Set;

public class PersonaDao {
    private Connection obtenerConexion() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/proxyPOO2", "root", "123456");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Persona personaPorId(int id) {
        String sql = "select p.nombre " + "from personas p " + "where p.id = ?";

        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            String nombrePersona = null;
            Set<Telefono> telefonos = new ProxyTelefono<>(id);
            while (result.next()) {
                nombrePersona = result.getString(1);
                //telefonos.add(new Telefono(result.getString(2)));
            }
            return new Persona(id, nombrePersona, telefonos);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
