<%-- 
    Document   : altaUsuario
    Created on : 28 sep. 2023, 16:34:13
    Author     : moss_
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<h1>Editar Usuarios</h1>
<p>Este es un apartado para modificar un usuario del sistema.</p>

<%Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>

<form class="user" action="SvEditUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu" placeholder="Nombre usuario" value="<%=usu.getNombreUsuario()%>">
        </div>     
            <div class="col-sm-6 mb-3">
                <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia" placeholder="Contraseña" value="<%=usu.getContrasenia()%>">
        </div>     
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="rol" name="rol" placeholder="Rol" value="<%=usu.getRol()%>">
        </div>           
    </div>               
    
    <!--Acá va a ir todo lo que respecta a horarios y usuarios -->
  
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar Modificación
     </button>
    <hr> 
</form>

<%@include file="components/bodyfinal.jsp"%>
