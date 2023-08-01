
package modelo;

public class Profesor {
    private int codprofesor,edad,celular,estado;
    private String nombres,apellidos,dni;

    public Profesor(int codprofesor, int edad, int celular, int estado, String nombres, String apellidos, String dni) {
        this.codprofesor = codprofesor;
        this.edad = edad;
        this.celular = celular;
        this.estado = estado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    
    public int getCodprofesor() {
        return codprofesor;
    }

    public void setCodprofesor(int codprofesor) {
        this.codprofesor = codprofesor;
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
        return "\ncodProfesor=" + codprofesor + ", edad=" + edad + 
                ", celular=" + celular + ", estado=" + estado + 
                ", nombres=" + nombres + ", apellidos=" + apellidos 
                + ", dni=" + dni +"\n";
    }
    
}
