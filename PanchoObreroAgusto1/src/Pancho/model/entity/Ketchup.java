package Pancho.model.entity;

public class Ketchup extends AgregadosDecorator{

	

	public Ketchup(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		super(pancho, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer costo() {
		return super.costo() + 50;
	}

	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return super.descripcion() + " con Ketchup";
	}

}
