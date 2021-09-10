<nav class="navbar navbar-expand-lg  navbar-light bg-light p-3"
	id="menu">
	<div class="container-fluid">
		<a
			class="navbar-brand align-content-end text-sm-center text-md-center text-lg-center"
			href="#">Zurita & Seguridad</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="${pageContext.request.getContextPath()}/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.getContextPath()}/contacto">Contacto</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.getContextPath()}/crearCapacitacion"
					tabindex="-1">Crear Capacitación</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.getContextPath()}/listarCapacitacion"
					tabindex="-1">Listar Capacitación</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.getContextPath()}/listarUsuario"
					tabindex="-1">Listar Usuario</a></li>
			</ul>
		</div>
	</div>
</nav>