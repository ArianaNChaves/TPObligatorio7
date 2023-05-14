
package tpalumnoss;


public class Inscripcion {
    private Materia unaMateria;
    private Alumno unAlumno;

    public Inscripcion(Alumno unAlumno, Materia unaMateria) {
        this.unaMateria = unaMateria;
        this.unAlumno = unAlumno;
    }

    public Materia getUnCurso() {
        return unaMateria;
    }

    public void setUnCurso(Materia unaMateria) {
        this.unaMateria = unaMateria;
    }

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    @Override
    public String toString() {
        return "Matricula{" + "unCurso=" + unaMateria + ", unAlumno=" + unAlumno + '}';
    }
    
    
    
}

