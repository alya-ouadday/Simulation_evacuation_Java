package proj.simuagent;
import proj.physics.Vecteur2D;
import proj.physics.Personne;
import proj.simuagent.Strategy;

/**
 * Cette classe impl�mente Strategy et a pour objectif de d�placer la personne dans une direction arbitraire.
 * 
 * @author BEN OUADDAY Alya 
 * @author LAUJIN Laurine
 *
 */
public class StrategyBasic implements Strategy {
	public StrategyBasic() {
	
	}
	
	@Override
	public Vecteur2D deplacement(Personne p) {
		Vecteur2D v = new Vecteur2D(9,9);
	
		return v;
	}

}
