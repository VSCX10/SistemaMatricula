/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ProfL3301
 */
public class Alumno extends Persona {

    private String carrera;
    public static int correlativo = 0;

    public Alumno(String carrera, int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.carrera = carrera;

        correlativo++;
        
        this.crearCodigo();
        this.crearEmailInstitucional();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
    @Override
    void crearCodigo() {
        this.codigo = "2024";

        if (correlativo <= 9) {
            this.codigo += "000";
        } else if (correlativo >= 10 && correlativo <= 99) {
            this.codigo += "00";
        } else if (correlativo >= 100 && correlativo < 999) {
            this.codigo += "0";
        }
        
        this.codigo +=correlativo;
    }

    @Override
    void crearEmailInstitucional() {
        this.eMail = codigo + "@aloe.ulima.edu.pe";
    }

}
