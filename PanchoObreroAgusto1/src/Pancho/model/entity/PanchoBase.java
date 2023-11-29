package Pancho.model.entity;

public class PanchoBase implements Pancho{

	@Override
	public Integer costo() {
		return 500;
	}

	@Override
	public String descripcion() {
		return "Pancho";
	}

	@Override
	public Integer poderDiarreico() {
		return 0;
	}
	
	
	
}
