

public class Plateau {
	int hauteur,largeur;
	Cellule[][] plateau;
	/**
	 * cree un tableau de cellule a 2dimensions pour representer le plateau
	 */
	public Plateau(){
		this.hauteur=10;
		this.largeur=5;
		plateau=new Cellule[10][5];
	}
	
	/**
	 * Affiche le plateau avec son contenu
	 */
	public void afficherPlateau() {	
		for(int i = 0;i < hauteur;i++) {
			for(int j=0;j < largeur;j++) {
				if(i == 0 && j == 0 || i==hauteur-1 && j == largeur-1) {
					plateau[i][j] = new Base(i,j);
					System.out.print(plateau[i][j]);
					
				} else if(plateau[i][j]== null){
					plateau[i][j] = new Case(i,j);
					System.out.print(plateau[i][j]);
				}
				System.out.print("|");
			}
			System.out.println("");
		}
	}
	
	/**
	 * 
	 * @return la hauteur du plateau
	 *  
	 */
	public int getHauteur() {
		return hauteur;
	}

	/**
	 * 
	 * @return la largeur du plateau
	 * 
	 */
	public int getLargeur() {
		return largeur;
	}
	
}