package TP.LaFamilia_mvc.Model;

import java.util.ArrayList;
import java.util.Collection;


public class Criminal extends Integrante {

	// atributos
	private Collection<Arma> armas;
	
	// constructores
	public Criminal(String nombre, Integer puntosDeHonorn, Integer id) {
		super(nombre, puntosDeHonorn, id);
		this.armas = new ArrayList<Arma>();
	}
	public Criminal(){}

	// metodos
	@Override
	public void imprimirNombre() {
		System.out.println(this.getNombre());
	}

 	@Override
	public Integer honor() {
		return this.honorArmas() + this.puntosDeHonor;
	}

	@Override
	public Boolean esCapo() {
		return  this.tieneHonorParaSerCapo() && this.tieneArmaHeavy();
	}

	private Boolean tieneArmaHeavy() {
		return this.armas.stream().anyMatch(Arma::isHeavy);
	}

 	private Integer honorArmas() {
 		return this.armas.stream()
 							.mapToInt(Arma::getPuntosDeHonor)
 							.sum();
 	}
 	
	public void add(Arma arma) {
		this.armas.add(arma);
	}
	
	
	//PRUEBA
	public static Criminal createCriminal(String nombre, Integer puntosDeHonorn, Integer id) {
        return new Criminal(nombre, puntosDeHonorn, id);
    }
}
