/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Isabella
 */
public class Conexion {
    private static final Properties CONFIG = new Properties();

    static {
        try (FileInputStream in = new FileInputStream("config.properties")) {
            CONFIG.load(in);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(
                    "No se encontró config.properties. Copie config.example.properties y complete sus datos.");
        }
    }

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(
                CONFIG.getProperty("db.url"),
                CONFIG.getProperty("db.user"),
                CONFIG.getProperty("db.pass"));
    }       
    
}
