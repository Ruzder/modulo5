package cl.awakalab.evaluacionModulo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.evaluacionModulo5.entity.Usuario;
import cl.awakelab.evaluacionModulo5.service.UsuarioServiceIMPL;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceIMPL us;
	
	
	@RequestMapping(value="/listarUsuario", method = RequestMethod.GET)
public ModelAndView listar() {
		
		List<Usuario> lista = us.readAll();
		ModelAndView mv = new ModelAndView("listarUsuario");
		mv.addObject("lista", lista);
		return mv;
	}

}
