<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 13-07-2023
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div>
    <h2  class="mt-3" style='text-align: center'>Login</h2>
    <div class="container">
      <div class="row justify-content-center">
            <form action="servlet-login" method="post" class="was-validated">
                <div class="form-group">
                    <label for="username">Usuario:</label>
                    <input type="text" class="form-control" id="username" placeholder="Ingrese usuario"
                           name="txtUserName" value="admin" required>
                    <div class="invalid-feedback">Campo obligatorio</div>
                </div>
                <div class="form-group">
                    <label for="password">Contraseña:</label>
                    <input type="password" class="form-control" id="password" placeholder="Ingrese contraseña"
                           name="txtPassword" value="1234"required>
                    <div class="invalid-feedback">Campo obligatorio</div>
                </div>
                <button type="submit" class="btn btn-primary">Ingresar</button>
            </form>
        </div>
    </div>
</body>
</html>

