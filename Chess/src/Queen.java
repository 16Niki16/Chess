
public class Queen extends Character{
	private int positionXtoMove;
	private int positionYtoMove;
	
	public boolean movement() {
		return true;
	}
public Queen(int positionXtoMove1, int positionYtoMove1, int positionX, int positionY){
	super(positionX, positionY);
	this.positionXtoMove = positionXtoMove1;
	this.positionYtoMove = positionYtoMove1; 
}
}
