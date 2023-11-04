package Test;

public class Vivienda extends Bien {
	
	private String calle;
	private String localidad;
	private String partido;
	private String provincia;

	public Vivienda(String calle, String localidad, String partido, String provincia) {
		this.calle = calle;
		this.localidad = localidad;
		this.partido = partido;
		this.provincia = provincia;
		
	}

}
