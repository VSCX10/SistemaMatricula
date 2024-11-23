/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Matricula;

/**
 *
 * @author gnaka
 */
public class RegistroMatricula {

    private final static int MAX = 1000;
    private Matricula[] array;
    private int num;

    public RegistroMatricula() {
        this.array = new Matricula[MAX];
        num = 0;
    }

    public boolean agregar(Matricula curso) {
        if (num < MAX) {
            array[num] = curso;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Matricula[] getListaMatriculas() {
        Matricula[] listaMatriculas = new Matricula[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listaMatriculas[j] = array[i];
            j++;
        }

        return listaMatriculas;
    }
}
