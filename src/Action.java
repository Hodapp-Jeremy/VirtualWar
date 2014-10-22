
public abstract class Action {
	
	private Robot robot;
	public Robot getRobot(){
		return robot;
		
	}
	public Coordonnees getDirection(){
		
	}
	public Coordonnees getObjectif(){
		
	}
	public Action(Robot robot,Coordonnees direction){
		
	}
	abstract void agit();
}
