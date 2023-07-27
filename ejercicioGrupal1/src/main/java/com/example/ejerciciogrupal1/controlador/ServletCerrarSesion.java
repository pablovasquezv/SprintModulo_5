package com.example.ejerciciogrupal1.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name = "servletCerrarSesion", value = "/servlet-cerrar-sesion")
public class ServletCerrarSesion extends HttpServlet {
    private HttpSession session;
    public ServletCerrarSesion() {
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
        HttpSession session = request.getSession(); // Obtener la sesión actual


            request.getSession().invalidate(); // Invalidar la sesión actual del usuario


        response.sendRedirect("login.jsp"); // Redireccionar el usuario al sitio de inicio de sesión
    }

}
