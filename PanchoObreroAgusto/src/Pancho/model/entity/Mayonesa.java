package Pancho.model.entity;

public class Mayonesa extends AgregadosDecorator{

	

	public Mayonesa(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		super(pancho, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer costo() {
		return super.costo() + 50;
	}

	@Override
	public String descripcion() {
		return super.descripcion() + " con Mayonesa";
	}

	
	
	
	
	
}
