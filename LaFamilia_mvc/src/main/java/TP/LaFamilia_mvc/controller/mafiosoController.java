package TP.LaFamilia_mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TP.LaFamilia_mvc.Model.Criminal;
import TP.LaFamilia_mvc.Model.Integrante;
import TP.LaFamilia_mvc.Model.Respetable;
import TP.LaFamilia_mvc.Model.Tipo;
import TP.LaFamilia_mvc.store.MafiosoStore;


@RestController
@RequestMapping()
public class mafiosoController {

	
	
	@GetMapping("/Integrantes")
	private ArrayList<Integrante> listaDeMafiosos() {
		return MafiosoStore.getInstance().getIntegrantes();
	}
	@PostMapping("/AgregarIntegranteCriminal")  
		public Criminal agregar(@RequestBody Criminal unaPersona) {
        MafiosoStore.getInstance().agregarIntegrante(unaPersona);
        return unaPersona;
    }
	@PostMapping("/AgregarIntegranteRespetable")  
	public Respetable agregar(@RequestBody Respetable unaPersona) {
    MafiosoStore.getInstance().agregarIntegrante(unaPersona);
    return unaPersona;
	}
	
	@DeleteMapping("Borrar/Integrante/{dni}")
	public String eliminarIntegrante(@PathVariable Integer dni) {
	    MafiosoStore store = MafiosoStore.getInstance();
	    List<Integrante> integrantes = store.getIntegrantes();
	    Integrante integranteAEliminar = integrantes
        	    .stream()
        	    .filter(i -> i.getId().equals(dni))
        	    .findFirst()
        	    .orElse(null);

	    if (integranteAEliminar != null) {
	        store.eliminarIntegrante(integranteAEliminar);
	        return "Integrante eliminado con éxito";
	    } else {
	        return "Integrante no encontrado";
	    }
	}

	
	@PutMapping("/EditarRespetable/{id}")
    public ResponseEntity<String> actualizarRespetable(@PathVariable Integer id, @RequestBody Respetable respetableActualizado) {
        MafiosoStore store = MafiosoStore.getInstance();
        
        // Buscar el Respetable por su ID
        Respetable respetableAEditar = (Respetable) store.getIntegrantes()
        	    .stream()
        	    .filter(i -> i.getTipo().equals(Tipo.RESPETABLE) && i.getId().equals(id))
        	    .findFirst()
        	    .orElse(null);
        
        if (respetableAEditar != null) {
            // Actualizar los campos del Respetable existente
            respetableAEditar.setNombre(respetableActualizado.getNombre());
            respetableAEditar.setPuntosDeHonor(respetableActualizado.getPuntosDeHonor());
            // Resto del código para actualizar campos específicos de Respetable

            return ResponseEntity.ok("Respetable actualizado con éxito");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	@PutMapping("/EditarCriminal/{id}")
    public ResponseEntity<String> actualizarCriminal(@PathVariable Integer id, @RequestBody Criminal criminalActualizado) {
        MafiosoStore store = MafiosoStore.getInstance();
        // Resto del código...

        // Aquí manejarías la actualización del Respetable
        Criminal criminalAEditar = (Criminal) store.getIntegrantes()
        	    .stream()
        	    .filter(i -> i.getTipo().equals(Tipo.CRIMINAL) && i.getId().equals(id))
        	    .findFirst()
        	    .orElse(null);

        if (criminalAEditar != null) {
            // Actualizar los campos del Respetable existente
        	criminalAEditar.setNombre(criminalActualizado.getNombre());
        	criminalAEditar.setPuntosDeHonor(criminalActualizado.getPuntosDeHonor());
            // Resto del código para actualizar campos específicos de Respetable

            return ResponseEntity.ok("Criminal actualizado con éxito");
        }else {
            return ResponseEntity.notFound().build();
        }
    }
	@GetMapping("/integranteRespetable/{id}")
	public ResponseEntity<Integrante> obtenerIntegranteRespetablePorId(@PathVariable Integer id) {
		MafiosoStore store = MafiosoStore.getInstance();		
		Respetable respetableABuscar = (Respetable) store.getIntegrantes()
        	    .stream()
        	    .filter(i -> i.getTipo().equals(Tipo.RESPETABLE) && i.getId().equals(id))
        	    .findFirst()
        	    .orElse(null);
		
	    if (respetableABuscar != null) {
	        return ResponseEntity.ok(respetableABuscar);
	    }else {
	        return ResponseEntity.notFound().build();
	    }
	}
	@GetMapping("/integranteCriminal/{id}")
	public ResponseEntity<Integrante> obtenerIntegranteCRiminalPorId(@PathVariable Integer id) {
		MafiosoStore store = MafiosoStore.getInstance();
		Criminal criminalABuscar = (Criminal) store.getIntegrantes()
        	    .stream()
        	    .filter(i -> i.getTipo().equals(Tipo.CRIMINAL) && i.getId().equals(id))
        	    .findFirst()
        	    .orElse(null);
		if (criminalABuscar != null) {
			return ResponseEntity.ok(criminalABuscar);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
