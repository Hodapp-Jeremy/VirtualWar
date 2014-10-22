
public abstract class Cellule {
	protected int mine=0;
	protected int base=0;
	private int largeur,hauteur;
	private String image;
	private Robot r ;
	
	public Cellule(int largeur,int hauteur){
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public int contientMine(){
		return mine;
	}
	public int estBase(){
		return base;
	}
	public Coordonnees getCoordonnees(){
		return new Coordonnees(largeur,hauteur);
	}
	public Robot getContenu(){
		return r;
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
