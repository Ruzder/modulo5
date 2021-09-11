package cl.awakelab.evaluacionModulo5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;
import cl.awakelab.evaluacionModulo5.repository.AdministrativoRepository;

@Service
public class AdministrativoServiceIMPL implements IAdministrativoService{
	
	
	
	@Autowired
	AdministrativoRepository er;
	@Override
	public void update(Administrativo a) {
		er.save(a);
		
	}

	@Override
	public Administrativo readOne(int id) {
		
		return er.findById(id).get();
	}

}
