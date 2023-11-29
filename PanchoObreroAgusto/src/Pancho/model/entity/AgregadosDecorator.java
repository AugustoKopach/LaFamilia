package Pancho.model.entity;

import java.time.*;

public abstract class AgregadosDecorator implements Pancho{
	protected Pancho pancho;
	protected LocalDate fechaVencimiento;
	protected LocalDate fechaHoy = LocalDate.now();
	
	
	@Override
	public Integer costo() {
		return this.pancho.costo();
	}

	@Override
	public String descripcion() {
		return this.pancho.descripcion() + ",";
	}
	

	public AgregadosDecorator(Pancho pancho, Integer ano, Integer mes, Integer dia) {
		this.pancho = pancho;
		this.fechaVencimiento = LocalDate.of(ano, mes, dia) ;
	}

	@Override
	public Integer poderDiarreico() {
		if(this.estaVencido()) {
			return pancho.poderDiarreico() + 1;
		}else {
			return pancho.poderDiarreico();
		}
	}

	public Boolean estaVencido() {
	    return this.fechaVencimiento.isBefore(fechaHoy); 
	}
	
	
	
}
