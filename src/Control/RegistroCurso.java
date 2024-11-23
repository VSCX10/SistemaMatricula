/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Curso;

/**
 *
 * @author gnaka
 */
public class RegistroCurso {

    private final static int MAX = 1000;
    private Curso[] array;
    private int num;

    public RegistroCurso() {
        this.array = new Curso[MAX];
        num = 0;
    }

    public boolean agregar(Curso curso) {
        if (num < MAX) {
            array[num] = curso;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Curso[] getListaCursos() {
        Curso[] listaCursos = new Curso[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listaCursos[j] = array[i];
            j++;
        }

        return listaCursos;
    }
}
