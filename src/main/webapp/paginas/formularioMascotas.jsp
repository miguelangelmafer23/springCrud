<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle Mascota</title>

<link rel="stylesheet" href="../recursos/css/bootstrap.min.css">

</head>

<script type="application/javascript">

function vaciarFormulario(){
	document.getElementById("idMascota").value=""
	document.getElementById("name").value=""
	document.getElementById("family").value=""
	document.getElementById("birth").value=""
	document.getElementById("chip").value=""	
}

function enviarPeticion(metodo, action){
	let formulario = document.getElementById("formulario")
	formulario.method = metodo;
	formulario.action = action;
}

</script>

<body>

	<div class="text-center page-header">
	    <h2 class="mt-4 mb-4">Aplicación veterinaria</h2>
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
		<h2>Formulario de mascotas</h2>
	</div>
	
	<form:form id="formulario" modelAttribute="mascota">
	
	<div class="text-center mt-4 mb-4">
			<input type="submit" class="btn btn-primary" value="Insertar"  onclick="enviarPeticion('POST','insertarMascota')"/> 
			<input type="submit" class="btn btn-primary" value="Modificar" onclick="enviarPeticion('POST','modificarMascota')"/> 
			<input type="submit" class="btn btn-danger"  value="Borrar"    onclick="enviarPeticion('POST','borrarMascota')"/> 
			<input type="button" class="btn btn-warning" value="Vaciar"    onclick="vaciarFormulario()"/> 
			<input type="submit" class="btn btn-warning" value="Cancelar"  onclick="enviarPeticion('GET','listadoMascotas')"/> 
	</div>
	
	<form:hidden path="id" id="idMascota"/>
			
		<div class="row">
		    <div class="col-sm-12 offset-sm-0 col-md-8 offset-md-2">
		        
				<div class="row">
				    <div class="col-sm-12 col-md-2 mt-1">
				        <label for="name">Name</label>
				    </div>
				    <div class="col-sm-12 col-md-10 mt-1">
				        <form:input path="name" id="name" class="form-control"/>
				    </div>
				    
				    <div class="col-sm-12 col-md-2 mt-1">
				        <label for="family">Family</label>
				    </div>
				    <div class="col-sm-12 col-md-10 mt-1">
				    	<!--<form:input path="family" id="family" class="form-control"/>-->
				    	<form:select path="family" id="family" class="form-control">
				    		<form:option value="">Select an option</form:option>
				    		<form:option value="Bird">Bird</form:option>
							<form:option value="Cat">Cat</form:option>
							<form:option value="Dog">Dog</form:option>
							<form:option value="Rabbit">Rabbit</form:option>
						</form:select>
				    </div>                 
				
				    <div class="col-sm-12 col-md-2 mt-1">
				        <label for="birthYear">Birth Year</label>
				    </div>
				    <div class="col-sm-12 col-md-10 mt-1">
				    	<form:input path="birthYear" id="birthYear" class="form-control"/>
				    </div>		  				 
	
				    <div class="col-sm-12 col-md-2 mt-1">
				        <label for="chip">Chip</label>
				    </div>
				    <div class="col-sm-12 col-md-10 mt-1">
				    	<form:checkbox path="chip" id="chip" class="form-control"/>
				    </div>				
				
				</div>    
		        
		    </div>
		</div>	
		
	</form:form>
	
</body>
</html>