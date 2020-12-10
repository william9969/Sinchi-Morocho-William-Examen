<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="ec.edu.ups.entidades.UsuarioExamen" %>
 <%@page import="ec.edu.ups.entidades.TelefonosExamen" %>
 <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/CSS/bootstrap-grid.css" />     
	<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/CSS/bootstrap.css"/>
	<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/CSS/style.css"/>
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
	
	
	
	
	<div class="container-md">
    	<% HttpSession sesion=request.getSession(); %>
    	<% UsuarioExamen usu = new UsuarioExamen(); %> 
		<% List<UsuarioExamen> usuarios= (List<UsuarioExamen>) sesion.getAttribute("agenda");  %> 
    
    	<% for(int i = 0; i < usuarios.size(); i++) {%>
			<% usu = usuarios.get(i); %>
	    	<div class="card">
				  <div class="card-header">
				    Usuario N° <%out.println(i+1);%>
				  </div>
				  <div class="card-body">
				    <p class="card-text">Cedula: <%out.println(usu.getCedUsuario());%></p>
				    <p class="card-text">Nombre: <%out.println(usu.getNomsUsuario());%></p>
				    <p class="card-text">Apellido: <%out.println(usu.getApeusuario());%></p>
				    <p class="card-text">Correo: <%out.println(usu.getCorrUsuario());%></p>
				    <p class="card-text">Contrasena: <%out.println(usu.getContUsuario());%></p>
				    <p>
					  <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample<%out.println(i);%>" role="button" aria-expanded="false" aria-controls="collapseExample">
					    Mostrar Telefonos
					  </a>
					</p>
		  		</div>
		  		
		  		<div class="collapse" id="collapseExample<%out.println(i);%>">
					  <div class="card card-body">
					  <table class="table">
						  <thead class="thead-dark">
						    <tr>
						      <th scope="col">Numero de Telefono</th>
						      <th scope="col">Tipo de Telefono</th>
						      <th scope="col">Operadora</th>
						    </tr>
						  </thead>
						  <tbody class="bg-light">
							  <% for(TelefonosExamen tlf:usuarios.get(i).getTelefonos()) {%>
					           	  <tr>
						               <th scope="row"><%out.println(tlf.getNumeroTelefono());%></td>
						               <td ><%out.println(tlf.getOperadoraTelefono().getNomOperadora());%></td>
						               <td><%out.println(tlf.getTipoTelefonotlf().getTipoTelefono());%></td>
					          		</tr>
					              <% } %>
						  </tbody>
						</table>
					  </div>
				</div>
		  		<br>
			</div>
			<br>
		<%} %>
    </div>
    
    
    
    
    
</body>
</html>