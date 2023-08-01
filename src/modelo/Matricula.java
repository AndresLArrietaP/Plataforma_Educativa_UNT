package modelo;

public class Matricula {

    private int numMatricula, codEstudiante, codCurso,codProfesor;
    private String fecha, hora;

    public Matricula(int numMatricula, int codEstudiante, int codCurso, String fecha, String hora) {
        this.numMatricula = numMatricula;
        this.codEstudiante = codEstudiante;
        this.codCurso = codCurso;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public Matricula(int numMatricula, int codEstudiante, int codProfesor, int codCurso, String fecha, String hora) {
        this.numMatricula = numMatricula;
        this.codEstudiante = codEstudiante;
        this.codProfesor = codProfesor;
        this.codCurso = codCurso;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setNumeroMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setCodigoEstudiante(int codAlumno) {
        this.codEstudiante = codAlumno;
    }
    
    public void setCodigoProfesor(int codProfesor) {
        this.codProfesor = codProfesor;
    }

    public void setCodigoCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNumeroMatricula() {
        return numMatricula;
    }

    public int getCodigoEstudiante() {
        return codEstudiante;
    }

    public int getCodigoProfesor() {
        return codProfesor;
    }
    
    public int getCodigoCurso() {
        return codCurso;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "\nnumMatricula=" + numMatricula + 
                "\ncodEstudiante=" + codEstudiante + 
                "\ncodProfesor=" + codProfesor + 
                "\ncodCurso=" + codCurso + 
                "\nfecha=" + fecha + 
                "\nhora=" + hora;
    }
    
    
    
}
