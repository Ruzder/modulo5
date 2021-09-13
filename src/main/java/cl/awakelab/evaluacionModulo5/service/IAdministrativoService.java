package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;
import cl.awakelab.evaluacionModulo5.entity.Usuario;

public interface IAdministrativoService {
	
	public void update(Administrativo a);
	public Administrativo readOne(int idAdm);
	public List<Administrativo> readAll();
	public Administrativo admiFk(int fk);
	
	

}
