package com.example.ejerciciogrupal1.models;

import java.time.LocalTime;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Capacitación
 */
public class Capacitacion {
    //Definición de atributos
    private int identificador;
    private int rut;
    private String dia;
    private LocalTime hora;
    private String lugar;
    private LocalTime duracion;
    private int cantAsistentes;

    /**
     *
     */

    public Capacitacion() {
    }

    /**
     * @param identificador
     * @param rut
     * @param dia
     * @param hora
     * @param lugar
     * @param duracion
     * @param cantAsistentes
     */

    public Capacitacion(int identificador, int rut, String dia, LocalTime hora, String lugar, LocalTime duracion, int cantAsistentes) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    /**
     * @return identificador
     */
    public int getIdentificador() {
        return this.identificador;
    }

    /**
     * @param identificador
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return rut
     */
    public int getRut() {
        return this.rut;
    }

    /**
     * @param rut
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * @return dia
     */
    public String getDia() {
        return this.dia;
    }

    /**
     * @param dia
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return hora
     */
    public LocalTime getHora() {
        return this.hora;
    }

    /**
     * @param hora
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * @return lugar
     */
    public String getLugar() {
        return this.lugar;
    }

    /**
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return duracion
     */
    public LocalTime getDuracion() {
        return this.duracion;
    }

    /**
     * @param duracion
     */
    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    /**
     * @return cantAsistentes
     */
    public int getCantAsistentes() {
        return this.cantAsistentes;
    }

    /**
     * @param cantAsistentes
     */
    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut=" + rut +
                ", dia='" + dia + '\'' +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantAsistentes=" + cantAsistentes +
                '}';
    }
    /**
     * Muestra el detalle de la capacitación.
     * @return Detalle de la capacitación.
     */
    public String mostrarDetalle() {
        String detalle = "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos.";
        return detalle;
    }
}
