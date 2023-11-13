package TP.LaFamilia_mvc.store;
import java.util.ArrayList;

import TP.LaFamilia_mvc.Model.Integrante;


public class MafiosoStore {
	private ArrayList <Integrante> integrantes;
	private static MafiosoStore instance;
	
	
	private MafiosoStore() {
		this.integrantes = new ArrayList<>();
	}

	public static MafiosoStore getInstance() {
		if(instance == null) 
			instance = new MafiosoStore();
		 return instance;
	}
	
	public Integrante agregarIntegrante(Integrante unaPersona) {
		integrantes.add(unaPersona);
		return unaPersona;
	}

	public ArrayList<Integrante> getIntegrantes() {
		return this.integrantes;
	}
	
	//eliminar integrante
		public void eliminarIntegrante(Integrante unaPersona) {
		    integrantes.remove(unaPersona);
		}
		
	//editar Integrante 
		public void editarIntegrante(Integrante unaPersona) {
		    for (Integrante integrante : this.integrantes) {
		        if (integrante.getId().equals(unaPersona.getId())) {
		            integrante.setNombre(unaPersona.getNombre());
		            integrante.setPuntosDeHonor(unaPersona.getPuntosDeHonor());
		            break; // Importante: Romper el bucle una vez que se encuentre y actualice el integrante.
		        }
		    }
		}

}

