/**
 * @description Classe Pays qui instancie un pays qui a un nom, une langue, une monnaie, une capitale et plusieurs villes.
 *
 */

import java.util.ArrayList;

public class Pays {

	//Attributs privés
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale capitale;
	private static int compteurPays;
	private ArrayList<Ville> listeVilles;
	
	//Constructeur
	public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale uneCapitale){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.capitale = uneCapitale;
		compteurPays ++;
		this.listeVilles = new ArrayList<Ville>();
	}
	
	public Pays(){
		compteurPays ++;
		this.listeVilles = new ArrayList<Ville>();
	}
	
	private String getNomMaj(){
		return(this.nom.toUpperCase().charAt(0) + this.nom.substring(1,this.nom.length()).toLowerCase());
	}
	
	public String getNOM(){
		return(this.nom.toUpperCase());
	}

	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public String getLangue() {
		return langue;
	}
	
	public void setLangue(String uneLangue) {
		this.langue = uneLangue;
	}

	public String getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}

	public Capitale getCapitale() {
		return capitale;
	}

	public void setCapitale(Capitale capitale) {
		this.capitale = capitale;
	}
	
	public String toString(){
		return("Nom : " + this.getNomMaj() + "\nLangue : " + this.getLangue() + "\nLa monnaie : " + this.getMonnaie() + "\nLa capitale : " + this.getCapitale().toString() + this.voirLesVilles());
	}

	public ArrayList<Ville> getListeVilles() {
		return listeVilles;
	}

	public String voirLesVilles(){
		String chaine = "\nLes villes de ce pays : ";
		for(Ville laVille : this.listeVilles){
			chaine += "\n" + laVille.toString();
		}
		return(chaine);
	}
	
	public void ajouterVille(Ville uneVille){
		this.listeVilles.add(uneVille);
	}
	
	
}
