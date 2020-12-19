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
        for (int i = 0; i < CANTIDAD_ESPACIO; i++){
            this.espacio.add(super.getESPACIO_LIBRE());
        }        
    }
    
    @Override
    public double getCOSTO_BOLETO() {
        return this.COSTO_BOLETO;
    }

    @Override 
    public void setEspacioReservado(int eje_x) {
        espacio.set(eje_x, getESPACIO_RESERVADO());
    }

    @Override
    public void setEspacioOcupado(int eje_x) {
        espacio.set(eje_x, getESPACIO_OCUPADO());
    }

    @ Override
    public void setEspacioReservadoOcupado(int eje_x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEspacioReservadoLibre(int eje_x) {
        espacio.set(eje_x, getESPACIO_LIBRE());
    }

    @Override
    public void setEspaciosBasico(int eje_x, int rOpcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEspaciosCompuesto(int eje_x, int rOpcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInformacionEspacio() {
        espacio.forEach(value -> {
            if (value == 0) {
                setEspaciosLibres(getEspaciosLibres() +1);
            }
            if (value == 1) {
                setEspaciosReservados(getEspaciosReservados()+1);
            }
            if (value == 2) {
                setEspaciosOcupados(getEspaciosOcupados() +1);
            }
        });
        setTotalGanancia(getEspaciosOcupados() * COSTO_BOLETO);
    }

    @Override
    public void reducirListaDeEspera() {
        if (getListaDeEspera().peek() != null){
            for (int i = 0; i < CANTIDAD_ESPACIO; i++){
                if (espacio.get(i) == 0){
                    espacio.set(i, 2);
                }
            }
        }
    }
}
