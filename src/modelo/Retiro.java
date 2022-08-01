/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Delma
 */
public class Retiro {

    private int numRetiro, numMatricula;
    private String fecha, hora;

    public Retiro(int numRetiro, int numMatricula, String fecha, String hora) {
        this.numRetiro = numRetiro;
        this.numMatricula = numMatricula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNumRetiro() {
        return numRetiro;
    }

    public void setNumRetiro(int numRetiro) {
        this.numRetiro = numRetiro;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "\nnumRetiro=" + numRetiro + 
                "\nnumMatricula=" + numMatricula + 
                "\nfecha=" + fecha + 
                "\nhora=" + hora;
    }
    
    
    
}
