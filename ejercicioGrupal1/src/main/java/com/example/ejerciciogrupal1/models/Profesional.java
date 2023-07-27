package com.example.ejerciciogrupal1.models;

import java.time.LocalDate;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */
/**
 * Creación Clase Profesional.
 */
public class Profesional extends Usuario {
    //Definición de atributos
    private String titulo;
    private LocalDate fechaIngreso;

    /**
     *
     */
    public Profesional() {
    }

    /**
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String titulo, LocalDate fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     *
     * @param id_usuario
     * @param nombre
     * @param tipo
     * @param pass
     * @param titulo
     * @param fechaIngreso
     */

    public Profesional(Long id_usuario, String nombre, String tipo, String pass, String titulo, LocalDate fechaIngreso) {
        super(id_usuario, nombre, tipo, pass);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return fechaIngreso
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return run, nombres, fechaNacimiento, edad.
     */
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

