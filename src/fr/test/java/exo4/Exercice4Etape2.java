package fr.test.java.exo4;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

import fr.test.java.modele.Moto;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;

public class Exercice4Etape2 {
	public static void main(String[] args) {
		Map<String,Vehicule> test = initialiserCollection();
		searchVehicule(test);		
	}

	public static Map<String, Vehicule> initialiserCollection() {
		Voiture civic = new Voiture("Civic", "Honda", 1991, "Verte","CV-BRR-CS");
		Voiture centdeux = new Voiture("102", "Peugeot", 1990, "Noir","CV-B5R-C6");
		Voiture deuxcentsix = new Voiture("206", "Peugeot", 2000, "Jaune","SV-BCR-CS");
		Moto cbr = new Moto("CBR", "Honda", 125,"CV-BRR-GS");
		Moto r1 = new Moto("R1", "Yamaha", 1000,"VH-TYR-TS");
		Moto mt7 = new Moto("MT7", "Yamaha", 750 ,"OV-BRR-ZS");

		Map<String, Vehicule> map = new TreeMap<>();
		map.put(civic.getImmat(),civic);
		map.put(centdeux.getImmat(),centdeux);
		map.put(deuxcentsix.getImmat(),deuxcentsix);
		map.put(cbr.getImmat(),cbr);
		map.put(r1.getImmat(),r1);
		map.put(mt7.getImmat(),mt7);

		return map;
	}

	public static void afficherVehicule(Map<String, Vehicule> map) {
		for (Map.Entry<String, Vehicule> entry : map.entrySet()) {	        
			String key = entry.getKey();
			Vehicule value = entry.getValue();

			System.out.println(key + " => " + value);
		}
	}

	public static void searchVehicule(Map<String,Vehicule> map) {
		Scanner sc = new Scanner(System.in);
		System.out.println(map.keySet());
		System.out.println("Veuillez saisir un nom de plaque : ");
		String str = sc.nextLine();
		/**
		 * with map.get(str) we check if user input is found in our Map
		 */
		try {
			Vehicule v = map.get(str);
			System.out.println(v.toString());
		} catch(NullPointerException e) {
			System.out.println("Erreur, pas de plaque à ce nom");
		}		
		sc.close();
	}
}
