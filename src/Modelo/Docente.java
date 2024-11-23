/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ProfL3301
 */
public class Docente extends Persona implements IRemuneracion {

    private String categoria;
    private double sueldoBasico;
    public static int correlativo = 0;

    public Docente(String categoria, int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.categoria = categoria;

        correlativo++;
        this.crearCodigo();
        this.crearEmailInstitucional();
        this.sueldoBasico = this.calcularSalario();
        
    }

    @Override
    void crearCodigo() {
        this.codigo = "D-0" + correlativo;
    }

    @Override
    void crearEmailInstitucional() {
        this.eMail = this.nombre.charAt(0) + this.apellido + "@ulima.edu.pe";
    }

    @Override
    public double calcularSalario() {
        double sueldo = 0;
        if (this.categoria.equals("Auxiliar")) {
            sueldo = 9000;
        } else if (this.categoria.equals("Asociado")) {
            sueldo = 11000;
        } else {
            sueldo = 15000;
        }
        return sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    

}
