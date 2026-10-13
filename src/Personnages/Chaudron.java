package Personnages;

import java.lang.reflect.Method;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = this.quantitePotion;
		forcePotion = this.forcePotion;
	}
	
	public boolean resterPotion() {
		if (quantitePotion > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int prendreLouche() {
		if (quantitePotion < 1) {
			this.forcePotion = 0;
		}
		quantitePotion--;
		return forcePotion;
	}
	
	
}
