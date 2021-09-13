<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">

    <link href="${pageContext.request.getContextPath()}/resources/css/registro.css" rel="stylesheet" type="text/css">
    <link rel="Shortcut Icon" href="IMG/safwan-mahmud-6xQFm9TFwmk-unsplash.jpg" type="image/x-icon" />
    <!-- <script src="JS/registro.js"></script> -->
</head>


<body>
    <main>
    <%
		String error = (String) request.getAttribute("error");
		if (error != null && error.equals("true")){
			out.println("<h3>ERROR DE AUTENTICACIÓN<h3>");
		}
	%>
        <img class="wave" src="IMG/safwan-mahmud-6xQFm9TFwmk-unsplash.jpg">
        <div class="login-content">

            <h2 class="title">Ingreso Usuario</h2>
        </div>
        <form action="${pageContext.request.contextPath}/login" name="loginForm" method="post">
            <!-- Grupo: Usuario -->
            <div  class="formulario__grupo" id="grupo__usuario">
                <label for="usuario" class="formulario__label">Usuario</label>
                <div class="formulario__grupo-input">
                    <input type="text" class="formulario__input" name="username" id="username" placeholder="Elva-Zurita">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Debe ingresar un usuario valido</p>
            </div>

            <!-- Grupo: Contraseña -->
            <div class="formulario__grupo" id="grupo__password">
                <label for="password" class="formulario__label">Contraseña</label>
                <div class="formulario__grupo-input">
                    <input type="password" class="formulario__input" name="password" id="password">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">La contraseña tiene que ser de 5 a 20 dígitos.</p>
            </div>
		
            

            <div class="formulario__mensaje" id="formulario__mensaje">
                <p><i class="fas fa-exclamation-triangle"></i> <b>Error:</b> Por favor rellene los campos correctamente. </p>
            </div>

            <div class="formulario__grupo formulario__grupo-btn-enviar">
                <button type="submit" class="formulario__btn">Enviar</button>
                <p class="formulario__mensaje-exito" id="formulario__mensaje-exito">Ingreso Exitoso</p>
            </div>
        </form>
    </main>

     <!-- <script src="js/login.js"></script>
    <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    <script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous">
	</script>
	
</body>

</html>