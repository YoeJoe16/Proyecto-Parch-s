/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Yoel Gonzalez
 */
public class Dado {
    
    private int dado;

    public Dado() {
        lanzarDado();
    }
    
    

    public int lanzarDado() {
        dado = (int)(Math.random() * 6) + 1; // Genera entre 1 y 6
        return dado;
    }

    public int getDado() {
        return dado;
    }
}

    

