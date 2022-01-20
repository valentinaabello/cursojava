package elecciones;

public class Persona{
	// Atributos
	private String  nombre;
	private int     edad;
	private String  Rut;
	private char    sexo;

	public Persona(String nombre, int edad, String Rut, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.Rut = Rut;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
