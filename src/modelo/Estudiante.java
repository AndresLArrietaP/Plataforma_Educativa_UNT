package modelo;

public class Estudiante {

    private int codEstudiante, edad, celular, estado;
    private String nombres, apellidos, dni;

    public Estudiante(int codEstudiante, String nombres, String apellidos, String dni, int edad, int celular, int estado) {
        this.codEstudiante = codEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.celular = celular;
        this.estado = estado;
    }

    public int getCodEstudiante() {
        return codEstudiante;
    }

    public void setCodEstudiante(int codEstudiante) {
        this.codEstudiante = codEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\ncodEstudiante=" + codEstudiante + ", edad=" + edad + 
                ", celular=" + celular + ", estado=" + estado + 
                ", nombres=" + nombres + ", apellidos=" + apellidos 
                + ", dni=" + dni +"\n";
    }
}