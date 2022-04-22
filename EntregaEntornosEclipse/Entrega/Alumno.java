
public class Alumno {
	

//Atributos
	
	private String dni;
	private String nombre;
	private String apellido;
	

//Metodos
	
	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.dni;
	}
	
	
//Constructor

	public Alumno(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
}
