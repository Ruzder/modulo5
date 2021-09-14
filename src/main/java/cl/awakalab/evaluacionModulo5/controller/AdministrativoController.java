package cl.awakalab.evaluacionModulo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cl.awakelab.evaluacionModulo5.entity.Administrativo;
import cl.awakelab.evaluacionModulo5.entity.Usuario;
import cl.awakelab.evaluacionModulo5.service.AdministrativoServiceIMPL;
import cl.awakelab.evaluacionModulo5.service.UsuarioServiceIMPL;

@Controller
public class AdministrativoController {	
	
	@Autowired
	private AdministrativoServiceIMPL ads;
	@Autowired
	private UsuarioServiceIMPL us;
	
	@RequestMapping(value="/editarAdministrativo/{idAdm}", method=RequestMethod.GET)
	public ModelAndView verEditar(@PathVariable("idAdm") int idAdm) {
		ModelAndView mv = new ModelAndView("editarAdministrativo");
		Administrativo a = ads.readOneFk(idAdm);
		 mv.addObject("a", a);
		 return mv;
	}
	@RequestMapping(value="/editarAdministrativo/{idAdm}", method=RequestMethod.POST)
	public ModelAndView GuardarEditar(@PathVariable("idAdm") int idAdm, @RequestParam("nomSupTxt") String nomSupTxt,  @RequestParam("areTxt") String areTxt,
			@RequestParam("expTxt") String expTxt, @RequestParam("funTxt") String funTxt) {
		ModelAndView mv = new ModelAndView("listarUsuario");
		
		Administrativo a = ads.readOne(idAdm);		
		a.setIdAdm(a.getIdAdm());
		a.setNomAdm(nomSupTxt);
		a.setAreAdm(areTxt);
		a.setExpAdm(expTxt);
		a.setFunAdm(funTxt);
		ads.update(a);
		
		List<Usuario> lista = us.readAll();
		mv.addObject("lista", lista);
		
		return mv;
	}

	 
	/*
	 * @RequestMapping(value="/listarAdmi", method=RequestMethod.GET ) public
	 * ModelAndView listar() { List<Administrativo> lista = ads.readAll();
	 * ModelAndView mv = new ModelAndView("listarAdmi"); mv.addObject("lista",
	 * lista); return mv; }
	 */	
}
