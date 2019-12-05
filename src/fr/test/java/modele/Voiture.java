package fr.test.java.modele;

public class Voiture extends Vehicule{
	
	int annee;
	String couleur;
	
	public Voiture () {
		
	}
	
	public Voiture (String modele, String marque, int annee, String couleur) {
		super(modele, marque, 4);
		this.annee = annee;
		this.couleur = couleur;
	}
	
	public Voiture (String modele, String marque, int annee, String couleur, String immat) {
		super(modele, marque, 4, immat);
		this.annee = annee;
		this.couleur = couleur;
	}
	
	public String toString() {
		String parentString = super.toString();
		String couleur = this.getCouleur();
		String annee = Integer.toString(this.getAnnee());
		return parentString + " " + couleur + " " + annee;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public int getAnnee() {
		return annee;
	}

	
}
