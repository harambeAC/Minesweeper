import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.MouseInputListener;

public class MouseController implements MouseListener {
        //where initialization occurs:
        //Register for mouse events on blankArea and the panel.
	
	public GameModel model;
	public Canvas canvas;

    public MouseController(GameModel model, Canvas canvas) {
		// TODO Auto-generated constructor stub
    		this.model = model;
    		this.canvas = canvas;
	}

	public void mousePressed(MouseEvent e) {
	    int x = (e.getX()/50);
	    int y = (e.getY()/50);
	 
	    System.out.println("x: "+e.getX()/50.0+" y: "+e.getY()/50.0);
	    
	    if(!model.revealed[y][x]) {
	    		model.revealed[y][x] = !model.revealed[y][x];
	    }
		if(model.grid[y][x] == -1) {
			System.exit(0);
		}
	    	    
		canvas.repaint();	
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
