package TP.LaFamilia_mvc.Model;

public abstract class Arma {

	// atributos
	protected Integer puntosDeHonor;
	protected Integer potenciaDestructiva;

	public Arma(Integer puntosDeHonor, Integer potenciaDestructiva) {
		this.puntosDeHonor = puntosDeHonor;
		this.potenciaDestructiva = potenciaDestructiva;
	}

	// metodos
	public Boolean isHeavy() {
		return 
			this.potenciaDestructiva>200 || this.puntosDeHonor>10;
	}

	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}

	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}

	public Integer getPotenciaDestructiva() {
		return potenciaDestructiva;
	}

	public void setPotenciaDestructiva(Integer potenciaDestructiva) {
		this.potenciaDestructiva = potenciaDestructiva;
	}
}
