package zonasteatro;

import java.util.ArrayList;

public class AreaPreferencial extends Graderia{
    
    // Creacion de Atributos
    private ArrayList<Integer> espacio;
    private final int CANTIDAD_ESPACIO = 10;
    private final double COSTO_BOLETO = 7000.00;
    
    // Const
    public AreaPreferencial() {
        super();
        this.espacio = new ArrayList<>(CANTIDAD_ESPACIO);
        for (int i = 0; i < CANTIDAD_ESPACIO-1; i++){
            this.espacio.add(super.getESPACIO_LIBRE());
        }        
    }
    
    @Override
    public double getCOSTO_BOLETO() {
        return this.COSTO_BOLETO;
    }

    @Override
    public void setEspacioReservado(int eje_x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEspacioOcupado(int eje_x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEspacioLibre(int eje_x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEspacioReservadoOcupado(int eje_x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEspacioReservadoLibre(int eje_x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
