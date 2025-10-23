/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Yoel Gonzalez
 */
public class FichaRoja {
    private Coordenadas[] caminoR;
    private int indice;
    
    public FichaRoja(){
    
        caminoR = new Coordenadas[]{
        new Coordenadas(198, 97),
        new Coordenadas(196, 123),
        new Coordenadas(197, 147),
        new Coordenadas(197, 170),
        new Coordenadas(204, 196),
        new Coordenadas(182, 221),
        new Coordenadas(156, 218),
        new Coordenadas(133, 215),
        new Coordenadas(110, 215),
        new Coordenadas(86, 212),
        new Coordenadas(62, 212),
        new Coordenadas(40, 213),
        new Coordenadas(15, 214),
        new Coordenadas(16, 272),
        new Coordenadas(15, 330),
        new Coordenadas(39, 330),
        new Coordenadas(61, 330),
        
        new Coordenadas(86, 330),
        new Coordenadas(110, 330),
        new Coordenadas(132, 330),
        new Coordenadas(156, 329),
        new Coordenadas(181, 324),
        new Coordenadas(207, 345),
        new Coordenadas(199, 370),
        new Coordenadas(198, 394),
        new Coordenadas(198, 418),
        new Coordenadas(198, 442),
        new Coordenadas(197, 467),
        new Coordenadas(198, 490),
        new Coordenadas(199, 515),
        new Coordenadas(255, 514),
        new Coordenadas(311, 514),
        new Coordenadas(309, 490),
        new Coordenadas(310, 467),
        
        new Coordenadas(312, 442),
        new Coordenadas(311, 417),
        new Coordenadas(312, 393),
        new Coordenadas(310, 368),
        new Coordenadas(306, 343),
        new Coordenadas(326, 322),
        new Coordenadas(349, 330),
        new Coordenadas(372, 330),
        new Coordenadas(396, 329),
        new Coordenadas(419, 329),
        new Coordenadas(443, 330),
        new Coordenadas(466, 329),
        new Coordenadas(490, 329),
        new Coordenadas(490, 272),
        new Coordenadas(490, 214),
        new Coordenadas(466, 216),
        new Coordenadas(443, 215),

      
        new Coordenadas(420, 212),
        new Coordenadas(396, 215),
        new Coordenadas(372, 216),
        new Coordenadas(349, 216),
        new Coordenadas(325, 221),
        new Coordenadas(304, 196),
        new Coordenadas(310, 170),
        new Coordenadas(309, 147),
        new Coordenadas(310, 122),
        new Coordenadas(310, 96),
        new Coordenadas(311, 73),
        new Coordenadas(311, 49),
        new Coordenadas(310, 25),
        new Coordenadas(255, 24),
        
        
        new Coordenadas(254, 50),
        new Coordenadas(254, 74),
        new Coordenadas(253, 97),
        new Coordenadas(254, 121),
        new Coordenadas(254, 146),
        new Coordenadas(255, 169),
        new Coordenadas(253, 196),
        new Coordenadas(254, 256)
        
        };
    
    
    this.indice=0;
    
    
    }
    
    public Coordenadas getPosicionRoja(){
    
        return caminoR[indice];
        
    }
    
    public void AvanzarRoja(){
    
         if (indice<caminoR.length-1){
            indice++;
        }
    
    }
    

}
