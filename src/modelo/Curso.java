/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author acer
 */
public class Curso {

    private int codCurso, ciclo, creditos, horas,vacantes,matriculados;
    private String asignatura;

    public Curso(int codCurso, String asignatura, int ciclo, int creditos, int horas) {
        this.codCurso = codCurso;
        this.asignatura = asignatura;
        this.ciclo = ciclo;
        this.creditos = creditos;
        this.horas = horas;
        this.matriculados = 0;
    }
    
    public Curso(int codCurso, String asignatura, int ciclo, int creditos, int horas,int vacantes) {
        this.codCurso = codCurso;
        this.asignatura = asignatura;
        this.ciclo = ciclo;
        this.creditos = creditos;
        this.horas = horas;
        this.vacantes = vacantes;
        this.matriculados = 0;
    }

    public Curso(int codCurso, String asignatura, int ciclo, int creditos, int horas,int vacantes,int matriculados) {
        this.codCurso = codCurso;
        this.asignatura = asignatura;
        this.ciclo = ciclo;
        this.creditos = creditos;
        this.horas = horas;
        this.vacantes = vacantes;
        this.matriculados = matriculados;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public int getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(int matriculados) {
        this.matriculados = matriculados;
    }

    
    @Override
    public String toString() {
        return "\ncodCurso=" + codCurso + 
                "\nciclo=" + ciclo + 
                "\ncreditos=" + creditos + 
                "\nhoras=" + horas + 
                "\nasignatura=" + asignatura +
                "\nvacantes=" + vacantes +
                "\nmatriculados=" + matriculados;
    }
    
    
    
}
