/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Negocio;

import uhv1.Vistas.VentanaEventos;

/**
 *
 * @author darky
 */
public class ControlVentanaEventos {
    public void inicia(){
        VentanaEventos VE = new VentanaEventos(this);
        VE.setVisible(true);
    }
    
    public void alta_pulsado(){
        ControlVentanaAltaEvento CVAE = new ControlVentanaAltaEvento();
        CVAE.inicia();
    }
}
