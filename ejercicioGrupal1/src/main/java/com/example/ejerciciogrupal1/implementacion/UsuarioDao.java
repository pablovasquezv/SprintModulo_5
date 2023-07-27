package com.example.ejerciciogrupal1.implementacion;

import com.example.ejerciciogrupal1.conexion.Conexion;
import com.example.ejerciciogrupal1.interfaces.IUsuario;
import com.example.ejerciciogrupal1.models.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Clase  de acceso a datos UsuarioDao.
 */

public class UsuarioDao implements IUsuario {
    //Varaibles
    private String sql = null;
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet resultSet = null;

    /**
     * @param usuario
     * @return
     * @throws Exception
     */
    @Override
    public boolean createUsuario(Usuario usuario) throws Exception {
        boolean registar = false;
        //Creamos la consulta SQL  para agregar nuevos valores en la tabla.
        sql = " INSERT INTO usuarios (nombre, tipo, pass) VALUES ('" + usuario.getNombre() +
                "', '" + usuario.getTipo() +
                "', '" + usuario.getPass()
                + "')";
        //Creación de try
        try {
            System.out.println(sql);
            connection = Conexion.conectar();//Agregar los datos de la conexión
            statement = connection.createStatement();
            statement.execute(sql);//Agregar la consulta para registrar
            registar = true;//Si salío todo de pana
            statement.close();// Cerrar declacaració
            connection.close();// Cerrar conexión-
        } catch (SQLException e) {
            System.out.println("Error: createUsuario");
            e.printStackTrace();
        }
        return registar;
    }

    /**
     * @param usuario
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateUsuario(Usuario usuario) throws Exception {
        boolean actualizar = false;
        //Creamos la consulta SQL  para actualizar los valores en la tabla.
        sql = "UPDATE  usuarios SET "
                + "nombre= '" + usuario.getNombre()
                + "',tipo='" + usuario.getTipo()
                + "', pass ='" + usuario.getPass()
                + "'WHERE  id=" + usuario.getId_usuario();
        //Creación de try
        try {
            System.out.println(sql);
            connection = Conexion.conectar();//Agregar los datos de la conexión
            statement = connection.createStatement();
            statement.execute(sql);//Agregar la consulta para registrar
            actualizar = true;//Si salío todo de pana
            statement.close();// Cerrar declacaració
            connection.close();// Cerrar conexión-
        } catch (SQLException e) {
            System.out.println("Error: updateUsuario");
            e.printStackTrace();
        }
        return actualizar;
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public List<Usuario> listaUsuarios() throws Exception {
        //Creamos la consulta SQL  para todos los valores en la tabla.
        sql = "SELECT * FROM usuarios";
        List<Usuario> usuarioList = new ArrayList<Usuario>();
        //Creación de try
        try {
            connection = Conexion.conectar();//Agregar los datos de la conexión
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);//Agregar la consulta para registrar

            while (resultSet.next()) {
                //Creación de un objeto para agregarlo a la lista
                Usuario usuario = new Usuario();
                //Obtencion de datos de la tabla campo por campo
                usuario.setId_usuario(resultSet.getLong(1));
                usuario.setNombre(resultSet.getString(2));
                usuario.setTipo(resultSet.getString(3));
                usuario.setPass(resultSet.getString(4));
                usuarioList.add(usuario);//Guardar los datos a lista
            }
            resultSet.close();// Cerrar resultset
            statement.close();// Cerrar declacaración
            connection.close();// Cerrar conexión-
        } catch (SQLException e) {
            System.out.println("Error: listaCapacitaciones");
            e.printStackTrace();
        }
        return usuarioList;
    }

    /**
     * @param usuario
     * @return
     * @throws Exception
     */
    @Override
    public boolean eliminarUsuario(Usuario usuario) throws Exception {
        boolean eliminar = false;
        //Creamos la consulta SQL  para eliminra los valores en la tabla.
        sql = "DELETE FROM  usuarios  WHERE id =" + usuario.getId_usuario();//Eliminamos donde esta el id
        //Creación de try
        try {
            connection = Conexion.conectar();//Agregar los datos de la conexión
            statement = connection.createStatement();
            statement.execute(sql);//Agregar la consulta para registrar
            eliminar = true;//Si salío todo de pana
            statement.close();// Cerrar declacaració
            connection.close();// Cerrar conexión-
        } catch (SQLException e) {
            System.out.println("Error: updateUsuario");
            e.printStackTrace();
        }
        return eliminar;
    }
}
