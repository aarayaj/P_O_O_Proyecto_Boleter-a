/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author aaj
 */
public abstract class EspaciosSala {
    
    private final boolean ESPACIO_LIBRE = true; 
    private final boolean ESPACIO_NO_DISPONIBLE = false;
    

    public EspaciosSala() {
    }

    public boolean isESPACIO_LIBRE() {
        return ESPACIO_LIBRE;
    }

    public boolean isESPACIO_NO_DISPONIBLE() {
        return ESPACIO_NO_DISPONIBLE;
    }
    
    public abstract void setEspacio(int eje_x, int eje_y, boolean espacioLibre);
    
    public abstract boolean getEspacio(int eje_x, int eje_y);
    
    public abstract double getCOSTO_BOLETO();
    
}
