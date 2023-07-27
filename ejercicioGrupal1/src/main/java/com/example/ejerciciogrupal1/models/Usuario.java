package com.example.ejerciciogrupal1.models;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Usuario
 */
public class Usuario {
    //Definición de atributos
    protected Long id_usuario;
    protected String nombre;
    protected String tipo;
    protected String pass;

    /**
     * Construct vacío
     */
    public Usuario() {
    }

    /**
     *
     * @param id_usuario
     * @param nombre
     * @param tipo
     * @param pass
     */
    public Usuario(Long id_usuario, String nombre, String tipo, String pass) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pass = pass;
    }

    /**
     *
     * @param nombre
     * @param tipo
     * @param pass
     */
    public Usuario( String nombre, String tipo,String pass) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.pass = pass;
    }

    /**
     *
     * @return
     */
    public Long getId_usuario() {
        return id_usuario;
    }

    /**
     *
     * @param id_usuario
     */
    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return run, nombres, fechaNacimiento, edad.
     */
    @Override
    public String toString() {
        return "Usuarios{" +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    /**
     *
     * Retorna un mensaje que indica la edad del usuario.
     * @return Un mensaje con la edad del usuario.
     */
    public String mostrarEdad() {
        return "El usuario es: " + tipo  ;
    }

}

