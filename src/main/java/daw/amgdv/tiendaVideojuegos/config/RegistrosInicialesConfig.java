package daw.amgdv.tiendaVideojuegos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import daw.amgdv.tiendaVideojuegos.model.Cliente;
import daw.amgdv.tiendaVideojuegos.model.Juego;
import daw.amgdv.tiendaVideojuegos.repository.ClienteRepository;
import daw.amgdv.tiendaVideojuegos.repository.JuegoRepository;

@Component //para que spring ejecute automaticamente la clase
public class RegistrosInicialesConfig implements CommandLineRunner {
	// SEPARO CLIENTES DE JUEGOS
	
	@Autowired
	private ClienteRepository repoCliente; 
	
	@Autowired
	private JuegoRepository repoJuego; 
	
	@Override
	public void run(String... args) throws Exception {
		// Esto se ejecuta antes de usar los endpoints
		//CLIENTES
		
		//Creo los 10 Clientes
		Cliente cl1 = new Cliente("Andrea", "Mateo", "García de Vinuesa", "aticasmia007@gmail.com");
		Cliente cl2  = new Cliente("Carlos", "López", "Martínez", "carlos.lopez@example.com");
		Cliente cl3  = new Cliente("María", "Santos", "Gómez", "maria.santos@example.com");
		Cliente cl4  = new Cliente("Javier", "Ruiz", "Fernández", "javier.ruiz@example.com");
		Cliente cl5  = new Cliente("Lucía", "Hernández", "Pérez", "lucia.hernandez@example.com");
		Cliente cl6  = new Cliente("David", "Ramírez", "Torres", "david.ramirez@example.com");
		Cliente cl7  = new Cliente("Sofía", "Díaz", "Navarro", "sofia.diaz@example.com");
		Cliente cl8  = new Cliente("Pablo", "García", "Serrano", "pablo.garcia@example.com");
		Cliente cl9  = new Cliente("Elena", "Castro", "Molina", "elena.castro@example.com");
		Cliente cl10 = new Cliente("Miguel", "Ortega", "Vega", "miguel.ortega@example.com");
		Cliente cl11 = new Cliente("Laura", "Núñez", "Cano", "laura.nunez@example.com");
		Cliente cl12 = new Cliente("Sergio", "Iglesias", "Ramos", "sergio.iglesias@example.com");
		Cliente cl13 = new Cliente("Paula", "Morales", "Santos", "paula.morales@example.com");

		
		//Guardo esos clientes en el repo
		repoCliente.save(cl1);
		repoCliente.save(cl2);
		repoCliente.save(cl3);
		repoCliente.save(cl4);
		repoCliente.save(cl5);
		repoCliente.save(cl6);
		repoCliente.save(cl7);
		repoCliente.save(cl8);
		repoCliente.save(cl9);
		repoCliente.save(cl10);
		repoCliente.save(cl11);
		repoCliente.save(cl12);
		repoCliente.save(cl13);

		//Ahora registros de Juegos
		Juego j1  = new Juego("Minecraft", "Sandbox", "PC / Consolas", 24.99, 50);
		Juego j2  = new Juego("Happy Wheels", "Plataformas / Física", "PC", 0.00, 999);
		Juego j3  = new Juego("Tomodachi Life", "Simulación", "Nintendo 3DS", 39.99, 20);
		Juego j4  = new Juego("Diablo IV", "ARPG", "PC / PS5 / Xbox", 69.99, 35);
		Juego j5  = new Juego("Overcooked", "Cooperativo / Cocina", "PC / Consolas", 19.99, 40);
		Juego j6  = new Juego("Detroit: Become Human", "Aventura narrativa", "PS4 / PC", 29.99, 25);
		Juego j7  = new Juego("Peak", "Puzzle / Entrenamiento mental", "Móvil", 0.00, 999);
		Juego j8  = new Juego("Viernes 13: El Videojuego", "Terror / Supervivencia", "PC / Consolas", 29.99, 15);
		Juego j9  = new Juego("Super Mario Bros", "Plataformas", "Nintendo", 14.99, 30);
		Juego j10 = new Juego("Five Nights at Freddy's", "Terror", "PC / Consolas", 7.99, 60);
		Juego j11 = new Juego("GTA V", "Acción / Mundo abierto", "PC / Consolas", 29.99, 45);
		Juego j12 = new Juego("Subnautica", "Supervivencia / Exploración", "PC / Consolas", 24.99, 30);
		Juego j13 = new Juego("Until Dawn", "Terror narrativo", "PS4", 19.99, 18);

		
		//Los guardo en el repo
		repoJuego.save(j1);
		repoJuego.save(j2);
		repoJuego.save(j3);
		repoJuego.save(j4);
		repoJuego.save(j5);
		repoJuego.save(j6);
		repoJuego.save(j7);
		repoJuego.save(j8);
		repoJuego.save(j9);
		repoJuego.save(j10);
		repoJuego.save(j11);
		repoJuego.save(j12);
		repoJuego.save(j13);
		
		//CONFIRMACIÓN

		System.out.println("Registros iniciales cargados correctamente");
	}

}
