/**
 * 
 */
package utils;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import constantes.ConstantesString;

/**
 * @author darkchyper
 *
 */
public class UtilsColor {

	private final static List<Color> schemaNormal = setSchemaNormal();
	private final static List<Color> schemaColorBLind = setSchemaColorBLind();
	private final static List<Color> schemaNoColor = setSchemaNoColor();

	/**
	 * Définition de la palette standard 
	 * 
	 * @return liste de couleur standard
	 */
	private static List<Color> setSchemaNormal(){

		final List<Color> liste = new ArrayList<Color>();

		liste.add(new Color(255,255,255));//blanc-0
		liste.add(new Color(245,20,20));//rouge-1
		liste.add(new Color(65,218,50));//vert-2
		liste.add(new Color(27,55,200));//bleu-3

		return liste;
	}

	/**
	 * Définition de la palette pour daltonien 
	 * 
	 * @return liste de couleur standard
	 */
	private static List<Color> setSchemaColorBLind(){

		final List<Color> liste = new ArrayList<Color>();

		liste.add(new Color(255,255,255)); //blanc-0
		liste.add(new Color(250,151,154));//rose-1
		liste.add(new Color(255,250,52)); //jaune-2
		liste.add(new Color(60,60,232));//bleu-3

		return liste;
	}

	/**
	 * Définition de la palette pour daltonien 
	 * 
	 * @return liste de couleur standard
	 */
	private static List<Color> setSchemaNoColor(){

		final List<Color> liste = new ArrayList<Color>();

		liste.add(new Color(255,255,255));//blanc-0
		liste.add(new Color(90,90,90));//gris foncé-1
		liste.add(new Color(180,180,180));//gris-2
		liste.add(new Color(0,0,0));//noir-3

		return liste;
	}

	/**
	 * Renvoie la couleur correspondant à la palette et à l'utilisateur fournit
	 * 
	 * @param schema
	 * @param utilisateur
	 * @return Color 
	 */
	public static Color getColor(final String schema, final int utilisateur){
		Color couleur = null;

		if(ConstantesString.NORMAL.equals(schema)){

			couleur = schemaNormal.get(utilisateur);

		}else if(ConstantesString.BLINDCOLOR.equals(schema)){

			couleur = schemaColorBLind.get(utilisateur);

		}else if(ConstantesString.NOCOLOR.equals(schema)) {

			couleur = schemaNoColor.get(utilisateur);

		}
		return couleur;
	}
}