/**
 * 
 */
package constantes;

/**
 * Classe regroupant les constantes de type string
 * 
 * @author darkchyper
 *
 */
public interface ConstantesString {

	// Simple Date Format
	String hh = "hh";
	String mm = "mm";

	String HOUR = "HOUR";
	String MINUTES ="MINUTES";

	String ESPACE = " ";

	// Liste des palettes de couleur
	String NORMAL = "NORMAL";
	String BLINDCOLOR = "BLINDCOLOR";
	String NOCOLOR = "NOCOLOR";

	// messages pop up
	String REGLES = "La suite de Fibonacci est une séquence de nombres créés par le mathématicien italien Fibonacci au 13ème siècle.\nC'est une séquence commençant par 1 et 1, où chaque nombre suivant est la somme des deux précédents.\nPour l'horloge on utilise les 5 premiers termes: 1, 1, 2, 3 et 5.\n\nL'écran de l'horloge est composée de cinq carrés dont les longueurs des côtés correspondent aux cinq premiers nombres de Fibonacci: 1, 1, 2, 3 et 5.\nLes heures sont affichées à l'aide rouge (rose ou gris foncé) et les minutes en utilisant le vert (jaune ou gris clair).\nQuand un carré est utilisé pour afficher les heures et les minutes, il devient bleu (jaue ou noir).\nLes carrés blancs sont ignorés.\n\nPour lire l'heure sur l'horloge de Fibonacci vous devez faire quelques calculs.\nIl suffit d'additionner les valeurs correspondantes des carrés rouges et bleus. Pour lire les minutes faire la même chose avec les carrés verts et bleus.\nLes minutes sont affichées par incréments de 5 minutes (0 à 12) de sorte que vous devez multiplier le résultat par 5 pour obtenir le nombre réel.";
	String A_PROPOS = "Fibonacci's Clock est un projet personnel inspiré du projet Kickstarter de Philippe Chrétien.\nLes sources sont disponibles sur github ainsi que la référence vers le projet initial.";

}
