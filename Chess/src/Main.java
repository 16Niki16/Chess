import javax.swing.JFrame;
import java.awt.Dimension;


public class Main extends JFrame {
	public Main() {
		Gameplay gg = new Gameplay();
		add(gg);
		setTitle("Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(412,434);
		setLocation(150,150);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Main();
	}

}
