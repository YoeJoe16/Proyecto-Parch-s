/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.Point;
import java.awt.event.ActionEvent;
import model.FichaRoja;
import model.Coordenadas;
import view.GUITableroJuego;
import view.PanelTableroF;
import javax.swing.JOptionPane;
import model.FichaAmarilla;
/**
 *
 * @author Yoel Gonzalez
 */
public class ControllerR {
    private FichaRoja fichaRoja;
    
    private PanelTableroF vista;
    
    
            
   

    public ControllerR(FichaRoja fichaRoja, PanelTableroF vista) {
    this.fichaRoja = fichaRoja;
    this.vista = vista;
   

    // Coloca la ficha en la posición inicial
    Coordenadas p = fichaRoja.getPosicionRoja();
    vista.MoverFichaR(new Point(p.getX(), p.getY()));
    }

    
    
    
    public void CaminarRoja() {
    
        fichaRoja.AvanzarRoja(); // Avanza al siguiente punto
        Coordenadas p = fichaRoja.getPosicionRoja(); // Obtiene la nueva posición
        vista.MoverFichaR(new Point(p.getX(), p.getY())); // Mueve la ficha en la vista
       
    }

}
