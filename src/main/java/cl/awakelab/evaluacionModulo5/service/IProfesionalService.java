package cl.awakelab.evaluacionModulo5.service;


import cl.awakelab.evaluacionModulo5.entity.Profesional;

public interface IProfesionalService {
	
	public void update(Profesional pr);
	public Profesional readOne(int idPro);

}
