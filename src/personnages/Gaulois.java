package personnages;

public class Gaulois {
	private String nom ;
	private int force ;
	private int effetPotion = 1 ;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
        int forceDuCoup = (force / 3) * effetPotion;
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(forceDuCoup);
    }
	
	public void boirePotion(int forcePotion) {
        effetPotion = forcePotion;
        System.out.println(nom + " : Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
    }

	

	@Override
public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.prendreParole();
        asterix.boirePotion(3);
		asterix.parler("Bonjour");
		Romain romain = new Romain("romain", 12);
		asterix.frapper(romain);
		System.out.println("Nom de l'objet asterix : " + asterix.getNom());
		
	}
	
}
