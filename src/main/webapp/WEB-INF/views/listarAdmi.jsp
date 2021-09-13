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
<title>Listar admi</title>
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
	<h4>Listado de admi</h4>
	
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">id adm</th>
				<th scope="col">nombre supervisor</th>
				<th scope="col">area</th>
				<th scope="col">experiencia</th>
				<th scope="col">funcion</th>
				<th scope="col">ID</th>
				<th scope="col">nombre</th>
				<th scope="col">Apellido</th>
				<th scope="col">fecha</th>
				<th scope="col">tipo</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="a" items="${lista}">
				<tr>
					<th><c:out value="${a.getIdAdm()}"></c:out></th>
					<td><c:out value="${a.getNomAdm()}"></c:out></td>
					<td><c:out value="${a.getAreAdm()}"></c:out></td>
					<td><c:out value="${a.getExpAdm()}"></c:out></td>
					<td><c:out value="${a.getFunAdm()}"></c:out></td>
					<td><c:out value="${a.getUsuario().getId()}"></c:out></td>	
					<td><c:out value="${a.getUsuario().getNom()}"></c:out></td>
					<td><c:out value="${a.getUsuario().getApe()}"></c:out></td>
					<td><c:out value="${a.getUsuario().getFec()}"></c:out></td>
					<td><c:out value="${a.getUsuario().getTip()}"></c:out></td>	
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