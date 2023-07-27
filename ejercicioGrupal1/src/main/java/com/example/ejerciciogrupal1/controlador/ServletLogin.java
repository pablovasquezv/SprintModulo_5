package com.example.ejerciciogrupal1.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "servletLogin", value = "/servlet-login")
public class ServletLogin extends HttpServlet {
    private int intentos = 0;

    /**
     *
     */
    public ServletLogin() {
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
        String usuario = request.getParameter("txtUserName");
        String password = request.getParameter("txtPassword");
        String usuarioIngreso= "admin";
        String usuarioPassword= "1234";

        if (usuario.equals(usuarioIngreso) && password.equals(usuarioPassword)) {
            intentos = 0; // reiniciar el contador

           request.getSession().setAttribute("usuario",request.getParameter("txtUserName"));
           request.getSession().setAttribute("sesion",true);
            response.sendRedirect("contacto.jsp");
        } else {
            intentos++;
            if (intentos == 3) {
                response.sendRedirect("bloqueado.jsp"); // redirigir a una página de bloqueo
            } else {
                response.sendRedirect("login.jsp?error=1"); // redirigir a la página de inicio de sesión con un mensaje de error
            }
        }

    }
}
