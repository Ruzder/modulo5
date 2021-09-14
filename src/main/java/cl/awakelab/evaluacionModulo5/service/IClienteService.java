package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import cl.awakelab.evaluacionModulo5.entity.Cliente;

public interface IClienteService {
	
	public void update(Cliente c);
	public Cliente readOne(int idCli);
	public List<Cliente> readAll();
	public Cliente readOneFk(int fk);
	

}
