<%-- 
    Document   : registrar
    Created on : 22 oct 2023, 16:33:10
    Author     : ddvar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/shared/header.jsp" %>
<%@include file="components/shared/bodyPrimeraParte.jsp" %>

<h1>Registrar nuevo odontólogo</h1>
<p>Esto es una prueba</p>

<form class="user" action="SvOdontologo" method="POST">
        <div class="form-group col">
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="documentoIdentidad"
                       name="documentoIdentidad"
                       placeholder="Documento Identidad">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="nombre"
                       name="nombre"
                       placeholder="Nombre">
            </div>
                    <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="apellido"
                       name="apellido"
                       placeholder="Apellido">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="telefono"
                       name="telefono"
                       placeholder="Teléfono">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="direccion"
                       name="direccion"
                       placeholder="Dirección">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="fechaNacimiento"
                       name="fechaNacimiento"
                       placeholder="Fecha Nacimiento">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="especialidad"
                       name="especialidad"
                       placeholder="Especialidad">
            </div>
        </div>
    
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Registrar Odontologo
        </button>    </form>



<%@include file="components/shared/bodyFinal.jsp" %>