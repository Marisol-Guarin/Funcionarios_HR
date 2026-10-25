/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacion;

import excepciones.ValidacionException;
import java.time.LocalDate;
import modelo.FormacionAcademica;
import modelo.GrupoFamiliar;
import modelo.Funcionarios;
/**
 *
 * @author Isabella
 */
public class ValidadorFuncionario {
    public static void validar(Funcionarios f) throws ValidacionException {
        if (f == null) {
            throw new ValidacionException("El funcionario no puede ser nulo.");
        }
        texto(f.getNombres(), "Los nombres", 50);
        texto(f.getApellidos(), "Los apellidos", 100);

        if (f.getTipoDocumento() == null) {
            throw new ValidacionException("Debe seleccionar el tipo de documento.");
        }
        if (f.getNumeroDocumento() == null
                || !f.getNumeroDocumento().matches("[A-Za-z0-9]{4,20}")) {
            throw new ValidacionException(
                    "El número de documento debe tener entre 4 y 20 letras o números, sin espacios.");
        }
        sexo(f.getSexo());
        if (f.getEstadoCivil() == null) {
            throw new ValidacionException("Debe seleccionar el estado civil.");
        }
        fechaNacimiento(f.getFechaNacimiento());
        telefonoOpcional(f.getTelefono());

        if (f.getCorreo() != null && !f.getCorreo().isBlank()
                && !f.getCorreo().matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$")) {
            throw new ValidacionException("El correo electrónico no tiene un formato válido.");
        }
        if (f.getDireccion() != null && f.getDireccion().length() > 150) {
            throw new ValidacionException("La dirección no puede superar los 150 caracteres.");
        }

        for (GrupoFamiliar fam : f.getFamiliares()) {
            if (fam.getRol() == null) {
                throw new ValidacionException("Cada familiar debe tener un rol.");
            }
            texto(fam.getNombres(), "Los nombres del familiar", 50);
            texto(fam.getApellidos(), "Los apellidos del familiar", 100);
            sexo(fam.getSexo());
            fechaNacimiento(fam.getFechaNacimiento());
            telefonoOpcional(fam.getTelefono());
        }

        int anioActual = LocalDate.now().getYear();
        for (FormacionAcademica e : f.getEstudios()) {
            if (e.getNivelEstudio() == null) {
                throw new ValidacionException("Cada estudio debe tener un nivel de estudio.");
            }
            texto(e.getInstitucion(), "La institución", 150);
            texto(e.getTituloObtenido(), "El título obtenido", 150);
            if (e.getAnioGraduacion() < 1950 || e.getAnioGraduacion() > anioActual) {
                throw new ValidacionException(
                        "El año de graduación debe estar entre 1950 y " + anioActual + ".");
            }
        }
    }

    private static void texto(String valor, String campo, int max) throws ValidacionException {
        if (valor == null || valor.isBlank()) {
            throw new ValidacionException(campo + " son obligatorios.");
        }
        if (valor.length() > max) {
            throw new ValidacionException(campo + " no pueden superar los " + max + " caracteres.");
        }
    }

    private static void sexo(char sexo) throws ValidacionException {
        if (sexo != 'M' && sexo != 'F') {
            throw new ValidacionException("El sexo debe ser M o F.");
        }
    }

    private static void fechaNacimiento(LocalDate fecha) throws ValidacionException {
        if (fecha == null) {
            throw new ValidacionException("La fecha de nacimiento es obligatoria.");
        }
        if (fecha.isAfter(LocalDate.now())) {
            throw new ValidacionException("La fecha de nacimiento no puede ser futura.");
        }
    }

    private static void telefonoOpcional(String tel) throws ValidacionException {
        if (tel != null && !tel.isBlank() && !tel.matches("\\d{7,15}")) {
            throw new ValidacionException("El teléfono debe tener entre 7 y 15 dígitos.");
        }
    }
}
