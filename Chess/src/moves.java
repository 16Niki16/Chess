
public class moves {
	boolean diagonalMove(String typeFigure, int positionX, int positionY, int futurePosX, int futurePosY) {
		if (positionX != futurePosX && positionY != futurePosY)
			return true;
		return false;
	}

	boolean HorizontalVerticalMove(String typeFigure, int positionX, int positionY, int futurePosX, int futurePosY) {
		if (positionX != futurePosX && positionY == futurePosY || positionX == futurePosX && positionY != futurePosY)
			return true;
		return false;
	}

}
