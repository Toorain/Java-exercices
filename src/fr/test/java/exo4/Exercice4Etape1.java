package fr.test.java.exo4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import fr.test.java.modele.Moto;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;

public class Exercice4Etape1 {

	public static void main(String[] args) {
		afficherVehicule(initialiserCollection());

	}
	
	public static void afficherVehicule(List<Vehicule> liste) {
		ListIterator<Vehicule> listerator = liste.listIterator();
		while(listerator.hasNext()) {
			System.out.println(listerator.next());
		}
	}
	
	public static List<Vehicule> initialiserCollection() {
		Voiture civic = new Voiture("Civic", "Honda", 1991, "Verte");
		Voiture centdeux = new Voiture("102", "Peugeot", 1990, "Noir");
		Voiture deuxcentsix = new Voiture("206", "Peugeot", 2000, "Jaune");
		Moto cbr = new Moto("CBR", "Honda", 125);
		Moto r1 = new Moto("CBR", "Yamaha", 1000);
		Moto mt7 = new Moto("MT7", "Yamaha", 750 );
		
		List<Vehicule> liste = new ArrayList<Vehicule>();
		liste.add(civic);
		liste.add(centdeux);
		liste.add(deuxcentsix);
		liste.add(cbr);
		liste.add(r1);
		liste.add(mt7);
		
		return liste;
	}

}
