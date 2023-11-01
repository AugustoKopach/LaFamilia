package TP.LaFamilia_mvc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TP.LaFamilia_mvc.Model.Criminal;
import TP.LaFamilia_mvc.Model.Integrante;
import TP.LaFamilia_mvc.Model.Respetable;
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
	    Integrante integranteAEliminar = null;
	    for (Integrante integrante : integrantes) {
	        if (integrante.getId().equals(dni)) {
	            integranteAEliminar = integrante;
	            break;
	        }
	    }

	    if (integranteAEliminar != null) {
	        store.eliminarIntegrante(integranteAEliminar);
	        return "Integrante eliminado con éxito";
	    } else {
	        return "Integrante no encontrado";
	    }
	}

	
	/*@PutMapping("Editar/{id}")
	public ResponseEntity<String> actualizarIntegrante(@PathVariable Integer id, @RequestBody Integrante integranteActualizado) {
        MafiosoStore store = MafiosoStore.getInstance();
        List<Integrante> integrantes = store.getIntegrantes();
        Integrante integranteExistente = null;

        // Buscar el Integrante por su ID
        for (Integrante integrante : integrantes) {
            if (integrante.getId().equals(id)) {
                integranteExistente = integrante;
                break;
            }
        }

        if (integranteExistente != null) {
            // Actualizar los datos del Integrante con los datos proporcionados en integranteActualizado
            integranteExistente.setNombre(integranteActualizado.getNombre());
            integranteExistente.setEdad(integranteActualizado.getEdad());

            // Puedes agregar más campos a actualizar según las propiedades de tu modelo

            return ResponseEntity.ok("Integrante actualizado con éxito");
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/
}
