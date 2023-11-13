package TP.LaFamilia_mvc.Model;


public abstract class Integrante {

	protected static final Integer HONOR_CAPO = Integer.valueOf(100);
	protected String nombre;
	protected Integer puntosDeHonor;
	protected Integer id;
	
	
	/**
	 * 
	 */
	public Integrante () {
		
	}
	/**
	 * @return the puntosDeHonor
	 */
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}
	/**
	 * @param puntosDeHonor the puntosDeHonor to set
	 */
	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the honorCapo
	 */
	public static Integer getHonorCapo() {
		return HONOR_CAPO;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Integrante(String nombre, Integer puntosDeHonorn, Integer idDelIntegrante) {
		this.nombre        = nombre;
		this.puntosDeHonor = puntosDeHonorn;
		this.id            = idDelIntegrante;
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
