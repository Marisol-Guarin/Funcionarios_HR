/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Isabella
 */
public class PruebaConexion {
    public static void main(String[] args) {
        try (Connection conn = Conexion.getConexion()) {
            System.out.println("Conexión exitosa a: " + conn.getCatalog());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
    
}
