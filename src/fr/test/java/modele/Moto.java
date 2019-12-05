package fr.test.java.modele;

public class Moto extends Vehicule{
	int puissance;

	
	public Moto(String modele, String marque, int puissance) {
		super(modele, marque, 2);
		this.puissance = puissance;				
	}
	
	public Moto(String modele, String marque, int puissance, String immat) {
		super(modele, marque, 2, immat);
		this.puissance = puissance;
	}
	
	public String toString() {
		String parentString = super.toString();
		String puissance = Integer.toString(this.getPuissance());
		return parentString + " " + puissance;
	}
	
	public int getPuissance() {
		return puissance;
	}
	
//	public void setPuissance() {
//		this.puissance = puissance;
//	}
}
