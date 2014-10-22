
public class Case extends Cellule{

	public Case(int largeur, int hauteur) {
		super(largeur, hauteur);
	}

	void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(getLargeur(),getHauteur()));
			
		
	}

	void ajoute(int equipe) {
		
	}

	void videCase() {
		
	}
	
}
