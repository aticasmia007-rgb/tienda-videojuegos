package daw.amgdv.tiendaVideojuegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import daw.amgdv.tiendaVideojuegos.model.Cliente;
import daw.amgdv.tiendaVideojuegos.model.Juego;
import daw.amgdv.tiendaVideojuegos.repository.ClienteRepository;
import daw.amgdv.tiendaVideojuegos.repository.JuegoRepository;


@Controller //Importante, al ser una web. --> Identifico el archivo
public class TiendaController {
	@Autowired //cargo repos --> Datos
	private JuegoRepository repoJuego;
	@Autowired
	private ClienteRepository repoCliente;
	
	//--> Endpoints -> ruta, Model con datos, Return con nombre html
	
	//INICIO
	@GetMapping("/inicio")
	public String inicio(Model model) { //Model siendo la clase asociada
		return "home"; 
	}
	
	
	//LISTAR
	@GetMapping("/listadoClientes")
	public String listarClientes(Model model) { //Model siendo la clase asociada
		model.addAttribute("listaClientes", repoCliente.findAll());
		return "CustomersList"; 
	}
	@GetMapping("/listadoJuegos")
	public String listarJuegos(Model model) { //Model siendo la clase asociada
		model.addAttribute("listaJuegos", repoJuego.findAll());
		return "GamesList"; 
	}
	
	
	//FORMULARIOS
	@GetMapping("/altaClientes")
	public String altaClientes(Model model) {
		model.addAttribute("customer", new Cliente()); //Cliente vacio, para molde del post
		return "CustomersEnroll";
	}
	@PostMapping("/altaClientes")
	public String crearCliente(@ModelAttribute("customer") Cliente customer) { //El cliente lo completa spring con el form; me aseguro de que reconozca customer, es simplemente por tenerlo en inglés...
		repoCliente.save(customer);
		return "redirect:/listadoClientes"; //devuelvo al endpoint de listar
	}
	@GetMapping("/altaJuegos")
	public String altaJuegos(Model model) {
		model.addAttribute("game", new Juego());
		return "GamesEnroll";
	}
	
	@PostMapping("/altaJuegos")
	public String crearJuego(@ModelAttribute("game") Juego game) { //El cliente lo completa spring con el form; me aseguro de que reconozca customer, es simplemente por tenerlo en inglés...
		repoJuego.save(game);
		return "redirect:/listadoJuegos"; //devuelvo al endpoint de listar
	}
}
