package com.example.ejerciciogrupal1.models;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Administrativo
 */
public class Administrativo extends Usuario {
    //Definición de atributos
    private String area;
    private String experienciaPrevia;

    /**
     *
     */

    public Administrativo() {
    }

    /**
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     *
     * @param id_usuario
     * @param nombre
     * @param tipo
     * @param pass
     * @param area
     * @param experienciaPrevia
     */

    public Administrativo(Long id_usuario, String nombre, String tipo, String pass, String area, String experienciaPrevia) {
        super(id_usuario, nombre, tipo, pass);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return experienciaPrevia
     */
    public String getExperienciaPrevia() {
        return this.experienciaPrevia;
    }

    /**
     * @param experienciaPrevia
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                ", id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
