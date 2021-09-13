package cl.awakelab.evaluacionModulo5.service;

import java.util.List;
import cl.awakelab.evaluacionModulo5.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> readAll();
	public void create(Usuario u);

}
