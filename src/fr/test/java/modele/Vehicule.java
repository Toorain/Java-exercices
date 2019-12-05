package fr.test.java.modele;


public class Vehicule {
	
	private String modele, marque;
	private int nombreRoues;
	private String immat;
	
	public Vehicule() {
		
	}
	
	public Vehicule(String modele, String marque, int nombreRoues) {
		this.modele = modele;
		this.marque = marque;
		this.nombreRoues = nombreRoues;
	}
	
	public Vehicule(String modele, String marque, int nombreRoues, String immat) {
		this.modele = modele;
		this.marque = marque;
		this.nombreRoues = nombreRoues;
		this.immat = immat;
	}
	
	public String toString() {
		String marque = this.getMarque();
		String modele = this.getModele();
		String roues = Integer.toString(this.getNombreRoues());
		return roues + " " + modele + " " + marque;
	}

	public int getNombreRoues() {
		return nombreRoues;
	}

	public void setNombreRoues(int nombreRoues) {
		this.nombreRoues = nombreRoues;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getImmat() {
		return immat;
	}

	public void setImmat(String immat) {
		this.immat = immat;
	}
}
