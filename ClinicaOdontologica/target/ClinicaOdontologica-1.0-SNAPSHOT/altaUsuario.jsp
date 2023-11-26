<%-- 
    Document   : altaUsuario
    Created on : 28 sep. 2023, 16:34:13
    Author     : moss_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<h1>Alta Usuarios</h1>
<p>Este es un apartado para dar de alta a los usuarios en el sistema.</p>

<form class="user" action="SvUsuario" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu" placeholder="Nombre usuario">
        </div>     
            <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia" placeholder="Contraseña">
        </div>     
            <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol" placeholder="Rol">
        </div>     
            
    </div>               
    
    <!--Acá va a ir todo lo que respecta a horarios y usarios -->
  
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear Usuario
     </button>
    <hr> 
</form>

<%@include file="components/bodyfinal.jsp"%>
