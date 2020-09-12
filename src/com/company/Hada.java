/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author Alvaro
 */
public class Hada {
    private String nombre;
    private int edad;
    private boolean tieneA;
    private Humano ahijado;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the tieneA
     */
    public boolean isTieneA() {
        return tieneA;
    }

    /**
     * @param tieneA the tieneA to set
     */
    public void setTieneA(boolean tieneA) {
        this.tieneA = tieneA;
    }

    /**
     * @return the ahijado
     */
    public Humano getAhijado() {
        return ahijado;
    }

    /**
     * @param ahijado the ahijado to set
     */
    public void setAhijado(Humano ahijado) {
        this.ahijado = ahijado;
    }
    
}
