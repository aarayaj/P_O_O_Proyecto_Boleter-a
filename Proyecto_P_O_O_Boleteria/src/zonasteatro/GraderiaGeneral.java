package zonasteatro;

import java.util.LinkedList;

public class GraderiaGeneral extends Graderia {

    private LinkedList<Integer> espacio;
    private final int CANTIDAD_ESPACIO = 20;
    private final double COSTO_BOLETO = 4000.00;
    
    public GraderiaGeneral() {
        super();
        this.espacio = new LinkedList();
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
        this.espacio.push(super.getESPACIO_RESERVADO());
    }

    @Override
    public void setEspacioOcupado(int eje_x) {
        this.espacio.push(super.getESPACIO_OCUPADO());
    }

    @Override
    public void setEspacioReservadoOcupado(int eje_x) {
        this.espacio.set(eje_x, 2);
    }

    @Override
    public void setEspacioReservadoLibre(int eje_x) {
        this.espacio.set(eje_x, 0);
    }

    @Override
    public void setEspaciosBasico(int eje_x, int rOpcion) {
        LinkedList<Integer> oldEspacio = espacio;
        LinkedList<Integer> newEspacio = new LinkedList<>();
        espacio = new LinkedList<>();
        // 0 para agregar Reserva
        if (eje_x > CANTIDAD_ESPACIO){
                eje_x = 5;
            }
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
            for (int i = 0; i < eje_x ; i++){
                espacio.push(getESPACIO_RESERVADO());
            }
            while (espacio.size() <= CANTIDAD_ESPACIO){
                espacio.push(0);
            }
        }
        // 1 para agregar Pagados
        if (rOpcion == 1){
            while (oldEspacio.peek() == 0){
                oldEspacio.pop();
            }
            while (oldEspacio.peek() != 0 && oldEspacio.peek() != null){
                newEspacio.push(oldEspacio.pop());
            }
            while (newEspacio.peek() != null) {
                espacio.push(newEspacio.pop());
            }
            for (int i = 0; i < eje_x ; i++){
                espacio.push(getESPACIO_OCUPADO());
            }
            while (espacio.size() <= CANTIDAD_ESPACIO){
                espacio.push(0);
            }
        }
        
    }

    @Override
    public void setEspaciosCompuesto(int eje_x, int rOpcion) {
        LinkedList<Integer> oldEspacio = espacio;
        LinkedList<Integer> newEspacio = new LinkedList<>();
        espacio = new LinkedList<>();
        
        if (oldEspacio.get(eje_x) == getESPACIO_RESERVADO()){
            // 0 para agregar Libre a Reserva
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
                if (eje_x > CANTIDAD_ESPACIO){
                    setEspacioReservadoLibre(eje_x);
                }else{
                    setEspacioReservadoLibre(eje_x);
                }
            }
            // 1 para agregar Pagado a Reserva
            if (rOpcion == 1){
                while (oldEspacio.peek() == 0){
                    oldEspacio.pop();
                }
                while (oldEspacio.peek() != 0 && oldEspacio.peek() != null){
                    newEspacio.push(oldEspacio.pop());
                }
                while (newEspacio.peek() != null) {
                    espacio.push(newEspacio.pop());
                }
                setEspacioReservadoOcupado(eje_x);
            }
            // Cambia todos los valores reserva a libre
            if (rOpcion == 2){
                while (oldEspacio.peek() == 0){
                    oldEspacio.pop();
                }
                while (oldEspacio.peek() != 0 && oldEspacio.peek() != null){
                    newEspacio.push(oldEspacio.pop());
                }
                while (newEspacio.peek() != null) {
                    espacio.push(newEspacio.pop());
                }
                for (int i = 0; i < CANTIDAD_ESPACIO ; i++){
                    setEspacioReservadoLibre(i);
                }
            }
            // Cambia todos los valores reserva a libre
            if (rOpcion == 3){
                while (oldEspacio.peek() == 0){
                    oldEspacio.pop();
                }
                while (oldEspacio.peek() != 0 && oldEspacio.peek() != null){
                    newEspacio.push(oldEspacio.pop());
                }
                while (newEspacio.peek() != null) {
                    espacio.push(newEspacio.pop());
                }
                for (int i = 0; i < CANTIDAD_ESPACIO ; i++){
                    setEspacioReservadoOcupado(i);
                }
            }
        }
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
        setTotalGanancia(getEspaciosOcupados() * getCOSTO_BOLETO());
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
