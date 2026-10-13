package Personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " :";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + "." );
	}
	
	public void booster(Gaulois gaulois) {
		boolean a = chaudron.resterPotion();
		gaulois.getNom();
		if (a == true) {
			if (gaulois.getNom().equals("Obélix")) {
				parler("Non, " + gaulois.getNom() + " Non !... Et tu le sais très bien !");
			}
			else {
				int forcePot = chaudron.prendreLouche();
				gaulois.boirePotion(forcePot);
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			}
		}
		else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}	

}
