package com.example.ejerciciogrupal1.controlador;

import com.example.ejerciciogrupal1.implementacion.UsuarioDao;
import com.example.ejerciciogrupal1.models.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletActualizarUsuario", value = "/servlet-actualizar-usuario")
public class ServletActualizarUsuario extends HttpServlet {
    private ArrayList<Usuario> usuarioArrayList = new ArrayList<Usuario>();

    private UsuarioDao usuarioDao = new UsuarioDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
