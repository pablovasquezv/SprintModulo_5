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
 * Creación Clase Cliente
 */
public class Cliente extends Usuario {
    private int telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;

    /**
     *
     */
    public Cliente() {
    }

    /**
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     */
    public Cliente(int telefono, String afp, int sistemaSalud, String direccion, String comuna) {
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    /**
     *
     * @param id_usuario
     * @param nombre
     * @param tipo
     * @param pass
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     */
    public Cliente(Long id_usuario, String nombre, String tipo, String pass, int telefono, String afp, int sistemaSalud, String direccion, String comuna) {
        super(id_usuario, nombre, tipo, pass);
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    /**
     * @return telefono
     */
    public int getTelefono() {
        return this.telefono;
    }

    /**
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return
     */
    public String getAfp() {
        return this.afp;
    }

    /**
     * @param afp
     */
    public void setAfp(String afp) {
        this.afp = afp;
    }

    /**
     * @return sistemaSalud
     */
    public int getSistemaSalud() {
        return this.sistemaSalud;
    }

    /**
     * @param sistemaSalud
     */
    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    /**
     * @return direccion
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return comuna
     */
    public String getComuna() {
        return this.comuna;
    }

    /**
     * @param comuna
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    /**
     * metodo SistemaSalud
     */
    public void obtenerSistemaSalud() {
        String tipoSistemaSalud;
        switch (this.sistemaSalud) {
            case 1:
                tipoSistemaSalud = "Fonasa";
                break;
            case 2:
                tipoSistemaSalud = "Isapre";
                break;
            case 3:
                tipoSistemaSalud = "Otros";
                break;
            default:
                tipoSistemaSalud = "Desconocido";
                break;
        }
        System.out.println("Tipo de sistema de salud: " + tipoSistemaSalud);
    }

}
