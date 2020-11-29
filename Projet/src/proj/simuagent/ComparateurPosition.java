package proj.simuagent;
import proj.physics.Vecteur2D;

import java.util.Comparator;
/**
 * ComparateurPosition impl�mente Comparator et contient la m�thode permettant de comparer des cibles.
 * @author BEN OUADDAY Alya 
 * @author LAUJIN Laurine 
 *
 */
public class ComparateurPosition implements Comparator<Vecteur2D>{
	
	private Salle s;
	private Vecteur2D pos;
	/**
	 * Constructeur de ComparateurPosition
	 * @param salle La Salle dans laquelle se trouve la Personne et les cibles.
	 * @param pos Les coordon�es de la Personne avec laquelle on comparera les coordonn�es des cibles 
	 */
	public ComparateurPosition(Salle salle, Vecteur2D pos) {
		s = salle;
		this.pos = pos;
		
	}
	
	@Override
	/**
	 * Cette m�thode permet de d�partager deux cibles en fonction de leur visibilit� et de leur score. 
	 *@param c1 les coordon�es de la cible 1 
	 *@param c2 les coordon�es de la cible 2 
	 *@return <li> 0 si les deux cibles sont � �galit� </li> 
	 *<li> -1 si c1 est meilleure </li>
	 *<li> 1 si c2 est meilleure </li> 
	 *
	 */
	public int compare(Vecteur2D c1, Vecteur2D c2) {
		if( s.isVisible(pos, c1) == false && s.isVisible(pos, c2) == false) {
			return 0;
		}
		
		else if ( s.isVisible(pos, c2) == false ) {
			return -1;
		}
		
		else if ( s.isVisible(pos, c1) == false) {
			return 1;
		}
		
		double scoreC1 = pos.distance(c1)+ Terrain.level(s.get(c1)) * 1000;
		double scoreC2 = pos.distance(c2)+ Terrain.level(s.get(c2)) * 1000;
		
		if(scoreC1 > scoreC2) {
			return 1;
		}
		
		else if(scoreC1< scoreC2) {
			return -1;
		}
		
		else {
			return 0;
		}
		
	}

}
