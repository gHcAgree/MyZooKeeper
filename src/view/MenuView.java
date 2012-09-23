package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import model.ZKImage;

public class MenuView extends BaseView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image title;
	private Rectangle level,time,highScore,exit,help;
	private boolean mouseIn = false;
	private int x,y;
	
	public MenuView() {
		initComponent();
	}
	
	public MenuView(MainFrame mf) {
		// TODO Auto-generated constructor stub
		this();
		container = mf;
	}

	private void initComponent() {
		ImageIcon icon = new ImageIcon(ZKImage.DIR+ZKImage.MAINBACK);
		background = icon.getImage();
		icon = new ImageIcon(ZKImage.DIR+ZKImage.TITLE);
		title = icon.getImage();
		
		level = new Rectangle(300,170,160,40);
		time = new Rectangle(300,230,160,40);
		highScore = new Rectangle(300,290,160,40);
		exit = new Rectangle(300,350,160,40);
		help = new Rectangle(300,410,160,40);
		
	}
	
	public void gameRender() {
		super.gameRender();
		
		bufG.clearRect(0,0,width,height);
		bufG.drawImage(background,0,0,this);
		bufG.setColor(Color.WHITE);
		bufG.setFont(new Font("Cooper",Font.BOLD,28));
		bufG.drawString("Level Mode",310,200);
		bufG.drawString("Time Mode", 310,260);
		bufG.drawString("High Score",310,320);
		bufG.drawString("Exit Game",310,380);
		bufG.drawString("    Help   ",310,440);
		bufG.drawImage(title,210,50,this);
		
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
		
		if(level.contains(x,y)) {
			
			return;
		}
		if(time.contains(x,y)) {
			
			return;
		}
		if(highScore.contains(x,y)) {
			
			return;
		}
		if(exit.contains(x,y)) {
			
			return;
		}
		if(help.contains(x,y)) {
			container.setView(new HelpView(container));
			return;
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if(level.contains(x,y)) {
			mouseIn = true;
			this.x = level.x;
			this.y = level.y;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			gameRender();
			return;
		}
		if(time.contains(x,y)) {
			mouseIn = true;
			this.x = time.x;
			this.y = time.y;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			gameRender();
			return;
		}
		if(highScore.contains(x,y)) {
			mouseIn = true;
			this.x = highScore.x;
			this.y = highScore.y;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			gameRender();
			return;
		}
		if(exit.contains(x,y)) {
			mouseIn = true;
			this.x = exit.x;
			this.y = exit.y;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			gameRender();
			return;
		}
		if(help.contains(x,y)) {
			mouseIn = true;
			this.x = help.x;
			this.y = help.y;
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			gameRender();
			return;
		}
		
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		mouseIn = false;
		gameRender();
	}
	
}
