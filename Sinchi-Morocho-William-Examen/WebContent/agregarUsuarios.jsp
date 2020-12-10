<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="ec.edu.ups.entidades.OperadoraExamen" %>
    <%@page import="ec.edu.ups.entidades.TipoTelfExamen" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/CSS/bootstrap-grid.css" />     
	<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/CSS/bootstrap.css"/>
	<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/CSS/style.css"/>
	<script src='<%=request.getContextPath()%>/JavaScript/agregarTelefono.js'></script>
</head>
<body>
<nav class="container">
		<nav class="nav nav-pills flex-column flex-sm-row">
			<a class="flex-sm-fill text-sm-center nav-link" href="index.html">Inicio</a>
			<div class="btn-group" role="group" aria-label="Basic checkbox toggle button group">
	        <form action="http://localhost:8080/Sinchi-Morocho-William-Examen/EnviarTipYOpe" method="get">
	        	<button type="submit" class="flex-sm-fill text-sm-center nav-link btn-dark">Agregar Usuario</button>
	        </form>
	        <form action="http://localhost:8080/Sinchi-Morocho-William-Examen/EnviarListado" method="get">
	       		<button type="submit" class="flex-sm-fill text-sm-center nav-link btn-dark">Listar Agenda</button>
	        </form>
	        <form action="http://localhost:8080/Sinchi-Morocho-William-Examen/LogOut" method="get">
	       		<button type="submit" class="flex-sm-fill text-sm-center nav-link btn-dark">Buscar Usuario</button>
	        </form>
	        </div>
		</nav>
		
	</nav>

<% HttpSession sesion=request.getSession();
	List<OperadoraExamen> operadoras= (List<OperadoraExamen>)sesion.getAttribute("operadorasTel");
	List<TipoTelfExamen> tipos= (List<TipoTelfExamen>)sesion.getAttribute("tiposTelf");
%>
<div class="section about_section layout_padding dash_bg ">  
        <div class="text-center bg-light ">
            <div class="heading_main text_align_center bg-light">
                <h2>Agregar Usuario</h2>
            </div>
        </div>
        <div class="container bg-secondary">
            <form action="http://localhost:8080/Sinchi-Morocho-William-Examen/AgregarUsuario" id="compra" method="post">
               <div class="form-row">
                    <div class="col">
                        <label for="exampleFormControlInput1 " class ="text-white">Cedula: </label>
                        <input type="text" class="form-control" name="cedUsuario" placeholder="Ingrese Cedula">
                    </div>
                  </div>
                <br>
                <div class="form-row ">
                	<div class="col">
                        <label for="exampleFormControlInput1 " class = "text-white">Nombre: </label>
                        <input type="text" class="form-control" name="nomUsuario" placeholder="Ingrese Nombre">
                    </div>
                    <div class="col"> 
	                    <label for="exampleFormControlInput1 " class= "text-white" >Apellido: </label>
	                    <input type="text" class="form-control"  name="apeUsuario" placeholder="Ingrese Apellido">
                    </div>
                </div>
                <div class="form-row">
                    <div class="col">
                        <label for="exampleFormControlInput1 " class = "text-white">Correo: </label>
                        <input type="text" class="form-control" name="corrUsuario" placeholder="Ingrese Correo">
                    </div>
                    <div class="col">
                    	<label for="exampleFormControlInput1 " class = "text-white">Contraseña: </label>
                        <input type="password" class="form-control" name="contraUsuario" placeholder="Ingrese Contraseña">
                    </div>
                </div>
               	 <div class="form-row">
                    <div class="col">
                        <<h2>Agregar Telefonos</h2>
                    </div>
                 </div>
               
               
                <br>
               	<table class="table table-striped" border="1" id = "">
               		<thead>
               			<th>Numero Teléfono</th>
               			<th>Tipo Teléfono</th>
               			<th>Operadora Teléfono</th>
               		</thead>

               			<tr>
               			<td><input type = "text" name = "numero" id = "numero" placeholder="Ingresa Numero" ></<input></td>
               			<td><select name="tipos" id="tipos">
               			<% for (TipoTelfExamen tip : tipos) {%>
               				<option name = "tipo" value ="<%= tip.getIdTipo()%>" id = ""><%= tip.getTipoTelefono()%>  </option>
               				<% }%>
               				</select></td> 
               			<td> <select name="operadoras" id="operadoras">
               			<% for (OperadoraExamen ope : operadoras) {%>
               				<option name = "operadora" value ="<%= ope.getIdOperadora()%>" id = ""><%= ope.getNomOperadora()%>  </option>
               				<% }%>
               				</select> </td>
               			</tr>	
            
            </table>
            <input type='hidden' id='cantidadTelefonos'  name="cantidadTelefonos" value='0'>
                  <br>                     
                    <br>
                  <h2>Telefonos</h2>
                  <br>
                  <table class="table table-striped" border="1" id="totalTelefonos">
                  	<thead>
                  		<th>Numero Teléfono</th>
               			<th>Tipo Teléfono</th>
               			<th>Operadora Teléfono</th>
                  	</thead>
                  		
                  </table>
                  <br>
                  <div class="form-row">
                    <div class="col">
                  <input class = "btn btn-success" type="submit" value="Agregar Usuario">
                  <br>
                  	</div>
           		 </div>
             	
            </form>
            
         	<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
                       <button onclick="agregarFila()" class="btn btn-warning">Agregar Telefono</button> 
        
                       <button onclick="eliminarFila()" class="btn btn-danger">Eliminar Telefono</button>  
          		
			</div>
        </div> 
    </div>
    </div>
</body>
</html>