/**
 * 
 */
package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

/**
 * @author a02276
 *
 */
public class BoutonRond extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6232520639223842663L;

	private final Color couleur;

	public BoutonRond(final Color couleur){
		this.couleur = couleur;
	}

	@Override
	public void paintComponent(final Graphics g){
		final Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(this.couleur);
		g2d.fillOval(this.getWidth() / 4, this.getHeight() / 4, 14, 14);
	}        

}