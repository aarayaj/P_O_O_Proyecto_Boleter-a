package zonasteatro;

import java.util.Stack;

public class GraderiaPreferencial extends Graderia{
    
    private Stack<Integer> espacio;
    private final int CANTIDAD_ESPACIO = 5;
    private final double COSTO_BOLETO = 5500.00;
    
    public GraderiaPreferencial() {
        super();
        this.espacio = new Stack();
        for (int i = 0; i < CANTIDAD_ESPACIO-1; i++){
            this.espacio.push(super.getESPACIO_LIBRE());
        }
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

    @Override
    public void setEspaciosBasico(int eje_x, int rOpcion) {
        Stack<Integer> oldEspacio = espacio;
        Stack<Integer> newEspacio = new Stack<>();
        espacio = new Stack<>();
        
        // 1 para agregar Reserva
        if (rOpcion == 0){
            while (oldEspacio.peek() == 0){
                oldEspacio.pop();
            }
            while (oldEspacio.peek() != 0 && oldEspacio.peek() != null){
                newEspacio.push(oldEspacio.pop());
            }
            while (newEspacio.peek() != null) {
                espacio.push(newEspacio.pop());
            }
            
        }
        // 2 para agregar Pagados
        if (rOpcion == 1){
            
        }
    }
    
}
