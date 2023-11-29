package Pancho.model.entity;

public class SalsaDeQueso extends AgregadosDecorator{

	

	public SalsaDeQueso(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		super(pancho, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer costo() {
		return super.costo();
	}

	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return super.descripcion() + "con Salsa de Queso";
	}

}
