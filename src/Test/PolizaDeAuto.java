package Test;

import java.util.HashSet;
import java.util.Set;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
	
	private Bien bienAsegurado = null;
	private Boolean robado = false;

	public PolizaDeAuto(Integer numero, Persona asegurado, Double suma, Double prima) {
		this.setNumero(numero);
		this.setAsegurado(asegurado);
		this.setSumaAsegurada(suma);
		this.setPrima(prima);

	}

	public PolizaDeAuto(Integer numero, Persona asegurado, Double suma, Double prima,Double premio) {
		this.setNumero(numero);
		this.setAsegurado(asegurado);
		this.setSumaAsegurada(suma);
		this.setPrima(prima);
		this.setPremio(premio);
	}

	@Override
	public Integer getNumeroDePoliza() {
		return this.numero;
	}

	@Override
	public Auto getAuto() {
		return (Auto) this.bienAsegurado;
	}

	@Override
	public Double getPremio() {
		return this.premio;
	}

	@Override
	public void agregarBienAsegurado(Bien auto) {
		this.bienAsegurado = (Auto) auto;

	}

	
	public Boolean fueRobado() {
		return this.robado;
	}
	
	public void setRobado(Boolean robado) {
		this.robado = robado;
	}
	
	
	
	
	

	

}
