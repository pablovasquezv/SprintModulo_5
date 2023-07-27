<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Capacitaciones</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active"
                                        aria-current="page" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="contacto.jsp"><b>Contacto</b></a>
                </li>
                <li class="nav-item"><a class="nav-link" href="/ejercicioGrupal1_war/servlet-capacitacion"><b>Capacitaciones</b></a>
                </li>
                <li class="nav-item"><a class="nav-link" href="/ejercicioGrupal1_war/servlet-usuario"><b>Usuarios</b></a>
                </li>
                <!--
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        <b>Capacitación</b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="capacitacion.jsp">Crear Capacitación</a></li>
                        <li><a class="dropdown-item" href="listaCapacitaciones.jsp">Listar Capacitaciones</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>-->
            </ul>
        <%

            if (request.getSession() != null) {

        %>
        <form action="servlet-cerrar-sesion" method="POST" class="justify-content-end" role="search">
            <button class="btn btn-outline-success " type="submit">Cerrar Sesión</button>
        </form>
        <%
        } else {%>
        <button type="button" class="btn btn-primary float-end" data-bs-toggle="modal" data-bs-target="#loginModal">
            Login
        </button>
        <%
            }
        %>
    </div>
</nav>

