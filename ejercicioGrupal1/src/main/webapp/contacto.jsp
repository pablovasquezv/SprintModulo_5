<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 13-07-2023
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Contacto</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
            crossorigin="anonymous">

</head>
<body>
<%
    if (request.getSession().getAttribute("sesion") != null) {
%>

<jsp:include page='header.jsp'>
    <jsp:param name='title' value='Welcome'/>
</jsp:include>

<h1 class="mt-3" style='text-align: center'>Formulario Ingreso
    Contacto</h1>
<div class="container">
    <div class="row">
        <form action="servlet-contacto" method="POST">

            <div class="form-group">
                <label for="lblNombre">Nombre: </label>
                <input type="text" class="form-control" id="name" name="txtNombre"
                       autofocus="autofocus" value="Alejador Magno" required>

            </div>
            <div class="form-group">
                <label for="lblEmail">Correo Electrónico:</label> <input
                    type="email" class="form-control" id="email" name="txtEmail"
                    value="alejandromagno@gmail.com"
                    required>
            </div>
            <div class="form-group">
                <label for="lblMessage">Mensaje:</label>
                <textarea class="form-control" id="message" name="txtMessage"
                          rows="5"
                          value="Que funcione esa 0'210321'03930"
                          required></textarea>
            </div>
            <button type="submit" class="btn btn-primary form-control ">Enviar</button>
        </form>
    </div>
</div>

<%
    } else {
        response.sendRedirect("login.jsp");
    }
%>

<jsp:include page='footer.jsp'/>

<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>

</body>
</html>
