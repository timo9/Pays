
public class Ville {

	//Attributs privés
	private String nom;
	private int nbHab;
	
	//Constructeur 
	public Ville(String unNom, int unNbHab){
		this.nom = unNom;
		this.nbHab = unNbHab;
	}
	
	public Ville(){
		
	}

	private String getNomMaj(){
		return(this.nom.toUpperCase().charAt(0) + this.nom.substring(1,this.nom.length()).toLowerCase());
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	
	public String toString(){
		return(this.getNomMaj() + " avec " + this.nbHab + " habitants.");
	}
}
