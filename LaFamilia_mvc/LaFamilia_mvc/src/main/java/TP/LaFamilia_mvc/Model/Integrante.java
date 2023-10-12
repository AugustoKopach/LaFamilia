package TP.LaFamilia_mvc.Model;


public abstract class Integrante {

	protected static final Integer HONOR_CAPO = Integer.valueOf(100);
	protected String nombre;
	protected Integer puntosDeHonor;

	public Integrante(String nombre, Integer puntosDeHonor) {
		this.nombre = nombre;
		this.puntosDeHonor = puntosDeHonor;
	}

	public abstract Integer honor();
	public abstract Boolean esCapo();

	public void imprimirNombre() {
		System.out.println(this.nombre);
	}

	protected Boolean tieneHonorParaSerCapo() {
		return this.honor()>HONOR_CAPO;
	}

	public String getNombre() {
		return nombre;
	}
}
