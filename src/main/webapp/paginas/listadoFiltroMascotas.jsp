<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado mascotas</title>

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
		<h2>Listado de Mascotas Filtrado</h2>
	</div>
	
		
		
	<div class="d-flex justify-content-center text-center">
			<form action="listadoFamily">
			<select id="family" class="form-control" name="family" class="form-control">
	    		<option value="">Select an option</option>
	    		<option value="Bird">Bird</option>
				<option value="Cat">Cat</option>
				<option value="Dog">Dog</option>
				<option value="Rabbit">Rabbit</option>
			</select><br>
				<input type="submit" placeholder="Family..." value="Filtrar" class="btn btn-success">
			</form>	
	</div>	
	
	<!-- Función para el botón de nuevo de nuestra vista de listadoClientes para que al cliclarlo, nos lleve a la pantalla de formularioClientes. -->
	<div class="text-center mt-4 mb-4">
		<form method="get" action="formularioMascotas">
			<input type="submit" class="btn btn-primary" value="Nuevo"/> 
		</form>
	</div>	
	
	<div class="row">
	    <div class="col-sm-12 offset-sm-0 col-md-8 offset-md-2">
	        
			<table class="table table-hover table-striped">    
			    <thead>
			        <tr>
			            <th>Name</th>
			            <th>Family</th>
			            <th>Birth Year</th>
			            <th>Chip</th>
			        </tr>
			    </thead>
			    <tbody>
					<c:forEach items="${listaFiltroMascotas}" var="mas">
						<tr>
						
							<td>
								<c:url var="url" value="seleccionarMascota">
									<c:param name="idMascota" value="${mas.id}"></c:param>
								</c:url>
								<a href="${url}">${mas.name}</a>
							</td>
							
							<td>${mas.family}</td>
							<td>${mas.birthYear}</td>
							<td>${mas.chip}</td>					
						</tr>					
					</c:forEach>			    
			    </tbody>
			</table> 
	        
	    </div>
	</div>	

</body>
</html>