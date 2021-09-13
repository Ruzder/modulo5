package cl.awakelab.evaluacionModulo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.awakelab.evaluacionModulo5.entity.Administrativo;

@Repository
public interface AdministrativoRepository extends JpaRepository<Administrativo, Integer>{
	
	
	//llamado desde la clase(administravo), usuario.id = objeto.
	@Query(value ="SELECT a FROM Administrativo a WHERE a.usuario.id = :fk")
	Administrativo findByFk(@Param("fk") int fk);


}
