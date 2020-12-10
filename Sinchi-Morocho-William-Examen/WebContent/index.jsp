<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Incio</title>
</head>
<body>
	<nav class="container">
		<nav class="nav nav-pills flex-column flex-sm-row">
		  <a class="flex-sm-fill text-sm-center nav-link active" aria-current="page" href="#">Inicio</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="#">Agregar Usuario</a>
		  <a class="flex-sm-fill text-sm-center nav-link" href="#">Listar Agenda</a>
		</nav>
		
	</nav>
	<div class="card text-center">
        <div class="card-header  bg-dark"> </div>
      </div>
    
          <div class="section about_section layout_padding dash_bg">
            <div class="container">
               <div class="row">
                  <div class="col-md-12">
                     <div class="full">
                        <div class="heading_main text_align_center">
                           <h2>Bienvenido</h2>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="row">
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href=""><img class="default-block" src="<%=request.getContextPath()%>/Imagenes/empresaIC.png" alt="#" /></a>
                            <a href=""><img class="default-none" src="<%=request.getContextPath()%>/Imagenes/empresaIC.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Mega Plaza Sur</h4>
                         </div>
                         <div class="full">
                           <p>Datos importantes sobre nuestra empresa, además nuestros colaboradores.</p>
                         </div>
                     </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp"><img class="default-block" src="<%=request.getContextPath()%>/Imagenes/prodIC.png" alt="#" /></a>
                            <a href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp"><img class="default-none" src="<%=request.getContextPath()%>/Imagenes/prodIC.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Productos</h4>
                         </div>
                         <div class="full">
                           <p>Puedes revisar los productos existentes en la empresa y listarlos.</p>
                         </div>
                     </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href="<%=request.getContextPath()%>/Admin/ListarRequerimientos.jsp"><img class="default-block" src="<%=request.getContextPath()%>/Imagenes/requeIC.png" alt="#" /></a>
                            <a href="<%=request.getContextPath()%>/Admin/ListarRequerimientos.jsp"><img class="default-none" src="<%=request.getContextPath()%>/Imagenes/requeIC.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Requerimientos</h4>
                         </div>
                         <div class="full">
                           <p>Puedes revisar los requerimientos de compra que han hecho los usuarios</p>
                         </div>
                     </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href="<%=request.getContextPath()%>/Admin/AdminPerfil.jsp"><img class="default-block" src="<%=request.getContextPath()%>/Imagenes/usuIC.png" alt="#" /></a>
                            <a href="<%=request.getContextPath()%>/Admin/AdminPerfil.jsp"><img class="default-none" src="<%=request.getContextPath()%>/Imagenes/usuIC.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Mi Perfil</h4>
                         </div>
                         <div class="full">
                           <p>Revisa tus datos personales para saber si los datos guardados son correctos.</p>
                         </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
</body>
</html>