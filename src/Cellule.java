
public abstract class Cellule {
	protected int mine=0;
	protected int base=0;
	private int largeur,hauteur;
	private String image;
	private Robot r ;
	
	/**
	 * 
	 * @param largeur
	 * @param hauteur
	 * Cree une cellule , avec pour parametres sa largeur et sa hauteur
	 */
	public Cellule(int largeur,int hauteur){
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	/**
	 * 
	 * @return
	 */
	public int contientMine(){
		return mine;
	}
	
	/**
	 * 
	 * @return
	 */
	public int estBase(){
		return base;
	}
	/**
	 * 
	 * @return Coordonnees
	 * retourne la coordonnee correspondant a la largeur & a la hauteur de la cellule
	 */
	
	public Coordonnees getCoordonnees(){
		return new Coordonnees(largeur,hauteur);
	}
	
	/**
	 * 
	 * @return robot
	 * retourne le robot contenu dans la cellule
	 */
	public Robot getContenu(){
		return r;
	}
	/**
	 * 
	 * @return la largeur de la cellule
	 */
	public int getLargeur() {
		return largeur;
	}
	/**
	 * 
	 * @return la hauteur de la cellule
	 */
	public int getHauteur() {
		return hauteur;
	}

	public String toString(){
		if(estBase() == 1) {
			return " B ";
		} else if(contientMine() == 1) {
			return " M ";
		} else{
			return " . ";
		}
	}
	abstract void deplaceSur(Robot robot);
	abstract void ajoute(int equipe);
	abstract void videCase();
}
