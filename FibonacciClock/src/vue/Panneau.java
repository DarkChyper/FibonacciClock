/**
 * 
 */
package vue;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author a02276
 *
 */
public class Panneau extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6868586427519836126L;

	private Color bloc0 = Color.WHITE;
	private Color bloc1 = Color.GREEN;
	private Color bloc2 = Color.RED;
	private Color bloc3 = Color.BLUE;
	private Color bloc5 = Color.ORANGE;


	@Override
	public void paintComponent(final Graphics g){

		// on definit la case ZERO
		g.setColor(bloc0);
		g.fillRect(this.getWidth()/4, 0, this.getWidth()/8, this.getHeight()/5);

		// on definit la case UN
		g.setColor(bloc1);
		g.fillRect(this.getWidth()/4, this.getHeight()/5, this.getWidth()/8, this.getHeight()/5);

		// on definit la case DEUX
		g.setColor(bloc2);
		g.fillRect(0, 0, this.getWidth()/4, (this.getHeight()*2)/5);


		// on definit la case TROIS
		g.setColor(bloc3);
		g.fillRect(0, (this.getHeight()*2)/5, (this.getWidth()*3)/8, (this.getHeight()*3)/5);

		// on definit la case CINQ
		g.setColor(bloc5);
		g.fillRect((this.getWidth()*3)/8, 0, (this.getWidth()*5)/8, this.getHeight());

		// on dessine la grille
		g.setColor(Color.black);
		g.drawLine(0, 0, this.getWidth(), 0);
		g.drawLine(0, this.getHeight() - 1, this.getWidth() -1, this.getHeight() - 1);
		g.drawLine(0, 0,0, this.getHeight());
		g.drawLine(this.getWidth() -1,0 , this.getWidth() -1,this.getHeight() - 1);

		g.drawLine(this.getWidth()/4, this.getHeight()/5, (this.getWidth()*3)/8, this.getHeight()/5);
		g.drawLine(0, (this.getHeight()*2)/5, (this.getWidth()*3)/8, (this.getHeight()*2)/5);
		g.drawLine(this.getWidth()/4, 0, this.getWidth()/4, (this.getHeight()*2)/5);
		g.drawLine((this.getWidth()*3)/8, 0, (this.getWidth()*3)/8, this.getHeight());

	}


	/**
	 * @return the bloc0
	 */
	public Color getBloc0() {
		return bloc0;
	}


	/**
	 * @param bloc0 the bloc0 to set
	 */
	public void setBloc0(final Color bloc0) {
		this.bloc0 = bloc0;
	}


	/**
	 * @return the bloc1
	 */
	public Color getBloc1() {
		return bloc1;
	}


	/**
	 * @param bloc1 the bloc1 to set
	 */
	public void setBloc1(final Color bloc1) {
		this.bloc1 = bloc1;
	}


	/**
	 * @return the bloc2
	 */
	public Color getBloc2() {
		return bloc2;
	}


	/**
	 * @param bloc2 the bloc2 to set
	 */
	public void setBloc2(final Color bloc2) {
		this.bloc2 = bloc2;
	}


	/**
	 * @return the bloc3
	 */
	public Color getBloc3() {
		return bloc3;
	}


	/**
	 * @param bloc3 the bloc3 to set
	 */
	public void setBloc3(final Color bloc3) {
		this.bloc3 = bloc3;
	}


	/**
	 * @return the bloc5
	 */
	public Color getBloc5() {
		return bloc5;
	}


	/**
	 * @param bloc5 the bloc5 to set
	 */
	public void setBloc5(final Color bloc5) {
		this.bloc5 = bloc5;
	}



}
