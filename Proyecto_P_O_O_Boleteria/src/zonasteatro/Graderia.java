/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonasteatro;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author aaj
 */
public abstract class Graderia implements EspaciosSala {
    
    private int espaciosLibres;
    private int espaciosOcupados;
    private int espaciosReservados;
    private int enListaDeEspera;
    private double TotalGanancia;
    private final int ESPACIO_LIBRE = 0;
    private final int ESPACIO_RESERVADO = 1;
    private final int ESPACIO_OCUPADO = 2;
    private Queue<Integer> listaDeEspera;

    public Graderia() {
        this.setEspaciosLibres(0);
        this.setEspaciosReservados(0);
        this.setEspaciosOcupados(0);
        this.listaDeEspera = new LinkedList<>();
    }
    
    public int getEspaciosLibres() {
        return espaciosLibres;
    }

    public void setEspaciosLibres(int espaciosLibres) {
        this.espaciosLibres = espaciosLibres;
    }

    public int getEspaciosOcupados() {
        return espaciosOcupados;
    }

    public void setEspaciosOcupados(int espaciosOcupados) {
        this.espaciosOcupados = espaciosOcupados;
    }

    public int getEspaciosReservados() {
        return espaciosReservados;
    }

    public void setEspaciosReservados(int espaciosReservados) {
        this.espaciosReservados = espaciosReservados;
    }

    public int getESPACIO_LIBRE() {
        return ESPACIO_LIBRE;
    }

    public int getESPACIO_RESERVADO() {
        return ESPACIO_RESERVADO;
    }

    public int getESPACIO_OCUPADO() {
        return ESPACIO_OCUPADO;
    }

    public double getTotalGanancia() {
        return TotalGanancia;
    }

    public void setTotalGanancia(double TotalGanancia) {
        this.TotalGanancia = TotalGanancia;
    }
    
    public Queue getListaDeEspera() {
        return listaDeEspera;
    }
    
    public void addNewItem(int enListaDeEspera){
        this.listaDeEspera.add(enListaDeEspera);
    }
    
    public void removeAnItem(int enListaDeEspera){
        this.listaDeEspera.poll();
    }

    public int getEnListaDeEspera() {
        return enListaDeEspera;
    }

    public void setEnListaDeEspera(int enListaDeEspera) {
        this.enListaDeEspera = enListaDeEspera;
    }
    
    public void countItems() {
        listaDeEspera.forEach(value -> {
            setEnListaDeEspera(getEnListaDeEspera() + 1);
        });
    }
    
    public abstract void setInformacionEspacio();
    public abstract void reducirListaDeEspera();
    
}
