package personnages;

import java.util.Random;

public class Druide {
	private String nom ;
	private int effetPotionMin ;
	private int effetPotionMax ;
	private int forcePotion =1 ;
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide" + nom + "et ma potion peut aller d'une force " + effetPotionMin + "a" + effetPotionMax + ".");
		
	}
	public String getNom() {
		return nom;
	}
	
	public void parler (String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	private void preparerPortion() {
		Random random = new Random ();
		int nouvelleForcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;


        if (nouvelleForcePotion > 7) {
            System.out.println("Le druide " + nom + " a pr�par� une super potion de force : " + forcePotion);
        } else {
            System.out.println("Le druide " + nom + " n'a pas trouv� tous les ingr�dients, sa potion est seulement de force : " + forcePotion);
          }
        }
		
	public static void main(String[] args) {
		 Druide panoramix = new Druide("Panoramix", 5,10);
		 for (int i = 0; i < 5; i++) {
	            panoramix.preparerPortion();
	     }
	}
}
	

