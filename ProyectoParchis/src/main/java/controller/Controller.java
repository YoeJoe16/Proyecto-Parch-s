/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.Point;
import java.awt.event.ActionEvent;
import model.FichaAmarilla;

import model.Coordenadas;
import view.GUITableroJuego;
import view.PanelTableroF;
import javax.swing.JOptionPane;
/**
 *
 * @author Yoel Gonzalez
 */
public class Controller {
    private FichaAmarilla fichaAmarilla;
    
    private PanelTableroF vista;
    
    
            
   

    public Controller(FichaAmarilla fichaAmarilla, PanelTableroF vista) {
    this.fichaAmarilla = fichaAmarilla;
    this.vista = vista;
   

    // Coloca la ficha en la posición inicial
    Coordenadas p = fichaAmarilla.getPosicionAmarilla();
    vista.MoverFicha(new Point(p.getX(), p.getY()));
    }

    
    
    
    public void CaminarAmarilla() {
    
        fichaAmarilla.AvanzarAmarilla();// Avanza al siguiente punto
        Coordenadas p = fichaAmarilla.getPosicionAmarilla(); // Obtiene la nueva posición
        vista.MoverFicha(new Point(p.getX(), p.getY())); // Mueve la ficha en la vista
       
    }

    
    
}
