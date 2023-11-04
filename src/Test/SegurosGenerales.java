package Test;

public interface SegurosGenerales {

	Integer getNumeroDePoliza();
	
	Bien getAuto();

	Persona getAsegurado();

	Double getPremio();

	void agregarBienAsegurado(Bien bien);
	
	
	

}
