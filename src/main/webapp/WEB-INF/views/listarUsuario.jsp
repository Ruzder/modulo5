<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="es">


<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js "
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM "
	crossorigin="anonymous "></script>
<link
	href="${pageContext.request.getContextPath()}/resources/css/estiloNEW.css"
	rel="stylesheet" type="text/css">
<title>Listar Usuario</title>
</head>
<body>
	<header
		class="container-fluid bg-primary d-flex justify-content-center">
		<p class="text-light mb-0 p-2 fs-6">Contactanos +56 9 3641 7409</p>
	</header>
	<jsp:include page="menu.jsp"></jsp:include>
	<!-- imagen principal -->

	<div class="fondo">
		<h1>Zurita & Seguridad</h1>
		<h2>Somos seguridad y bienestar de tus equipos de trabajo</h2>
	</div>

	<a href="${pageContext.request.contextPath}/logout">Salir</a>
	<!-- cuerpo de trabajo  -->
	<h4>Listado de Usuarios</h4>
	
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">RUN</th>
				<th scope="col">NOMBRE</th>
				<th scope="col">APELLIDO</th>
				<th scope="col">FECHA</th>
				<th scope="col">TIPO</th>
				<th scope="col">Acciones</th>
			</tr>
		</thead>
		<%-- <tbody>
			<c:forEach var="u" items="${lista}">
				<tr>
					<th><c:out value="${u.getId()}"></c:out></th>
					<td><c:out value="${u.getNom()}"></c:out></td>
					<td><c:out value="${u.getApe()}"></c:out></td>
					<td><c:out value="${u.getFec()}"></c:out></td>
					<td><c:out value="${u.getTip()}"></c:out></td>		
				</tr>
			</c:forEach>
		</tbody> --%>
		
		<tbody>
			<c:forEach var="u" items="${lista}">
				<tr>
					<th scope="row"><c:out value="${u.getId()}"></c:out></th>
					<td><c:out value="${u.getNom()}"></c:out></td>
					<td><c:out value="${u.getApe()}"></c:out></td>
					<td><c:out value="${u.getFec()}"></c:out></td>

					<c:choose>
						<c:when test="${u.getTip() == 1}">
							<td>Cliente</td>
						</c:when>

						<c:when test="${u.getTip() == 2}">
							<td>Profesional</td>
						</c:when>

						<c:when test="${u.getTip() == 3}">
							<td>Administrativo</td>
						</c:when>
					</c:choose>
					<c:url var="editar" value="/EditUsuario">
						<c:param name="run" value="${u.getId()}"></c:param>
						<c:param name="tipo" value="${u.getTip()}"></c:param>
						<c:param name="accion" value="edit"></c:param>
					</c:url>
					<td><a href="${pageContext.request.getContextPath()}/editarUsuario/${u.getId()}">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
	
	<jsp:include page="footer.jsp"></jsp:include>
	<!-- <script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js">
    </script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script> -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>