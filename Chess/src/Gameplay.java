import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gameplay extends JPanel {
	//private final ImageIcon map;
	private final ImageIcon whiteRook;
	private final ImageIcon WhiteKnight; 
	private final ImageIcon WhitePawn;
	private final ImageIcon WhiteQueen;
	private final ImageIcon WhiteKing;
	private final ImageIcon WhiteBishop;
	
	private final ImageIcon BlackRook;
	private final ImageIcon BlackKnight;
	private final ImageIcon BlackBishop;
	private final ImageIcon BlackKing;
	private final ImageIcon BlackQueen;
	private final ImageIcon BlackPawn;
	
	int basicPositionStartX = -8;
	int basicPositionEnd = 340;
	int basicPositionWhiteY = -13;
	
	
public Gameplay(){	
	setFocusable(true);
	//map = new ImageIcon("images/board.png");
	whiteRook = new ImageIcon("images/WhiteRook.png");
	WhiteKnight = new ImageIcon("images/white Knight.png");
	WhitePawn = new ImageIcon("images/whitePawn.png");
	WhiteQueen = new ImageIcon("images/WhiteQueen.png");
	WhiteKing = new ImageIcon("images/WhiteKing.png");
	WhiteBishop = new ImageIcon("images/whiteBishop.png");
	
	BlackRook = new ImageIcon("images/BlackRook.png");
	BlackKnight = new ImageIcon("images/black Knight.png");
	BlackBishop = new ImageIcon("images/bishop.png");
	BlackKing = new ImageIcon("images/king.png");
	BlackQueen = new ImageIcon("images/queen.png");
	BlackPawn = new ImageIcon("images/pawn.png");
	
	}

public void paintMap(Graphics g){
   
    Color greenBoard = new Color(0, 102, 0);
    g.setColor(greenBoard);
    g.fillRect(0, 0, 600, 600);
    for(int i = 0; i <= 600; i+=100){
        for(int j = 0; j <= 600; j+=100){
            g.clearRect(i, j, 50, 50);
        }
    }
    
    for(int i = 50; i <= 650; i+=100){
        for(int j = 50; j <= 650; j+=100){
            g.clearRect(i, j, 50, 50);
        }
    }
}

public void BlackPawnsDraw(Graphics g) {
	int basicPawnY = basicPositionEnd - 60;
	int startingPosX = basicPositionStartX;
	for(int i = 0;i<8;i++) {
		BlackPawn.paintIcon(this, g, startingPosX, basicPawnY);
		startingPosX+=50;
	}
}

public void WhitePawnDraw(Graphics g) {
	int basicPawnY = basicPositionWhiteY + 50;
	int startingPosX = basicPositionStartX;
	for(int i = 0;i<8;i++) {
		WhitePawn.paintIcon(this, g, startingPosX, basicPawnY);
		startingPosX+=50;
	}
}

public void paint(Graphics g) { //main paint method
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g.create();
   // map.paintIcon(this, g2d, 0, 0);
    paintMap(g);
    int distance = 50;
    whiteRook.paintIcon(this, g2d, basicPositionStartX, basicPositionWhiteY);
    whiteRook.paintIcon(this, g2d, basicPositionStartX + 7*distance, basicPositionWhiteY);
    WhiteKnight.paintIcon(this, g2d, basicPositionStartX + distance, basicPositionWhiteY);
    WhiteKnight.paintIcon(this, g2d,basicPositionStartX + 6*distance , basicPositionWhiteY);
    WhiteKing.paintIcon(this, g2d, basicPositionStartX + 3*distance, basicPositionWhiteY);
    WhiteQueen.paintIcon(this, g2d,basicPositionStartX + 4*distance,basicPositionWhiteY);
    WhiteBishop.paintIcon(this, g2d, basicPositionStartX + 2*distance, basicPositionWhiteY);
    WhiteBishop.paintIcon(this, g2d, basicPositionStartX + 5*distance, basicPositionWhiteY);
   WhitePawnDraw(g2d);
    
    
    BlackRook.paintIcon(this, g2d, basicPositionStartX, basicPositionEnd);
    BlackRook.paintIcon(this, g2d, basicPositionStartX + 7*distance, basicPositionEnd);
    BlackKnight.paintIcon(this, g2d, basicPositionStartX + distance, basicPositionEnd);
    BlackKnight.paintIcon(this, g2d, basicPositionStartX + 6*distance, basicPositionEnd);
    BlackBishop.paintIcon(this, g2d, basicPositionStartX + 2*distance, basicPositionEnd);
    BlackBishop.paintIcon(this, g2d, basicPositionStartX + 5*distance, basicPositionEnd);
    BlackKing.paintIcon(this, g2d, basicPositionStartX + 3*distance, basicPositionEnd);
    BlackQueen.paintIcon(this, g2d, basicPositionStartX + 4*distance, basicPositionEnd);
    BlackPawnsDraw(g2d);
    g.dispose();
}

}