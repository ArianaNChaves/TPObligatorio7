
package tpalumnoss;

import java.util.HashMap;

public class GestionInscripciones {

    public static HashMap<String, Inscripcion> mapaInscripcion = new HashMap<>();

    public static void agregarMatricula(Inscripcion inscripcion) {
        String clave = generarClave(inscripcion);
        mapaInscripcion.put(clave, inscripcion);
    }

    public static boolean estaMatriculado(Inscripcion inscripcion) {
        String clave = generarClave(inscripcion);
        return mapaInscripcion.containsKey(clave);
    }

    private static String generarClave(Inscripcion inscripcion) {
        Integer identificacion = inscripcion.getUnAlumno().getLegajo();
        Integer codigoCurso = inscripcion.getUnCurso().getCodigoMateria();
        return identificacion + "-" + codigoCurso;
    }
}
