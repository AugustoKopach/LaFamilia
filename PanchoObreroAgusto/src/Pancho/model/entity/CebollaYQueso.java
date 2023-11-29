package Pancho.model.entity;

public class CebollaYQueso extends AgregadosDecorator{

	

	public CebollaYQueso(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		super(pancho, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer costo() {
		return super.costo() + 180;
	}

	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return super.descripcion() + " con Cebolla y Queso";
	}

}
