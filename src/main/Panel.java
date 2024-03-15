package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class Panel extends JPanel{
	
	private MouseInputs mouseInputs;
	private int xVar = 100, yVar = 100;
	
	public Panel () {
		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}
	
	public void xMove(int value){
		this.xVar+=value;
		repaint();
	}
	
	public void yMove(int value){
		this.yVar+=value;
		repaint();
	}
	
	public void setRectPos(int x, int y) {
		this.xVar = x;
		this.yVar = y;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	 
		g.fillRect(xVar, yVar, 200, 50);
	}

}
