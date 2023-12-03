<%-- 
    Document   : visualizarOdontologos
    Created on : 12 nov 2023, 12:24:09
    Author     : ddvar
--%>

<%@page import="model.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/shared/header.jsp" %>
<%@include file="components/shared/bodyPrimeraParte.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Odontologos</h1>
    <p class="mb-4">A continuación podrá ver la lista completa de usuarios</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Odontologos</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px">Acción:</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Nombre Usuario</th>
                            <th>Rol</th>
                            <th style="width: 210px">Acción:</th>
                        </tr>
                    </tfoot>   
                    
                    <%List<Odontologo> listaOdontologos = (List) request.getSession().getAttribute("listaOdontologos");%>
                    
                    <tbody>
                        <%for (Odontologo odonto : listaOdontologos) {%>
                        <tr>
                            <td><%=odonto.getId()%></td>
                            <td><%=odonto.getDocumentoIdentidad()%></td>
                            <td><%=odonto.getNombre()%></td>
                            <td><%=odonto.getApellido()%></td>
                            <td><%=odonto.getDireccion()%></td>
                            <td><%=odonto.getTelefono()%></td>
                            <td><%=odonto.getFechaNacimiento()%></td>
                            <td><%=odonto.getEspecialidad()%></td>
                            
                            <td style="display: flex;width: 230px">
                                <!-- Botón para eliminación -->
                                <form name="eliminar" action="SvEliminarUsuarios" method="POST"><!-- Envío de datos al servlet -->
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;">
                                        <i  class="fas  fa-trash-alt"></i> Eliminar
                                    </button>
                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>"><!-- Envío de datos al servlet -->
                                </form>
                                
                                <!-- Botón de edición -->
                                <form name="editar" action="SvEditarUsuarios" method="GET"><!-- Envío de datos al servlet -->
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-right: 5px;">
                                        <i  class="fas  fa-pencil-alt"></i> Editar
                                    </button>
                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>"><!-- Envío de datos al servlet -->
                                </form>
                            </td>
                        </tr>   
                        
                        <%}%>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->


<%@include file="components/shared/bodyFinal.jsp" %>