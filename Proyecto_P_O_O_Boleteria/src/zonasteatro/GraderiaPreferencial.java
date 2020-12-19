package zonasteatro;

import java.util.Stack;

public class GraderiaPreferencial extends Graderia{
    
    private Stack<Integer> espacio;
    private final int CANTIDAD_ESPACIO = 25;
    private final double COSTO_BOLETO = 5500.00;
    
    public GraderiaPreferencial() {
        super();
        this.espacio = new Stack();
    }
    
    @Override
    public double getCOSTO_BOLETO() {
        return this.COSTO_BOLETO;
    }

    @Override
    public void setEspacioReservado(int eje_x) {
        this.espacio.push(super.getESPACIO_RESERVADO());
    }

    @Override
    public void setEspacioOcupado(int eje_x) {
        this.espacio.push(super.getESPACIO_OCUPADO());
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
