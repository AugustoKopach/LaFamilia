package Pancho.model.entity;

public class SalsaCriolla extends AgregadosDecorator{

	

	public SalsaCriolla(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		super(pancho, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer costo() {
		return super.costo() + 100;
	}

	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return super.descripcion() + "con Salsa Criolla";
	}

}
