/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonasteatro;

/**
 *
 * @author aaj
 */
public interface EspaciosSala {
   
    public abstract double getCOSTO_BOLETO();
    public abstract void setEspacioReservado(int eje_x);
    public abstract void setEspacioOcupado(int eje_x);
    public abstract void setEspacioReservadoOcupado(int eje_x);
    public abstract void setEspacioReservadoLibre(int eje_x);
    public abstract void setEspaciosBasico(int eje_x, int rOpcion);
    public abstract void setEspaciosCompuesto(int eje_x, int rOpcion);
    
}
