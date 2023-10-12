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
	public Respetable(String nombre, Integer puntosDeHonor, Boolean cargoPolitico) {
		super(nombre, puntosDeHonor);
		this.titulos = new ArrayList<Titulo>();
		this.tieneCargoPolitico = cargoPolitico;
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
}
