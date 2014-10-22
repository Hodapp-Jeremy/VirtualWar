
public class Base extends Cellule{

	public Base(int largeur, int hauteur) {
		super(largeur, hauteur);
		
	}

	public void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(getLargeur(),getHauteur()));
	}

	public void ajoute(int equipe) {
		
		
	}

	public void videCase() {
		
		
	}

}
