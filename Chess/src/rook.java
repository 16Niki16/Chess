
public class rook extends Character{
	private int positionXtoMove;
	private int positionYtoMove;
	
	
public rook(int positionXtoMove1, int positionYtoMove1, int positionX, int positionY){
	super(positionX, positionY);
	this.positionXtoMove = positionXtoMove1;
	this.positionYtoMove = positionYtoMove1; 
}

@Override
public boolean movement() {
	// TODO Auto-generated method stub
	return false;
	}
}
