/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.*;

/**
 *
 * @author ProfL3301
 */
public class RegistroPersona {

    private final static int MAX = 1000;
    private Persona[] array;
    private int num;

    public RegistroPersona() {
        this.array = new Persona[MAX];
        num = 0;
    }

    public boolean agregar(Persona persona) {
        if (num < MAX) {
            array[num] = persona;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Persona[] getListaAdministrativos() {
        int numAdm = 0;

        for (int i = 0; i < num; i++) {
            Persona persona = array[i];

            if (persona instanceof Administrativo) {
                numAdm++;
            }

        }
        //Creo un arreglo con el tamaño exacto de personas administrativas que están almacenadas en el arrreglo
        Persona[] listaAdministrativos = new Persona[numAdm];
        int j = 0;

        for (int i = 0; i < num; i++) {
            Persona persona = array[i];
            if (persona instanceof Administrativo) {
                listaAdministrativos[j] = persona;
                j++;
            }
        }
        return listaAdministrativos;
    }

    public Persona[] getListaDocente() {
        int numDoc = 0;

        for (int i = 0; i < num; i++) {
            Persona persona = array[i];

            if (persona instanceof Docente) {
                numDoc++;
            }

        }
        //Creo un arreglo con el tamaño exacto de personas administrativas que están almacenadas en el arrreglo
        Persona[] listaDocentes = new Persona[numDoc];
        int j = 0;

        for (int i = 0; i < num; i++) {
            Persona persona = array[i];
            if (persona instanceof Docente) {
                listaDocentes[j] = persona;
                j++;
            }

        }
        return listaDocentes;
    }

    public Persona[] getListaAlumnos() {
        int numAdm = 0;

        for (int i = 0; i < num; i++) {
            Persona persona = array[i];

            if (persona instanceof Alumno) {
                numAdm++;
            }

        }
        //Creo un arreglo con el tamaño exacto de personas administrativas que están almacenadas en el arrreglo
        Persona[] listaAlumnos = new Persona[numAdm];
        int j = 0;

        for (int i = 0; i < num; i++) {
            Persona persona = array[i];
            if (persona instanceof Alumno) {
                listaAlumnos[j] = persona;
                j++;
            }
        }
        return listaAlumnos;
    }
}
