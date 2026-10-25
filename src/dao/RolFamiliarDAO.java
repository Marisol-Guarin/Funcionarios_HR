/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import excepciones.DAOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.RolFamiliar;
/**
 *
 * @author Isabella
 */
public class RolFamiliarDAO {
    private static final String SQL_LISTAR =
            "SELECT id, nombre FROM rol_familiar ORDER BY nombre";

    public List<RolFamiliar> listar() throws DAOException {
        List<RolFamiliar> lista = new ArrayList<>();
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(SQL_LISTAR);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new RolFamiliar(rs.getInt("id"), rs.getString("nombre")));
            }
        } catch (SQLException e) {
            throw new DAOException("Error al listar los roles familiares.", e);
        }
        return lista;
    }
}
