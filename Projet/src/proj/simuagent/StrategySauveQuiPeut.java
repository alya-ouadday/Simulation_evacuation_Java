package proj.simuagent;
import proj.physics.Vecteur2D;
import proj.physics.Personne;
import proj.simuagent.Strategy;

import java.util.Collections;

/**
 * <b>StrategySauveQuiPeut est la classe repr�sentant une Strategy qu'est susceptible d'adopter une Personne </b>
 * 
 * @author BEN OUADDAY Alya 
 * @author LAUJIN Laurine s
 *
 */
public class StrategySauveQuiPeut implements Strategy {
	/**
	 * La Salle dans laquelle se trouveront les Personne
	 */
	private Salle s;
	/**
	 * Constructeur de la Strategy SauveQuiPeut
	 * @param salle
	 */
	public StrategySauveQuiPeut(Salle salle) {
		s = salle;
	}
	
	@Override
	/**
	 * Cette m�thode retourne les coordon�es de la meilleure cible (de plus bas score) de la listeCibles.
	 *  <ul>La personne se dirigera alors vers cette derni�re </ul>
	 */
	public Vecteur2D deplacement(Personne p) {
		Vecteur2D best = Collections.min(s.getListeCibles(), new ComparateurPosition(s, p.getPos()));
		return best;
		
		
	}

}
