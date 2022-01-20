package elecciones;

public class Votante extends Persona{
	// Atributos
	private boolean vocal;
	private String  localVot;
	
	// Constructor
	public Votante (String nombre, int edad, String rut, char sexo, boolean vocal, String localVot) {
		super(nombre, edad, rut, sexo);
		this.vocal = vocal;
		if (localVot == "")
			System.out.println("error");
		else
			this.localVot = localVot;
	}
	
	public Votante (String nombre, int edad, String rut, char sexo, String localVot) {
		super(nombre, edad, rut, sexo);
		this.vocal = false;
		if (localVot == "")
			System.out.println("error");
		else
			this.localVot = localVot;
	}

	// Métodos
	public void setVocal (boolean v) {
		vocal = v;
	}
	
	public boolean getVocal () {
		return this.vocal;
	}
	
	public void setLocalVot(String v) {
		this.localVot= v;
	}
	
	public String getLocalVot() {
		return this.localVot;
	}
}

