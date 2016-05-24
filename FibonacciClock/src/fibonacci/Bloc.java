/**
 * 
 */
package fibonacci;

import enumeration.EnumNombres;

/**
 * Représente un bloc de fibonacci
 * La valeur est le nombre de fibonnacci
 * L'utilisateur indique si le bloc est utilisé pour compter 
 * les heures, les minutes, les deux ou pas du tout
 * 
 * @author darkchyper
 *
 */
public class Bloc {

	private final int valeur;
	private int utilisateur;

	/**
	 * Constructeur
	 * 
	 * @param valeur
	 */
	public Bloc(final int valeur){
		this.valeur = valeur;
		resetUtilisateur();

	}
	/**
	 * @return the valeur
	 */
	public int getValeur() {
		return valeur;
	}


	/**
	 * On ajoute l'heure comme utilisateur de ce bloc
	 * Retourne false si le bloc est d�ja utilis� pour l'heure
	 * 
	 * @return boolean
	 */
	public boolean addHeure(){
		if((this.utilisateur != EnumNombres.UN.getNombre()) && (this.utilisateur < EnumNombres.TROIS.getNombre())){
			this.utilisateur = this.utilisateur + EnumNombres.UN.getNombre();
			return true;
		}
		return false;
	}

	/**
	 * On ajoute les minutes comme utilisateur de ce bloc
	 * Retourne false si le bloc est d�ja utilis� pour les minutes
	 * 
	 * @return boolean
	 */
	public boolean addMinutes(){
		if(this.utilisateur < EnumNombres.DEUX.getNombre()){
			this.utilisateur = this.utilisateur + EnumNombres.DEUX.getNombre();
			return true;
		}
		return false;
	}

	/**
	 * Remise à zéro de l'utilisateur du bloc
	 */
	public void resetUtilisateur(){
		this.utilisateur = EnumNombres.ZERO.getNombre();
	}


	/**
	 * @return l'utilisateur du bloc
	 */
	public int getUtilisateur() {
		return this.utilisateur;
	}



}
