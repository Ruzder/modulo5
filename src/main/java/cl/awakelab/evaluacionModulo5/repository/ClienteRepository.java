package cl.awakelab.evaluacionModulo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import cl.awakelab.evaluacionModulo5.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	@Query(value ="SELECT a FROM Cliente a WHERE a.usuario.id = :fk")
	Cliente findByFk(@Param("fk") int fk);
}
