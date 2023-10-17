package TP.LaFamilia_mvc.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TP.LaFamilia_mvc.Model.Criminal;
import TP.LaFamilia_mvc.Model.Integrante;
import TP.LaFamilia_mvc.Model.Respetable;
import TP.LaFamilia_mvc.store.MafiosoStore;

@RestController
@RequestMapping("/0800LaMafilia")
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
	
}
