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
public class Humano {
    
    private String nombre;
    private int edad;
    private Hada padrino;

  
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
     * @return the padrino
     */
    public Hada getPadrino() {
        return padrino;
    }

    /**
     * @param padrino the padrino to set
     */
    public void setPadrino(Hada padrino) {
        this.padrino = padrino;
    }
    
}
