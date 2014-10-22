
public class Case extends Cellule{
	
	/**
	 * 
	 * @param largeur
	 * la largeur a laquelle se trouve la case
	 * 
	 * @param hauteur
	 * la hauteur a laquelle se trouve la case
	 */
	public Case(int largeur, int hauteur) {
		super(largeur, hauteur);
	}

	void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(super.getLargeur(),super.getHauteur()));
			
		
	}

	void ajoute(int equipe) {
		
	}

	void videCase() {
		
	}
	
}
