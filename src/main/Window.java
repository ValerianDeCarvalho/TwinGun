package main;

import javax.swing.JFrame;

public class Window {
	private JFrame jframe;
	
	public Window(Panel panel){	
		jframe = new JFrame();
		jframe.setSize(400, 400);
		jframe.add(panel);
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
