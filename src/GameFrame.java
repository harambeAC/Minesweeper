import javax.swing.JFrame;


public class GameFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameFrame(GameModel model) {
		setTitle("MineSweeper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Canvas canvas = new Canvas(model);
		add(canvas);
		addMouseListener(new MouseController(model,canvas));
		pack();
		repaint();
	}
}