
public abstract class Character {
private int positionX;
private int positionY;

public abstract boolean movement();

public Character(int positionX1, int positionY1){
	this.positionX = positionX1;
	this.positionY = positionY1;
	}
public int getPositionX() {
	return positionX;
}
public int getPositonY() {
	return positionY;
}
}
