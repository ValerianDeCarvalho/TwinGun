package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Panel;

public class KeyboardInputs implements KeyListener {

	private Panel panel;

	public KeyboardInputs(Panel panel) {
		this.panel = panel;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_Z:
			panel.yMove(-5);
			break;
		case KeyEvent.VK_Q:
			panel.xMove(-5);
			break;
		case KeyEvent.VK_D:
			panel.xMove(5);
			break;
		case KeyEvent.VK_S:
			panel.yMove(5);
			break;
			
		}	
	}
}
