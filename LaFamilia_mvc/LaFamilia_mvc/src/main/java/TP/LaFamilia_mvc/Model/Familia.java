package TP.LaFamilia_mvc.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Familia {

	private Collection<Integrante> integrantes;
	
	public Familia() {
		this.integrantes = new ArrayList<Integrante>();
	}
	
	public Collection<Integrante> capos() {
		return this.integrantes.stream()
									.filter(Integrante::esCapo)
									.collect(Collectors.toList());
	}
	
	public Integer honorPerCapita() {
		return this.honor() / this.integrantes();
	}
	
	public Boolean esEjemplar() {
		return this.integrantes.stream()
									.allMatch(i -> i.honor()>60);
	}
	
	public void add(Integrante integrante) {
		this.integrantes.add(integrante);
	}
	
	private Integer integrantes() {
		return this.integrantes.size();
	}
	
	private Integer honor() {
		return this.integrantes.stream()
									.mapToInt(Integrante::honor)
									.sum();
	}
}
