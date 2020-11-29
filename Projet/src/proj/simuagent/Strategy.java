package proj.simuagent;
import proj.physics.Personne;
import proj.physics.Vecteur2D;
/**
 *<ul> L'interface Strategy repr�sente le "contrat" pour la cr�ation des classes concr�tes l'impl�mentant .</ul>
 *Elle impose la red�finition d'une m�thode deplacement(Personne p).
 * @author BEN OUADDAY Alya 
 * @author LAUJIN Laurine
 *
 */
public interface Strategy {
	/**
	 * Cette m�thdode indique comment la personnne va se deplacer.
	 * @param p La personne qui va se d�placer.
	 * @return la cible vers laquelle va se diriger la personne
	 */
	public Vecteur2D deplacement(Personne p);
}
