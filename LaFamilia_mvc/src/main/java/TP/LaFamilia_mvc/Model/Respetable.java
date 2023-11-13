package TP.LaFamilia_mvc.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Respetable extends Integrante {

	// constantes
	private static final Integer HONOR_POR_TITULO = Integer.valueOf(10);
	// atributos
	private Collection<Titulo> titulos;
	private Boolean tieneCargoPolitico;

	// constructores
	public Respetable(String nombre, Integer puntosDeHonorn, Boolean cargoPolitico, Integer id) {
		super(nombre, puntosDeHonorn, id);
		this.titulos = new ArrayList<Titulo>();
		this.tieneCargoPolitico = cargoPolitico;
	}
	public Respetable() {
	    
	}

	// metodos
	@Override
	public Integer honor() {
		return this.puntosDeHonor + this.honorTitulos();
	}

	@Override
	public Boolean esCapo() {
		return this.tieneHonorParaSerCapo() && this.tieneCargoPolitico;
	}

	private Integer honorTitulos() {
		return this.titulos.size() * HONOR_POR_TITULO;
	}

	public void add(Titulo titulo) {
		this.titulos.add(titulo);
	}
	
	//PRUEBA
	public static Respetable createRespetable(String nombre, Integer puntosDeHonorn, Boolean cargoPolitico, Integer id) {
        return new Respetable(nombre, puntosDeHonorn, cargoPolitico, id);
    }
	
	
}
