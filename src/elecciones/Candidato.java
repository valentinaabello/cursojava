package elecciones;

public class Candidato extends Persona{
	// Atributos
	private String partido;
	
	// Constructor
	public Candidato(String nombre, int edad, String Rut, char sexo, String partido) {
		super(nombre, edad, Rut, sexo);
		this.partido= partido;
	}
	
	// Métodos
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public String getPartido(){
		return this.partido;
	}
}

