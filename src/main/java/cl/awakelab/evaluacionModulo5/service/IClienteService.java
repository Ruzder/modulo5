package cl.awakelab.evaluacionModulo5.service;

import cl.awakelab.evaluacionModulo5.entity.Cliente;

public interface IClienteService {
	
	public void update(Cliente cl);
	public Cliente readOne(int idCli);

}
