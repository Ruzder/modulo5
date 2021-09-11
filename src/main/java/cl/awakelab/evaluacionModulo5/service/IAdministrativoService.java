package cl.awakelab.evaluacionModulo5.service;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;

public interface IAdministrativoService {
	
	public void update(Administrativo a);
	public Administrativo readOne(int id);
	

}
