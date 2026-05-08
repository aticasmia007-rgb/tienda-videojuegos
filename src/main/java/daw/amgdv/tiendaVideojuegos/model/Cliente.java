package daw.amgdv.tiendaVideojuegos.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id autoincremental
	private Long id; 
	
	private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;
    
    //Atributos que puedo poner como opcionales con @Column
    
    @Column(name = "puntos_fidelidad")
    private Integer puntosFidelidad;
    
    @Column(name = "fecha_nacimiento")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fechaNacimiento;
    
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    
    @Column(name = "fecha_alta")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fechaAlta;
    
    @Column(name = "codigo_postal")
    private String codigoPostal;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido1, String apellido2, String correo) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
	}

	public Cliente(Long id, String nombre, String apellido1, String apellido2, String correo, Integer puntosFidelidad,
			Date fechaNacimiento, String telefonoContacto, Date fechaAlta, String codigoPostal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
		this.puntosFidelidad = puntosFidelidad;
		this.fechaNacimiento = fechaNacimiento;
		this.telefonoContacto = telefonoContacto;
		this.fechaAlta = fechaAlta;
		this.codigoPostal = codigoPostal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getPuntosFidelidad() {
		return puntosFidelidad;
	}

	public void setPuntosFidelidad(Integer puntosFidelidad) {
		this.puntosFidelidad = puntosFidelidad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", correo=" + correo + ", puntosFidelidad=" + puntosFidelidad + ", fechaNacimiento=" + fechaNacimiento
				+ ", telefonoContacto=" + telefonoContacto + ", fechaAlta=" + fechaAlta + ", codigoPostal="
				+ codigoPostal + "]";
	}
	
    
    
    //Para que fuese fiel a la bd habría que poner cosas como: 
	//@Column(nullable = false, length = 50) // NOT NULL
}
