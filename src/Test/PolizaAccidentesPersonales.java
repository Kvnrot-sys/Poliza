package Test;

import java.util.HashMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {
	
	
	private Map<Persona,TipoDeBeneficiario> beneficiarios = new HashMap<Persona,TipoDeBeneficiario>();
	private Boolean accidente = false;

	public PolizaAccidentesPersonales(Integer numero, Persona asegurado, Double suma, Double prima) {
		this.setNumero(numero);
		this.setAsegurado(asegurado);
		this.setSumaAsegurada(suma);
		this.setPrima(prima);

	}

	public PolizaAccidentesPersonales(Integer numero, Persona asegurado, Double suma, Double prima, Double premio) {
		this.setNumero(numero);
		this.setAsegurado(asegurado);
		this.setSumaAsegurada(suma);
		this.setPrima(prima);
		this.setPremio(premio);

	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}

	@Override
	public Persona getAsegurado() {
		return this.asegurado;
	}

	@Override
	public Double getPremio() {
		return this.premio;
	}

	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		this.beneficiarios.put(persona, tipo);
		
		
	}

	

	public Boolean tuvoAlgunAccidente() {
		return this.accidente;
	}

	

	public void setAccidente(Boolean accidente) {
		this.accidente = accidente;
	}
	
	
	

}
