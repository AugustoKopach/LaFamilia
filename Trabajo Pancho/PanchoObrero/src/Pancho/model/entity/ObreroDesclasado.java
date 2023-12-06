package Pancho.model.entity;

public class ObreroDesclasado extends AgregadosDecorator{

	

	public ObreroDesclasado(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		super(pancho, ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer costo() {
		return super.costo() + 300;
	}

	@Override
	public String descripcion() {
		return super.descripcion() + " con salsa golf, mix de hojas verdes y champignones";
	}
	

}
