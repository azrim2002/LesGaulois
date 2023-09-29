package personnages;

public class Romain {
	private String nom ;
	private int force ;
	private int effetPotion = 1 ;
	
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : " ;
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup ;
		if (force > 0) {
			parler ("Aie");
		} else {
			parler("J'abandonne ...");
		}
	} 
	
	public static void main(String[] args) {
		 Romain romain = new Romain("romain", 12) ;
		 romain.prendreParole();
		 romain.parler("Bonjour");
		 romain.recevoirCoup(5);
				 
	}
	
	

}
