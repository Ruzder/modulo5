package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacionModulo5.entity.Profesional;
import cl.awakelab.evaluacionModulo5.repository.ProfesionalRepository;

@Service
public class ProfesionalServiceIMPL  implements IProfesionalService{
	
	@Autowired
	ProfesionalRepository er;
	@Override
	public void update(Profesional p) {
		er.save(p);
		
	}

	@Override
	public Profesional readOne(int idPro) {
		// TODO Auto-generated method stub
		return er.findById(idPro).get();
	}

	@Override
	public List<Profesional> readAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Profesional readOneFk(int fk) {
		// TODO Auto-generated method stub
		return er.findByFk(fk);
	}

	
}
