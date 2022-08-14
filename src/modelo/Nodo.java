package modelo;

public class Nodo {

    private Nodo siguiente;
    private Nodo anterior;

    private Alumno alum;
    private Curso curso;
    private Matricula matricula;
    private Retiro retiro;
    
    public Nodo(Alumno alumno, Nodo ante, Nodo sig) {
        siguiente = sig;
        anterior = ante;
        alum = alumno;
    }
    
    public Nodo(Curso cur, Nodo ante, Nodo sig) {
        siguiente = sig;
        anterior = ante;
        curso = cur;
    }
    
    public Nodo(Matricula matri, Nodo ante, Nodo sig) {
        siguiente = sig;
        anterior = ante;
        matricula = matri;
    }
    
    public Nodo(Retiro reti, Nodo ante, Nodo sig) {
        siguiente = sig;
        anterior = ante;
        retiro = reti;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }
    
    
    
}
