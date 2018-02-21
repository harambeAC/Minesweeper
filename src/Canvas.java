
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Canvas extends JPanel {

	public static final int SIZE = 50;

	public GameModel model;
	public int[][] grid;
	public boolean[][] revealed;


	public Canvas(GameModel model) {
		this.model = model;
		this.grid = model.grid;
		this.revealed = model.revealed;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		grid = model.grid;
		
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[0].length; j++){
				if(!revealed[i][j]){
					g.setColor(Color.WHITE);
					g.fillRect(j*50, i*50, 50, 50);
				}else{
					g.drawString(model.grid[i][j]+"", j*50+25, i*50+25);
					g.setColor(Color.RED);
					g.fillRect(j*50, i*50, 50, 50);
				}
			}
		}
	}

	@Override
	public Dimension preferredSize() {
		return new Dimension(SIZE * grid[0].length, SIZE * grid.length);
	}
}