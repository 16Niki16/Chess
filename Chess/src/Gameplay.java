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
	private final ImageIcon BlackRook;
	private final ImageIcon WhiteKnight; 
	private final ImageIcon BlackKnight;
	int basicPositionStart = - 2;
	int basicPositionEnd = 344;
	
	
public Gameplay(){	
	setFocusable(true);
	//map = new ImageIcon("images/board.png");
	whiteRook = new ImageIcon("images/WhiteRook.png");
	BlackRook = new ImageIcon("images/BlackRook.png");
	WhiteKnight = new ImageIcon("images/white Knight.png");
	BlackKnight = new ImageIcon("images/black Knight.png");
	
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
public void paint(Graphics g) { //main paint method
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g.create();
   // map.paintIcon(this, g2d, 0, 0);
    paintMap(g);
    whiteRook.paintIcon(this, g2d, basicPositionStart, basicPositionStart);
    whiteRook.paintIcon(this, g2d, basicPositionEnd, basicPositionStart);
    BlackRook.paintIcon(this, g2d, basicPositionStart, basicPositionEnd);
    BlackRook.paintIcon(this, g2d, basicPositionEnd , basicPositionEnd);
    WhiteKnight.paintIcon(this, g2d, 30, basicPositionStart);
    WhiteKnight.paintIcon(this, g2d,280 , basicPositionStart);
    BlackKnight.paintIcon(this, g2d, 30, basicPositionEnd);
    BlackKnight.paintIcon(this, g2d, 280 , basicPositionEnd);
    g.dispose();
}

}