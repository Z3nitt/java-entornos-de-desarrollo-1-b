package model.Model;


import java.util.*;

/**
 * Representa una casa del mundo real
 */
public class Casa {


    public Casa() {
    }


    private String direccion;


    private int numHabitaciones;


    private int metrosCuadrados;

    /**
     * Constructor que recibe como parametros la direccion, el num hab y  los mcuadrados de una casa
     * @param direccion 
     * @param numHabitaciones 
     * @param metrosCuadrados
     */
    public Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
        this.direccion= direccion;
        this.numHabitaciones = numHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return
     */
    public String getDireccion() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getnumHabitaciones() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getmetrosCuadrados() {
        // TODO implement here
        return 0;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param numHabitaciones
     */
    public void setnumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @param metrosCuadrados
     */
    public void setmetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados; 
    }





}