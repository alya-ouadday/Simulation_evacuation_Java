package proj.physics;
/**
 * Cette classe Mur repr�sente les murs de la Salle. Elle �tend la classe RectanglePhysique
 * @author BEN OUADDAY Alya 
 * @author LAUJIN Laurine 
 *
 */
public class Mur extends RectanglePhysique{
	/**
	 * Constructeur de Mur
	 * @param x coordon�e x
	 * @param y coordon�e y 
	 * @param larg largeur 
	 * @param haut hauteur 
	 */
    public Mur(double x, double y, double larg, double haut) {
        super(x, y, larg, haut); //On fait appel au constructeur de la super class RectanglePhysique 
    }   
}
