package daw.amgdv.tiendaVideojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import daw.amgdv.tiendaVideojuegos.model.Juego;

@Repository
public interface JuegoRepository extends JpaRepository<Juego, Long> {
	//Ya con el crud heredado
}
