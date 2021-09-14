package cl.awakelab.evaluacionModulo5.service;
import java.util.List;
import cl.awakelab.evaluacionModulo5.entity.Profesional;

public interface IProfesionalService {
	
	public void update(Profesional p);
	public Profesional readOne(int idPro);
	public List<Profesional> readAll();
	public Profesional readOneFk(int fk);

}
