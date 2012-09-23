package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import model.ZKImage;

public class HelpView extends BaseView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean mouseIn = false;
	private int x,y;
	private Rectangle back;
	
	public HelpView() {
		initComponent();
	}
	
	public HelpView(MainFrame mf) {
		this();
		container = mf;
	}
	
	private void initComponent() {
		ImageIcon icon = new ImageIcon(ZKImage.DIR+ZKImage.HELPBACK);
		background = icon.getImage();
		
		back = new Rectangle(580,470,180,40);
	}
	
	public void gameRender() {
		super.gameRender();
		
		bufG.clearRect(0,0,width,height);
		bufG.drawImage(background,0,0,this);
		bufG.setColor(Color.WHITE);
		bufG.setFont(new Font("Cooper",Font.BOLD,28));
		
		bufG.drawString("Rules", 370, 50);
		bufG.drawString("1.At least 3 equal icons in a row or ", 100, 100);
		bufG.drawString("   column can disappear together;", 100, 150);
		bufG.drawString("2.Combo gives bonus points;", 100, 200);
		bufG.drawString("3.There ares 2 game modes.", 100, 250);
		bufG.drawString("Back", 630, 500);
		
		if(mouseIn){
			bufG.setColor(Color.GRAY);
			bufG.draw3DRect(x, y, 170, 46, true);
			bufG.draw3DRect(x-2, y-2, 174, 50, true);
		}
		
		repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if(back.contains(x,y)) {
			container.setView(new MenuView(container));
			return;
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if(back.contains(x,y)) {
			mouseIn = true;
			this.x = back.x;
			this.y = back.y;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			gameRender();
			return;
		}
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		mouseIn = false;
		gameRender();
	}
}
