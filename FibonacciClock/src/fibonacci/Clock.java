/**
 * 
 */
package fibonacci;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import constantes.ConstantesString;
import enumeration.EnumNombres;
import utils.UtilsColor;

/**
 * @author darkchyper
 *
 */
public class Clock {

	private final List<Bloc> listeBloc;
	private String schemaDeCouleur;

	public Clock(){

		setSchemaDeCouleur(ConstantesString.NORMAL);

		this.listeBloc = new ArrayList<Bloc>();
		this.listeBloc.add(new Bloc(EnumNombres.UN.getNombre()));
		this.listeBloc.add(new Bloc(EnumNombres.UN.getNombre()));
		this.listeBloc.add(new Bloc(EnumNombres.DEUX.getNombre()));
		this.listeBloc.add(new Bloc(EnumNombres.TROIS.getNombre()));
		this.listeBloc.add(new Bloc(EnumNombres.CINQ.getNombre()));
	}

	/**
	 * Retourne la couleur que doit afficher le bloc
	 * 
	 * @param numero de bloc
	 * @return Color
	 */
	public Color getColorBLoc(final int bloc){

		return UtilsColor.getColor(getSchemaDeCouleur(), this.listeBloc.get(bloc).getUtilisateur());
	}

	/**
	 * Ajoute un utilisateur � un bloc
	 * 
	 * @param numeroDeBloc
	 * @param type
	 * @return booleean
	 */
	public boolean setUtilisateur(final int numeroDeBloc, final int type) {
		boolean retour = false;
		if(EnumNombres.UN.getNombre() == type){
			retour = this.listeBloc.get(numeroDeBloc).addHeure();

		}else if(EnumNombres.DEUX.getNombre() == type){
			retour = this.listeBloc.get(numeroDeBloc).addMinutes();

		}

		return retour;
	}

	/**
	 * Remet l'utilisateur de tous les blocs � z�ro � z�ro
	 * 
	 */
	public void resetBloc() {
		for (final Bloc bloc : listeBloc) {
			bloc.resetUtilisateur();
		}

	}

	/**
	 * @return the schemaDeCouleur
	 */
	public String getSchemaDeCouleur() {
		return schemaDeCouleur;
	}



	/**
	 * @param schemaDeCouleur the schemaDeCouleur to set
	 */
	public void setSchemaDeCouleur(final String schemaDeCouleur) {
		this.schemaDeCouleur = schemaDeCouleur;
	}


}