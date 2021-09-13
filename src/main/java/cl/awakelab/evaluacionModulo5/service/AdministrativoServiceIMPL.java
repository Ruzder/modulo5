package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;
import cl.awakelab.evaluacionModulo5.entity.Usuario;
import cl.awakelab.evaluacionModulo5.repository.AdministrativoRepository;

@Service
public class AdministrativoServiceIMPL implements IAdministrativoService{

	
	@Autowired
	AdministrativoRepository er;

	@Override
	public void update(Administrativo a) {
		// TODO Auto-generated method stub
		er.save(a);
	}

	@Override
	public Administrativo readOne(int idAdm) {
		// TODO Auto-generated method stub
		return er.findById(idAdm).get(); // duda
		
	}

	@Override
	public List<Administrativo> readAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Administrativo admiFk(int fk) {
		// TODO Auto-generated method stub
		return er.findByFk(fk);
	}
}
