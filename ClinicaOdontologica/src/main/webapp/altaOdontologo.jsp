<%-- 
    Document   : altas
    Created on : 27 sep. 2023, 11:35:55
    Author     : moss_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimeraparte.jsp"%>

<h1>Alta Odontólogos</h1>
<p>Esto es una prueba</p>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" placeholder="dni">
        </div>     
            <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" placeholder="Nombre">
        </div>     
            <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido" placeholder="Apellido">
        </div>     
            <div class="col-sm-6 mb-3">
                <input type="tel" class="form-control form-control-user" id="telefono" placeholder="Teléfono">
        </div>         
            <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion" placeholder="Dirección">
        </div>   
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechanac" placeholder="Fecha de Nacimiento">
        </div>              
            <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad" placeholder="Especialidad">
        </div>   
    </div>         
             
    
    <!--Acá va a ir todo lo que respecta a horarios y usarios -->
    </div>
     <a href="login.html" class="btn btn-primary btn-user btn-block">
        Crear Odontólogo
     </a>
    <hr> 
</form>

<%@include file="components/bodyfinal.jsp"%>
