/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import dao.FuncionarioDAO;
import excepciones.DAOException;
import excepciones.ValidacionException;
import java.time.LocalDate;
import modelo.EstadoCivil;
import modelo.Funcionarios;
import modelo.TipoDocumento;
/**
 *
 * @author Isabella
 */
public class PruebaFuncionarioDAO {
     public static void main(String[] args) {
         /*
        //Prueba insertar
        Funcionarios f = new Funcionarios();
        f.setNombres("Luis");
        f.setApellidos("Prueba");
        f.setTipoDocumento(new TipoDocumento(1, "Cédula"));
        f.setNumeroDocumento("78901");
        f.setSexo('M');
        f.setEstadoCivil(new EstadoCivil(1, "Soltero(a)"));
        f.setDireccion("Calle 13");
        f.setTelefono("4000000000");
        f.setFechaNacimiento(LocalDate.of(1990, 5, 20));
        f.setCorreo("luis@correo.com");
        
        
        //Prueba insertar
        try {
            new FuncionarioDAO().insertar(f);
                System.out.println("Insertado con id " + f.getId());
    } catch (DAOException e) {
            System.out.println("Error al insertar: " + e.getMessage());
                if (e.getCause() != null) {
                    System.out.println("Causa: " + e.getCause().getMessage());
                }
            }           

        try {
            for (Funcionarios x : new FuncionarioDAO().listar()) {
                System.out.println(x.getId() + " - " + x.getNombres() + " " + x.getApellidos());
            }
        } catch (DAOException e) {
            System.out.println("Error al listar: " + e.getMessage());
                if (e.getCause() != null) {
                    System.out.println("Causa: " + e.getCause().getMessage());
                }
            }
        
        //Prueba buscar id
        try {
            Funcionarios encontrado = new FuncionarioDAO().buscarPorId(1);
            System.out.println(encontrado.getNombres() + " " + encontrado.getApellidos());
            System.out.println("Familiares: " + encontrado.getFamiliares().size());
            System.out.println("Estudios: " + encontrado.getEstudios().size());
        } catch (DAOException e) {
            System.out.println(e.getMessage());
        }
        
        //Prueba eliminar
        
        try {
            new FuncionarioDAO().eliminar(9);   // cambia el 9 por el id de Luis Prueba
            System.out.println("Eliminado.");
        } catch (DAOException e) {
            System.out.println(e.getMessage());
        }
        */
        //Prueba actualizar
        
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
                Funcionarios x = dao.buscarPorId(1);
                x.setDireccion("Calle 99 # 1-23");
                    dao.actualizar(x);
                        System.out.println("Actualizado: " + dao.buscarPorId(1).getDireccion());
        } catch (DAOException e) {
            System.out.println(e.getMessage());
        } catch (ValidacionException e) {
            System.out.println("Datos inválidos: " + e.getMessage());
        }
    }
           
}
