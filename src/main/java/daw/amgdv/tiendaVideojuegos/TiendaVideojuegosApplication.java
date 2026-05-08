package daw.amgdv.tiendaVideojuegos;

import daw.amgdv.tiendaVideojuegos.controller.TiendaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendaVideojuegosApplication {

    private final TiendaController tiendaController;

    TiendaVideojuegosApplication(TiendaController tiendaController) {
        this.tiendaController = tiendaController;
    }
	
	public static void main(String[] args) {
		System.out.println("Hola esto funciona");
		SpringApplication.run(TiendaVideojuegosApplication.class, args);
	}

}
