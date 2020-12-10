<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    	<% Requerimiento requerimiento = new Requerimiento(); %> 
		<% List<Requerimiento> listRequerimientos= (List<Requerimiento>) sesion.getAttribute("listReqEmp");  %> 
    
    	<% for(int i = 0; i < listRequerimientos.size(); i++) {%>
			<% requerimiento = listRequerimientos.get(i); %>
	    	<div class="card">
				  <div class="card-header">
				    Requerimiento N° <%out.println(i+1);%>
				  </div>
				  <div class="card-body">
				    <p class="card-text">ID Requerimiento: <%out.println(requerimiento.getIdReq());%></p>
				    <p class="card-text">Nombre del Solicitante: <%out.println(requerimiento.getUsuarioReq().getNombreUsu());%></p>
				    <p class="card-text">Autorizado Por: <%out.println(requerimiento.getAutorizaReq());%></p>
				    <p class="card-text">Observacion del Requerimiento: <%out.println(requerimiento.getObserReq());%></p>
				    <p class="card-text">Estado del Requerimiento: <%out.println(requerimiento.getEstadoReq());%></p>
				    <p>
					  <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample<%out.println(i);%>" role="button" aria-expanded="false" aria-controls="collapseExample">
					    Mostrar Detalle
					  </a>
					  <form action="http://localhost:8080/Practica02/EditarRequerimientos" method="get">
                      		<button type="submit" class="btn btn-primary"  name="idRequerimientoEditar" value="<%out.println(requerimiento.getIdReq());%>">Editar Requerimiento</button>
                      </form>
					</p>
		  		</div>
		  		
		  		<div class="collapse" id="collapseExample<%out.println(i);%>">
					  <div class="card card-body">
					  <table class="table">
						  <thead class="thead-dark">
						    <tr>
						      <th scope="col">ID</th>
						      <th scope="col">Cantidad Producto</th>
						      <th scope="col">ID Producto</th>
						      <th scope="col">Stock Producto</th>
						      <th scope="col">Precio Unitario</th>
						    </tr>
						  </thead>
						  <tbody class="bg-light">
							  <% for(DetRequerimiento detReq:listRequerimientos.get(i).getDetRequerimientos()) {%>
					           	  <tr>
						               <th scope="row"><%out.println(detReq.getIdDetReq());%></td>
						               <td ><%out.println(detReq.getCantProDetReq());%></td>
						               <td><%out.println(detReq.getIdProdDetReq());%></td>
						               <td ><%out.println(detReq.getInvenProdDetReq());%></td>
						               <td ><%out.println(detReq.getPrecProdDetReq());%></td>
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