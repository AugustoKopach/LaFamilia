package TP.LaFamilia_mvc.Model;

public class Bomba extends Arma {

	private static final Integer POTENCIA_DESTRUCTIVA = Integer.valueOf(1000);
	private static final Integer PUNTOS_DE_HONOR = Integer.valueOf(0);

	private Bomba(Integer puntosDeHonor, Integer potenciaDestructiva) {
		super(TipoDeArma.Bomba, PUNTOS_DE_HONOR, POTENCIA_DESTRUCTIVA);
	}

	public Bomba() {
		this(PUNTOS_DE_HONOR, POTENCIA_DESTRUCTIVA);
	}

}
