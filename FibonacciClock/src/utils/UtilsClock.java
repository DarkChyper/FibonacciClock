/**
 * 
 */
package utils;

import java.util.Random;

import enumeration.EnumNombres;
import fibonacci.Clock;

/**
 * Classe utilitaire contenant les m�thodes pour manipuler l'horloge
 * 
 * @author a02276
 *
 */
public class UtilsClock {

	/**
	 * @param clock
	 * @param time
	 * @param type
	 */
	public static void allumerBloc(final Clock clock, final Integer time, final int type) {

		final Random rand = new Random();
		int randomInt; 


		switch(time){

		case 0:
			break;

		case 1:
			// si la valeur est 1 on peut allumer 
			// l'un des deux bloc de valeur 1

			randomInt = rand.nextInt(EnumNombres.DEUX.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				break;
			default :
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				break;

			};
			break;


		case 2:
			// si la valeur est 2 on peut allumer 
			// les deux blocs de valeur 1 ou le bloc de valeur 2

			randomInt = rand.nextInt(time);

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				break;

			};
			break;

		case 3:
			// si la valeur est 3 on peut allumer 
			// le bloc de valeur 2 et l'un des deux bloc de valeur 1
			// ou le bloc de valeur 3

			randomInt = rand.nextInt(time);

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;

			};
			break;

		case 4:
			// si la valeur est 4 on peut allumer 
			// le bloc de valeur 3 et l'un des deux bloc de valeur 1
			// ou le bloc de valeur 2 et les deux blocs de valeur 1

			randomInt = rand.nextInt(EnumNombres.TROIS.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				break;
			}
			break;

		case 5:
			// si la valeur est 5 on peut allumer 
			// le bloc de valeur 3 et les deux bloc de valeur 1
			// ou le bloc de valeur 3 et le blocs de valeur 2
			// ou avec le bloc de valeur 5

			randomInt = rand.nextInt(EnumNombres.QUATRE.getNombre());

			switch(randomInt){


			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;
			}
			break;

		case 6:
			// si la valeur est 6 on peut allumer 
			// le bloc de valeur 5 et l'un des deux bloc de valeur 1 (2 cas)
			// ou le bloc de valeur 3 et le blocs de valeur 2 
			// et l'un des deux blocs de valeur 1 (2 cas)

			randomInt = rand.nextInt(EnumNombres.QUATRE.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			case 3 :
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;
			}
			break;

		case 7:
			// si la valeur est 7 on peut allumer 
			// le bloc de valeur 5 et le blocs de valeur 2 
			// ou le bloc de valeur 5 et les deux blocs de valeur 1 
			// ou les blocs de valeur 1, 2 et 3

			randomInt = rand.nextInt(EnumNombres.TROIS.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				break;
			}
			break;

		case 8:
			// si la valeur est 8 on peut allumer 
			// les blocs de valeur 5 et 3
			// ou les blocs de valeurs 5, 2 et l'un des 1 ( 2 cas )

			randomInt = rand.nextInt(EnumNombres.TROIS.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			default : 

				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			};
			break;

		case 9:
			// si la valeur est 9 on peut allumer 
			// les blocs de valeur 5, 3 et l'un des 1 (2 cas)
			// ou les blocs de valeur 5, 2 et les deux 1

			randomInt = rand.nextInt(EnumNombres.TROIS.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			case 2 :
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;
			}
			break;

		case 10:
			// si la valeur est 10 on peut allumer 
			// les blocs de valeur 5, 3 et 2
			// ou les blocs de valeur 5, 3 et les deux 1

			randomInt = rand.nextInt(EnumNombres.DEUX.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			};
			break;

		case 11:
			// si la valeur est 11 on peut allumer 
			// les blocs de valeur 5, 3 ,2 et l'un des blocs de valeur 1

			randomInt = rand.nextInt(EnumNombres.DEUX.getNombre());

			switch(randomInt){
			case 1 :
				clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			default : 
				clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
				clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
				clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
				clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
				break;

			};
			break;

		default:
			clock.setUtilisateur(EnumNombres.ZERO.getNombre(), type);
			clock.setUtilisateur(EnumNombres.UN.getNombre(), type);
			clock.setUtilisateur(EnumNombres.DEUX.getNombre(), type);
			clock.setUtilisateur(EnumNombres.TROIS.getNombre(), type);
			clock.setUtilisateur(EnumNombres.QUATRE.getNombre(), type);
			break;

		};

	}
}
