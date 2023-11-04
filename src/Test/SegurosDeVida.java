package Test;

public interface SegurosDeVida {

	Integer obtenerCantidadDeBeneficiarios();

	Persona getAsegurado();

	Double getPremio();

	void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2);
	
	Boolean fueRobado();

}
