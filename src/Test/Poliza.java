package Test;

import java.util.Objects;

public abstract class Poliza {
	protected Integer numero;
	protected Persona asegurado;
	protected Double sumaAsegurada;
	protected Double prima;
	protected Double premio;
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Persona getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}
	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public Double getPrima() {
		return prima;
	}
	public void setPrima(Double prima) {
		this.prima = prima;
	}
	public Double getPremio() {
		return premio;
	}
	public void setPremio(Double premio) {
		this.premio = premio;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(numero, other.numero);
	}
	public Boolean fueRobado() {
		// TODO Auto-generated method stub
		return false;
	}
	public Boolean tuvoAlgunAccidente() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	
	
	

}
