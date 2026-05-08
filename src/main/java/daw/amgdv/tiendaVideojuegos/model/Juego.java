package daw.amgdv.tiendaVideojuegos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegos") //Indico qué tabla es
public class Juego {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id autoincremental
	private Long id; 
	
	private String titulo;
    private String genero;
    private String plataforma;
    private double precio; 
    private int stock;
    
    //Constructores
	public Juego() {
		super();
	}
	public Juego(String titulo, String genero, String plataforma, double precio, int stock) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.precio = precio;
		this.stock = stock;
	}
	
	//Geter y Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//toString
	@Override
	public String toString() {
		return "Juego [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", plataforma=" + plataforma
				+ ", precio=" + precio + ", stock=" + stock + "]";
	}
    
    
}
