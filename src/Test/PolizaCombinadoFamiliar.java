package Test;

import java.util.HashMap;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales {

	private Map<Persona,TipoDeBeneficiario> beneficiarios = new HashMap<Persona,TipoDeBeneficiario>();
	
	private Bien bienAsegurado = null;
	private Boolean robado = false;
	private Boolean accidente = false;

	
	
	public PolizaCombinadoFamiliar(Integer numero, Persona asegurado, Double suma, Double prima, Double premio) {
		this.setNumero(numero);
		this.setAsegurado(asegurado);
		this.setSumaAsegurada(suma);
		this.setPrima(prima);
		this.setPremio(premio);	
		}

	public PolizaCombinadoFamiliar(Integer numero, Persona asegurado, Double suma, Double prima) {
		this.setNumero(numero);
		this.setAsegurado(asegurado);
		this.setSumaAsegurada(suma);
		this.setPrima(prima);	}

	@Override
	public Integer getNumeroDePoliza() {
		return this.numero;
	}

	@Override
	public Bien getAuto() {
		return this.bienAsegurado;
	}

	@Override
	public void agregarBienAsegurado(Bien bien) {
		this.bienAsegurado = (Vivienda) bien;
		
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}

	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		this.beneficiarios.put(persona, tipo);
		
	}

	public Boolean fueRobado() {
		return this.robado;
	}

	public Boolean tuvoAlgunAccidente() {
		return this.accidente;
	}
	
	}


