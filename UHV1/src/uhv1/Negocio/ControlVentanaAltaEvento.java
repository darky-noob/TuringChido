/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Vistas.VentanaAltaEvento;

/**
 *
 * @author darky
 */
public class ControlVentanaAltaEvento {
    public void inicia(){
        VentanaAltaEvento VAE = new VentanaAltaEvento (this);
        VAE.setVisible(true);
        
    }
    public void datos_de_evento(String nombreH, String nombre){
        
    }
}
