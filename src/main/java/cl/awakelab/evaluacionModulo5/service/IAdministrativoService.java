package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;


public interface IAdministrativoService {
	
	public void update(Administrativo a);
	public Administrativo readOne(int idAdm);
	public List<Administrativo> readAll();
	public Administrativo readOneFk(int fk);
	
	

}
