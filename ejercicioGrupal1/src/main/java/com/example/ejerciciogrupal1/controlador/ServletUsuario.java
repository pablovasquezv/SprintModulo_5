package com.example.ejerciciogrupal1.controlador;

import com.example.ejerciciogrupal1.implementacion.UsuarioDao;
import com.example.ejerciciogrupal1.models.Cliente;
import com.example.ejerciciogrupal1.models.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletUsuario", value = "/servlet-usuario")
public class ServletUsuario extends HttpServlet {
    private ArrayList<Usuario> usuarioArrayList = new ArrayList<Usuario>();

    private UsuarioDao usuarioDao = new UsuarioDao();

    public ServletUsuario() {
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("txtNombres");
        String tipo = request.getParameter("txtTipoUsuario");
        String pass = request.getParameter("txtPass");
        Usuario usuario = new Usuario(nombre, tipo,pass);
        try {
            if (usuarioDao.createUsuario(usuario)) {
                System.out.printf("¡Usuario Creado correctamente!");
            }
            List<Usuario> usuarioList = usuarioDao.listaUsuarios();
            if (!usuarioList.isEmpty()) {
                //listaCapacitacion.add(capacitacion);
                request.setAttribute("listaUsuarios", usuarioList);
                request.getRequestDispatcher("listaUsuarios.jsp").forward(request, response); // enviar la solicitud y la respuesta al archivo JSP "tabla.jsp"
                System.out.printf("¡Lista de Usuarios mostrada correctamente!");
            }
        } catch (Exception e) {
            System.out.println("Error: doPost ServletUsuario");

        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> usuarioList = null;
        try {
            usuarioList = usuarioDao.listaUsuarios();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (!usuarioList.isEmpty()) {
            //listaCapacitacion.add(capacitacion);
            request.setAttribute("listaUsuarios", usuarioList);
            request.getRequestDispatcher("listaUsuarios.jsp").forward(request, response); // enviar la solicitud y la respuesta al archivo JSP "tabla.jsp"
            System.out.printf("¡Lista de Usuarios mostrada correctamente!");
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("método doPut");
        Long id_cliente= Long.valueOf(request.getParameter("txtId_Usuario"));
        String nombre = request.getParameter("txtNombres");
        String tipo = request.getParameter("txtTipoUsuario");
        String pass = request.getParameter("txtPass");
        Usuario usuario = new Usuario(id_cliente,nombre, tipo,pass);

        try {
            if (usuarioDao.updateUsuario(usuario)) {
                System.out.printf("¡Usuario actualizado correctamente!");
            }
            List<Usuario> usuarioList = usuarioDao.listaUsuarios();
            if (!usuarioList.isEmpty()) {
                //listaCapacitacion.add(capacitacion);
                request.setAttribute("listaUsuarios", usuarioList);
                request.getRequestDispatcher("listaUsuarios.jsp").forward(request, response); // enviar la solicitud y la respuesta al archivo JSP "tabla.jsp"
                System.out.printf("¡Lista de Usuarios mostrada correctamente!");
            }
        } catch (Exception e) {
            System.out.println("Error: doPost ServletUsuario");
        }
    }
}
