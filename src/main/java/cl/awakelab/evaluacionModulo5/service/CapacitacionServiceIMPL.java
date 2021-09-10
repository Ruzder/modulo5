package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacionModulo5.entity.Capacitacion;
import cl.awakelab.evaluacionModulo5.repository.CapacitacionRepository;



@Service
public class CapacitacionServiceIMPL implements ICapacitacionService {
	
	
	@Autowired
	CapacitacionRepository er;
	@Override
	public List<Capacitacion> readAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public void create(Capacitacion c) {
		// TODO Auto-generated method stub
		er.save(c);
	}

	

}
