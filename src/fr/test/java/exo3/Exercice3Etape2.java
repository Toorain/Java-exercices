package fr.test.java.exo3;

import fr.test.java.modele.Moto;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;

public class Exercice3Etape2 {
	public static void main(String[] args) {
		Moto moto = new Moto("CB125R", "Honda", 125);
		Voiture voiture = new Voiture("Civic", "Honda", 1991, "Bleu");
		Vehicule avion = new Vehicule("Honda", "Vu-outre", 2);
		System.out.println(moto);
	}
	
	public static void afficherVehicule(Vehicule catin) {
		System.out.println(catin);
	}
}
