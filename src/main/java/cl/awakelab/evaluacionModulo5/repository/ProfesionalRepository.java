package cl.awakelab.evaluacionModulo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import cl.awakelab.evaluacionModulo5.entity.Profesional;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional, Integer>{

	@Query(value ="SELECT a FROM Profesional a WHERE a.usuario.id = :fk")
	Profesional findByFk(@Param("fk") int fk);
	
	
	
	
	
}
