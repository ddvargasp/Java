<%-- 
    Document   : registrarUsuarios
    Created on : 22 oct 2023, 17:19:54
    Author     : ddvar
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/shared/header.jsp" %>
<%@include file="components/shared/bodyPrimeraParte.jsp" %>

<h1>Editar Usuario</h1>
<p>Este es el apartado para modificar los datos de los usuarios registrados en el sistema</p>

<% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar"); %>

        <form class="user" action="SvEditarUsuarios" method="POST">
            <div class="form-group col">
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                           placeholder="Nombre Usuario" value="<%=usu.getNombreUsuario()%>">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                           placeholder="Contraseña" value="<%=usu.getContrasenia()%>">
                </div>
                <div class="col-sm-6 mb-3">
                    <input type="text" class="form-control form-control-user" id="rol" name="rol"
                           placeholder="Rol" value="<%=usu.getRol()%>">
                </div>
            </div>

            <button class="btn btn-primary btn-user btn-block" type="submit">
                Finalizar Edición
            </button>

        </form>



<%@include file="components/shared/bodyFinal.jsp" %>