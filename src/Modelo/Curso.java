/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author gnaka
 */
public class Curso {
    private String codCurso;
    private String nombreCurso;
    private int horasT;
    private int horasP;
    private Docente docente;

    public Curso(String codCurso, String nombreCurso, int horasT, int horasP, Docente docente) {
        this.codCurso = codCurso;
        this.nombreCurso = nombreCurso;
        this.horasT = horasT;
        this.horasP = horasP;
        this.docente = docente;
    }

    
    
    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public int getHorasP() {
        return horasP;
    }

    public void setHorasP(int horasP) {
        this.horasP = horasP;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return  nombreCurso;
    }
    
    
}
