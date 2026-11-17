package village_gaulois;

import java.lang.classfile.MethodBuilder;
import java.lang.reflect.Method;

import Personnages.Gaulois;


public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int indicevillageois = 0;
	
	public Village(String nom, int nbVillageoisMax, Gaulois chef) {
		this.nom = nom;
		this.villageois =  new Gaulois[nbVillageoisMax];
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[indicevillageois] = gaulois;
		indicevillageois++;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		for (int i = 0; i < villageois.length; i++) {
			if (i + 1 == numVillageois) {
				return villageois[i];
			}
		}
		System.out.print("Il n'y a pas autant d'habitants dans notre village ");
		return null;
	}
	
	public void afficherVillage() {
		System.out.print("Dans le village \" " + nom + "\" du chef " + chef + "vivent les légendaires gaulois :");
		for(int i = 0; i <= indicevillageois; i++) {
			System.out.println("-" + villageois[i+1]);
			}
		}
	
	public static void main(String[] args) {
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, Abraracourcix);
		village.trouverVillageois(30);
		Gaulois Astérix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(Astérix);
		Gaulois gaulois = village.trouverVillageois(1); 
		System.out.println(gaulois); 
		gaulois = village.trouverVillageois(2); 
		System.out.println(gaulois);
		
		Gaulois Obélix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(Obélix);
		village.afficherVillage();
		 
		Gaulois Doublepolémix = new Gaulois("Doublepolémix", 4);
		Abraracourcix.sePresenter();
		Astérix.sePresenter();
		Doublepolémix.sePresenter();
	}
}
