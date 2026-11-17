package Personnages;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Astérix", 8);
		System.out.println(Asterix);
	}

	@Override
	public String toString() {
		return nom;
	}
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
				+ nomRomain);
		int forceCoup = this.force * this.effetPotion;
		forceCoup = this.force/3;
		romain.recevoirCoup(forceCoup);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
			System.out.println("effet de la potion = 1");
		}
		}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
	
	public void sePresenter() {
		if(village == null) {
			System.out.println( "Le Gaulois" + nom + ": Bonjour, je m'appelle" + nom + ". Je voyage de villages en villages.");
		}	
		else {
			if (village.getChef() == this) {
				System.out.println("Le Gaulois :" + nom + "Bonjour, je m'appelle" + nom + ". Je suis le chef le village :" +  village.getNom());
			}
			else {
				System.out.println("Le Gaulois :" + nom + "Bonjour, je m'appelle"+ nom + ". J'habite le village : Village des Irreductibles.");
			}
		}
		

	}
}