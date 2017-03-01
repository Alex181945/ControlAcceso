<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Control de Asistencia</title>
	<link href="resources/image/vakera.ico" rel="shortcut icon" type="image/x-icon"/>
	<link type="text/css" rel="stylesheet" href="resources/css/lib/bootstrap.min.css"/>
	<link href="https://fonts.googleapis.com/css?family=Lora" rel="stylesheet">
	<link type="text/css" rel="stylesheet" href="resources/css/template.css"/>
</head>
<body>

	<div class="container">
	
		<div class="row">
			<div class="col-xs-12">
				<div class="titulo">
					<h1>Bienvenido</h1>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div style="text-align:right;padding:1em 0;"> 
					<h2>
						<span style="color:white;">Hora actual en la</span><br /><span style="color:white;">Ciudad de México</span>
					</h2> 
					<iframe class="col-sm-12" src="http://www.zeitverschiebung.net/clock-widget-iframe-v2?language=es&timezone=America%2FMexico_City" style="margin-left: 34%;"  height="150" frameborder="0" seamless></iframe> 
				</div>
			</div>
		</div>	
			
		<c:url var="addAction" value="/acceso"></c:url>
		
		<form:form class="form-horizontal" action="${addAction}" method="POST" commandName="ctEmpleado">
			<div class="form-group form-group-lg">
				<label class="col-sm-offset-5 col-sm-3 control-label" for="formGroupInputLarge" style="color: white">Número de Empleado:</label>
				<div class="col-sm-4">
					<form:input path="iIDEmpleado" class="form-control" type="text" id="formGroupInputLarge" maxlength="9" placeholder="123456789" onkeypress="return isNumberKey(event)" />
				</div>
			</div>
			
			<input class="col-md-2 btn btn-primary btn-sm " style="float: right;" type="submit" value="Checa Hora">
		</form:form>
		
		<p class="text-right" style="color: white; " >${mensaje}</p>
		
	</div>
	
	<div class="col-sm-12"><p></p></div>
	<div class="col-sm-offset-8 col-sm-4"><p style=" color:white;">¿Administrativo? Inicia Sesión <a href="administrativo">aquí</a></p></div>
	
	<!-- Script -->
	<script type="text/javascript" src="resources/js/lib/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="resources/js/lib/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/validaciones.js"></script>
	
</body>
</html>
