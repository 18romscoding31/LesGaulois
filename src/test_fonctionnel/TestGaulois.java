package test_fonctionnel;

import Personnages.Gaulois;
import Personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 16);
		
		Asterix.parler("Bonjour Obélix");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler("Oui très bonne idée.");
	}
}	
