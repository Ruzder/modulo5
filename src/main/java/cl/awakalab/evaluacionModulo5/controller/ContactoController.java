package cl.awakalab.evaluacionModulo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactoController {


		@RequestMapping(value = "/contacto", method = RequestMethod.GET)
		public String contacto() {
			return "contacto";
		}

		@RequestMapping(value = "/contacto", method = RequestMethod.POST)
		public String crearGuardar(Model model, @RequestParam("nombre") String nombreCont,
				@RequestParam("correo") String correoCont, @RequestParam("telefono") String telefonoCont,
				@RequestParam("mensaje") String mensajeCont) {
			// color verde es name jsp/ azul private modelo
			
			
			System.out.println("Nombre: " + nombreCont );
			System.out.println("correo: " + correoCont);
			System.out.println("Telefono: " + telefonoCont);
			System.out.println("Mensaje: " + mensajeCont);	
			return "contacto";

		}

	}