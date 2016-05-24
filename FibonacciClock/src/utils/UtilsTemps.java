/**
 * 
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import constantes.ConstantesString;
import enumeration.EnumNombres;

/**
 * Classe utilitaire qui manipule le temps
 * 
 * @author darkchyper
 *
 */
public class UtilsTemps {


	/**
	 * Renvoie l'heure au format 12h sous forme d'un entier à partir d'une Date
	 * 
	 * @param date
	 * @return
	 */
	public static int getHour(final Date date){

		// on extrait l'heure
		final SimpleDateFormat h = new SimpleDateFormat(ConstantesString.hh);
		final String hourString = h.format(date);
		final int hour = Integer.parseInt(hourString);


		return hour;
	}

	/**
	 * Renvoie les minutes pondérées /5 au format 0-12 sous forme d'un entier à partir d'une Date
	 * 
	 * @param date
	 * @return
	 */
	public static int getMinutes(final Date date){

		// on extrait les minutes
		final SimpleDateFormat m = new SimpleDateFormat(ConstantesString.mm);
		final String minuteString = m.format(date);
		int minutes = Integer.parseInt(minuteString);

		// on ponere les minutes
		minutes = pondererMinutes(minutes);

		return minutes;
	}

	/**
	 * PondÃ¨re les minutes en un multiple entier de 5 
	 * 
	 * @param minutes
	 * @return int
	 */
	private static int pondererMinutes(final int minutes) {

		final int retour =  minutes / EnumNombres.CINQ.getNombre();

		return retour;
	}

}
