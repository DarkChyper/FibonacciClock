/**
 * 
 */
package enumeration;

/**
 * Enumération des nombres
 * 
 * @author darkchyper
 *
 */
public enum EnumNombres {

	ZERO(0),UN(1),DEUX(2),TROIS(3),QUATRE(4), CINQ(5), SIX(6), SEPT(7), HUIT(8), NEUF(9), DIX(10), ONZE(11), DOUZE(12), VINGT(20);

	private int nombre;


	/**
	 * Constructeur privé
	 * 
	 * @param nombre
	 */
	private EnumNombres(final int nombre){
		this.nombre=nombre;
	}

	/**
	 * Retourne le nombre
	 * 
	 * @return nombre
	 */
	public int getNombre(){
		return this.nombre;
	}

}
