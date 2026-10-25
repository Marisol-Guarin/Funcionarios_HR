/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Isabella
 */
public class DAOException extends Exception{
        public DAOException(String mensaje) {
        super(mensaje);
    }
    public DAOException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
