<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado propietarios</title>

<link rel="stylesheet" href="../recursos/css/bootstrap.min.css"> 
 
</head>
<body>

	<div class="text-center page-header">
	    <h2 class="mt-4 mb-4">Gestión veterinaria</h2>
	</div>  
	
	<div class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <ul class="navbar-nav">
	        <li class="nav-item active">
	            <a class="nav-link" href="listadoMascotas">Mascotas</a>
	        </li>
	        <li class="nav-item">
	            <a class="nav-link" href="listadoPropietarios">Propietarios</a>
	        </li>	     
	        <li class="nav-item">
	            <a class="nav-link" href="/Ejercicio_Spring">Salir</a>
	        </li>
	    </ul>
	</div> 	
	
	<div class="text-center mt-4 mb-4">
		<h2>Listado de Propietarios</h2>
	</div>
	
	<!-- Función para el botón de nuevo de nuestra vista de listadoClientes para que al cliclarlo, nos lleve a la pantalla de formularioClientes. -->
	<div class="text-center mt-4 mb-4">
		<form method="get" action="formularioPropietarios">
			<input type="submit" class="btn btn-primary" value="Nuevo"/> 
		</form>
	</div>	
	
	<div class="row">
	    <div class="col-sm-12 offset-sm-0 col-md-8 offset-md-2">
	        
			<table class="table table-hover table-striped">    
			    <thead>
			        <tr>
			            <th>Name</th>
			            <th>Surname</th>
			            <th>Email</th>
			            <th>Phone</th>
			            <th>Pets</th>			    
			        </tr>
			    </thead>
			    <tbody>
					<c:forEach items="${listaPropietarios}" var="prop">
						<tr>
						
							<td>
								<c:url var="url" value="seleccionarPropietario">
									<c:param name="idPropietario" value="${prop.id}"></c:param>
								</c:url>
								<a href="${url}">${prop.name}</a>
							</td>
							
							<td>${prop.surname}</td>
							<td>${prop.email}</td>
							<td>${prop.phone}</td>			
							<td>${prop.mascotas}</td>		
						</tr>					
					</c:forEach>			    
			    </tbody>
			</table> 
	        
	    </div>
	</div>	

</body>
</html>