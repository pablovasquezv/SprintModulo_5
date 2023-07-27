<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 24-07-2023
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">


    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


    <script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>


</head>
<body>
<%
    if (request.getSession().getAttribute("sesion") != null) {
%>

<jsp:include page='header.jsp'/>
<jsp:include page='modalUsuario.jsp' flush="true"/>
<jsp:include page='modalEditarUsuario.jsp' flush="true"/>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <button type="button" class="btn btn-primary float-end" data-bs-toggle="modal"
                    data-bs-target="#crearUsuario">
                <b>Crear Usuario</b>
            </button>
        </div>
    </div>
</div>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h1 class="mt-3" style='text-align: center'>Lista de Usuarios</h1>
            <div class="table-responsive">
                <table id="tablaUsuarios" class="table" action="servlet-capacitacion" method="DELETE">
                    <thead>
                    <tr>
                        <th scope="col">Código</th>
                        <th scope="col">Nombres</th>
                        <th scope="col">Tipo</th>

                        <th scope="col"><b>Botón</b></th>
                        <th scope="col"><b>Botón</b></th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${listaUsuarios}" var="usuario">
                        <tr>
                            <td>${usuario.id_usuario}</td>
                            <td>${usuario.nombre}</td>
                            <td>${usuario.tipo}</td>

                            <td>

                                <button type="button" class="btn btn-warning " data-bs-toggle="modal" id="editarUsers"
                                        data-bs-target="#editarUsuario"
                                        idUsuario="${usuario.id_usuario}"
                                        nombreUsuario="${usuario.nombre}"
                                        tipoUsuario="${usuario.tipo}"
                                        passUser="${usuario.pass}">
                                    <b>Actualizar</b>
                                </button>
                            </td>

                            <td>
                                <button type="button" class="btn btn-danger" data-toggle="modal"
                                        data-target="">
                                    Eliminar
                                </button>
                            </td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>

                <script>
                    $(document).ready(function () {
                        // Inicializar DataTable
                        $(".table").DataTable();
                    });
                </script>

                <script>
                    function eliminarCapacitacion(identificador) {
                        if (confirm('¿Está seguro que desea eliminar la capacitación ' + identificador + '?')) {
                            // hacer una llamada AJAX para eliminar la capacitación de la lista
                            // por ejemplo, podríamos enviar una solicitud POST al servlet que maneja la eliminación de capacitaciones
                            // después de eliminar la capacitación, volver a cargar la página para actualizar la tabla
                            window.location.reload();
                        }
                    }
                </script>
            </div>
        </div>
    </div>
</div>
</br>
<%
    } else {
        response.sendRedirect("login.jsp");
    }
%>
<jsp:include page='footer.jsp'/>

<script>
    const myModal = document.getElementById('editarUsuario')
    //const myInput = document.getElementById('myInput')

    myModal.addEventListener('shown.bs.modal', () => {
        //myInput.focus()
    })
</script>
<script>
    $(document).ready(function () {
        // Inicializar DataTable
        $(".table").DataTable();

        /*$('#editarUsers').on("click",function(){
            var idUser=  $('#editarUsers').attr("idUsuario");
            var nombreUsuario=  $('#editarUsers').attr("nombreUsuario");
            var tipoUsuario=  $('#editarUsers').attr("tipoUsuario");
            var contrasenia=  $('#editarUsers').attr("passUser");
            $('#formEditNombreUsuario').val('');
            $('#formEditIdUser').val(idUser);
            $('#formEditNombreUsuario').val(nombreUsuario);
            $('#formEditSelect').val(tipoUsuario);
            $('#formEditPass').val(contrasenia);


        })*/

        $("body").on("click", "#editarUsers", function(e) {
            e.preventDefault();
            var id = $(this).parent().parent().children()[0];
            var nombres = $(this).parent().parent().children()[1];
            var tipo = $(this).parent().parent().children()[2];
            var pass = $(this).parent().parent().children()[2];
            console.log($(nombres).text());

            document.getElementById('formEditIdUsuario').value=$(id).text() ;
            document.getElementById('formEditNombreUsuario').value=$(nombres).text() ;
            document.getElementById('formEditSelect').value=$(tipo).text() ;
            document.getElementById('formEditPassUsuario').value=$(pass).text() ;

        });

    });
    /**$(document).ready(function(){
        $("#editarUsers").click(function(){
            var nombre = $("#formEditNombreUsuario").val();
            var correo = $("#correo").val();
            var telefono = $("#telefono").val();

            // Aquí puedes hacer algo con los datos capturados, como enviarlos a un servidor
            // o actualizar la página con los datos ingresados.
        });
    });*/
</script>



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
