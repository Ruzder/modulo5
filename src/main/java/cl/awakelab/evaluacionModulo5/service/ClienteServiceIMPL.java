package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacionModulo5.entity.Cliente;
import cl.awakelab.evaluacionModulo5.repository.ClienteRepository;

@Service
public class ClienteServiceIMPL implements IClienteService{
	
	@Autowired
	ClienteRepository er;
	@Override
	public void update(Cliente c) {
		// TODO Auto-generated method stub
		er.save(c);
	}

	@Override
	public Cliente readOne(int idCli) {
		// TODO Auto-generated method stub
		return er.findById(idCli).get();
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Cliente readOneFk(int fk) {
		// TODO Auto-generated method stub
		return er.findByFk(fk);
	}
	

}
