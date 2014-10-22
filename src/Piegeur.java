
import java.util.List;


public class Piegeur extends Robot{
	/**
	 * Portee : 1
	 * Energie : 50
	 * Cout Deplacement: 2
	 * Deplacement : 1case
	 * Cout Mine : 2
	 * Regeneration Base : +2/tour
	 * Degat Tir/Mine :  -2
	 */
	public Piegeur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		this.setEnergie(50);
	}

	
	public boolean peutTirer() {
		
		return false;
	}

	
	public int getCoutAction() {
		
		return 2;
	}

	
	public int getCoutDep() {
		
		return 2;
	}

	
	public int getDegatTir() {
		
		return 2;
	}

	
	public int getDegatMine() {
		
		return 2;
	}

	
	public String getType() {
		
		return "Piegeur";
	}

	
	public List<Coordonnees> getDeplacements() {
		
		return null;
	}
	
	
	
}
