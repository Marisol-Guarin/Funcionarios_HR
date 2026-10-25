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
import modelo.NivelEstudio;
/**
 *
 * @author Isabella
 */
public class NivelEstudioDAO {
    private static final String SQL_LISTAR =
            "SELECT id, nombre FROM nivel_estudio ORDER BY nombre";

    public List<NivelEstudio> listar() throws DAOException {
        List<NivelEstudio> lista = new ArrayList<>();
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(SQL_LISTAR);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new NivelEstudio(rs.getInt("id"), rs.getString("nombre")));
            }
        } catch (SQLException e) {
            throw new DAOException("Error al listar el nivel de estudio.", e);
        }
        return lista;
    }
}
