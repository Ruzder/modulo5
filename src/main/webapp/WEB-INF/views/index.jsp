<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="shortcut icon"
	href="https://raw.githubusercontent.com/Ruzder/grupal/main/icono.com%20(1).png">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js "
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM "
	crossorigin="anonymous "></script>
<link
	href="${pageContext.request.getContextPath()}/resources/css/estiloNEW.css"
	rel="stylesheet" type="text/css">
<title>Index</title>
</head>

<body>
	<header
		class="container-fluid bg-primary d-flex justify-content-center">
		<p
			class="text-light mb-0 p-2 fs-6 text-sm-center text-lg-center text-justify">
			Contactanos +56 9 3641 7409</p>
	</header>

	<jsp:include page="menu.jsp"></jsp:include>
	<!-- imagen principal -->
	<div class="fondo">
		<h1>Zurita & Seguridad</h1>
		<h2>Somos seguridad y bienestar de tus equipos de trabajo</h2>
	</div>


	<!-- articulos mas imagen-->
	<div class="cuerpo-info">
		<div class="cuerpo-hijo">
			<section class="informacion-primera">
				<h3>Toda la asesoría de salud laboral que tu empresa necesita</h3>
				<P>Zurita & Safety te entrega un servicio integral de
					externalización de prevención de riesgos laborales y gestión de
					equipos. Por ello te invitamos a descansar y dejar estás temáticas
					en manos de especialistas, enfocándote en lo que realmente
					necesitas para la sustentabilidad de tu organización.</P>
			</section>
			<section class="informacion-segundo">
				<h3>Nuestra empresa</h3>
				<ul class="segundo-ul">
					<li>
						<h5>Objetivo de nuestra empresa.</h5>
						<p>Mejorar la salud laboral de nuestros partners,
							convirtiéndolos así en empresas más competitivas, productivas y
							sustentables. Para impactar en la cultura organizacional,
							fortaleciendo el liderazgo y la cohesión de los equipos.</p>
					</li>
					<li>
						<h5>Destinado a.</h5>
						<p>Coaching Ejecutivo y Entrenamiento de Líderes y Equipos.</p>
					</li>
					<li>
						<h5>Nuestra empresa ofrece.</h5>
						<p>-Intervenciones Spot individuales o grupales ante
							accidentes o eventos críticos.</p>
						<p>-Desarrollo e implementación del Plan de emergencia.</p>
					</li>
				</ul>
			</section>
		</div>
		<div class="caja-imagen">
			<img class="imagen-segundo"
				src="https://raw.githubusercontent.com/Ruzder/grupal/main/pngwing.com%20(1).png"
				alt="imagen ingeniero">
		</div>

	</div>

	<!-- caja con nueve fotos-->
	<div class="galeria">
		<h2>Algunos de los lugares donde hemos trabajado</h2>
		<div class="linea"></div>
		<div class="contenedor-imagenes">
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(1).jpg"
					alt="mall">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
					<img
						src="https://raw.githubusercontent.com/Ruzder/grupal/main/Zurita%20%26%20Seguridad.png"
						alt="logo">
				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(2).jpg"
					alt="junta directiva">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(3).jpg"
					alt="minera">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(4).jpg"
					alt="medicina">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>

				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(5).jpg"
					alt="construccion">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
					<img
						src="https://raw.githubusercontent.com/Ruzder/grupal/main/Zurita%20%26%20Seguridad.png"
						alt="logo">
				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(6).jpg"
					alt="escuela">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>

				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(7).jpg"
					alt="industria">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1%20(8).jpg"
					alt="ciudad">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
				</div>
			</div>
			<div class="imagen">
				<img
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/imagen1(9).jpg"
					alt="pesquera">
				<div class="overlay">
					<h2>Revisa nuestros proyectos</h2>
					<img
						src="https://raw.githubusercontent.com/Ruzder/grupal/main/Zurita%20%26%20Seguridad.png"
						alt="logo">
				</div>
			</div>
		</div>
	</div>
	<div class="cliente-contenedor">
		<h4 class="titulo">LO QUE LOS CLIENTES COMENTARON SOBRE NUESTRAS
			ASERORÍA</h4>
		<div class="cards">
			<div class="card">
				<img class="imagen-comentada-1"
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/persona1.jpg"
					alt="persona1">
				<div class="contenido-texto-card">
					<h2>Aquiles Brinco</h2>
					<p>Nuestra experiencia con la empresa ha sido muy buena y
						estamos muy contentos.</p>
				</div>
			</div>
			<div class="card">
				<img class="imagen-comentada-1"
					src="https://raw.githubusercontent.com/Ruzder/grupal/main/persona2.jpg"
					alt="persona2">
				<div class="contenido-texto-card">
					<h2>Jorge Nitales</h2>
					<p>Desde que contratamos los servicios, nuestros accidentes
						bajaron en 95% en el primer mes.</p>
				</div>
			</div>
		</div>
	</div>

	<!-- footer  -->
	<jsp:include page="footer.jsp"></jsp:include>
	<!-- JavaScript Libraries -->
	<!-- <script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/jquery/jquery-migrate.min.js"></script>
	<script src="lib/popper/popper.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="lib/easing/easing.min.js"></script>
	<script src="lib/counterup/jquery.waypoints.min.js"></script>
	<script src="lib/counterup/jquery.counterup.js"></script>
	<script src="lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="lib/lightbox/js/lightbox.min.js"></script>
	<script src="lib/typed/typed.min.js"></script>
	Contact Form JavaScript File
	<script src="contactform/contactform.js"></script> -->

	<!-- Template Main Javascript File -->
<!-- 	<script src="js/main.js"></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
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