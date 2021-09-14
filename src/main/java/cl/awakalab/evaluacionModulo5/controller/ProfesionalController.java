package cl.awakalab.evaluacionModulo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cl.awakelab.evaluacionModulo5.entity.Profesional;
import cl.awakelab.evaluacionModulo5.entity.Usuario;
import cl.awakelab.evaluacionModulo5.service.ProfesionalServiceIMPL;
import cl.awakelab.evaluacionModulo5.service.UsuarioServiceIMPL;

@Controller
public class ProfesionalController {
	
	@Autowired
	private UsuarioServiceIMPL us;
	@Autowired
	private ProfesionalServiceIMPL ps;
	
	@RequestMapping(value="/editarProfesional/{idPro}", method=RequestMethod.GET)
	public ModelAndView verEditar(@PathVariable("idPro") int idPro) {
		ModelAndView mv = new ModelAndView("editarProfesional");
		Profesional p = ps.readOneFk(idPro);
		 mv.addObject("p", p);
		 return mv;
	}
	
	@RequestMapping(value="/editarProfesional/{idPro}", method=RequestMethod.POST)
	public ModelAndView GuardarEditar(@PathVariable("idPro") int idPro, @RequestParam("expTxt") int expTxt,  @RequestParam("depTxt") String depTxt,
			@RequestParam("titTxt") String titTxt, @RequestParam("fecPTxt") String fecPTxt) {
		ModelAndView mv = new ModelAndView("listarUsuario");
		
		
		  Profesional p = ps.readOne(idPro);
		  p.setIdPro(p.getIdPro());
		  p.setExpPro(expTxt);
		  p.setDepPro(depTxt);
		  p.setTitPro(titTxt);
		  p.setFecPro(fecPTxt);
		  ps.update(p);
		  
		  List<Usuario> lista = us.readAll(); mv.addObject("lista", lista);
		 
		
		return mv;
	}

}
