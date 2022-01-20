package elecciones;

public class Ppal {
	public static void main(String[] args) {
		// Creación de candidatos
		Candidato candidato1 = new Candidato("Candidato 1",35,"123-6",'M',"partido 1");    
		Candidato candidato2 = new Candidato("Candidato 2",53,"321-7",'F',"partido 2");

		// Creación de votantes
		Votante vot1 = new Votante("Juan Pérez", 44, "321-4", 'M', false, "Escuela XY");
		// Segundo llamado: omite si es vocal o no
		Votante vot2 = new Votante("María Gómez", 25, "123-6", 'F', "Gimnasio Municipal");
		Votante vot3 = new Votante("Pablo Tapia", 56, "567-8", 'M', true, "Teatro Caupolicán");
		
		// Mostrar datos
		System.out.println("Candidatos:");
		System.out.println("1) Nombre: "+candidato1.getNombre());
		System.out.println("   Edad: "+candidato1.getEdad());
		System.out.println("   Partido: "+candidato1.getPartido());
		System.out.println("");
		System.out.println("2) Nombre: "+candidato2.getNombre());
		System.out.println("   Edad: "+candidato2.getEdad());
		System.out.println("   Partido: "+candidato2.getPartido());
		
		System.out.println("-------------------------");

		System.out.println("Votantes:");
		System.out.println("1) Nombre: "+vot1.getNombre());
		System.out.println("   Edad: "+vot1.getEdad());
		System.out.println("   RUT: "+vot1.getRut());
		System.out.println("   Sexo: "+vot1.getSexo());
		System.out.println("   Vocal de mesa: "+(vot1.getVocal()?"sí":"no"));
		System.out.println("   Local de votación: "+vot1.getLocalVot());
		System.out.println("");
		System.out.println("2) Nombre: "+vot2.getNombre());
		System.out.println("   Edad: "+vot2.getEdad());
		System.out.println("   RUT: "+vot2.getRut());
		System.out.println("   Sexo: "+vot2.getSexo());
		System.out.println("   Vocal de mesa: "+(vot2.getVocal()?"sí":"no"));
		System.out.println("   Local de votación: "+vot2.getLocalVot());
		System.out.println("");
		System.out.println("3) Nombre: "+vot3.getNombre());
		System.out.println("   Edad: "+vot3.getEdad());
		System.out.println("   RUT: "+vot3.getRut());
		System.out.println("   Sexo: "+vot3.getSexo());
		System.out.println("   Vocal de mesa: "+(vot3.getVocal()?"sí":"no"));
		System.out.println("   Local de votación: "+vot3.getLocalVot());
	} // fin main
} // fin clase ppal

