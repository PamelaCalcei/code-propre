package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	/**
	 * Attributs de la classe
	 */
	private String nom;
	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	/**
	 * constructeur
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.types = new ArrayList<>();
		this.noms = new ArrayList<>();
		this.comportements = new ArrayList<>();
	}
	
	/** 
	 * Méthode pour ajouter un animal au zoo
	 * 
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	/**
	 * Méthode pour afficher la liste des animaux
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<types.size(); i++) {
			System.out.println(noms.get(i)+" "+types.get(i)+" "+comportements.get(i));
		}
	}
	
	public int taille() {
		return types.size();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Rajout de la méthode toString() afin de bien afficher les méthodes sous forme de string
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < types.size(); i++) {
			sb.append("Animal ").append(i + 1).append(": ");
			sb.append("Nom: ").append(noms.get(i));
			sb.append(", Type: ").append(types.get(i));
			sb.append(", Comportement: ").append(comportements.get(i)).append('\n');
		}
		return sb.toString();
	}
	
	
}

