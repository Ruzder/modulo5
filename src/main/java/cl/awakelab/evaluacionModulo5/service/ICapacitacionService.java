package cl.awakelab.evaluacionModulo5.service;

import java.util.List;

import cl.awakelab.evaluacionModulo5.entity.Capacitacion;

public interface ICapacitacionService {
	
	
	public List<Capacitacion> readAll();
	public void create(Capacitacion c);

}
