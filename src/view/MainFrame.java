package view;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BaseView view;
	
	public MainFrame() {
		initComponent();
	}

	public void initComponent() {	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Zoo Keeper");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	@Override
	public void run() {
		setView(new MenuView(this));
	}
	
	public static void main(String[] args) {
		new MainFrame().run();
	}
	
	public void setView(BaseView v) {
		view = v;
		this.setContentPane(view);
		view.gameRender();
	}
}
