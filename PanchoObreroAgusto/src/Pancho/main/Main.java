package Pancho.main;

import java.time.LocalDate;

import Pancho.model.entity.Ketchup;
import Pancho.model.entity.Mayonesa;
import Pancho.model.entity.Pancho;
import Pancho.model.entity.PanchoBase;
import Pancho.model.entity.SalsaPutaPario;

public class Main {

	public static void main(String[] args) {
		Pancho pancho = new PanchoBase();
        Pancho panchoMayonesa = new Mayonesa(pancho, 2020, 3, 15);
        Pancho panchoKetchup = new Ketchup(panchoMayonesa, 2024, 2, 24);
        Pancho panchoSalsaPutaPario = new SalsaPutaPario(panchoKetchup, 2023, 12, 24);
        

        System.out.println("Descripción: " + panchoSalsaPutaPario.descripcion());
        System.out.println("Costo: $" + panchoSalsaPutaPario.costo());
        System.out.println("PoderDiarreico : " + panchoSalsaPutaPario.poderDiarreico());
        System.out.println("fecha actual : " + LocalDate.now());
	}
}
