package proj.physics;
import proj.simuagent.Strategy;
import proj.simuagent.Salle;

/** 
 * <b> Personne est la classe repr�sentant une personne pr�sente dans la salle.</b>
 * <p>
 *  Une Personne est caract�ris�e par les informations suivantes :
 *  <ul>
 *  <li>Un identifiant unique attribu� d�finitivement.</li>
 *  <li> Une cible "target" de type Vecteur2D </li>
 *  <li> Une strat�gie "str" de type Strategy </li> 
 *  </ul>
 *  </p>
 * @author BEN OUADDAY Alya  
 * @author LAUJIN Laurine
 */
public class Personne extends CerclePhysique {
	/**
	 * identifiant de la Personne
	 */
	private int id;
	/**
	 * Compteur statique permettant d'instancier l'identifiant 
	 */
	private static int cpt = 1;
	/**
	 * Vecteur correspondant aux coordonn�es (x,y) de la cible de la Personne
	 */
	private Vecteur2D target;
	/**
	 * Strategie opt�e par la Personne
	 */
	private Strategy str;
	public static final int NBCHOCS = 350;

/** 
 * Constructeur Personne
 * @param x la position en x de la Personne
 * @param y la position en y de la Personne
 * @param s la Strategy qui sera associ�e a la Personne et d�finira alors son d�placement
 */
	public Personne(double x, double y, Strategy s ) {
		super(x, y);
		id = cpt;
		cpt++;
		str = s;  
		
		
	}
	/** Constructeur Personne
	 * 
	 * @param x position en x de la personne dans la salle
	 * @param y position en y de la personne dans la salle
	 * @param rayon
	 * @param masse poids de la personne
	 * @param s strat�gie associ�e � la personne
	 */
	

	public Personne(double x, double y , double rayon, double masse, Strategy s){
		super(x,y,rayon,masse);
		this.str = s;
		id = cpt;
		cpt++;
	}
	/** Redefinition de la m�thode setDir(Vecteur2D) dans MovePhysique
	 * 
	 */
	public void setDir(Vecteur2D v) {
		super.setDir(v);
	}
	/**
	 * D�placement de la personne. 
	 *<p> On lui affecte une vitesse et une direction correspondant au vecteur reliant la personne et la cible qu'elle doit rejoindre.
	 * 
	 * </p>
	 */
	public void move(){
		
        target = str.deplacement(this); // usage de la strategie sur la personne qui invoque move
        super.setVit(2.); // arbitraire, �a pourra d�pendre des personnes... 
                          // En fait, �a pourrait �tre fait dans la strat�gie si on ouvre la red�finition
        
        Vecteur2D dir = target.minus(getPos()); //on affecte � dir le vecteur reliant la personne � la cible determin�e
		dir.normalize();
		dir.fact(1/Salle.cote);
		setDir(dir); //la direction de la personne est alors la direction du vecteur dir 
    }
	
	/**
	 * Retourne les coordon�es de la cible de la personne
	 * @return le vecteur de la cible target.
	 */
	public Vecteur2D getTarget() {
		return target;
	}
}


