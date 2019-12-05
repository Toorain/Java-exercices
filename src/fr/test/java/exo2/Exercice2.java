package fr.test.java.exo2;

import java.io.IOException;
import java.util.Scanner;

public class Exercice2 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int[] tableau = initialiserTableau(Integer.parseInt(args[0]));
		while (true) {

			System.out.println("Entrez une valeur: 1 : trier; 2 : afficher; 3 : Initialiser tableau;"
					+ " 4 : Calculer nombre premiers; 5 : Fermer le programme");

			int value = scan.nextInt(); // attente de la saisie d'un entier
			

			switch (value) {
			case 1:
				afficherTableau(trier(tableau));
				break;
			case 2: 
				afficherTableau(tableau);
				break;
			case 3: 
				tableau = initialiserTableau(Integer.parseInt(args[0]));
				break;
			case 4: 				
				afficherTableau(calculerNombresPremiers(Integer.parseInt(args[0])));
				break;
			case 5: 
				scan.close();
				break;

			default:
				break;
			}
		}

	}

	public static int[] initialiserTableau(int number) {
		int[] arrayN = new int[number];

		for (int i = 0; i < number; i++) {
			arrayN[i] = (int)(Math.random()*100);
		}
		return arrayN;
	}

	public static void afficherTableau(int[] tableau) {
		for (int j = 0; j < tableau.length; j++) {
			System.out.print(tableau[j] + "/");
		}
		System.out.println();
	}

	public static int[] trier(int[] tableau) {
		int[] tableauFun = tableau;
		int lengthArray = tableau.length;
		int temp = 0;

		for (int i = 0; i < lengthArray; i++) {
			for (int j = 1; j < (lengthArray - i); j++) {
				if (tableauFun[j-1] > tableauFun[j]) {
					temp = tableauFun[j-1];
					tableauFun[j-1] = tableauFun[j];
					tableauFun[j] = temp;
				}
			}
		}
		return tableauFun;

	}

	private static int[] calculerNombresPremiers(int num) {

		int[] tab = new int[num];
		boolean premier;

		int index = 0;

		tab[index] = 2; // 2 est le premier nombre premier
		index++;
		int nombre = 3;
		while (index < num) {
			int diviseur = 2;
			premier = true;
			do {
				if (nombre % diviseur == 0) {
					premier = false;
				}
				else {
					diviseur = diviseur+1;
				}
			} 
			while ((diviseur <= nombre/2) && premier);
			if (premier) {
				tab[index] = nombre;
				index++;
			}
			nombre = nombre + 1;
		}
		return tab;
	}
}
