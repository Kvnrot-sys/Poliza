package Test;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {
	private String nombre;
	private Set<Poliza>polizas = new HashSet<Poliza>();
	
	
	
	

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
	}


	public void agregarPoliza(Poliza poliza) {
		this.polizas.add(poliza);
		
	}
	
	
	public Integer obtenerLaCantidadDePolizasEmitidas(){
		return this.polizas.size();
		
	}


	public void denunciarSiniestro(Integer numeroDePoliza) throws PolizaInexistenteException {
		Poliza poliza = getPoliza(numeroDePoliza);
		
		if(poliza == null) {
			throw new PolizaInexistenteException();
		}
		
		if(poliza instanceof PolizaDeAuto) {
			((PolizaDeAuto) poliza).setRobado(true);
		}
		else {
			if(poliza instanceof PolizaAccidentesPersonales) {
				((PolizaAccidentesPersonales) poliza).setAccidente(true);
			}
		}
		
	}


	public Poliza getPoliza(Integer numero) {
		for(Poliza actual : this.polizas) {
			if(actual.getNumero().equals(numero)) {
				return actual;
			}
		}
		return null;
		
	}
	
	
	

}
