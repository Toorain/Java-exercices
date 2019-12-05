package fr.test.java.exo5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import fr.test.java.modele.Moto;
import fr.test.java.modele.Vehicule;
import fr.test.java.modele.Voiture;

public class Exercice5Etape1 {

	public static void main(String[] args) throws IOException {
		List<Vehicule> test = initialiserCollection();
		ecrireFichierTexte(test, "test", ";");

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
	
	public static void ecrireFichierTexte(List<Vehicule> liste, String file, String separator) throws IOException {
		ListIterator<Vehicule> listIterator = liste.listIterator();
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		while(listIterator.hasNext()) {
			Vehicule current = listIterator.next();
			printWriter.print(current.getClass().getSimpleName()+ separator + current.toString().replace(" ", separator) + " \n");	
		}
		printWriter.close();
	}
	
	public static void lireFichierTexte() {
		
	}

}
