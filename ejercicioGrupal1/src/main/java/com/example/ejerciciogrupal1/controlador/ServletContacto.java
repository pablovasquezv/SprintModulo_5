package com.example.ejerciciogrupal1.controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "servletContacto", value = "/servlet-contacto")
public class ServletContacto extends HttpServlet {

    public ServletContacto() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession() == null) {
            //response.sendRedirect("index.jsp");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombre = request.getParameter("txtNombre");
        String email = request.getParameter("txtEmail");
        String mensaje = request.getParameter("txtMessage");


        imprimirDatosEnConsola(nombre, email, mensaje);

        request.setAttribute("nombreSalida", nombre);
        request.setAttribute("emailSalida", email);
        request.setAttribute("mensajeSalida", mensaje);

        RequestDispatcher rd = request.getRequestDispatcher("contacto.jsp");
        rd.forward(request, response);
    }

    // Método
    private void imprimirDatosEnConsola(String nombre, String email, String mensaje) {
        System.out.println("Datos ingresados por el usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Mensaje: " + mensaje);
    }
}
