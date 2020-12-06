package logica;

import java.util.ArrayList;

public class AreaPreferencial extends EspaciosSala{
    
    // Creacion de Atributos
    private ArrayList<Boolean> espacio;
    private final int CANTIDAD_ESPACIO = 10;
    private final double COSTO_BOLETO = 7000.00;
    
    // Const
    public AreaPreferencial() {
        super();
        this.espacio = new ArrayList<>(CANTIDAD_ESPACIO);
        for (int i = 0; i < CANTIDAD_ESPACIO-1; i++){
            this.espacio.add(super.isESPACIO_LIBRE());
        }        
    }
    
    @Override
    public double getCOSTO_BOLETO() {
        return this.COSTO_BOLETO;
    }
    
    @Override
    public void setEspacio(int eje_x, int eje_y, boolean espacioLibre) {
        this.espacio.set(eje_x, espacioLibre);
    }

    @Override
    public boolean getEspacio(int eje_x, int eje_y) {
        return this.espacio.get(eje_x).booleanValue();
    }
    
    
    
}
