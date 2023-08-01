package modelo;

public class Nodo {

    private Nodo siguiente;
    private Nodo anterior;

    private Estudiante estu;
    private Profesor prof;
    private Curso curso;
    private Matricula matricula;
    private Retiro retiro;
   
    public Nodo(Estudiante estudiante, Nodo ante, Nodo sig) {
        siguiente = sig;
        anterior = ante;
        estu = estudiante;
    }
    
    public Nodo(Profesor profesor, Nodo ante, Nodo sig) {
        siguiente = sig;
        anterior = ante;
        prof = profesor;
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

    public Estudiante getEstu() {
        return estu;
    }

    public void setEstu(Estudiante estu) {
        this.estu = estu;
    }
    
    public Profesor getProf() {
        return prof;
    }

    public void setProf(Profesor prof) {
        this.prof = prof;
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
