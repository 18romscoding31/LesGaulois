package test_fonctionnel;

import java.util.Iterator;

import Personnages.Druide;
import Personnages.Gaulois;
import Personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 16);
		Romain Minus = new Romain("Minus", 6);
		Romain Brutus= new Romain("Brutus", 14);
		Druide Panoramix = new Druide("Panoramix", 2);
		
		
		Asterix.parler("Bonjour Obélix");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt " + Asterix.getNom() + " et " + Obelix.getNom() + " tombent nez à nez sur le romain " + Minus.getNom());
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);	
		}
		
		Panoramix.fabriquerPotion(4, 3);
		Panoramix.booster(Obelix);
		Panoramix.booster(Asterix);
		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Brutus);
		}

	}
}	
