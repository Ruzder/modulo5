package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacionModulo5.entity.Usuario;
import cl.awakelab.evaluacionModulo5.repository.UsuarioRepository;

@Service
public class UsuarioServiceIMPL implements IUsuarioService {

	
	@Autowired
	UsuarioRepository er;
	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public void create(Usuario u) {
		// TODO Auto-generated method stub
		er.save(u);
	}

}
