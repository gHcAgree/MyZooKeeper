package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.ZKImage;

public class BaseView extends JPanel implements MouseListener,MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Image bufImage;
    protected Graphics2D bufG;
    protected Image background;
    protected int width = 800;
    protected int height = 600;
    protected MainFrame container;
	
    public BaseView() {
    	setSize(width,height);
		addMouseListener(this);
		addMouseMotionListener(this);
    }
    
    public void gameRender() {
		if(bufImage==null) {
			bufImage = createImage(width,height);     //bufImage should be visible
			bufG = (Graphics2D)bufImage.getGraphics();
		}
    }
    
	@Override
	public void paint(Graphics g) {
		paintComponent(g);
		g.drawImage(bufImage,0,0,this);
	}
	
	public Graphics2D getBufG() {
		return bufG;
	}

	public void setBufG(Graphics2D bufG) {
		this.bufG = bufG;
	}

	public Image getBufImage() {
		return bufImage;
	}

	public void setBufImage(Image bufImage) {
		this.bufImage = bufImage;
	}


	public Image getBackgroundImage() {
		return background;
	}


	public void setBackgroundImage(Image background) {
		this.background = background;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
