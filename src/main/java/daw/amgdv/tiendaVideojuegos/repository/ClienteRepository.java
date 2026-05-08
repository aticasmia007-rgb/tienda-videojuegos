package daw.amgdv.tiendaVideojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import daw.amgdv.tiendaVideojuegos.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	//Ya hereda el crud
}
