<%-- 
    Document   : registrarUsuarios
    Created on : 22 oct 2023, 17:19:54
    Author     : ddvar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/shared/header.jsp" %>
<%@include file="components/shared/bodyPrimeraParte.jsp" %>

<h1>Registrar nuevo Usuario</h1>
<p>Este es el apartado para registrar nuevos usuarios</p>

        <form class="user" action="SvUsuarios" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                           placeholder="Nombre Usuario">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                           placeholder="Contraseña">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" id="rol" name="rol"
                           placeholder="Rol">
                </div>
            </div>

            <button class="btn btn-primary btn-user btn-block" type="submit">
                Registrar Usuario
            </button>

        </form>



<%@include file="components/shared/bodyFinal.jsp" %>