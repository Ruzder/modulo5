package cl.awakalab.evaluacionModulo5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;
import cl.awakelab.evaluacionModulo5.service.AdministrativoServiceIMPL;

@Controller
public class AdministrativoController {
	
	
	@Autowired
	private AdministrativoServiceIMPL ads;
	
	@RequestMapping(value="/editarAdministrativo/{id}", method=RequestMethod.GET)
	public ModelAndView verEditar(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("editarAdministrativo");
		Administrativo a = ads.readOne(id);
		 mv.addObject("a", a);
		 return mv;
	}
	//opcion 1
	@RequestMapping(value="/editarAdministrativo", method=RequestMethod.POST)
	public ModelAndView GuardarEditar(Administrativo a) {
		Administrativo adm = ads.readOne(a.getId());
		a.setUsuario(adm.getUsuario());
		ads.update(a);
		return new ModelAndView("redirect:/listarUsuario");
	
	}
	//opcion 2
	/*
	 * @RequestMapping(value="/editarAdministrativo/{id}",
	 * method=RequestMethod.POST) public ModelAndView
	 * GuardarEditar(@PathVariable("id") int id, @RequestParam(""
	 */
	

}
