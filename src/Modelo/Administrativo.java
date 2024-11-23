/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ProfL3301
 */
public class Administrativo extends Persona implements IRemuneracion{
    private String area;
    private double sueldoBasico;
    public static int correlativo;

    public Administrativo(String area, int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.area = area;
        
        correlativo++;
        this.crearCodigo();
        this.crearEmailInstitucional();
        this.sueldoBasico = this.calcularSalario();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    
    
    @Override
    void crearCodigo() {
          this.codigo = "A-0"+correlativo;
    }

    @Override
    void crearEmailInstitucional() {
        this.eMail = this.nombre.charAt(0) + this.apellido + "@ulima.edu.pe";
    }

    @Override
    public double calcularSalario() {
        double sueldo = 0;
        if (this.area.equals("Rectorado")) {
            sueldo = 15000;
        } else if (this.area.equals("Facultad")) {
            sueldo = 10000;
        } else {
            sueldo = 8000;
        }
        return sueldo;
    }   
}
