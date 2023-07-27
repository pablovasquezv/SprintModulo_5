package com.example.ejerciciogrupal1.implementacion;
//Imports
import com.example.ejerciciogrupal1.conexion.Conexion;
import com.example.ejerciciogrupal1.interfaces.ICapacitacion;
import com.example.ejerciciogrupal1.models.Capacitacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Clase  de acceso a datos CapacitacionDAO.
 */
public class CapacitacionDAO implements ICapacitacion {
    private Statement statement = null;
    private Connection connection = null;

    private ResultSet resultSet = null;

    /***
     *
     * @param capacitacion
     * @return
     * @throws Exception
     */
    @Override
    public boolean createCapacitacion(Capacitacion capacitacion) throws Exception {
        boolean registar = false;//Se incia en falso
        // Creación de la consulta SQL
        String sql = "INSERT INTO Capacitaciones ( identificador, rut, dia, hora, lugar, duracion, cantAsistentes) VALUES('" + capacitacion.getIdentificador() +
                "','" + capacitacion.getRut() +
                "', '" + capacitacion.getDia() +
                "','" + capacitacion.getHora() +
                "','" + capacitacion.getLugar() +
                "','" + capacitacion.getDuracion() +
                "','" + capacitacion.getCantAsistentes() + "') ";
        //Creación de try
        try {
            connection = Conexion.conectar();//Agregar los datos de la conexión
            statement = connection.createStatement();
            statement.execute(sql);//Agregar la consulta para registrar
            registar = true;//Si salío todo de pana
            statement.close();// Cerrar declacaració
            connection.close();// Cerrar conexión-
        } catch (SQLException e) {
            System.out.println("Error: createCapacitacion");
            e.printStackTrace();
        }
        return registar;
    }

    /**
     *
     * @param capacitacion
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateCapacitacion(Capacitacion capacitacion) throws Exception {
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Capacitacion> listaCapacitaciones() {
        String sql = "SELECT * FROM Capacitaciones";
        List<Capacitacion> capacitacionList = new ArrayList<Capacitacion>();
        //Creación de try
        try {
            connection = Conexion.conectar();//Agregar los datos de la conexión
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);//Agregar la consulta para registrar

            while (resultSet.next()) {
                //Creación de un objeto para agregarlo a la lista
                Capacitacion capacitacion = new Capacitacion();
                //Obtencion de datos de la tabla campo por campo
                capacitacion.setIdentificador(resultSet.getInt(1));
                capacitacion.setRut(resultSet.getInt(2));
                capacitacion.setDia(resultSet.getString(3));
                capacitacion.setHora(resultSet.getTime(4).toLocalTime());
                capacitacion.setLugar(resultSet.getString(5));
                capacitacion.setDuracion(resultSet.getTime(6).toLocalTime());
                capacitacion.setCantAsistentes(resultSet.getInt(7));
                capacitacionList.add(capacitacion);//Guardar los datos a lista
            }
            resultSet.close();// Cerrar resultset
            statement.close();// Cerrar declacaración
            connection.close();// Cerrar conexión-
        } catch (SQLException e) {
            System.out.println("Error: listaCapacitaciones");
            e.printStackTrace();
        }
        return capacitacionList;
    }

    /**
     *
     * @param capacitacion
     * @return
     * @throws Exception
     */
    @Override
    public boolean eliminarCapacitacion(Capacitacion capacitacion) throws Exception {
        return false;
    }
}
