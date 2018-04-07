
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
					g.fillRect(j*SIZE, i*SIZE, SIZE, SIZE);
				}else{
					g.setColor(Color.RED);
					//g.fillRect((j-1)*(SIZE), (i-1)*(SIZE), SIZE, SIZE);
					g.drawString(""+model.grid[i][j], (j)*SIZE+25, (i)*SIZE+25);
				}
			}
		}
	}

	@Override
	public Dimension preferredSize() {
		return new Dimension(SIZE * grid[0].length, SIZE * grid.length);
	}
}